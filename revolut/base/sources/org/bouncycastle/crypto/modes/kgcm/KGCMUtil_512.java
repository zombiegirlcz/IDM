package org.bouncycastle.crypto.modes.kgcm;

import org.bouncycastle.math.raw.Interleave;

/* JADX INFO: loaded from: classes14.dex */
public class KGCMUtil_512 {
    public static final int SIZE = 8;

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr2[7] ^ jArr[7];
    }

    public static void copy(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
        jArr2[4] = jArr[4];
        jArr2[5] = jArr[5];
        jArr2[6] = jArr[6];
        jArr2[7] = jArr[7];
    }

    public static boolean equal(long[] jArr, long[] jArr2) {
        return ((jArr2[7] ^ jArr[7]) | (((((((jArr[0] ^ jArr2[0]) | (jArr[1] ^ jArr2[1])) | (jArr[2] ^ jArr2[2])) | (jArr[3] ^ jArr2[3])) | (jArr[4] ^ jArr2[4])) | (jArr[5] ^ jArr2[5])) | (jArr[6] ^ jArr2[6]))) == 0;
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        int i = 0;
        long j2 = jArr2[0];
        char c2 = 1;
        long j3 = jArr2[1];
        char c3 = 2;
        long j5 = jArr2[2];
        char c5 = 3;
        long j16 = jArr2[3];
        long j22 = jArr2[4];
        long j42 = jArr2[5];
        long j46 = jArr2[6];
        long j47 = jArr2[7];
        long j57 = 0;
        long j58 = 0;
        long j65 = 0;
        long j69 = 0;
        long j76 = 0;
        long j85 = 0;
        long j100 = 0;
        long j101 = 0;
        long j102 = 0;
        while (true) {
            char c6 = c2;
            if (i >= 8) {
                char c7 = c3;
                jArr3[0] = j57 ^ (((j58 ^ (j58 << c7)) ^ (j58 << 5)) ^ (j58 << 8));
                jArr3[c6] = j65 ^ (((j58 >>> 62) ^ (j58 >>> 59)) ^ (j58 >>> 56));
                jArr3[c7] = j69;
                jArr3[c5] = j76;
                jArr3[4] = j85;
                jArr3[5] = j100;
                jArr3[6] = j101;
                jArr3[7] = j102;
                return;
            }
            long j103 = jArr[i];
            long j104 = jArr[i + 1];
            long j105 = j5;
            long j106 = j3;
            long j107 = j46;
            j46 = j42;
            j42 = j22;
            j22 = j16;
            long j108 = j105;
            char c16 = c3;
            int i2 = 0;
            while (i2 < 64) {
                char c26 = c5;
                long j109 = j108;
                long j110 = -(j103 & 1);
                j103 >>>= c6;
                j57 ^= j2 & j110;
                long j111 = j106;
                long j112 = -(j104 & 1);
                j104 >>>= c6;
                j65 = (j65 ^ (j106 & j110)) ^ (j2 & j112);
                j69 = (j69 ^ (j109 & j110)) ^ (j111 & j112);
                j76 = (j76 ^ (j22 & j110)) ^ (j109 & j112);
                j85 = (j85 ^ (j42 & j110)) ^ (j22 & j112);
                j100 = (j100 ^ (j46 & j110)) ^ (j42 & j112);
                j101 = (j101 ^ (j107 & j110)) ^ (j46 & j112);
                j102 = (j102 ^ (j47 & j110)) ^ (j107 & j112);
                j58 ^= j47 & j112;
                long j113 = j47 >> 63;
                j47 = (j47 << c6) | (j107 >>> 63);
                j107 = (j107 << c6) | (j46 >>> 63);
                j46 = (j46 << c6) | (j42 >>> 63);
                j42 = (j42 << c6) | (j22 >>> 63);
                j22 = (j22 << c6) | (j109 >>> 63);
                long j114 = (j111 << c6) | (j2 >>> 63);
                j2 = (j2 << c6) ^ (j113 & 293);
                i2++;
                c5 = c26;
                j108 = (j109 << c6) | (j111 >>> 63);
                j106 = j114;
            }
            long j115 = ((j2 ^ (j47 >>> 62)) ^ (j47 >>> 59)) ^ (j47 >>> 56);
            long j116 = ((j47 ^ (j47 << c16)) ^ (j47 << 5)) ^ (j47 << 8);
            i += 2;
            j47 = j107;
            c5 = c5;
            c2 = c6;
            j16 = j108;
            j3 = j115;
            j2 = j116;
            c3 = c16;
            j5 = j106;
        }
    }

    public static void multiplyX(long[] jArr, long[] jArr2) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j5 = jArr[2];
        long j16 = jArr[3];
        long j22 = jArr[4];
        long j42 = jArr[5];
        long j46 = jArr[6];
        long j47 = jArr[7];
        jArr2[0] = (j2 << 1) ^ ((j47 >> 63) & 293);
        jArr2[1] = (j3 << 1) | (j2 >>> 63);
        jArr2[2] = (j5 << 1) | (j3 >>> 63);
        jArr2[3] = (j16 << 1) | (j5 >>> 63);
        jArr2[4] = (j22 << 1) | (j16 >>> 63);
        jArr2[5] = (j42 << 1) | (j22 >>> 63);
        jArr2[6] = (j46 << 1) | (j42 >>> 63);
        jArr2[7] = (j47 << 1) | (j46 >>> 63);
    }

    public static void multiplyX8(long[] jArr, long[] jArr2) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j5 = jArr[2];
        long j16 = jArr[3];
        long j22 = jArr[4];
        long j42 = jArr[5];
        long j46 = jArr[6];
        long j47 = jArr[7];
        long j57 = j47 >>> 56;
        jArr2[0] = ((((j2 << 8) ^ j57) ^ (j57 << 2)) ^ (j57 << 5)) ^ (j57 << 8);
        jArr2[1] = (j3 << 8) | (j2 >>> 56);
        jArr2[2] = (j5 << 8) | (j3 >>> 56);
        jArr2[3] = (j16 << 8) | (j5 >>> 56);
        jArr2[4] = (j22 << 8) | (j16 >>> 56);
        jArr2[5] = (j42 << 8) | (j22 >>> 56);
        jArr2[6] = (j46 << 8) | (j42 >>> 56);
        jArr2[7] = (j47 << 8) | (j46 >>> 56);
    }

    public static void one(long[] jArr) {
        jArr[0] = 1;
        jArr[1] = 0;
        jArr[2] = 0;
        jArr[3] = 0;
        jArr[4] = 0;
        jArr[5] = 0;
        jArr[6] = 0;
        jArr[7] = 0;
    }

    public static void square(long[] jArr, long[] jArr2) {
        int i = 16;
        long[] jArr3 = new long[16];
        for (int i2 = 0; i2 < 8; i2++) {
            Interleave.expand64To128(jArr[i2], jArr3, i2 << 1);
        }
        while (true) {
            int i3 = i - 1;
            if (i3 < 8) {
                copy(jArr3, jArr2);
                return;
            }
            long j2 = jArr3[i3];
            int i5 = i - 9;
            jArr3[i5] = jArr3[i5] ^ ((((j2 << 2) ^ j2) ^ (j2 << 5)) ^ (j2 << 8));
            int i6 = i - 8;
            jArr3[i6] = ((j2 >>> 56) ^ ((j2 >>> 62) ^ (j2 >>> 59))) ^ jArr3[i6];
            i = i3;
        }
    }

    public static void x(long[] jArr) {
        jArr[0] = 2;
        jArr[1] = 0;
        jArr[2] = 0;
        jArr[3] = 0;
        jArr[4] = 0;
        jArr[5] = 0;
        jArr[6] = 0;
        jArr[7] = 0;
    }

    public static void zero(long[] jArr) {
        jArr[0] = 0;
        jArr[1] = 0;
        jArr[2] = 0;
        jArr[3] = 0;
        jArr[4] = 0;
        jArr[5] = 0;
        jArr[6] = 0;
        jArr[7] = 0;
    }
}
