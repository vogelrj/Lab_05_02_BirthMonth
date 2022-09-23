    public class Lab_05_02_birthMonth {
        public static void main(String[] args) {
            // Class BirthCalc
            //	Main()
            // 		String MONTH_STATE = “Your birth month is “
            //		num  birthMonth
            //		output “What is your birth month [1-12]? “
            //		input birthMonth
            //		if birthMonth == 1 then
            //			output MONTH_STATE + “January.”
            //		else if birthMonth == 2 then
            //			output MONTH_STATE + “February.”
            // 		else if birthMonth == 3 then
            //			output MONTH_STATE + “March.”
            //		else if birthMonth == 4 then
            //			output MONTH_STATE + “April.”
            //		else if birthMonth == 5 then
            //			output MONTH_STATE + “May.”
            //		else if birthMonth == 6 then
            //			output MONTH_STATE + “June.”
            //		else if birthMonth == 7 then
            //			output MONTH_STATE + “July.”
            //		else if birthMonth == 8 then
            //			output MONTH_STATE + “August.”
            //		else if birthMonth == 9 then
            //			output MONTH_STATE + “September.”
            //		else if birthMonth == 10 then
            //			output MONTH_STATE + “October.”
            //		else if birthMonth == 11 then
            //			output MONTH_STATE + “November.”
            //		else if birthMonth == 12 then
            //			output MONTH_STATE + “December.”
            //		else
            //			output “Invalid entry” + birthMonth “Enter a number [1-12] ”
            //		end if
            //	return
            //end class
            String MONTH_STATE = "Your birth month is ";
            int birthMonth = 1;
            System.out.println("What is your birth month [1-12]?");
            System.out.println( "My birth month is [" + birthMonth + "].");
            switch (birthMonth){
                case (1):
                    System.out.println(MONTH_STATE  + "January.");
                    break;
                case (2):
                    System.out.println(MONTH_STATE  + "February.");
                    break;
                case (3):
                    System.out.println(MONTH_STATE  + "March.");
                case (4):
                    System.out.println(MONTH_STATE  + "April.");
                    break;
                case (5):
                    System.out.println(MONTH_STATE  + "May.");
                    break;
                case (6):
                    System.out.println(MONTH_STATE  + "June.");
                case (7):
                    System.out.println(MONTH_STATE  + "July.");
                    break;
                case (8):
                    System.out.println(MONTH_STATE  + "August.");
                    break;
                case (9):
                    System.out.println(MONTH_STATE  + "September.");
                case (10):
                    System.out.println(MONTH_STATE  + "October.");
                    break;
                case (11):
                    System.out.println(MONTH_STATE  + "November.");
                    break;
                case (12):
                    System.out.println(MONTH_STATE  + "December.");
                    break;
                default:
                    System.out.println("Invalid Selection [" + birthMonth + "]. Please try again.");

            }
        }
    }


