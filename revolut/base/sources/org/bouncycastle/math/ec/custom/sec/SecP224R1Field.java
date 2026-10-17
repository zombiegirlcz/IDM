package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat224;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes14.dex */
public class SecP224R1Field {
    private static final long M = 4294967295L;
    private static final int P6 = -1;
    private static final int PExt13 = -1;
    static final int[] P = {1, 0, 0, -1, -1, -1, -1};
    private static final int[] PExt = {1, 0, 0, -2, -1, -1, 0, 2, 0, 0, -2, -1, -1, -1};
    private static final int[] PExtInv = {-1, -1, -1, 1, 0, 0, -1, -3, -1, -1, 1};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat224.add(iArr, iArr2, iArr3) != 0 || (iArr3[6] == -1 && Nat224.gte(iArr3, P))) {
            addPInvTo(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.add(14, iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && Nat.gte(14, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                Nat.incAt(14, iArr3, iArr4.length);
            }
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (Nat.inc(7, iArr, iArr2) != 0 || (iArr2[6] == -1 && Nat224.gte(iArr2, P))) {
            addPInvTo(iArr2);
        }
    }

    private static void addPInvTo(int[] iArr) {
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
        long j22 = (4294967295L & ((long) iArr[3])) + 1 + j3;
        iArr[3] = (int) j22;
        if ((j22 >> 32) != 0) {
            Nat.incAt(7, iArr, 4);
        }
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] iArrFromBigInteger = Nat224.fromBigInteger(bigInteger);
        if (iArrFromBigInteger[6] == -1) {
            int[] iArr = P;
            if (Nat224.gte(iArrFromBigInteger, iArr)) {
                Nat224.subFrom(iArr, iArrFromBigInteger);
            }
        }
        return iArrFromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            Nat.shiftDownBit(7, iArr, 0, iArr2);
        } else {
            Nat.shiftDownBit(7, iArr2, Nat224.add(iArr, P, iArr2));
        }
    }

    public static void inv(int[] iArr, int[] iArr2) {
        Mod.checkedModOddInverse(P, iArr, iArr2);
    }

    public static int isZero(int[] iArr) {
        return Nat.equalToZero(7, iArr);
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrCreateExt = Nat224.createExt();
        Nat224.mul(iArr, iArr2, iArrCreateExt);
        reduce(iArrCreateExt, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat224.mulAddTo(iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && Nat.gte(14, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                Nat.incAt(14, iArr3, iArr4.length);
            }
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (isZero(iArr) == 0) {
            Nat224.sub(P, iArr, iArr2);
        } else {
            int[] iArr3 = P;
            Nat224.sub(iArr3, iArr3, iArr2);
        }
    }

    public static void random(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[28];
        do {
            secureRandom.nextBytes(bArr);
            Pack.littleEndianToInt(bArr, 0, iArr, 0, 7);
        } while (Nat.lessThan(7, iArr, P) == 0);
    }

    public static void randomMult(SecureRandom secureRandom, int[] iArr) {
        do {
            random(secureRandom, iArr);
        } while (isZero(iArr) != 0);
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j2 = ((long) iArr[10]) & 4294967295L;
        long j3 = ((long) iArr[11]) & 4294967295L;
        long j5 = ((long) iArr[12]) & 4294967295L;
        long j16 = ((long) iArr[13]) & 4294967295L;
        long j22 = ((((long) iArr[7]) & 4294967295L) + j3) - 1;
        long j42 = (((long) iArr[8]) & 4294967295L) + j5;
        long j46 = (((long) iArr[9]) & 4294967295L) + j16;
        long j47 = (((long) iArr[0]) & 4294967295L) - j22;
        long j57 = j47 & 4294967295L;
        long j58 = ((((long) iArr[1]) & 4294967295L) - j42) + (j47 >> 32);
        int i = (int) j58;
        iArr2[1] = i;
        long j65 = ((((long) iArr[2]) & 4294967295L) - j46) + (j58 >> 32);
        int i2 = (int) j65;
        iArr2[2] = i2;
        long j69 = (((((long) iArr[3]) & 4294967295L) + j22) - j2) + (j65 >> 32);
        long j76 = j69 & 4294967295L;
        long j85 = (((((long) iArr[4]) & 4294967295L) + j42) - j3) + (j69 >> 32);
        iArr2[4] = (int) j85;
        long j100 = (((((long) iArr[5]) & 4294967295L) + j46) - j5) + (j85 >> 32);
        iArr2[5] = (int) j100;
        long j101 = (((((long) iArr[6]) & 4294967295L) + j2) - j16) + (j100 >> 32);
        iArr2[6] = (int) j101;
        long j102 = (j101 >> 32) + 1;
        long j103 = j76 + j102;
        long j104 = j57 - j102;
        iArr2[0] = (int) j104;
        long j105 = j104 >> 32;
        if (j105 != 0) {
            long j106 = j105 + (((long) i) & 4294967295L);
            iArr2[1] = (int) j106;
            long j107 = (j106 >> 32) + (((long) i2) & 4294967295L);
            iArr2[2] = (int) j107;
            j103 += j107 >> 32;
        }
        iArr2[3] = (int) j103;
        if (((j103 >> 32) == 0 || Nat.incAt(7, iArr2, 4) == 0) && !(iArr2[6] == -1 && Nat224.gte(iArr2, P))) {
            return;
        }
        addPInvTo(iArr2);
    }

    public static void reduce32(int i, int[] iArr) {
        long j2;
        if (i != 0) {
            long j3 = ((long) i) & 4294967295L;
            long j5 = (((long) iArr[0]) & 4294967295L) - j3;
            iArr[0] = (int) j5;
            long j16 = j5 >> 32;
            if (j16 != 0) {
                long j22 = j16 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j22;
                long j42 = (j22 >> 32) + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j42;
                j16 = j42 >> 32;
            }
            long j46 = (4294967295L & ((long) iArr[3])) + j3 + j16;
            iArr[3] = (int) j46;
            j2 = j46 >> 32;
        } else {
            j2 = 0;
        }
        if ((j2 == 0 || Nat.incAt(7, iArr, 4) == 0) && !(iArr[6] == -1 && Nat224.gte(iArr, P))) {
            return;
        }
        addPInvTo(iArr);
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] iArrCreateExt = Nat224.createExt();
        Nat224.square(iArr, iArrCreateExt);
        reduce(iArrCreateExt, iArr2);
    }

    public static void squareN(int[] iArr, int i, int[] iArr2) {
        int[] iArrCreateExt = Nat224.createExt();
        Nat224.square(iArr, iArrCreateExt);
        while (true) {
            reduce(iArrCreateExt, iArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                Nat224.square(iArr2, iArrCreateExt);
            }
        }
    }

    private static void subPInvFrom(int[] iArr) {
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
        long j22 = ((4294967295L & ((long) iArr[3])) - 1) + j3;
        iArr[3] = (int) j22;
        if ((j22 >> 32) != 0) {
            Nat.decAt(7, iArr, 4);
        }
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat224.sub(iArr, iArr2, iArr3) != 0) {
            subPInvFrom(iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(14, iArr, iArr2, iArr3) != 0) {
            int[] iArr4 = PExtInv;
            if (Nat.subFrom(iArr4.length, iArr4, iArr3) != 0) {
                Nat.decAt(14, iArr3, iArr4.length);
            }
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (Nat.shiftUpBit(7, iArr, 0, iArr2) != 0 || (iArr2[6] == -1 && Nat224.gte(iArr2, P))) {
            addPInvTo(iArr2);
        }
    }
}
