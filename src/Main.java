import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{
    static Scanner scan;
    private static String[] text;

    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("src/data.txt");
        scan = new Scanner(file);

        String inputFromFile = "";

        while (scan.hasNextLine())                                // checks if theres more lines in the file
        {
            inputFromFile += scan.nextLine();                     // adds each line to the inputFromFile string.
        }

        text = inputFromFile.split(" ");                    // Creates and array of strings, where each element is a single word from the file.
        
        printLongestWord();
        printFirstHalfOfEachWord();

        //test dine metoder ved at kalde dem her:


    }

    private static void printWordsOfLength(int l)
    {
        boolean wordisvalid = true;

        for (String s : text)
        {
            if (s.length() == l)
            {
                if (s.contains(",") || s.contains("."))
                {
                    wordisvalid = false;
                }

                if (wordisvalid)
                {
                    System.out.println(s);
                }
            }
        }
    }

    private static void printWordsStartingWith(String pattern)
    {
        for (String s : text) // for each word in text
        {
            if (s.startsWith(pattern) || s.startsWith(pattern.toLowerCase()))
            {
                System.out.println(s);
            }
        }
    }

    //skriv dine metoder herunder:

    //Task 1
    private static void printLongestWord()
    {
        String longestWord = "";
        for(String string : text){
            if(string.length() > longestWord.length()){
                longestWord = string;
            }
        }
        System.out.println(longestWord);
    }

    //Task 2
    private static void printFirstHalfOfEachWord()
    {
        for(String string : text){
            System.out.println(string.substring(0, string.length()/2));
        }
    }

    //Task 3
    private static void printMostFrequentLetter()
    {
        
    }

}