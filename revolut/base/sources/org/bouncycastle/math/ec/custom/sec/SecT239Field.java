package org.bouncycastle.math.ec.custom.sec;

import ch.qos.logback.core.net.SyslogConstants;
import java.math.BigInteger;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat256;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes14.dex */
public class SecT239Field {
    private static final long M47 = 140737488355327L;
    private static final long M60 = 1152921504606846975L;

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    public static void addExt(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr2[7] ^ jArr[7];
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    private static void addTo(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr2[0] ^ jArr[0];
        jArr2[1] = jArr2[1] ^ jArr[1];
        jArr2[2] = jArr2[2] ^ jArr[2];
        jArr2[3] = jArr2[3] ^ jArr[3];
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        return Nat.fromBigInteger64(239, bigInteger);
    }

    public static void halfTrace(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat256.createExt64();
        Nat256.copy64(jArr, jArr2);
        for (int i = 1; i < 239; i += 2) {
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
        long j46 = jArr[6];
        long j47 = jArr[7];
        jArr[0] = j2 ^ (j3 << 60);
        jArr[1] = (j3 >>> 4) ^ (j5 << 56);
        jArr[2] = (j5 >>> 8) ^ (j16 << 52);
        jArr[3] = (j16 >>> 12) ^ (j22 << 48);
        jArr[4] = (j22 >>> 16) ^ (j42 << 44);
        jArr[5] = (j42 >>> 20) ^ (j46 << 40);
        jArr[6] = (j46 >>> 24) ^ (j47 << 36);
        jArr[7] = j47 >>> 28;
    }

    public static void implExpand(long[] jArr, long[] jArr2) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j5 = jArr[2];
        long j16 = jArr[3];
        jArr2[0] = j2 & M60;
        jArr2[1] = ((j2 >>> 60) ^ (j3 << 4)) & M60;
        jArr2[2] = ((j3 >>> 56) ^ (j5 << 8)) & M60;
        jArr2[3] = (j5 >>> 52) ^ (j16 << 12);
    }

    public static void implMultiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        implExpand(jArr, jArr4);
        implExpand(jArr2, jArr5);
        long[] jArr6 = new long[8];
        implMulwAcc(jArr6, jArr4[0], jArr5[0], jArr3, 0);
        implMulwAcc(jArr6, jArr4[1], jArr5[1], jArr3, 1);
        implMulwAcc(jArr6, jArr4[2], jArr5[2], jArr3, 2);
        implMulwAcc(jArr6, jArr4[3], jArr5[3], jArr3, 3);
        for (int i = 5; i > 0; i--) {
            jArr3[i] = jArr3[i] ^ jArr3[i - 1];
        }
        implMulwAcc(jArr6, jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        implMulwAcc(jArr6, jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 3);
        for (int i2 = 7; i2 > 1; i2--) {
            jArr3[i2] = jArr3[i2] ^ jArr3[i2 - 2];
        }
        long j2 = jArr4[0] ^ jArr4[2];
        long j3 = jArr4[1] ^ jArr4[3];
        long j5 = jArr5[0] ^ jArr5[2];
        long j16 = jArr5[3] ^ jArr5[1];
        implMulwAcc(jArr6, j2 ^ j3, j5 ^ j16, jArr3, 3);
        long[] jArr7 = new long[3];
        implMulwAcc(jArr6, j2, j5, jArr7, 0);
        implMulwAcc(jArr6, j3, j16, jArr7, 1);
        long j22 = jArr7[0];
        long j42 = jArr7[1];
        long j46 = jArr7[2];
        jArr3[2] = jArr3[2] ^ j22;
        jArr3[3] = (j22 ^ j42) ^ jArr3[3];
        jArr3[4] = jArr3[4] ^ (j42 ^ j46);
        jArr3[5] = jArr3[5] ^ j46;
        implCompactExt(jArr3);
    }

    public static void implMulwAcc(long[] jArr, long j2, long j3, long[] jArr2, int i) {
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
        long j46 = (jArr[(i2 >>> 3) & 7] << 3) ^ jArr[i2 & 7];
        long j47 = 0;
        int i3 = 54;
        do {
            int i5 = (int) (j2 >>> i3);
            long j57 = jArr[i5 & 7] ^ (jArr[(i5 >>> 3) & 7] << 3);
            j46 ^= j57 << i3;
            j47 ^= j57 >>> (-i3);
            i3 -= 6;
        } while (i3 > 0);
        jArr2[i] = jArr2[i] ^ (M60 & j46);
        int i6 = i + 1;
        jArr2[i6] = ((((((j2 & 585610922974906400L) & ((j3 << 4) >> 63)) >>> 5) ^ j47) << 4) ^ (j46 >>> 60)) ^ jArr2[i6];
    }

    public static void implSquare(long[] jArr, long[] jArr2) {
        Interleave.expand64To128(jArr, 0, 4, jArr2, 0);
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (Nat256.isZero64(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrCreate64 = Nat256.create64();
        long[] jArrCreate642 = Nat256.create64();
        square(jArr, jArrCreate64);
        multiply(jArrCreate64, jArr, jArrCreate64);
        square(jArrCreate64, jArrCreate64);
        multiply(jArrCreate64, jArr, jArrCreate64);
        squareN(jArrCreate64, 3, jArrCreate642);
        multiply(jArrCreate642, jArrCreate64, jArrCreate642);
        square(jArrCreate642, jArrCreate642);
        multiply(jArrCreate642, jArr, jArrCreate642);
        squareN(jArrCreate642, 7, jArrCreate64);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 14, jArrCreate642);
        multiply(jArrCreate642, jArrCreate64, jArrCreate642);
        square(jArrCreate642, jArrCreate642);
        multiply(jArrCreate642, jArr, jArrCreate642);
        squareN(jArrCreate642, 29, jArrCreate64);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        square(jArrCreate64, jArrCreate64);
        multiply(jArrCreate64, jArr, jArrCreate64);
        squareN(jArrCreate64, 59, jArrCreate642);
        multiply(jArrCreate642, jArrCreate64, jArrCreate642);
        square(jArrCreate642, jArrCreate642);
        multiply(jArrCreate642, jArr, jArrCreate642);
        squareN(jArrCreate642, LDSFile.EF_SOD_TAG, jArrCreate64);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        square(jArrCreate64, jArr2);
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt64 = Nat256.createExt64();
        implMultiply(jArr, jArr2, jArrCreateExt64);
        reduce(jArrCreateExt64, jArr3);
    }

    public static void multiplyAddToExt(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt64 = Nat256.createExt64();
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
        long j57 = j46 ^ (j47 >>> 17);
        long j58 = (j42 ^ (j47 << 47)) ^ (j57 >>> 17);
        long j65 = ((j22 ^ (j47 >>> 47)) ^ (j57 << 47)) ^ (j58 >>> 17);
        long j69 = j2 ^ (j65 << 17);
        long j76 = (j3 ^ (j58 << 17)) ^ (j65 >>> 47);
        long j85 = ((j5 ^ (j57 << 17)) ^ (j58 >>> 47)) ^ (j65 << 47);
        long j100 = (((j16 ^ (j47 << 17)) ^ (j57 >>> 47)) ^ (j58 << 47)) ^ (j65 >>> 17);
        long j101 = j100 >>> 47;
        jArr2[0] = j69 ^ j101;
        jArr2[1] = j76;
        jArr2[2] = (j101 << 30) ^ j85;
        jArr2[3] = M47 & j100;
    }

    public static void reduce17(long[] jArr, int i) {
        int i2 = i + 3;
        long j2 = jArr[i2];
        long j3 = j2 >>> 47;
        jArr[i] = jArr[i] ^ j3;
        int i3 = i + 2;
        jArr[i3] = (j3 << 30) ^ jArr[i3];
        jArr[i2] = j2 & M47;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long jUnshuffle = Interleave.unshuffle(jArr[0]);
        long jUnshuffle2 = Interleave.unshuffle(jArr[1]);
        long j2 = (jUnshuffle & BodyPartID.bodyIdMax) | (jUnshuffle2 << 32);
        long j3 = (jUnshuffle >>> 32) | (jUnshuffle2 & (-4294967296L));
        int i = 2;
        long jUnshuffle3 = Interleave.unshuffle(jArr[2]);
        long jUnshuffle4 = Interleave.unshuffle(jArr[3]);
        long j5 = (jUnshuffle3 & BodyPartID.bodyIdMax) | (jUnshuffle4 << 32);
        long j16 = (jUnshuffle4 & (-4294967296L)) | (jUnshuffle3 >>> 32);
        long j22 = j16 >>> 49;
        long j42 = (j3 >>> 49) | (j16 << 15);
        long j46 = j16 ^ (j3 << 15);
        long[] jArrCreateExt64 = Nat256.createExt64();
        int[] iArr = {39, SyslogConstants.LOG_CLOCK};
        int i2 = 0;
        while (i2 < i) {
            int i3 = iArr[i2];
            int i5 = i3 >>> 6;
            int i6 = i3 & 63;
            jArrCreateExt64[i5] = jArrCreateExt64[i5] ^ (j3 << i6);
            int i21 = i5 + 1;
            int[] iArr2 = iArr;
            int i22 = -i6;
            jArrCreateExt64[i21] = jArrCreateExt64[i21] ^ ((j46 << i6) | (j3 >>> i22));
            int i32 = i5 + 2;
            jArrCreateExt64[i32] = jArrCreateExt64[i32] ^ ((j42 << i6) | (j46 >>> i22));
            int i33 = i5 + 3;
            jArrCreateExt64[i33] = jArrCreateExt64[i33] ^ ((j22 << i6) | (j42 >>> i22));
            int i43 = i5 + 4;
            jArrCreateExt64[i43] = jArrCreateExt64[i43] ^ (j22 >>> i22);
            i2++;
            i = 2;
            iArr = iArr2;
        }
        reduce(jArrCreateExt64, jArr2);
        jArr2[0] = jArr2[0] ^ j2;
        jArr2[1] = jArr2[1] ^ j5;
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat256.createExt64();
        implSquare(jArr, jArrCreateExt64);
        reduce(jArrCreateExt64, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat256.createExt64();
        implSquare(jArr, jArrCreateExt64);
        addExt(jArr2, jArrCreateExt64, jArr2);
    }

    public static void squareN(long[] jArr, int i, long[] jArr2) {
        long[] jArrCreateExt64 = Nat256.createExt64();
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
        return ((int) ((jArr[0] ^ (jArr[1] >>> 17)) ^ (jArr[2] >>> 34))) & 1;
    }
}
