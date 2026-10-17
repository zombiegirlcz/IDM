package org.bouncycastle.util;

/* JADX INFO: loaded from: classes14.dex */
public class Integers {
    public static final int BYTES = 4;
    public static final int SIZE = 32;

    public static int bitCount(int i) {
        return Integer.bitCount(i);
    }

    public static int bitLength(int i) {
        return 32 - numberOfLeadingZeros(i);
    }

    public static int compare(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static int compareUnsigned(int i, int i2) {
        return compare(i - Integer.MIN_VALUE, i2 - Integer.MIN_VALUE);
    }

    public static int highestOneBit(int i) {
        return Integer.highestOneBit(i);
    }

    public static int lowestOneBit(int i) {
        return Integer.lowestOneBit(i);
    }

    public static int numberOfLeadingZeros(int i) {
        return Integer.numberOfLeadingZeros(i);
    }

    public static int numberOfTrailingZeros(int i) {
        return Integer.numberOfTrailingZeros(i);
    }

    public static int reverse(int i) {
        return Integer.reverse(i);
    }

    public static int reverseBytes(int i) {
        return Integer.reverseBytes(i);
    }

    public static int rotateLeft(int i, int i2) {
        return Integer.rotateLeft(i, i2);
    }

    public static int rotateRight(int i, int i2) {
        return Integer.rotateRight(i, i2);
    }

    public static Integer valueOf(int i) {
        return Integer.valueOf(i);
    }
}
