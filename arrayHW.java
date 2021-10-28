// 1. Write a program to sum all the values of a given Array in Java.

//public class ArraySum{

    //public static void main(String []args){

        //int arr[] = {2,5,6,3,7,8};
        //int sum=0;

        //for(int i=0;i<arr.length;i++){
            //sum += arr[i];
        //}

        //System.out.println("Sum of array is: "+sum);

    //}
//}

// 2. What is the output?

//public class Main {

    //public static void main(String []args){

    //double[] exampleArray = {1, 5, 6, 5, 4, 1};
    //double maximum = exampleArray[0];
    //int index = 0;
  //for(int i = 1; i<exampleArray.length>;i++){
      //if (exampleArray[i] > maximum) {
          //maximum = exampleArray[i];
          //index = i;
      //}
  //}
        //System.out.println(index);
//}
//}

// 3. Write a public static method called "toPower" that takes in as parameters
// two integers called size and power. The method should return an array of
// size "size" with each array index raised to the value of "power." So, for example,
// if we passed in "size = 4" and "power = 2" to the "toPower," the method should return the
// following result: [0,1,4,9].

import java.lang.Math;
import java.util.Arrays;

public class Main{

    public static double[] toPower(int size, int power){
        double[] result = new double[size];
        for(int i=0; i<size; i++){
            result[i] = Math.pow(Double.valueOf(i), Double.valueOf(power));
        }
        return result;
    }

    public static void main(String []args){

        int size = 4;
        int power = 2;
        double[] result = toPower(size, power);

        System.out.print("toPower result is: "+Arrays.toString(result));

    }
}



