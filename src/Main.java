import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        // each question in an array
        String[] questions = {"What friend said the wrong name at their wedding?", "What friend plays a doctor on a soap opera?", "What friend plays the guitar?", "What friend works in fashion?", "What friend is a chef?"};

        // each answer in an array
        String[] answers = {"Ross", "Joey", "Phoebe", "Rachel", "Monica"};

        // each potential answer in an array
        String[] userAnswers = {"", "", "", "", ""};

        // initialize the current score to tracking correct responses
        int currentScore = 0;

        // initialize the scanner utility for getting user input
        Scanner userInput = new Scanner(System.in);

        // print the first lines for the game title and rules
        System.out.println("Let's play Bamboozle!");
        System.out.println("Answer the questions below with the correct friend's name.");

        // initiate a for loop for each question in the array 'questions'
        // while i is less than the number of items in the array, loop will continue
        // after each iteration, i will add 1 to advance to next item in array
        for (int i = 0; i < questions.length; i++)
        {
            System.out.print("\n" + questions[i] + " "); //print each question with each iteration
            userAnswers[i] = userInput.next(); // obtain the users input and add to existing array

            if (userAnswers[i].equalsIgnoreCase(answers[i])) // comparing the answer with user-answer to compare
            {
                System.out.println("That is correct!");
                currentScore += 1;  // if answer is correct, print 'correct' and add 1 to the score

            } else {  // if the answer is wrong, say incorrect and display the correct answer from answer array
                System.out.println("I'm sorry, that is incorrect.");
                System.out.println("The correct answer is: " + answers[i]);
            }
        }
        // once game is complete, show the final score with the total number possible based on length of questions array
        System.out.println("\nYou scored: " + currentScore + "/" + questions.length);
    }
}
