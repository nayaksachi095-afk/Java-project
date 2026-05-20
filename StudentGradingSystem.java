import java.util.Scanner;

// Student Class
class Student {

    // Private Variables (Encapsulation)
    private String name;
    private int roll;
    private int[] marks;

    // Constructor
    Student(String name, int roll, int[] marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    // Method to Calculate Average
    public double calculateAverage() {

        int sum = 0;

        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }

        return (double) sum / marks.length;
    }

    // Method to Assign Grade
    public char assignGrade() {

        double average = calculateAverage();

        if (average >= 90) {
            return 'A';
        }
        else if (average >= 75) {
            return 'B';
        }
        else if (average >= 60) {
            return 'C';
        }
        else if (average >= 50) {
            return 'D';
        }
        else {
            return 'F';
        }
    }

    // Method to Display Result
    public void displayDetails() {

        System.out.println("\n===== RESULT =====");

        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + roll);

        System.out.print("Marks        : ");

        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }

        System.out.println();

        System.out.println("Average      : " + calculateAverage());
        System.out.println("Grade        : " + assignGrade());

        // Pass/Fail Status
        if (assignGrade() == 'F') {
            System.out.println("Status       : Fail");
        }
        else {
            System.out.println("Status       : Pass");
        }
    }
}

// Main Class
public class StudentGradingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input Student Details
        System.out.println("===== STUDENT GRADING SYSTEM =====");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        // Number of Subjects
        System.out.print("Enter Number of Subjects: ");
        int n = sc.nextInt();

        // Array for Marks
        int[] marks = new int[n];

        // Input Marks
        for (int i = 0; i < n; i++) {

            System.out.print("Enter Marks of Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        // Create Object
        Student s1 = new Student(name, roll, marks);

        // Display Result
        s1.displayDetails();

        sc.close();
    }
}