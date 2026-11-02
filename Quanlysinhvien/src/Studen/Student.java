package Studen;

public class Student {
    // 1. Khai báo thuộc tính
    String studentId;
    String name;
    int age;
    double gpa;

    // 2. Constructor
    public Student(String studentId, String name, int age, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    // 3. Phương thức hiển thị thông tin
    public void displayInfo() {
        System.out.println("Ma SV: " + studentId);
        System.out.println("Ho ten: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("Diem TB: " + gpa);
    }
}
