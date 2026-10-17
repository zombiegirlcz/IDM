package org.bouncycastle.math.raw;

/* JADX INFO: loaded from: classes14.dex */
public abstract class Bits {
    public static int bitPermuteStep(int i, int i2, int i3) {
        int i5 = i2 & ((i >>> i3) ^ i);
        return i ^ (i5 ^ (i5 << i3));
    }

    public static int bitPermuteStepSimple(int i, int i2, int i3) {
        return ((i >>> i3) & i2) | ((i & i2) << i3);
    }

    public static long bitPermuteStep(long j2, long j3, int i) {
        long j5 = j3 & ((j2 >>> i) ^ j2);
        return j2 ^ (j5 ^ (j5 << i));
    }

    public static long bitPermuteStepSimple(long j2, long j3, int i) {
        return ((j2 >>> i) & j3) | ((j2 & j3) << i);
    }
}
