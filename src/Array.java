public class Array {
    public static void main(String[] args) {


    double marks [] = {203.4, 407.5, 10002.4, 4.5};


        //Gennemløb af array med for loop
        for (int counter = 0; counter < marks.length ; counter++) {
                System.out.println("Nummer " + counter + " = " + marks[counter]);
        }

        //Gennemløb array uden for loop
        for (double nummer : marks){
            System.out.println("foreach " + nummer);
        }

    }
}
