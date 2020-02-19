package com.management.restaurant;

import java.util.Scanner;

public class Main {
    public static void main(String[] string){
        System.out.println("**********************************Main menu**********************************");
        System.out.println("1. Signup.");
        System.out.println("2. Login.");
        System.out.println("3. Menu.");
        System.out.println("4. About us.");
        System.out.println("5. Contact us.");
        System.out.println("*****************************************************************************");

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            int action;
            System.out.println("Enter your input: ");
            action = scanner.nextInt();
            User user = new User();
            switch (action){
                case 1:
                    System.out.println("1. Signup: Enter your details below.");
                    System.out.println("Enter your name: ");
                    System.out.println("Enter your mobile number: ");
                    System.out.println("Enter your password: ");
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }

        }
    }
}
