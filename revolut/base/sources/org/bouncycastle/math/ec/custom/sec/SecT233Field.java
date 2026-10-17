package org.bouncycastle.math.ec.custom.sec;

import com.youTransactor.uCube.rpc.Constants;
import java.math.BigInteger;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat256;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes14.dex */
public class SecT233Field {
    private static final long M41 = 2199023255551L;
    private static final long M59 = 576460752303423487L;

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
        return Nat.fromBigInteger64(Constants.TAG_USB_CAPABILITY, bigInteger);
    }

    public static void halfTrace(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat256.createExt64();
        Nat256.copy64(jArr, jArr2);
        for (int i = 1; i < 233; i += 2) {
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
        jArr[0] = j2 ^ (j3 << 59);
        jArr[1] = (j3 >>> 5) ^ (j5 << 54);
        jArr[2] = (j5 >>> 10) ^ (j16 << 49);
        jArr[3] = (j16 >>> 15) ^ (j22 << 44);
        jArr[4] = (j22 >>> 20) ^ (j42 << 39);
        jArr[5] = (j42 >>> 25) ^ (j46 << 34);
        jArr[6] = (j46 >>> 30) ^ (j47 << 29);
        jArr[7] = j47 >>> 35;
    }

    public static void implExpand(long[] jArr, long[] jArr2) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j5 = jArr[2];
        long j16 = jArr[3];
        jArr2[0] = j2 & M59;
        jArr2[1] = ((j2 >>> 59) ^ (j3 << 5)) & M59;
        jArr2[2] = ((j3 >>> 54) ^ (j5 << 10)) & M59;
        jArr2[3] = (j5 >>> 49) ^ (j16 << 15);
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
        jArr2[i] = jArr2[i] ^ (M59 & j46);
        int i6 = i + 1;
        jArr2[i6] = jArr2[i6] ^ ((j46 >>> 59) ^ (j47 << 5));
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
        squareN(jArrCreate64, 58, jArrCreate642);
        multiply(jArrCreate642, jArrCreate64, jArrCreate642);
        squareN(jArrCreate642, 116, jArrCreate64);
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
        long j57 = j42 ^ (j47 >>> 31);
        long j58 = (j22 ^ ((j47 >>> 41) ^ (j47 << 33))) ^ (j46 >>> 31);
        long j65 = ((j16 ^ (j47 << 23)) ^ ((j46 >>> 41) ^ (j46 << 33))) ^ (j57 >>> 31);
        long j69 = j2 ^ (j58 << 23);
        long j76 = (j3 ^ (j57 << 23)) ^ ((j58 >>> 41) ^ (j58 << 33));
        long j85 = ((j5 ^ (j46 << 23)) ^ ((j57 >>> 41) ^ (j57 << 33))) ^ (j58 >>> 31);
        long j100 = j65 >>> 41;
        jArr2[0] = j69 ^ j100;
        jArr2[1] = (j100 << 10) ^ j76;
        jArr2[2] = j85;
        jArr2[3] = M41 & j65;
    }

    public static void reduce23(long[] jArr, int i) {
        int i2 = i + 3;
        long j2 = jArr[i2];
        long j3 = j2 >>> 41;
        jArr[i] = jArr[i] ^ j3;
        int i3 = i + 1;
        jArr[i3] = (j3 << 10) ^ jArr[i3];
        jArr[i2] = j2 & M41;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long jUnshuffle = Interleave.unshuffle(jArr[0]);
        boolean z = true;
        long jUnshuffle2 = Interleave.unshuffle(jArr[1]);
        long j2 = (jUnshuffle & BodyPartID.bodyIdMax) | (jUnshuffle2 << 32);
        long j3 = (jUnshuffle >>> 32) | (jUnshuffle2 & (-4294967296L));
        long jUnshuffle3 = Interleave.unshuffle(jArr[2]);
        long jUnshuffle4 = Interleave.unshuffle(jArr[3]);
        long j5 = (BodyPartID.bodyIdMax & jUnshuffle3) | (jUnshuffle4 << 32);
        long j16 = (jUnshuffle3 >>> 32) | ((-4294967296L) & jUnshuffle4);
        long j22 = j16 >>> 27;
        long j42 = j16 ^ ((j3 >>> 27) | (j16 << 37));
        long j46 = j3 ^ (j3 << 37);
        long[] jArrCreateExt64 = Nat256.createExt64();
        int[] iArr = {32, LDSFile.EF_DG2_TAG, 191};
        int i = 0;
        while (i < 3) {
            int i2 = iArr[i];
            int i3 = i2 >>> 6;
            int i5 = i2 & 63;
            jArrCreateExt64[i3] = jArrCreateExt64[i3] ^ (j46 << i5);
            int i6 = i3 + 1;
            boolean z3 = z;
            int i21 = -i5;
            jArrCreateExt64[i6] = jArrCreateExt64[i6] ^ ((j42 << i5) | (j46 >>> i21));
            int i22 = i3 + 2;
            jArrCreateExt64[i22] = jArrCreateExt64[i22] ^ ((j22 << i5) | (j42 >>> i21));
            int i32 = i3 + 3;
            jArrCreateExt64[i32] = jArrCreateExt64[i32] ^ (j22 >>> i21);
            i++;
            z = z3;
        }
        boolean z4 = z;
        reduce(jArrCreateExt64, jArr2);
        jArr2[0] = jArr2[0] ^ j2;
        jArr2[z4 ? 1 : 0] = jArr2[z4 ? 1 : 0] ^ j5;
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
        return ((int) (jArr[0] ^ (jArr[2] >>> 31))) & 1;
    }
}
