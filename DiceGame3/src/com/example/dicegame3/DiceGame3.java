package com.example.dicegame3;
import java.util.Random;
import java.util.Scanner;
public class DiceGame3 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello and welcome! Let's play a game.");
        System.out.println("First of all, just enter how many times you'd like to throw a dice with the comp(etitor): ");
        int numberOfTurns = scan.nextInt();
        int compDie;
        int compSum = 0;
        int compThrow = 0;
        int userDie;
        int userSum = 0;
        int userThrow = 0;


        for (int i = 1; i <= numberOfTurns; i++){
            compDie = random.nextInt(6) + 1;
            userDie = random.nextInt(6) + 1;
            if(compDie > userDie ){
                compSum = compSum + 1;
                compThrow = compSum;
                System.out.println("This round was won by the computer with " + compDie + " against " + userDie);
            } else if (userDie > compDie){
                userSum = userSum + 1;
                userThrow = userSum;
                System.out.println("This round was won by you with " + userDie + " against " + compDie);
            } else {
                compSum = compSum + 1;
                userSum = userSum + 1;
                userThrow = userSum;
                compThrow = compSum;
                System.out.println("It's a tie! You both had " + userDie);
            }


        }
        if(compSum > userSum){
            System.out.println("You lost, the computer won with the total point of " + compSum );
        } else if (userSum > compSum){
            System.out.println("You won with the total point of " + userSum + " compared with the computers point of " + compSum);
        } else if (userSum == compSum){
            System.out.println("It's a tie! You are both winners..., or losers. With a total point of " +userSum );
        }

        System.out.println(userThrow + " " + compThrow);
    }
}
