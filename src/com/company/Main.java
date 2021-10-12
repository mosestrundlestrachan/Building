package com.company;
import java.util.Scanner;
import java.lang.Math;
public class Main {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("What is the name of your building? ");
        String name = scan.nextLine();

        System.out.print("Would you like to know the height of " + name + " in meters? Type (yes) for height. ");
        String questionasked = scan.nextLine();

        System.out.print("How many feet tall is " + name + "? ");
        double heightbuilding = scan.nextInt();

        if (questionasked.equals("yes")) {
            heightbuilding = (heightbuilding/3);
            System.out.println("Your building " + name + " is " + (Math.round(heightbuilding * 100.0)/100.0) + " meters tall.");
            System.out.println("The End.");
        }


    }



    }

