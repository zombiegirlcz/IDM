package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat192;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes14.dex */
public class SecT131Field {
    private static final long M03 = 7;
    private static final long M44 = 17592186044415L;
    private static final long[] ROOT_Z = {2791191049453778211L, 2791191049453778402L, 6};

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr2[2] ^ jArr[2];
    }

    public static void addExt(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr2[4] ^ jArr[4];
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
    }

    private static void addTo(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr2[0] ^ jArr[0];
        jArr2[1] = jArr2[1] ^ jArr[1];
        jArr2[2] = jArr2[2] ^ jArr[2];
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        return Nat.fromBigInteger64(ISO781611.CREATION_DATE_AND_TIME_TAG, bigInteger);
    }

    public static void halfTrace(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(5);
        Nat192.copy64(jArr, jArr2);
        for (int i = 1; i < 131; i += 2) {
            implSquare(jArr2, jArrCreate64);
            reduce(jArrCreate64, jArr2);
            implSquare(jArr2, jArrCreate64);
            reduce(jArrCreate64, jArr2);
            addTo(jArr, jArr2);
        }
    }

    public static void implCompactExt(long[] jArr) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j5 = jArr[2];
        long j16 = jArr[3];
        long j22 = jArr[4];
        long j42 = jArr[5];
        jArr[0] = j2 ^ (j3 << 44);
        jArr[1] = (j3 >>> 20) ^ (j5 << 24);
        jArr[2] = ((j5 >>> 40) ^ (j16 << 4)) ^ (j22 << 48);
        jArr[3] = ((j16 >>> 60) ^ (j42 << 28)) ^ (j22 >>> 16);
        jArr[4] = j42 >>> 36;
        jArr[5] = 0;
    }

    public static void implMultiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j5 = ((jArr[2] << 40) ^ (j3 >>> 24)) & M44;
        long j16 = ((j2 >>> 44) ^ (j3 << 20)) & M44;
        long j22 = j2 & M44;
        long j42 = jArr2[0];
        long j46 = jArr2[1];
        long j47 = ((j46 >>> 24) ^ (jArr2[2] << 40)) & M44;
        long j57 = ((j42 >>> 44) ^ (j46 << 20)) & M44;
        long j58 = j42 & M44;
        long[] jArr4 = new long[10];
        implMulw(jArr3, j22, j58, jArr4, 0);
        implMulw(jArr3, j5, j47, jArr4, 2);
        long j65 = (j22 ^ j16) ^ j5;
        long j69 = (j58 ^ j57) ^ j47;
        implMulw(jArr3, j65, j69, jArr4, 4);
        long j76 = (j16 << 1) ^ (j5 << 2);
        long j85 = (j57 << 1) ^ (j47 << 2);
        implMulw(jArr3, j22 ^ j76, j58 ^ j85, jArr4, 6);
        implMulw(jArr3, j65 ^ j76, j69 ^ j85, jArr4, 8);
        long j100 = jArr4[6];
        long j101 = jArr4[8] ^ j100;
        long j102 = jArr4[7];
        long j103 = jArr4[9] ^ j102;
        long j104 = (j101 << 1) ^ j100;
        long j105 = (j101 ^ (j103 << 1)) ^ j102;
        long j106 = jArr4[0];
        long j107 = jArr4[1];
        long j108 = (j107 ^ j106) ^ jArr4[4];
        long j109 = j107 ^ jArr4[5];
        long j110 = jArr4[2];
        long j111 = ((j104 ^ j106) ^ (j110 << 4)) ^ (j110 << 1);
        long j112 = jArr4[3];
        long j113 = (((j108 ^ j105) ^ (j112 << 4)) ^ (j112 << 1)) ^ (j111 >>> 44);
        long j114 = (j109 ^ j103) ^ (j113 >>> 44);
        long j115 = ((j111 & M44) >>> 1) ^ ((j113 & 1) << 43);
        long j116 = ((j113 & M44) >>> 1) ^ ((j114 & 1) << 43);
        long j117 = j115 ^ (j115 << 1);
        long j118 = j117 ^ (j117 << 2);
        long j119 = j118 ^ (j118 << 4);
        long j120 = j119 ^ (j119 << 8);
        long j121 = j120 ^ (j120 << 16);
        long j122 = (j121 ^ (j121 << 32)) & M44;
        long j123 = j116 ^ (j122 >>> 43);
        long j124 = j123 ^ (j123 << 1);
        long j125 = j124 ^ (j124 << 2);
        long j126 = j125 ^ (j125 << 4);
        long j127 = j126 ^ (j126 << 8);
        long j128 = j127 ^ (j127 << 16);
        long j129 = (j128 ^ (j128 << 32)) & M44;
        long j130 = (j129 >>> 43) ^ (j114 >>> 1);
        long j131 = j130 ^ (j130 << 1);
        long j132 = j131 ^ (j131 << 2);
        long j133 = j132 ^ (j132 << 4);
        long j134 = j133 ^ (j133 << 8);
        long j135 = j134 ^ (j134 << 16);
        long j136 = j135 ^ (j135 << 32);
        jArr3[0] = j106;
        jArr3[1] = (j108 ^ j122) ^ j110;
        jArr3[2] = ((j109 ^ j129) ^ j122) ^ j112;
        jArr3[3] = j136 ^ j129;
        jArr3[4] = jArr4[2] ^ j136;
        jArr3[5] = jArr4[3];
        implCompactExt(jArr3);
    }

    public static void implMulw(long[] jArr, long j2, long j3, long[] jArr2, int i) {
        jArr[1] = j3;
        long j5 = j3 << 1;
        jArr[2] = j5;
        long j16 = j5 ^ j3;
        jArr[3] = j16;
        long j22 = j3 << 2;
        jArr[4] = j22;
        jArr[5] = j22 ^ j3;
        long j42 = j16 << 1;
        jArr[6] = j42;
        jArr[7] = j42 ^ j3;
        int i2 = (int) j2;
        long j46 = (((jArr[i2 & 7] ^ (jArr[(i2 >>> 3) & 7] << 3)) ^ (jArr[(i2 >>> 6) & 7] << 6)) ^ (jArr[(i2 >>> 9) & 7] << 9)) ^ (jArr[(i2 >>> 12) & 7] << 12);
        long j47 = 0;
        int i3 = 30;
        do {
            int i5 = (int) (j2 >>> i3);
            long j57 = (((jArr[i5 & 7] ^ (jArr[(i5 >>> 3) & 7] << 3)) ^ (jArr[(i5 >>> 6) & 7] << 6)) ^ (jArr[(i5 >>> 9) & 7] << 9)) ^ (jArr[(i5 >>> 12) & 7] << 12);
            j46 ^= j57 << i3;
            j47 ^= j57 >>> (-i3);
            i3 -= 15;
        } while (i3 > 0);
        jArr2[i] = M44 & j46;
        jArr2[i + 1] = (j46 >>> 44) ^ (j47 << 20);
    }

    public static void implSquare(long[] jArr, long[] jArr2) {
        Interleave.expand64To128(jArr, 0, 2, jArr2, 0);
        jArr2[4] = ((long) Interleave.expand8to16((int) jArr[2])) & BodyPartID.bodyIdMax;
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (Nat192.isZero64(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrCreate64 = Nat192.create64();
        long[] jArrCreate642 = Nat192.create64();
        square(jArr, jArrCreate64);
        multiply(jArrCreate64, jArr, jArrCreate64);
        squareN(jArrCreate64, 2, jArrCreate642);
        multiply(jArrCreate642, jArrCreate64, jArrCreate642);
        squareN(jArrCreate642, 4, jArrCreate64);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 8, jArrCreate642);
        multiply(jArrCreate642, jArrCreate64, jArrCreate642);
        squareN(jArrCreate642, 16, jArrCreate64);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 32, jArrCreate642);
        multiply(jArrCreate642, jArrCreate64, jArrCreate642);
        square(jArrCreate642, jArrCreate642);
        multiply(jArrCreate642, jArr, jArrCreate642);
        squareN(jArrCreate642, 65, jArrCreate64);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        square(jArrCreate64, jArr2);
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        implMultiply(jArr, jArr2, jArr4);
        reduce(jArr4, jArr3);
    }

    public static void multiplyAddToExt(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        implMultiply(jArr, jArr2, jArr4);
        addExt(jArr3, jArr4, jArr3);
    }

    public static void reduce(long[] jArr, long[] jArr2) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j5 = jArr[2];
        long j16 = jArr[3];
        long j22 = jArr[4];
        long j42 = j16 ^ (j22 >>> 59);
        long j46 = j2 ^ ((j42 << 61) ^ (j42 << 63));
        long j47 = (j3 ^ ((j22 << 61) ^ (j22 << 63))) ^ ((((j42 >>> 3) ^ (j42 >>> 1)) ^ j42) ^ (j42 << 5));
        long j57 = (j5 ^ ((((j22 >>> 3) ^ (j22 >>> 1)) ^ j22) ^ (j22 << 5))) ^ (j42 >>> 59);
        long j58 = j57 >>> 3;
        jArr2[0] = (((j46 ^ j58) ^ (j58 << 2)) ^ (j58 << 3)) ^ (j58 << 8);
        jArr2[1] = (j57 >>> 59) ^ j47;
        jArr2[2] = M03 & j57;
    }

    public static void reduce61(long[] jArr, int i) {
        int i2 = i + 2;
        long j2 = jArr[i2];
        long j3 = j2 >>> 3;
        jArr[i] = ((j3 << 8) ^ (((j3 << 2) ^ j3) ^ (j3 << 3))) ^ jArr[i];
        int i3 = i + 1;
        jArr[i3] = jArr[i3] ^ (j2 >>> 59);
        jArr[i2] = j2 & M03;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat192.create64();
        long jUnshuffle = Interleave.unshuffle(jArr[0]);
        long jUnshuffle2 = Interleave.unshuffle(jArr[1]);
        long j2 = (jUnshuffle & BodyPartID.bodyIdMax) | (jUnshuffle2 << 32);
        jArrCreate64[0] = (jUnshuffle >>> 32) | (jUnshuffle2 & (-4294967296L));
        long jUnshuffle3 = Interleave.unshuffle(jArr[2]);
        long j3 = jUnshuffle3 & BodyPartID.bodyIdMax;
        jArrCreate64[1] = jUnshuffle3 >>> 32;
        multiply(jArrCreate64, ROOT_Z, jArr2);
        jArr2[0] = jArr2[0] ^ j2;
        jArr2[1] = jArr2[1] ^ j3;
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(5);
        implSquare(jArr, jArrCreate64);
        reduce(jArrCreate64, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(5);
        implSquare(jArr, jArrCreate64);
        addExt(jArr2, jArrCreate64, jArr2);
    }

    public static void squareN(long[] jArr, int i, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(5);
        implSquare(jArr, jArrCreate64);
        while (true) {
            reduce(jArrCreate64, jArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                implSquare(jArr2, jArrCreate64);
            }
        }
    }

    public static int trace(long[] jArr) {
        return ((int) ((jArr[0] ^ (jArr[1] >>> 59)) ^ (jArr[2] >>> 1))) & 1;
    }
}
