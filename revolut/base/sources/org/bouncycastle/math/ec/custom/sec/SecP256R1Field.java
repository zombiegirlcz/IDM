package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat256;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes14.dex */
public class SecP256R1Field {
    private static final long M = 4294967295L;
    private static final int P7 = -1;
    private static final int PExt15s1 = Integer.MAX_VALUE;
    static final int[] P = {-1, -1, -1, 0, 0, 0, 1, -1};
    private static final int[] PExt = {1, 0, 0, -2, -1, -1, -2, 1, -2, 1, -2, 1, 1, -2, 2, -2};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat256.add(iArr, iArr2, iArr3) != 0 || (iArr3[7] == -1 && Nat256.gte(iArr3, P))) {
            addPInvTo(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.add(16, iArr, iArr2, iArr3) != 0 || ((iArr3[15] >>> 1) >= Integer.MAX_VALUE && Nat.gte(16, iArr3, PExt))) {
            Nat.subFrom(16, PExt, iArr3);
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (Nat.inc(8, iArr, iArr2) != 0 || (iArr2[7] == -1 && Nat256.gte(iArr2, P))) {
            addPInvTo(iArr2);
        }
    }

    private static void addPInvTo(int[] iArr) {
        long j2 = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j2;
        long j3 = j2 >> 32;
        if (j3 != 0) {
            long j5 = j3 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j5;
            long j16 = (j5 >> 32) + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j16;
            j3 = j16 >> 32;
        }
        long j22 = ((((long) iArr[3]) & 4294967295L) - 1) + j3;
        iArr[3] = (int) j22;
        long j42 = j22 >> 32;
        if (j42 != 0) {
            long j46 = j42 + (((long) iArr[4]) & 4294967295L);
            iArr[4] = (int) j46;
            long j47 = (j46 >> 32) + (((long) iArr[5]) & 4294967295L);
            iArr[5] = (int) j47;
            j42 = j47 >> 32;
        }
        long j57 = ((((long) iArr[6]) & 4294967295L) - 1) + j42;
        iArr[6] = (int) j57;
        iArr[7] = (int) ((4294967295L & ((long) iArr[7])) + 1 + (j57 >> 32));
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] iArrFromBigInteger = Nat256.fromBigInteger(bigInteger);
        if (iArrFromBigInteger[7] == -1) {
            int[] iArr = P;
            if (Nat256.gte(iArrFromBigInteger, iArr)) {
                Nat256.subFrom(iArr, iArrFromBigInteger);
            }
        }
        return iArrFromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            Nat.shiftDownBit(8, iArr, 0, iArr2);
        } else {
            Nat.shiftDownBit(8, iArr2, Nat256.add(iArr, P, iArr2));
        }
    }

    public static void inv(int[] iArr, int[] iArr2) {
        Mod.checkedModOddInverse(P, iArr, iArr2);
    }

    public static int isZero(int[] iArr) {
        return Nat.equalToZero(8, iArr);
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrCreateExt = Nat256.createExt();
        Nat256.mul(iArr, iArr2, iArrCreateExt);
        reduce(iArrCreateExt, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat256.mulAddTo(iArr, iArr2, iArr3) != 0 || ((iArr3[15] >>> 1) >= Integer.MAX_VALUE && Nat.gte(16, iArr3, PExt))) {
            Nat.subFrom(16, PExt, iArr3);
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (isZero(iArr) == 0) {
            Nat256.sub(P, iArr, iArr2);
        } else {
            int[] iArr3 = P;
            Nat256.sub(iArr3, iArr3, iArr2);
        }
    }

    public static void random(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[32];
        do {
            secureRandom.nextBytes(bArr);
            Pack.littleEndianToInt(bArr, 0, iArr, 0, 8);
        } while (Nat.lessThan(8, iArr, P) == 0);
    }

    public static void randomMult(SecureRandom secureRandom, int[] iArr) {
        do {
            random(secureRandom, iArr);
        } while (isZero(iArr) != 0);
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j2 = ((long) iArr[8]) & 4294967295L;
        long j3 = ((long) iArr[9]) & 4294967295L;
        long j5 = ((long) iArr[10]) & 4294967295L;
        long j16 = ((long) iArr[11]) & 4294967295L;
        long j22 = ((long) iArr[12]) & 4294967295L;
        long j42 = ((long) iArr[13]) & 4294967295L;
        long j46 = ((long) iArr[14]) & 4294967295L;
        long j47 = ((long) iArr[15]) & 4294967295L;
        long j57 = j2 - 6;
        long j58 = j57 + j3;
        long j65 = j3 + j5;
        long j69 = (j5 + j16) - j47;
        long j76 = j16 + j22;
        long j85 = j22 + j42;
        long j100 = j42 + j46;
        long j101 = j46 + j47;
        long j102 = j100 - j58;
        long j103 = ((((long) iArr[0]) & 4294967295L) - j76) - j102;
        iArr2[0] = (int) j103;
        long j104 = ((((((long) iArr[1]) & 4294967295L) + j65) - j85) - j101) + (j103 >> 32);
        iArr2[1] = (int) j104;
        long j105 = (((((long) iArr[2]) & 4294967295L) + j69) - j100) + (j104 >> 32);
        iArr2[2] = (int) j105;
        long j106 = ((((((long) iArr[3]) & 4294967295L) + (j76 << 1)) + j102) - j101) + (j105 >> 32);
        iArr2[3] = (int) j106;
        long j107 = ((((((long) iArr[4]) & 4294967295L) + (j85 << 1)) + j46) - j65) + (j106 >> 32);
        iArr2[4] = (int) j107;
        long j108 = (((((long) iArr[5]) & 4294967295L) + (j100 << 1)) - j69) + (j107 >> 32);
        iArr2[5] = (int) j108;
        long j109 = (((long) iArr[6]) & 4294967295L) + (j101 << 1) + j102 + (j108 >> 32);
        iArr2[6] = (int) j109;
        long j110 = (((((((long) iArr[7]) & 4294967295L) + (j47 << 1)) + j57) - j69) - j85) + (j109 >> 32);
        iArr2[7] = (int) j110;
        reduce32((int) ((j110 >> 32) + 6), iArr2);
    }

    public static void reduce32(int i, int[] iArr) {
        long j2;
        if (i != 0) {
            long j3 = ((long) i) & 4294967295L;
            long j5 = (((long) iArr[0]) & 4294967295L) + j3;
            iArr[0] = (int) j5;
            long j16 = j5 >> 32;
            if (j16 != 0) {
                long j22 = j16 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j22;
                long j42 = (j22 >> 32) + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j42;
                j16 = j42 >> 32;
            }
            long j46 = ((((long) iArr[3]) & 4294967295L) - j3) + j16;
            iArr[3] = (int) j46;
            long j47 = j46 >> 32;
            if (j47 != 0) {
                long j57 = j47 + (((long) iArr[4]) & 4294967295L);
                iArr[4] = (int) j57;
                long j58 = (j57 >> 32) + (((long) iArr[5]) & 4294967295L);
                iArr[5] = (int) j58;
                j47 = j58 >> 32;
            }
            long j65 = ((((long) iArr[6]) & 4294967295L) - j3) + j47;
            iArr[6] = (int) j65;
            long j69 = (4294967295L & ((long) iArr[7])) + j3 + (j65 >> 32);
            iArr[7] = (int) j69;
            j2 = j69 >> 32;
        } else {
            j2 = 0;
        }
        if (j2 != 0 || (iArr[7] == -1 && Nat256.gte(iArr, P))) {
            addPInvTo(iArr);
        }
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] iArrCreateExt = Nat256.createExt();
        Nat256.square(iArr, iArrCreateExt);
        reduce(iArrCreateExt, iArr2);
    }

    public static void squareN(int[] iArr, int i, int[] iArr2) {
        int[] iArrCreateExt = Nat256.createExt();
        Nat256.square(iArr, iArrCreateExt);
        while (true) {
            reduce(iArrCreateExt, iArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                Nat256.square(iArr2, iArrCreateExt);
            }
        }
    }

    private static void subPInvFrom(int[] iArr) {
        long j2 = (((long) iArr[0]) & 4294967295L) - 1;
        iArr[0] = (int) j2;
        long j3 = j2 >> 32;
        if (j3 != 0) {
            long j5 = j3 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j5;
            long j16 = (j5 >> 32) + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j16;
            j3 = j16 >> 32;
        }
        long j22 = (((long) iArr[3]) & 4294967295L) + 1 + j3;
        iArr[3] = (int) j22;
        long j42 = j22 >> 32;
        if (j42 != 0) {
            long j46 = j42 + (((long) iArr[4]) & 4294967295L);
            iArr[4] = (int) j46;
            long j47 = (j46 >> 32) + (((long) iArr[5]) & 4294967295L);
            iArr[5] = (int) j47;
            j42 = j47 >> 32;
        }
        long j57 = (((long) iArr[6]) & 4294967295L) + 1 + j42;
        iArr[6] = (int) j57;
        iArr[7] = (int) (((4294967295L & ((long) iArr[7])) - 1) + (j57 >> 32));
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat256.sub(iArr, iArr2, iArr3) != 0) {
            subPInvFrom(iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(16, iArr, iArr2, iArr3) != 0) {
            Nat.addTo(16, PExt, iArr3);
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (Nat.shiftUpBit(8, iArr, 0, iArr2) != 0 || (iArr2[7] == -1 && Nat256.gte(iArr2, P))) {
            addPInvTo(iArr2);
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        Nat256.mul(iArr, iArr2, iArr4);
        reduce(iArr4, iArr3);
    }

    public static void square(int[] iArr, int[] iArr2, int[] iArr3) {
        Nat256.square(iArr, iArr3);
        reduce(iArr3, iArr2);
    }

    public static void squareN(int[] iArr, int i, int[] iArr2, int[] iArr3) {
        Nat256.square(iArr, iArr3);
        while (true) {
            reduce(iArr3, iArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                Nat256.square(iArr2, iArr3);
            }
        }
    }
}
