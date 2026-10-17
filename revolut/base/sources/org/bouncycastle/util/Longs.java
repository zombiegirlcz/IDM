package org.bouncycastle.util;

import org.bouncycastle.math.raw.Nat;

/* JADX INFO: loaded from: classes14.dex */
public class Longs {
    public static final int BYTES = 8;
    public static final int SIZE = 64;

    public static int bitCount(long j2) {
        return Long.bitCount(j2);
    }

    public static int bitLength(long j2) {
        return 64 - numberOfLeadingZeros(j2);
    }

    public static int compare(long j2, long j3) {
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    public static int compareUnsigned(long j2, long j3) {
        return compare(j2 - Long.MIN_VALUE, j3 - Long.MIN_VALUE);
    }

    public static long highestOneBit(long j2) {
        return Long.highestOneBit(j2);
    }

    public static long lowestOneBit(long j2) {
        return Long.lowestOneBit(j2);
    }

    public static int numberOfLeadingZeros(long j2) {
        return Long.numberOfLeadingZeros(j2);
    }

    public static int numberOfTrailingZeros(long j2) {
        return Long.numberOfTrailingZeros(j2);
    }

    public static long reverse(long j2) {
        return Long.reverse(j2);
    }

    public static long reverseBytes(long j2) {
        return Long.reverseBytes(j2);
    }

    public static long rotateLeft(long j2, int i) {
        return Long.rotateLeft(j2, i);
    }

    public static long rotateRight(long j2, int i) {
        return Long.rotateRight(j2, i);
    }

    public static Long valueOf(long j2) {
        return Long.valueOf(j2);
    }

    public static void xorTo(int i, long[] jArr, int i2, long[] jArr2, int i3) {
        Nat.xorTo64(i, jArr, i2, jArr2, i3);
    }
}
