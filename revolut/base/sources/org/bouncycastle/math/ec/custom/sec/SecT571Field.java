package org.bouncycastle.math.ec.custom.sec;

import ch.qos.logback.core.net.SyslogConstants;
import java.math.BigInteger;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat576;

/* JADX INFO: loaded from: classes14.dex */
public class SecT571Field {
    private static final long M59 = 576460752303423487L;
    private static final long[] ROOT_Z = {3161836309350906777L, -7642453882179322845L, -3821226941089661423L, 7312758566309945096L, -556661012383879292L, 8945041530681231562L, -4750851271514160027L, 6847946401097695794L, 541669439031730457L};

    private static void add(long[] jArr, int i, long[] jArr2, int i2, long[] jArr3, int i3) {
        for (int i5 = 0; i5 < 9; i5++) {
            jArr3[i3 + i5] = jArr[i + i5] ^ jArr2[i2 + i5];
        }
    }

    private static void addBothTo(long[] jArr, int i, long[] jArr2, int i2, long[] jArr3, int i3) {
        for (int i5 = 0; i5 < 9; i5++) {
            int i6 = i3 + i5;
            jArr3[i6] = jArr3[i6] ^ (jArr[i + i5] ^ jArr2[i2 + i5]);
        }
    }

    public static void addExt(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 18; i++) {
            jArr3[i] = jArr[i] ^ jArr2[i];
        }
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        for (int i = 1; i < 9; i++) {
            jArr2[i] = jArr[i];
        }
    }

    private static void addTo(long[] jArr, long[] jArr2) {
        for (int i = 0; i < 9; i++) {
            jArr2[i] = jArr2[i] ^ jArr[i];
        }
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        return Nat.fromBigInteger64(571, bigInteger);
    }

    public static void halfTrace(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat576.createExt64();
        Nat576.copy64(jArr, jArr2);
        for (int i = 1; i < 571; i += 2) {
            implSquare(jArr2, jArrCreateExt64);
            reduce(jArrCreateExt64, jArr2);
            implSquare(jArr2, jArrCreateExt64);
            reduce(jArrCreateExt64, jArr2);
            addTo(jArr, jArr2);
        }
    }

    public static void implMultiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[16];
        for (int i = 0; i < 9; i++) {
            implMulwAcc(jArr4, jArr[i], jArr2[i], jArr3, i << 1);
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
        long j105 = j102 ^ jArr3[13];
        long j106 = j103 ^ jArr3[14];
        long j107 = j106 ^ j105;
        jArr3[7] = j107;
        long j108 = j105 ^ jArr3[15];
        long j109 = j106 ^ jArr3[16];
        long j110 = j109 ^ j108;
        jArr3[8] = j110;
        long j111 = (j108 ^ jArr3[17]) ^ j109;
        jArr3[9] = j2 ^ j111;
        jArr3[10] = j16 ^ j111;
        jArr3[11] = j46 ^ j111;
        jArr3[12] = j58 ^ j111;
        jArr3[13] = j76 ^ j111;
        jArr3[14] = j101 ^ j111;
        jArr3[15] = j104 ^ j111;
        jArr3[16] = j107 ^ j111;
        jArr3[17] = j110 ^ j111;
        implMulwAcc(jArr4, jArr[0] ^ jArr[1], jArr2[0] ^ jArr2[1], jArr3, 1);
        implMulwAcc(jArr4, jArr[0] ^ jArr[2], jArr2[0] ^ jArr2[2], jArr3, 2);
        implMulwAcc(jArr4, jArr[0] ^ jArr[3], jArr2[0] ^ jArr2[3], jArr3, 3);
        implMulwAcc(jArr4, jArr[1] ^ jArr[2], jArr2[1] ^ jArr2[2], jArr3, 3);
        implMulwAcc(jArr4, jArr[0] ^ jArr[4], jArr2[0] ^ jArr2[4], jArr3, 4);
        implMulwAcc(jArr4, jArr[1] ^ jArr[3], jArr2[1] ^ jArr2[3], jArr3, 4);
        implMulwAcc(jArr4, jArr[0] ^ jArr[5], jArr2[0] ^ jArr2[5], jArr3, 5);
        implMulwAcc(jArr4, jArr[1] ^ jArr[4], jArr2[1] ^ jArr2[4], jArr3, 5);
        implMulwAcc(jArr4, jArr[2] ^ jArr[3], jArr2[2] ^ jArr2[3], jArr3, 5);
        implMulwAcc(jArr4, jArr[0] ^ jArr[6], jArr2[0] ^ jArr2[6], jArr3, 6);
        implMulwAcc(jArr4, jArr[1] ^ jArr[5], jArr2[1] ^ jArr2[5], jArr3, 6);
        implMulwAcc(jArr4, jArr[2] ^ jArr[4], jArr2[2] ^ jArr2[4], jArr3, 6);
        implMulwAcc(jArr4, jArr[0] ^ jArr[7], jArr2[0] ^ jArr2[7], jArr3, 7);
        implMulwAcc(jArr4, jArr[1] ^ jArr[6], jArr2[1] ^ jArr2[6], jArr3, 7);
        implMulwAcc(jArr4, jArr[2] ^ jArr[5], jArr2[2] ^ jArr2[5], jArr3, 7);
        implMulwAcc(jArr4, jArr[3] ^ jArr[4], jArr2[3] ^ jArr2[4], jArr3, 7);
        implMulwAcc(jArr4, jArr[0] ^ jArr[8], jArr2[0] ^ jArr2[8], jArr3, 8);
        implMulwAcc(jArr4, jArr[1] ^ jArr[7], jArr2[1] ^ jArr2[7], jArr3, 8);
        implMulwAcc(jArr4, jArr[2] ^ jArr[6], jArr2[2] ^ jArr2[6], jArr3, 8);
        implMulwAcc(jArr4, jArr[3] ^ jArr[5], jArr2[3] ^ jArr2[5], jArr3, 8);
        implMulwAcc(jArr4, jArr[1] ^ jArr[8], jArr2[1] ^ jArr2[8], jArr3, 9);
        implMulwAcc(jArr4, jArr[2] ^ jArr[7], jArr2[2] ^ jArr2[7], jArr3, 9);
        implMulwAcc(jArr4, jArr[3] ^ jArr[6], jArr2[3] ^ jArr2[6], jArr3, 9);
        implMulwAcc(jArr4, jArr[4] ^ jArr[5], jArr2[4] ^ jArr2[5], jArr3, 9);
        implMulwAcc(jArr4, jArr[2] ^ jArr[8], jArr2[2] ^ jArr2[8], jArr3, 10);
        implMulwAcc(jArr4, jArr[3] ^ jArr[7], jArr2[3] ^ jArr2[7], jArr3, 10);
        implMulwAcc(jArr4, jArr[4] ^ jArr[6], jArr2[4] ^ jArr2[6], jArr3, 10);
        implMulwAcc(jArr4, jArr[3] ^ jArr[8], jArr2[3] ^ jArr2[8], jArr3, 11);
        implMulwAcc(jArr4, jArr[4] ^ jArr[7], jArr2[4] ^ jArr2[7], jArr3, 11);
        implMulwAcc(jArr4, jArr[5] ^ jArr[6], jArr2[5] ^ jArr2[6], jArr3, 11);
        implMulwAcc(jArr4, jArr[4] ^ jArr[8], jArr2[4] ^ jArr2[8], jArr3, 12);
        implMulwAcc(jArr4, jArr[5] ^ jArr[7], jArr2[5] ^ jArr2[7], jArr3, 12);
        implMulwAcc(jArr4, jArr[5] ^ jArr[8], jArr2[5] ^ jArr2[8], jArr3, 13);
        implMulwAcc(jArr4, jArr[6] ^ jArr[7], jArr2[6] ^ jArr2[7], jArr3, 13);
        implMulwAcc(jArr4, jArr[6] ^ jArr[8], jArr2[6] ^ jArr2[8], jArr3, 14);
        implMulwAcc(jArr4, jArr[7] ^ jArr[8], jArr2[7] ^ jArr2[8], jArr3, 15);
    }

    public static void implMultiplyPrecomp(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 56; i >= 0; i -= 8) {
            for (int i2 = 1; i2 < 9; i2 += 2) {
                int i3 = (int) (jArr[i2] >>> i);
                addBothTo(jArr2, (i3 & 15) * 9, jArr2, (((i3 >>> 4) & 15) + 16) * 9, jArr3, i2 - 1);
            }
            Nat.shiftUpBits64(16, jArr3, 0, 8, 0L);
        }
        for (int i5 = 56; i5 >= 0; i5 -= 8) {
            int i6 = 0;
            while (i6 < 9) {
                int i21 = (int) (jArr[i6] >>> i5);
                int i22 = i6;
                addBothTo(jArr2, (i21 & 15) * 9, jArr2, (((i21 >>> 4) & 15) + 16) * 9, jArr3, i22);
                i6 = i22 + 2;
            }
            if (i5 > 0) {
                Nat.shiftUpBits64(18, jArr3, 0, 8, 0L);
            }
        }
    }

    public static void implMulwAcc(long[] jArr, long j2, long j3, long[] jArr2, int i) {
        jArr[1] = j3;
        long j5 = 0;
        long j16 = j3;
        long j22 = j2;
        for (int i2 = 2; i2 < 16; i2 += 2) {
            long j42 = jArr[i2 >>> 1] << 1;
            jArr[i2] = j42;
            jArr[i2 + 1] = j42 ^ j3;
            j22 = (j22 & (-72340172838076674L)) >>> 1;
            j5 ^= (j16 >> 63) & j22;
            j16 <<= 1;
        }
        int i3 = (int) j2;
        long j46 = jArr[i3 & 15] ^ (jArr[(i3 >>> 4) & 15] << 4);
        int i5 = 56;
        do {
            int i6 = (int) (j2 >>> i5);
            long j47 = jArr[i6 & 15] ^ (jArr[(i6 >>> 4) & 15] << 4);
            j46 ^= j47 << i5;
            j5 ^= j47 >>> (-i5);
            i5 -= 8;
        } while (i5 > 0);
        jArr2[i] = jArr2[i] ^ j46;
        int i21 = i + 1;
        jArr2[i21] = jArr2[i21] ^ j5;
    }

    public static void implSquare(long[] jArr, long[] jArr2) {
        Interleave.expand64To128(jArr, 0, 9, jArr2, 0);
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (Nat576.isZero64(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrCreate64 = Nat576.create64();
        long[] jArrCreate642 = Nat576.create64();
        long[] jArrCreate643 = Nat576.create64();
        square(jArr, jArrCreate643);
        square(jArrCreate643, jArrCreate64);
        square(jArrCreate64, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 2, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        multiply(jArrCreate64, jArrCreate643, jArrCreate64);
        squareN(jArrCreate64, 5, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate642, 5, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 15, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate643);
        squareN(jArrCreate643, 30, jArrCreate64);
        squareN(jArrCreate64, 30, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 60, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate642, 60, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 180, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate642, 180, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        multiply(jArrCreate64, jArrCreate643, jArr2);
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt64 = Nat576.createExt64();
        implMultiply(jArr, jArr2, jArrCreateExt64);
        reduce(jArrCreateExt64, jArr3);
    }

    public static void multiplyAddToExt(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt64 = Nat576.createExt64();
        implMultiply(jArr, jArr2, jArrCreateExt64);
        addExt(jArr3, jArrCreateExt64, jArr3);
    }

    public static void multiplyPrecomp(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt64 = Nat576.createExt64();
        implMultiplyPrecomp(jArr, jArr2, jArrCreateExt64);
        reduce(jArrCreateExt64, jArr3);
    }

    public static void multiplyPrecompAddToExt(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt64 = Nat576.createExt64();
        implMultiplyPrecomp(jArr, jArr2, jArrCreateExt64);
        addExt(jArr3, jArrCreateExt64, jArr3);
    }

    public static long[] precompMultiplicand(long[] jArr) {
        long[] jArr2 = new long[288];
        System.arraycopy(jArr, 0, jArr2, 9, 9);
        int i = 7;
        int i2 = 0;
        while (i > 0) {
            int i3 = i2 + 18;
            Nat.shiftUpBit64(9, jArr2, i3 >>> 1, 0L, jArr2, i3);
            reduce5(jArr2, i3);
            long[] jArr3 = jArr2;
            add(jArr3, 9, jArr3, i3, jArr3, i2 + 27);
            jArr2 = jArr3;
            i--;
            i2 = i3;
        }
        Nat.shiftUpBits64(SyslogConstants.LOG_LOCAL2, jArr2, 0, 4, 0L, jArr2, SyslogConstants.LOG_LOCAL2);
        return jArr2;
    }

    public static void reduce(long[] jArr, long[] jArr2) {
        long j2 = jArr[9];
        long j3 = jArr[17];
        long j5 = (((j2 ^ (j3 >>> 59)) ^ (j3 >>> 57)) ^ (j3 >>> 54)) ^ (j3 >>> 49);
        long j16 = (j3 << 15) ^ (((jArr[8] ^ (j3 << 5)) ^ (j3 << 7)) ^ (j3 << 10));
        for (int i = 16; i >= 10; i--) {
            long j22 = jArr[i];
            jArr2[i - 8] = (((j16 ^ (j22 >>> 59)) ^ (j22 >>> 57)) ^ (j22 >>> 54)) ^ (j22 >>> 49);
            j16 = (((jArr[i - 9] ^ (j22 << 5)) ^ (j22 << 7)) ^ (j22 << 10)) ^ (j22 << 15);
        }
        jArr2[1] = (((j16 ^ (j5 >>> 59)) ^ (j5 >>> 57)) ^ (j5 >>> 54)) ^ (j5 >>> 49);
        long j42 = (j5 << 15) ^ (((jArr[0] ^ (j5 << 5)) ^ (j5 << 7)) ^ (j5 << 10));
        long j46 = jArr2[8];
        long j47 = j46 >>> 59;
        jArr2[0] = (((j42 ^ j47) ^ (j47 << 2)) ^ (j47 << 5)) ^ (j47 << 10);
        jArr2[8] = M59 & j46;
    }

    public static void reduce5(long[] jArr, int i) {
        int i2 = i + 8;
        long j2 = jArr[i2];
        long j3 = j2 >>> 59;
        jArr[i] = ((j3 << 10) ^ (((j3 << 2) ^ j3) ^ (j3 << 5))) ^ jArr[i];
        jArr[i2] = j2 & M59;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat576.create64();
        long[] jArrCreate642 = Nat576.create64();
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = i + 1;
            long jUnshuffle = Interleave.unshuffle(jArr[i]);
            i += 2;
            long jUnshuffle2 = Interleave.unshuffle(jArr[i3]);
            jArrCreate64[i2] = (BodyPartID.bodyIdMax & jUnshuffle) | (jUnshuffle2 << 32);
            jArrCreate642[i2] = (jUnshuffle >>> 32) | ((-4294967296L) & jUnshuffle2);
        }
        long jUnshuffle3 = Interleave.unshuffle(jArr[i]);
        jArrCreate64[4] = BodyPartID.bodyIdMax & jUnshuffle3;
        jArrCreate642[4] = jUnshuffle3 >>> 32;
        multiply(jArrCreate642, ROOT_Z, jArr2);
        add(jArr2, jArrCreate64, jArr2);
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat576.createExt64();
        implSquare(jArr, jArrCreateExt64);
        reduce(jArrCreateExt64, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat576.createExt64();
        implSquare(jArr, jArrCreateExt64);
        addExt(jArr2, jArrCreateExt64, jArr2);
    }

    public static void squareN(long[] jArr, int i, long[] jArr2) {
        long[] jArrCreateExt64 = Nat576.createExt64();
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
        long j2 = jArr[0];
        long j3 = jArr[8];
        return ((int) ((j2 ^ (j3 >>> 49)) ^ (j3 >>> 57))) & 1;
    }

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 9; i++) {
            jArr3[i] = jArr[i] ^ jArr2[i];
        }
    }

    public static void addBothTo(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 9; i++) {
            jArr3[i] = jArr3[i] ^ (jArr[i] ^ jArr2[i]);
        }
    }
}
