package hello;

public class test2 {
    public test2(int sal, String empName) {
        this.sal = sal;
        this.empName = empName;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    int sal;
    String empName;
}