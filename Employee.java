public class Employee {

    String name;
    int id;
    double salary;
    String Address;
    public Employee(String name, int id, double salary, String Address)
    {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.Address = Address;
    }
    public void displayInfo(){
        System.out.println("Employee ID: " + id );
        System.out.println("Employee Name: " + name );
        System.out.println("Employee Salary: " + salary );
        System.out.println("Employee Address: " + Address );

    }
    public static void main(String[] args) {
        Employee emp1 = new Employee("XYZ", 0101, 50000.0, "hubli");
        emp1.displayInfo();
    }


}
