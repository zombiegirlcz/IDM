package org.bouncycastle.math.ec.custom.sec;

import com.youTransactor.uCube.rpc.Constants;
import java.math.BigInteger;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat192;

/* JADX INFO: loaded from: classes14.dex */
public class SecT163Field {
    private static final long M35 = 34359738367L;
    private static final long M55 = 36028797018963967L;
    private static final long[] ROOT_Z = {-5270498306774157648L, 5270498306774195053L, 19634136210L};

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
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr2[5] ^ jArr[5];
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
        return Nat.fromBigInteger64(Constants.TAG_ACE_LAYER_VERSION, bigInteger);
    }

    public static void halfTrace(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat192.createExt64();
        Nat192.copy64(jArr, jArr2);
        for (int i = 1; i < 163; i += 2) {
            implSquare(jArr2, jArrCreateExt64);
            reduce(jArrCreateExt64, jArr2);
            implSquare(jArr2, jArrCreateExt64);
            reduce(jArrCreateExt64, jArr2);
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
        jArr[0] = j2 ^ (j3 << 55);
        jArr[1] = (j3 >>> 9) ^ (j5 << 46);
        jArr[2] = (j5 >>> 18) ^ (j16 << 37);
        jArr[3] = (j16 >>> 27) ^ (j22 << 28);
        jArr[4] = (j22 >>> 36) ^ (j42 << 19);
        jArr[5] = j42 >>> 45;
    }

    public static void implMultiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j5 = (j3 >>> 46) ^ (jArr[2] << 18);
        long j16 = ((j3 << 9) ^ (j2 >>> 55)) & M55;
        long j22 = j2 & M55;
        long j42 = jArr2[0];
        long j46 = jArr2[1];
        long j47 = (j46 >>> 46) ^ (jArr2[2] << 18);
        long j57 = ((j42 >>> 55) ^ (j46 << 9)) & M55;
        long j58 = j42 & M55;
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
        long j113 = (((j108 ^ j105) ^ (j112 << 4)) ^ (j112 << 1)) ^ (j111 >>> 55);
        long j114 = j111 & M55;
        long j115 = (j109 ^ j103) ^ (j113 >>> 55);
        long j116 = (j114 >>> 1) ^ ((j113 & 1) << 54);
        long j117 = ((j113 & M55) >>> 1) ^ ((j115 & 1) << 54);
        long j118 = j116 ^ (j116 << 1);
        long j119 = j118 ^ (j118 << 2);
        long j120 = j119 ^ (j119 << 4);
        long j121 = j120 ^ (j120 << 8);
        long j122 = j121 ^ (j121 << 16);
        long j123 = (j122 ^ (j122 << 32)) & M55;
        long j124 = j117 ^ (j123 >>> 54);
        long j125 = j124 ^ (j124 << 1);
        long j126 = j125 ^ (j125 << 2);
        long j127 = j126 ^ (j126 << 4);
        long j128 = j127 ^ (j127 << 8);
        long j129 = j128 ^ (j128 << 16);
        long j130 = M55 & (j129 ^ (j129 << 32));
        long j131 = (j115 >>> 1) ^ (j130 >>> 54);
        long j132 = j131 ^ (j131 << 1);
        long j133 = j132 ^ (j132 << 2);
        long j134 = j133 ^ (j133 << 4);
        long j135 = j134 ^ (j134 << 8);
        long j136 = j135 ^ (j135 << 16);
        long j137 = j136 ^ (j136 << 32);
        jArr3[0] = j106;
        jArr3[1] = (j108 ^ j123) ^ j110;
        jArr3[2] = ((j109 ^ j130) ^ j123) ^ j112;
        jArr3[3] = j137 ^ j130;
        jArr3[4] = jArr4[2] ^ j137;
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
        long j46 = jArr[((int) j2) & 3];
        long j47 = 0;
        int i2 = 47;
        do {
            int i3 = (int) (j2 >>> i2);
            long j57 = (jArr[i3 & 7] ^ (jArr[(i3 >>> 3) & 7] << 3)) ^ (jArr[(i3 >>> 6) & 7] << 6);
            j46 ^= j57 << i2;
            j47 ^= j57 >>> (-i2);
            i2 -= 9;
        } while (i2 > 0);
        jArr2[i] = M55 & j46;
        jArr2[i + 1] = (j46 >>> 55) ^ (j47 << 9);
    }

    public static void implSquare(long[] jArr, long[] jArr2) {
        Interleave.expand64To128(jArr, 0, 3, jArr2, 0);
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (Nat192.isZero64(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrCreate64 = Nat192.create64();
        long[] jArrCreate642 = Nat192.create64();
        square(jArr, jArrCreate64);
        squareN(jArrCreate64, 1, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate642, 1, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 3, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate642, 3, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 9, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate642, 9, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 27, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate642, 27, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 81, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArr2);
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
        long j42 = jArr[5];
        long j46 = j16 ^ ((((j42 >>> 35) ^ (j42 >>> 32)) ^ (j42 >>> 29)) ^ (j42 >>> 28));
        long j47 = (j5 ^ ((((j42 << 29) ^ (j42 << 32)) ^ (j42 << 35)) ^ (j42 << 36))) ^ ((j22 >>> 28) ^ (((j22 >>> 35) ^ (j22 >>> 32)) ^ (j22 >>> 29)));
        long j57 = j2 ^ ((((j46 << 29) ^ (j46 << 32)) ^ (j46 << 35)) ^ (j46 << 36));
        long j58 = (j3 ^ ((((j22 << 29) ^ (j22 << 32)) ^ (j22 << 35)) ^ (j22 << 36))) ^ ((j46 >>> 28) ^ (((j46 >>> 35) ^ (j46 >>> 32)) ^ (j46 >>> 29)));
        long j65 = j47 >>> 35;
        jArr2[0] = (((j57 ^ j65) ^ (j65 << 3)) ^ (j65 << 6)) ^ (j65 << 7);
        jArr2[1] = j58;
        jArr2[2] = M35 & j47;
    }

    public static void reduce29(long[] jArr, int i) {
        int i2 = i + 2;
        long j2 = jArr[i2];
        long j3 = j2 >>> 35;
        jArr[i] = ((j3 << 7) ^ (((j3 << 3) ^ j3) ^ (j3 << 6))) ^ jArr[i];
        jArr[i2] = j2 & M35;
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
        long[] jArrCreateExt64 = Nat192.createExt64();
        implSquare(jArr, jArrCreateExt64);
        reduce(jArrCreateExt64, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat192.createExt64();
        implSquare(jArr, jArrCreateExt64);
        addExt(jArr2, jArrCreateExt64, jArr2);
    }

    public static void squareN(long[] jArr, int i, long[] jArr2) {
        long[] jArrCreateExt64 = Nat192.createExt64();
        implSquare(jArr, jArrCreateExt64);
        while (true) {
            reduce(jArrCreateExt64, jArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                implSquare(jArr2, jArrCreateExt64);
            }
        }
    }

    public static int trace(long[] jArr) {
        return ((int) (jArr[0] ^ (jArr[2] >>> 29))) & 1;
    }
}
