/*
Question : Given an array with N elements, the task is to rotate the array to the left by
k steps. where K is non-negative.
_____________________________________________________________________________________________
I/O = 7 5 2 11 2 43 1 1
O/P = 2 11 2 43 11 7 5
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sizeOfArray,start,startingIndex;
        System.out.println("Enter the length of array :");
        sizeOfArray = input.nextInt();
        System.out.println("Enter the element inside array :");
        int[] array = new int[sizeOfArray];
        for (start = 0; start < array.length; start++){
            array[start] = input.nextInt();
        }
        System.out.println("Enter the index from where to start rotating the array :");
        startingIndex = input.nextInt();

        System.out.println("Printing the result : ");
        if (array.length > 1) {
            for (start = startingIndex - 1; start < array.length; start++) {
                System.out.print(array[start] + " ");
            }
            for (start = 0; start < startingIndex - 1; start++) {
                System.out.print(array[start] + " ");
            }
        }else
            System.out.println(array[0]);
    }
}