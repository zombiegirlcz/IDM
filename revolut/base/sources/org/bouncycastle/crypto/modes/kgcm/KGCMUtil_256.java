package org.bouncycastle.crypto.modes.kgcm;

import org.bouncycastle.math.raw.Interleave;

/* JADX INFO: loaded from: classes14.dex */
public class KGCMUtil_256 {
    public static final int SIZE = 4;

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    public static void copy(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    public static boolean equal(long[] jArr, long[] jArr2) {
        return ((jArr2[3] ^ jArr[3]) | (((jArr[0] ^ jArr2[0]) | (jArr[1] ^ jArr2[1])) | (jArr[2] ^ jArr2[2]))) == 0;
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        char c2;
        char c3;
        long j2;
        int i = 0;
        long j3 = jArr[0];
        char c5 = 1;
        long j5 = jArr[1];
        char c6 = 2;
        long j16 = jArr[2];
        char c7 = 3;
        long j22 = jArr[3];
        long j42 = jArr2[0];
        long j46 = jArr2[1];
        long j47 = jArr2[2];
        long j57 = jArr2[3];
        long j58 = 0;
        long j65 = 0;
        long j69 = 0;
        long j76 = 0;
        long j85 = 0;
        while (true) {
            c2 = c5;
            c3 = c6;
            j2 = j16;
            if (i >= 64) {
                break;
            }
            long j100 = -(j3 & 1);
            j3 >>>= c2;
            j58 ^= j42 & j100;
            char c16 = c7;
            long j101 = -(j5 & 1);
            j5 >>>= c2;
            j65 = (j65 ^ (j46 & j100)) ^ (j42 & j101);
            j69 = (j69 ^ (j47 & j100)) ^ (j46 & j101);
            j76 = (j76 ^ (j57 & j100)) ^ (j47 & j101);
            j85 ^= j57 & j101;
            long j102 = j57 >> 63;
            j57 = (j57 << c2) | (j47 >>> 63);
            j47 = (j47 << c2) | (j46 >>> 63);
            j46 = (j42 >>> 63) | (j46 << c2);
            j42 = (j42 << c2) ^ (j102 & 1061);
            i++;
            c7 = c16;
            c5 = c2;
            c6 = c3;
            j16 = j2;
            j22 = j22;
        }
        char c26 = c7;
        long j103 = j22;
        char c28 = '>';
        long j104 = (((j57 >>> 62) ^ j42) ^ (j57 >>> 59)) ^ (j57 >>> 54);
        long j105 = ((j57 ^ (j57 << c3)) ^ (j57 << 5)) ^ (j57 << 10);
        int i2 = 0;
        while (i2 < 64) {
            long j106 = -(j2 & 1);
            j2 >>>= c2;
            j58 ^= j105 & j106;
            char c29 = c28;
            long j107 = j104;
            long j108 = -(j103 & 1);
            j103 >>>= c2;
            long j109 = (j65 ^ (j104 & j106)) ^ (j105 & j108);
            j69 = (j69 ^ (j46 & j106)) ^ (j107 & j108);
            j76 = (j76 ^ (j47 & j106)) ^ (j46 & j108);
            j85 ^= j47 & j108;
            long j110 = j47 >> 63;
            j47 = (j47 << c2) | (j46 >>> 63);
            j46 = (j107 >>> 63) | (j46 << c2);
            long j111 = (j107 << c2) | (j105 >>> 63);
            j105 = (j105 << c2) ^ (j110 & 1061);
            i2++;
            c28 = c29;
            j104 = j111;
            j65 = j109;
        }
        jArr3[0] = j58 ^ (((j85 ^ (j85 << c3)) ^ (j85 << 5)) ^ (j85 << 10));
        jArr3[c2] = j65 ^ (((j85 >>> c28) ^ (j85 >>> 59)) ^ (j85 >>> 54));
        jArr3[c3] = j69;
        jArr3[c26] = j76;
    }

    public static void multiplyX(long[] jArr, long[] jArr2) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j5 = jArr[2];
        long j16 = jArr[3];
        jArr2[0] = ((j16 >> 63) & 1061) ^ (j2 << 1);
        jArr2[1] = (j2 >>> 63) | (j3 << 1);
        jArr2[2] = (j5 << 1) | (j3 >>> 63);
        jArr2[3] = (j16 << 1) | (j5 >>> 63);
    }

    public static void multiplyX8(long[] jArr, long[] jArr2) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j5 = jArr[2];
        long j16 = jArr[3];
        long j22 = j16 >>> 56;
        jArr2[0] = ((((j2 << 8) ^ j22) ^ (j22 << 2)) ^ (j22 << 5)) ^ (j22 << 10);
        jArr2[1] = (j2 >>> 56) | (j3 << 8);
        jArr2[2] = (j5 << 8) | (j3 >>> 56);
        jArr2[3] = (j16 << 8) | (j5 >>> 56);
    }

    public static void one(long[] jArr) {
        jArr[0] = 1;
        jArr[1] = 0;
        jArr[2] = 0;
        jArr[3] = 0;
    }

    public static void square(long[] jArr, long[] jArr2) {
        int i = 8;
        long[] jArr3 = new long[8];
        for (int i2 = 0; i2 < 4; i2++) {
            Interleave.expand64To128(jArr[i2], jArr3, i2 << 1);
        }
        while (true) {
            int i3 = i - 1;
            if (i3 < 4) {
                copy(jArr3, jArr2);
                return;
            }
            long j2 = jArr3[i3];
            int i5 = i - 5;
            jArr3[i5] = jArr3[i5] ^ ((((j2 << 2) ^ j2) ^ (j2 << 5)) ^ (j2 << 10));
            int i6 = i - 4;
            jArr3[i6] = ((j2 >>> 54) ^ ((j2 >>> 62) ^ (j2 >>> 59))) ^ jArr3[i6];
            i = i3;
        }
    }

    public static void x(long[] jArr) {
        jArr[0] = 2;
        jArr[1] = 0;
        jArr[2] = 0;
        jArr[3] = 0;
    }

    public static void zero(long[] jArr) {
        jArr[0] = 0;
        jArr[1] = 0;
        jArr[2] = 0;
        jArr[3] = 0;
    }
}
