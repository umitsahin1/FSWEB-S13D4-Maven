package org.example;

public enum Weapon {
    SWORD(50, 1.5),
    BOW(35, 2.0),
    AXE(60, 1.2);

    private int damage;
    private double attackSpeed;

    private Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }

    public int getDamage() {
        return damage;
    }
}
