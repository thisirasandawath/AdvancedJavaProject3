public class AdvanceJava {

    public static void main(String args[]){
        System.out.println("Hi");

        Faculty faculty = Faculty.ENGINEERING;

        System.out.println(faculty.name());
        System.out.println(faculty.getValue());

        System.out.println(findFactorial(5));


    }

    public static int findFactorial(int number){
        if(number ==0){
            return 1;
        }else {
            return number * findFactorial(number-1);
        }
    }
}
