package org.bouncycastle.math.ec.custom.sec;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.math.BigInteger;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat320;

/* JADX INFO: loaded from: classes14.dex */
public class SecT283Field {
    private static final long M27 = 134217727;
    private static final long M57 = 144115188075855871L;
    private static final long[] ROOT_Z = {878416384462358536L, 3513665537849438403L, -9076969306111048948L, 585610922974906400L, 34087042};

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr2[4] ^ jArr[4];
    }

    public static void addExt(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr[7] ^ jArr2[7];
        jArr3[8] = jArr2[8] ^ jArr[8];
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
        jArr2[4] = jArr[4];
    }

    private static void addTo(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr2[0] ^ jArr[0];
        jArr2[1] = jArr2[1] ^ jArr[1];
        jArr2[2] = jArr2[2] ^ jArr[2];
        jArr2[3] = jArr2[3] ^ jArr[3];
        jArr2[4] = jArr2[4] ^ jArr[4];
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        return Nat.fromBigInteger64(283, bigInteger);
    }

    public static void halfTrace(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(9);
        Nat320.copy64(jArr, jArr2);
        for (int i = 1; i < 283; i += 2) {
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
        long j46 = jArr[6];
        long j47 = jArr[7];
        long j57 = jArr[8];
        long j58 = jArr[9];
        jArr[0] = j2 ^ (j3 << 57);
        jArr[1] = (j3 >>> 7) ^ (j5 << 50);
        jArr[2] = (j5 >>> 14) ^ (j16 << 43);
        jArr[3] = (j16 >>> 21) ^ (j22 << 36);
        jArr[4] = (j22 >>> 28) ^ (j42 << 29);
        jArr[5] = (j42 >>> 35) ^ (j46 << 22);
        jArr[6] = (j46 >>> 42) ^ (j47 << 15);
        jArr[7] = (j47 >>> 49) ^ (j57 << 8);
        jArr[8] = (j57 >>> 56) ^ (j58 << 1);
        jArr[9] = j58 >>> 63;
    }

    public static void implExpand(long[] jArr, long[] jArr2) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j5 = jArr[2];
        long j16 = jArr[3];
        long j22 = jArr[4];
        jArr2[0] = j2 & M57;
        jArr2[1] = ((j2 >>> 57) ^ (j3 << 7)) & M57;
        jArr2[2] = ((j3 >>> 50) ^ (j5 << 14)) & M57;
        jArr2[3] = ((j5 >>> 43) ^ (j16 << 21)) & M57;
        jArr2[4] = (j16 >>> 36) ^ (j22 << 28);
    }

    public static void implMultiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[5];
        long[] jArr5 = new long[5];
        implExpand(jArr, jArr4);
        implExpand(jArr2, jArr5);
        long[] jArr6 = new long[26];
        implMulw(jArr3, jArr4[0], jArr5[0], jArr6, 0);
        implMulw(jArr3, jArr4[1], jArr5[1], jArr6, 2);
        implMulw(jArr3, jArr4[2], jArr5[2], jArr6, 4);
        implMulw(jArr3, jArr4[3], jArr5[3], jArr6, 6);
        implMulw(jArr3, jArr4[4], jArr5[4], jArr6, 8);
        long j2 = jArr4[0];
        long j3 = j2 ^ jArr4[1];
        long j5 = jArr5[0];
        long j16 = j5 ^ jArr5[1];
        long j22 = jArr4[2];
        long j42 = j2 ^ j22;
        long j46 = jArr5[2];
        long j47 = j5 ^ j46;
        long j57 = jArr4[4];
        long j58 = j22 ^ j57;
        long j65 = jArr5[4];
        long j69 = j46 ^ j65;
        long j76 = jArr4[3];
        long j85 = j76 ^ j57;
        long j100 = jArr5[3];
        long j101 = j100 ^ j65;
        implMulw(jArr3, j42 ^ j76, j47 ^ j100, jArr6, 18);
        implMulw(jArr3, j58 ^ jArr4[1], j69 ^ jArr5[1], jArr6, 20);
        long j102 = j3 ^ j85;
        long j103 = j16 ^ j101;
        long j104 = j102 ^ jArr4[2];
        long j105 = jArr5[2] ^ j103;
        implMulw(jArr3, j102, j103, jArr6, 22);
        implMulw(jArr3, j104, j105, jArr6, 24);
        implMulw(jArr3, j3, j16, jArr6, 10);
        implMulw(jArr3, j42, j47, jArr6, 12);
        implMulw(jArr3, j58, j69, jArr6, 14);
        implMulw(jArr3, j85, j101, jArr6, 16);
        jArr3[0] = jArr6[0];
        jArr3[9] = jArr6[9];
        long j106 = jArr6[0];
        long j107 = jArr6[1] ^ j106;
        long j108 = jArr6[2] ^ j107;
        long j109 = jArr6[10] ^ j108;
        jArr3[1] = j109;
        long j110 = jArr6[3] ^ jArr6[4];
        long j111 = j108 ^ (j110 ^ (jArr6[11] ^ jArr6[12]));
        jArr3[2] = j111;
        long j112 = j107 ^ j110;
        long j113 = jArr6[5] ^ jArr6[6];
        long j114 = jArr6[8];
        long j115 = (j112 ^ j113) ^ j114;
        long j116 = jArr6[13] ^ jArr6[14];
        long j117 = jArr6[18];
        long j118 = jArr6[22];
        long j119 = jArr6[24];
        jArr3[3] = (j115 ^ j116) ^ ((j117 ^ j118) ^ j119);
        long j120 = jArr6[7] ^ j114;
        long j121 = jArr6[9];
        long j122 = j120 ^ j121;
        long j123 = j122 ^ jArr6[17];
        jArr3[8] = j123;
        long j124 = (j122 ^ j113) ^ (jArr6[15] ^ jArr6[16]);
        jArr3[7] = j124;
        long j125 = j124 ^ j109;
        long j126 = jArr6[19] ^ jArr6[20];
        long j127 = jArr6[25];
        long j128 = j127 ^ j119;
        long j129 = jArr6[23];
        long j130 = j126 ^ j128;
        jArr3[4] = (j130 ^ (j117 ^ j129)) ^ j125;
        long j131 = jArr6[21];
        jArr3[5] = ((j111 ^ j123) ^ j130) ^ (j131 ^ j118);
        jArr3[6] = (((((j115 ^ j106) ^ j121) ^ j116) ^ j131) ^ j129) ^ j127;
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
        long j46 = jArr[((int) j2) & 7];
        long j47 = 0;
        int i2 = 48;
        do {
            int i3 = (int) (j2 >>> i2);
            long j57 = (jArr[i3 & 7] ^ (jArr[(i3 >>> 3) & 7] << 3)) ^ (jArr[(i3 >>> 6) & 7] << 6);
            j46 ^= j57 << i2;
            j47 ^= j57 >>> (-i2);
            i2 -= 9;
        } while (i2 > 0);
        jArr2[i] = M57 & j46;
        jArr2[i + 1] = (((((j2 & 72198606942111744L) & ((j3 << 7) >> 63)) >>> 8) ^ j47) << 7) ^ (j46 >>> 57);
    }

    public static void implSquare(long[] jArr, long[] jArr2) {
        Interleave.expand64To128(jArr, 0, 4, jArr2, 0);
        jArr2[8] = Interleave.expand32to64((int) jArr[4]);
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (Nat320.isZero64(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrCreate64 = Nat320.create64();
        long[] jArrCreate642 = Nat320.create64();
        square(jArr, jArrCreate64);
        multiply(jArrCreate64, jArr, jArrCreate64);
        squareN(jArrCreate64, 2, jArrCreate642);
        multiply(jArrCreate642, jArrCreate64, jArrCreate642);
        squareN(jArrCreate642, 4, jArrCreate64);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 8, jArrCreate642);
        multiply(jArrCreate642, jArrCreate64, jArrCreate642);
        square(jArrCreate642, jArrCreate642);
        multiply(jArrCreate642, jArr, jArrCreate642);
        squareN(jArrCreate642, 17, jArrCreate64);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        square(jArrCreate64, jArrCreate64);
        multiply(jArrCreate64, jArr, jArrCreate64);
        squareN(jArrCreate64, 35, jArrCreate642);
        multiply(jArrCreate642, jArrCreate64, jArrCreate642);
        squareN(jArrCreate642, 70, jArrCreate64);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        square(jArrCreate64, jArrCreate64);
        multiply(jArrCreate64, jArr, jArrCreate64);
        squareN(jArrCreate64, ModuleDescriptor.MODULE_VERSION, jArrCreate642);
        multiply(jArrCreate642, jArrCreate64, jArrCreate642);
        square(jArrCreate642, jArr2);
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt64 = Nat320.createExt64();
        implMultiply(jArr, jArr2, jArrCreateExt64);
        reduce(jArrCreateExt64, jArr3);
    }

    public static void multiplyAddToExt(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt64 = Nat320.createExt64();
        implMultiply(jArr, jArr2, jArrCreateExt64);
        addExt(jArr3, jArrCreateExt64, jArr3);
    }

    public static void reduce(long[] jArr, long[] jArr2) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j5 = jArr[2];
        long j16 = jArr[3];
        long j22 = jArr[4];
        long j42 = jArr[5];
        long j46 = jArr[6];
        long j47 = jArr[7];
        long j57 = jArr[8];
        long j58 = j22 ^ ((((j57 >>> 27) ^ (j57 >>> 22)) ^ (j57 >>> 20)) ^ (j57 >>> 15));
        long j65 = j2 ^ ((((j42 << 37) ^ (j42 << 42)) ^ (j42 << 44)) ^ (j42 << 49));
        long j69 = (j3 ^ ((((j46 << 37) ^ (j46 << 42)) ^ (j46 << 44)) ^ (j46 << 49))) ^ ((((j42 >>> 27) ^ (j42 >>> 22)) ^ (j42 >>> 20)) ^ (j42 >>> 15));
        long j76 = j58 >>> 27;
        jArr2[0] = (((j65 ^ j76) ^ (j76 << 5)) ^ (j76 << 7)) ^ (j76 << 12);
        jArr2[1] = j69;
        jArr2[2] = (j5 ^ ((((j47 << 37) ^ (j47 << 42)) ^ (j47 << 44)) ^ (j47 << 49))) ^ ((((j46 >>> 27) ^ (j46 >>> 22)) ^ (j46 >>> 20)) ^ (j46 >>> 15));
        jArr2[3] = (j16 ^ ((((j57 << 37) ^ (j57 << 42)) ^ (j57 << 44)) ^ (j57 << 49))) ^ ((((j47 >>> 27) ^ (j47 >>> 22)) ^ (j47 >>> 20)) ^ (j47 >>> 15));
        jArr2[4] = M27 & j58;
    }

    public static void reduce37(long[] jArr, int i) {
        int i2 = i + 4;
        long j2 = jArr[i2];
        long j3 = j2 >>> 27;
        jArr[i] = ((j3 << 12) ^ (((j3 << 5) ^ j3) ^ (j3 << 7))) ^ jArr[i];
        jArr[i2] = j2 & M27;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat320.create64();
        long jUnshuffle = Interleave.unshuffle(jArr[0]);
        long jUnshuffle2 = Interleave.unshuffle(jArr[1]);
        long j2 = (jUnshuffle & BodyPartID.bodyIdMax) | (jUnshuffle2 << 32);
        jArrCreate64[0] = (jUnshuffle >>> 32) | (jUnshuffle2 & (-4294967296L));
        long jUnshuffle3 = Interleave.unshuffle(jArr[2]);
        long jUnshuffle4 = Interleave.unshuffle(jArr[3]);
        long j3 = (jUnshuffle3 & BodyPartID.bodyIdMax) | (jUnshuffle4 << 32);
        jArrCreate64[1] = (jUnshuffle3 >>> 32) | ((-4294967296L) & jUnshuffle4);
        long jUnshuffle5 = Interleave.unshuffle(jArr[4]);
        long j5 = BodyPartID.bodyIdMax & jUnshuffle5;
        jArrCreate64[2] = jUnshuffle5 >>> 32;
        multiply(jArrCreate64, ROOT_Z, jArr2);
        jArr2[0] = jArr2[0] ^ j2;
        jArr2[1] = jArr2[1] ^ j3;
        jArr2[2] = jArr2[2] ^ j5;
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(9);
        implSquare(jArr, jArrCreate64);
        reduce(jArrCreate64, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(9);
        implSquare(jArr, jArrCreate64);
        addExt(jArr2, jArrCreate64, jArr2);
    }

    public static void squareN(long[] jArr, int i, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(9);
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
        return ((int) (jArr[0] ^ (jArr[4] >>> 15))) & 1;
    }
}
