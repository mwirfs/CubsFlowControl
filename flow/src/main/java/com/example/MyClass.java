package com.example;
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        System.out.println("Did the Cubs win?");
        System.out.println("Enter a number.");
        System.out.println("1. Yes");
        System.out.println("2. No");

        Scanner input1 = new Scanner(System.in);
        int answer = input1.nextInt();
        if (answer == 1)
        {
            System.out.println("YAY!");
            System.out.println("Do you want to go out and celebrate?");
            System.out.println("3. Yes");
            System.out.println("4. No");
            Scanner input2 = new Scanner(System.in);
            int answer2 = input2.nextInt();
            if (answer2 == 3)
            {
                System.out.println("Do you have work tomorrow?");
                System.out.println("5. Yes");
                System.out.println("6. No");
                Scanner input3 = new Scanner(System.in);
                int answer3 = input3.nextInt();
                if (answer3 == 5)
                {
                    System.out.println("Go to bed");
                }
                if (answer3 == 6)
                {
                    System.out.println("HAVE FUN!");
                    System.out.println("How many drinks have you had?");
                    for(int x = 0; x < 10; x = x+1)
                    {
                        System.out.print(x + " ");
                        while (x==9)
                        {
                            System.out.print("\n");
                            break;
                        }
                    }
                    Scanner input4 = new Scanner(System.in);
                    int answer4 = input4.nextInt();
                    if (answer4 <3 )
                    {
                        System.out.println("You are ok to drive");
                    }
                    else
                    {
                        System.out.println("DO NOT DRIVE");
                    }
                }
            }
            if (answer2 == 4)
            {
                System.out.println("Go to bed");
            }
        }
        if (answer == 2)
        {
            System.out.println("Stay home and cry.");
        }
        else
        {
            System.out.println("Please enter a valid choice");
        }
    }
}