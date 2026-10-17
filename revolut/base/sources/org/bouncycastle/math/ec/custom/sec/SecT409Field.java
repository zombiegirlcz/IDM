package org.bouncycastle.math.ec.custom.sec;

import com.google.android.gms.wallet.WalletConstants;
import java.math.BigInteger;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat448;

/* JADX INFO: loaded from: classes14.dex */
public class SecT409Field {
    private static final long M25 = 33554431;
    private static final long M59 = 576460752303423487L;

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr2[6] ^ jArr[6];
    }

    public static void addExt(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 13; i++) {
            jArr3[i] = jArr[i] ^ jArr2[i];
        }
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
        jArr2[4] = jArr[4];
        jArr2[5] = jArr[5];
        jArr2[6] = jArr[6];
    }

    private static void addTo(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr2[0] ^ jArr[0];
        jArr2[1] = jArr2[1] ^ jArr[1];
        jArr2[2] = jArr2[2] ^ jArr[2];
        jArr2[3] = jArr2[3] ^ jArr[3];
        jArr2[4] = jArr2[4] ^ jArr[4];
        jArr2[5] = jArr2[5] ^ jArr[5];
        jArr2[6] = jArr2[6] ^ jArr[6];
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        return Nat.fromBigInteger64(WalletConstants.ERROR_CODE_BUYER_ACCOUNT_ERROR, bigInteger);
    }

    public static void halfTrace(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(13);
        Nat448.copy64(jArr, jArr2);
        for (int i = 1; i < 409; i += 2) {
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
        long j65 = jArr[10];
        long j69 = jArr[11];
        long j76 = jArr[12];
        long j85 = jArr[13];
        jArr[0] = j2 ^ (j3 << 59);
        jArr[1] = (j3 >>> 5) ^ (j5 << 54);
        jArr[2] = (j5 >>> 10) ^ (j16 << 49);
        jArr[3] = (j16 >>> 15) ^ (j22 << 44);
        jArr[4] = (j22 >>> 20) ^ (j42 << 39);
        jArr[5] = (j42 >>> 25) ^ (j46 << 34);
        jArr[6] = (j46 >>> 30) ^ (j47 << 29);
        jArr[7] = (j47 >>> 35) ^ (j57 << 24);
        jArr[8] = (j57 >>> 40) ^ (j58 << 19);
        jArr[9] = (j58 >>> 45) ^ (j65 << 14);
        jArr[10] = (j65 >>> 50) ^ (j69 << 9);
        jArr[11] = ((j69 >>> 55) ^ (j76 << 4)) ^ (j85 << 63);
        jArr[12] = j85 >>> 1;
    }

    public static void implExpand(long[] jArr, long[] jArr2) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j5 = jArr[2];
        long j16 = jArr[3];
        long j22 = jArr[4];
        long j42 = jArr[5];
        long j46 = jArr[6];
        jArr2[0] = j2 & M59;
        jArr2[1] = ((j2 >>> 59) ^ (j3 << 5)) & M59;
        jArr2[2] = ((j3 >>> 54) ^ (j5 << 10)) & M59;
        jArr2[3] = ((j5 >>> 49) ^ (j16 << 15)) & M59;
        jArr2[4] = ((j16 >>> 44) ^ (j22 << 20)) & M59;
        jArr2[5] = ((j22 >>> 39) ^ (j42 << 25)) & M59;
        jArr2[6] = (j42 >>> 34) ^ (j46 << 30);
    }

    public static void implMultiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[7];
        long[] jArr5 = new long[7];
        implExpand(jArr, jArr4);
        implExpand(jArr2, jArr5);
        long[] jArr6 = new long[8];
        for (int i = 0; i < 7; i++) {
            implMulwAcc(jArr6, jArr4[i], jArr5[i], jArr3, i << 1);
        }
        long j2 = jArr3[0];
        long j3 = jArr3[1];
        long j5 = jArr3[2] ^ j2;
        long j16 = j5 ^ j3;
        jArr3[1] = j16;
        long j22 = j3 ^ jArr3[3];
        long j42 = j5 ^ jArr3[4];
        long j46 = j42 ^ j22;
        jArr3[2] = j46;
        long j47 = j22 ^ jArr3[5];
        long j57 = j42 ^ jArr3[6];
        long j58 = j57 ^ j47;
        jArr3[3] = j58;
        long j65 = j47 ^ jArr3[7];
        long j69 = j57 ^ jArr3[8];
        long j76 = j69 ^ j65;
        jArr3[4] = j76;
        long j85 = j65 ^ jArr3[9];
        long j100 = j69 ^ jArr3[10];
        long j101 = j100 ^ j85;
        jArr3[5] = j101;
        long j102 = j85 ^ jArr3[11];
        long j103 = j100 ^ jArr3[12];
        long j104 = j103 ^ j102;
        jArr3[6] = j104;
        long j105 = (j102 ^ jArr3[13]) ^ j103;
        jArr3[7] = j2 ^ j105;
        jArr3[8] = j16 ^ j105;
        jArr3[9] = j46 ^ j105;
        jArr3[10] = j58 ^ j105;
        jArr3[11] = j76 ^ j105;
        jArr3[12] = j101 ^ j105;
        jArr3[13] = j104 ^ j105;
        implMulwAcc(jArr6, jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        implMulwAcc(jArr6, jArr4[0] ^ jArr4[2], jArr5[0] ^ jArr5[2], jArr3, 2);
        implMulwAcc(jArr6, jArr4[0] ^ jArr4[3], jArr5[0] ^ jArr5[3], jArr3, 3);
        implMulwAcc(jArr6, jArr4[1] ^ jArr4[2], jArr5[1] ^ jArr5[2], jArr3, 3);
        implMulwAcc(jArr6, jArr4[0] ^ jArr4[4], jArr5[0] ^ jArr5[4], jArr3, 4);
        implMulwAcc(jArr6, jArr4[1] ^ jArr4[3], jArr5[1] ^ jArr5[3], jArr3, 4);
        implMulwAcc(jArr6, jArr4[0] ^ jArr4[5], jArr5[0] ^ jArr5[5], jArr3, 5);
        implMulwAcc(jArr6, jArr4[1] ^ jArr4[4], jArr5[1] ^ jArr5[4], jArr3, 5);
        implMulwAcc(jArr6, jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 5);
        implMulwAcc(jArr6, jArr4[0] ^ jArr4[6], jArr5[0] ^ jArr5[6], jArr3, 6);
        implMulwAcc(jArr6, jArr4[1] ^ jArr4[5], jArr5[1] ^ jArr5[5], jArr3, 6);
        implMulwAcc(jArr6, jArr4[2] ^ jArr4[4], jArr5[2] ^ jArr5[4], jArr3, 6);
        implMulwAcc(jArr6, jArr4[1] ^ jArr4[6], jArr5[1] ^ jArr5[6], jArr3, 7);
        implMulwAcc(jArr6, jArr4[2] ^ jArr4[5], jArr5[2] ^ jArr5[5], jArr3, 7);
        implMulwAcc(jArr6, jArr4[3] ^ jArr4[4], jArr5[3] ^ jArr5[4], jArr3, 7);
        implMulwAcc(jArr6, jArr4[2] ^ jArr4[6], jArr5[2] ^ jArr5[6], jArr3, 8);
        implMulwAcc(jArr6, jArr4[3] ^ jArr4[5], jArr5[3] ^ jArr5[5], jArr3, 8);
        implMulwAcc(jArr6, jArr4[3] ^ jArr4[6], jArr5[3] ^ jArr5[6], jArr3, 9);
        implMulwAcc(jArr6, jArr4[4] ^ jArr4[5], jArr5[4] ^ jArr5[5], jArr3, 9);
        implMulwAcc(jArr6, jArr4[4] ^ jArr4[6], jArr5[4] ^ jArr5[6], jArr3, 10);
        implMulwAcc(jArr6, jArr4[5] ^ jArr4[6], jArr5[5] ^ jArr5[6], jArr3, 11);
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
        Interleave.expand64To128(jArr, 0, 6, jArr2, 0);
        jArr2[12] = Interleave.expand32to64((int) jArr[6]);
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (Nat448.isZero64(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrCreate64 = Nat448.create64();
        long[] jArrCreate642 = Nat448.create64();
        long[] jArrCreate643 = Nat448.create64();
        square(jArr, jArrCreate64);
        squareN(jArrCreate64, 1, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate642, 1, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 3, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 6, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 12, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate643);
        squareN(jArrCreate643, 24, jArrCreate64);
        squareN(jArrCreate64, 24, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 48, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 96, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 192, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        multiply(jArrCreate64, jArrCreate643, jArr2);
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt64 = Nat448.createExt64();
        implMultiply(jArr, jArr2, jArrCreateExt64);
        reduce(jArrCreateExt64, jArr3);
    }

    public static void multiplyAddToExt(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt64 = Nat448.createExt64();
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
        long j57 = jArr[12];
        long j58 = j42 ^ (j57 << 39);
        long j65 = j46 ^ ((j57 >>> 25) ^ (j57 << 62));
        long j69 = j47 ^ (j57 >>> 2);
        long j76 = jArr[11];
        long j85 = j22 ^ (j76 << 39);
        long j100 = j58 ^ ((j76 >>> 25) ^ (j76 << 62));
        long j101 = j65 ^ (j76 >>> 2);
        long j102 = jArr[10];
        long j103 = j16 ^ (j102 << 39);
        long j104 = j85 ^ ((j102 >>> 25) ^ (j102 << 62));
        long j105 = j100 ^ (j102 >>> 2);
        long j106 = jArr[9];
        long j107 = j5 ^ (j106 << 39);
        long j108 = j103 ^ ((j106 >>> 25) ^ (j106 << 62));
        long j109 = j104 ^ (j106 >>> 2);
        long j110 = jArr[8];
        long j111 = j2 ^ (j69 << 39);
        long j112 = (j3 ^ (j110 << 39)) ^ ((j69 >>> 25) ^ (j69 << 62));
        long j113 = (j107 ^ ((j110 >>> 25) ^ (j110 << 62))) ^ (j69 >>> 2);
        long j114 = j101 >>> 25;
        jArr2[0] = j111 ^ j114;
        jArr2[1] = (j114 << 23) ^ j112;
        jArr2[2] = j113;
        jArr2[3] = j108 ^ (j110 >>> 2);
        jArr2[4] = j109;
        jArr2[5] = j105;
        jArr2[6] = j101 & M25;
    }

    public static void reduce39(long[] jArr, int i) {
        int i2 = i + 6;
        long j2 = jArr[i2];
        long j3 = j2 >>> 25;
        jArr[i] = jArr[i] ^ j3;
        int i3 = i + 1;
        jArr[i3] = (j3 << 23) ^ jArr[i3];
        jArr[i2] = j2 & M25;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long jUnshuffle = Interleave.unshuffle(jArr[0]);
        long jUnshuffle2 = Interleave.unshuffle(jArr[1]);
        long j2 = (jUnshuffle & BodyPartID.bodyIdMax) | (jUnshuffle2 << 32);
        long j3 = (jUnshuffle >>> 32) | (jUnshuffle2 & (-4294967296L));
        long jUnshuffle3 = Interleave.unshuffle(jArr[2]);
        long jUnshuffle4 = Interleave.unshuffle(jArr[3]);
        long j5 = (jUnshuffle3 & BodyPartID.bodyIdMax) | (jUnshuffle4 << 32);
        long j16 = (jUnshuffle3 >>> 32) | (jUnshuffle4 & (-4294967296L));
        long jUnshuffle5 = Interleave.unshuffle(jArr[4]);
        long jUnshuffle6 = Interleave.unshuffle(jArr[5]);
        long j22 = (jUnshuffle5 & BodyPartID.bodyIdMax) | (jUnshuffle6 << 32);
        long j42 = (jUnshuffle5 >>> 32) | (jUnshuffle6 & (-4294967296L));
        long jUnshuffle7 = Interleave.unshuffle(jArr[6]);
        long j46 = jUnshuffle7 & BodyPartID.bodyIdMax;
        long j47 = jUnshuffle7 >>> 32;
        jArr2[0] = j2 ^ (j3 << 44);
        jArr2[1] = (j5 ^ (j16 << 44)) ^ (j3 >>> 20);
        jArr2[2] = (j22 ^ (j42 << 44)) ^ (j16 >>> 20);
        jArr2[3] = (((j47 << 44) ^ j46) ^ (j42 >>> 20)) ^ (j3 << 13);
        jArr2[4] = (j3 >>> 51) ^ ((jUnshuffle7 >>> 52) ^ (j16 << 13));
        jArr2[5] = (j42 << 13) ^ (j16 >>> 51);
        jArr2[6] = (j47 << 13) ^ (j42 >>> 51);
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(13);
        implSquare(jArr, jArrCreate64);
        reduce(jArrCreate64, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(13);
        implSquare(jArr, jArrCreate64);
        addExt(jArr2, jArrCreate64, jArr2);
    }

    public static void squareN(long[] jArr, int i, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(13);
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
        return ((int) jArr[0]) & 1;
    }
}
