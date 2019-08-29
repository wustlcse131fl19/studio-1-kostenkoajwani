package studio1;

import support.cse131.ArgsProcessor;

public class Average {

    public static void main(String[] args)
    {
        ArgsProcessor ap = new ArgsProcessor(args);
        int n1 = ap.nextInt("Enter integer 1" );
        int n2 = ap.nextInt("Enter integer 2" );

        double add = n1 + n2;
        double divide = add/2;

        System.out.println("Average is " + divide);


    }




}
