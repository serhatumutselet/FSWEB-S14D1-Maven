package com.workintech.developers;

public class HRManager extends Employee {
    private static final int DEFAULT_CAPACITY = 10;

    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
        this.juniorDevelopers = new JuniorDeveloper[DEFAULT_CAPACITY];
        this.midDevelopers = new MidDeveloper[DEFAULT_CAPACITY];
        this.seniorDevelopers = new SeniorDeveloper[DEFAULT_CAPACITY];
    }

    @Override
    public void work() {
        System.out.println("HRManager starts to working");
        setSalary(getSalary() + 20000);
    }

    public void addEmployee(JuniorDeveloper developer, int index) {
        addToArray(juniorDevelopers, developer, index, "JuniorDeveloper");
    }

    public void addEmployee(MidDeveloper developer, int index) {
        addToArray(midDevelopers, developer, index, "MidDeveloper");
    }

    public void addEmployee(SeniorDeveloper developer, int index) {
        addToArray(seniorDevelopers, developer, index, "SeniorDeveloper");
    }

    private <T> void addToArray(T[] target, T developer, int index, String label) {
        if (developer == null) {
            System.out.println(label + " is null, cannot add.");
            return;
        }
        if (index < 0 || index >= target.length) {
            System.out.println("Index out of bounds for " + label + ".");
            return;
        }
        if (target[index] != null) {
            System.out.println("Index " + index + " already occupied for " + label + ".");
            return;
        }
        target[index] = developer;
    }
}

