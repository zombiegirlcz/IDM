package org.bouncycastle.crypto.modes.kgcm;

import org.bouncycastle.math.raw.Interleave;

/* JADX INFO: loaded from: classes14.dex */
public class KGCMUtil_128 {
    public static final int SIZE = 2;

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr2[1] ^ jArr[1];
    }

    public static void copy(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
    }

    public static boolean equal(long[] jArr, long[] jArr2) {
        return ((jArr2[1] ^ jArr[1]) | (jArr[0] ^ jArr2[0])) == 0;
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        int i = 0;
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j5 = jArr2[0];
        long j16 = jArr2[1];
        long j22 = 0;
        long j42 = 0;
        long j46 = 0;
        while (i < 64) {
            long j47 = j2;
            int i2 = i;
            long j57 = -(j47 & 1);
            j22 ^= j5 & j57;
            long j58 = (j57 & j16) ^ j46;
            long j65 = -(j3 & 1);
            j3 >>>= 1;
            long j69 = j58 ^ (j5 & j65);
            j42 ^= j65 & j16;
            long j76 = j16 >> 63;
            j16 = (j16 << 1) | (j5 >>> 63);
            j5 = (j5 << 1) ^ (j76 & 135);
            j46 = j69;
            i = i2 + 1;
            j2 = j47 >>> 1;
        }
        jArr3[0] = ((((j42 << 1) ^ j42) ^ (j42 << 2)) ^ (j42 << 7)) ^ j22;
        jArr3[1] = (((j42 >>> 63) ^ (j42 >>> 62)) ^ (j42 >>> 57)) ^ j46;
    }

    public static void multiplyX(long[] jArr, long[] jArr2) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        jArr2[0] = ((j3 >> 63) & 135) ^ (j2 << 1);
        jArr2[1] = (j2 >>> 63) | (j3 << 1);
    }

    public static void multiplyX8(long[] jArr, long[] jArr2) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j5 = j3 >>> 56;
        jArr2[0] = (j5 << 7) ^ ((((j2 << 8) ^ j5) ^ (j5 << 1)) ^ (j5 << 2));
        jArr2[1] = (j2 >>> 56) | (j3 << 8);
    }

    public static void one(long[] jArr) {
        jArr[0] = 1;
        jArr[1] = 0;
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[4];
        Interleave.expand64To128(jArr[0], jArr3, 0);
        Interleave.expand64To128(jArr[1], jArr3, 2);
        long j2 = jArr3[0];
        long j3 = jArr3[1];
        long j5 = jArr3[2];
        long j16 = jArr3[3];
        long j22 = j5 ^ ((j16 >>> 57) ^ ((j16 >>> 63) ^ (j16 >>> 62)));
        jArr2[0] = j2 ^ ((((j22 << 1) ^ j22) ^ (j22 << 2)) ^ (j22 << 7));
        jArr2[1] = (j3 ^ ((((j16 << 1) ^ j16) ^ (j16 << 2)) ^ (j16 << 7))) ^ ((j22 >>> 57) ^ ((j22 >>> 63) ^ (j22 >>> 62)));
    }

    public static void x(long[] jArr) {
        jArr[0] = 2;
        jArr[1] = 0;
    }

    public static void zero(long[] jArr) {
        jArr[0] = 0;
        jArr[1] = 0;
    }
}
