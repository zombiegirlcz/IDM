package org.bouncycastle.math.raw;

import ch.qos.logback.core.util.a;
import java.util.Random;
import org.bouncycastle.util.Integers;

/* JADX INFO: loaded from: classes14.dex */
public abstract class Mod {
    private static final int M30 = 1073741823;
    private static final long M32L = 4294967295L;

    private static int add30(int i, int[] iArr, int[] iArr2) {
        int i2 = i - 1;
        int i3 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = iArr[i5] + iArr2[i5] + i3;
            iArr[i5] = M30 & i6;
            i3 = i6 >> 30;
        }
        int i21 = iArr[i2] + iArr2[i2] + i3;
        iArr[i2] = i21;
        return i21 >> 30;
    }

    public static void checkedModOddInverse(int[] iArr, int[] iArr2, int[] iArr3) {
        if (modOddInverse(iArr, iArr2, iArr3) == 0) {
            throw new ArithmeticException("Inverse does not exist.");
        }
    }

    public static void checkedModOddInverseVar(int[] iArr, int[] iArr2, int[] iArr3) {
        if (!modOddInverseVar(iArr, iArr2, iArr3)) {
            throw new ArithmeticException("Inverse does not exist.");
        }
    }

    private static void cnegate30(int i, int i2, int[] iArr) {
        int i3 = i - 1;
        int i5 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            int i21 = ((iArr[i6] ^ i2) - i2) + i5;
            iArr[i6] = M30 & i21;
            i5 = i21 >> 30;
        }
        iArr[i3] = ((iArr[i3] ^ i2) - i2) + i5;
    }

    private static void cnormalize30(int i, int i2, int[] iArr, int[] iArr2) {
        int i3 = i - 1;
        int i5 = iArr[i3] >> 31;
        int i6 = 0;
        for (int i21 = 0; i21 < i3; i21++) {
            int i22 = (((iArr[i21] + (iArr2[i21] & i5)) ^ i2) - i2) + i6;
            iArr[i21] = i22 & M30;
            i6 = i22 >> 30;
        }
        int i32 = (((iArr[i3] + (i5 & iArr2[i3])) ^ i2) - i2) + i6;
        iArr[i3] = i32;
        int i33 = i32 >> 31;
        int i43 = 0;
        for (int i59 = 0; i59 < i3; i59++) {
            int i66 = iArr[i59] + (iArr2[i59] & i33) + i43;
            iArr[i59] = i66 & M30;
            i43 = i66 >> 30;
        }
        iArr[i3] = iArr[i3] + (i33 & iArr2[i3]) + i43;
    }

    private static void decode30(int i, int[] iArr, int[] iArr2) {
        int i2 = 0;
        long j2 = 0;
        int i3 = 0;
        int i5 = 0;
        while (i > 0) {
            while (i2 < Math.min(32, i)) {
                j2 |= ((long) iArr[i3]) << i2;
                i2 += 30;
                i3++;
            }
            iArr2[i5] = (int) j2;
            j2 >>>= 32;
            i2 -= 32;
            i -= 32;
            i5++;
        }
    }

    private static int divsteps30Var(int i, int i2, int i3, int[] iArr) {
        int i5;
        int i6 = 30;
        int i21 = 1;
        int i22 = 1;
        int i32 = 0;
        int i33 = 0;
        while (true) {
            int iNumberOfTrailingZeros = Integers.numberOfTrailingZeros(((-1) << i6) | i3);
            int i43 = i3 >> iNumberOfTrailingZeros;
            i21 <<= iNumberOfTrailingZeros;
            i32 <<= iNumberOfTrailingZeros;
            i -= iNumberOfTrailingZeros;
            i6 -= iNumberOfTrailingZeros;
            if (i6 <= 0) {
                iArr[0] = i21;
                iArr[1] = i32;
                iArr[2] = i33;
                iArr[3] = i22;
                return i;
            }
            if (i <= 0) {
                i = 2 - i;
                int i59 = -i2;
                int i66 = -i21;
                int i74 = -i32;
                i5 = ((-1) >>> (32 - (i > i6 ? i6 : i))) & 63 & (((i43 * i43) - 2) * i43 * i59);
                i43 = i59;
                i2 = i43;
                int i92 = i33;
                i33 = i66;
                i21 = i92;
                int i96 = i22;
                i22 = i74;
                i32 = i96;
            } else {
                i5 = ((-1) >>> (32 - (i > i6 ? i6 : i))) & 15 & (((((i2 + 1) & 4) << 1) + i2) * (-i43));
            }
            i3 = i43 + (i2 * i5);
            i33 += i21 * i5;
            i22 += i5 * i32;
        }
    }

    private static void encode30(int i, int[] iArr, int[] iArr2) {
        int i2 = 0;
        long j2 = 0;
        int i3 = 0;
        int i5 = 0;
        while (i > 0) {
            if (i2 < Math.min(30, i)) {
                j2 |= (((long) iArr[i3]) & 4294967295L) << i2;
                i2 += 32;
                i3++;
            }
            iArr2[i5] = ((int) j2) & M30;
            j2 >>>= 30;
            i2 -= 30;
            i -= 30;
            i5++;
        }
    }

    private static int equalTo(int i, int[] iArr, int i2) {
        int i3 = i2 ^ iArr[0];
        for (int i5 = 1; i5 < i; i5++) {
            i3 |= iArr[i5];
        }
        return Nat.czero(i3);
    }

    private static boolean equalToVar(int i, int[] iArr, int i2) {
        int i3 = i2 ^ iArr[0];
        if (i3 != 0) {
            return false;
        }
        for (int i5 = 1; i5 < i; i5++) {
            i3 |= iArr[i5];
        }
        return i3 == 0;
    }

    private static int getMaximumDivsteps(int i) {
        return (int) (((((long) i) * 188898) + ((long) (i < 46 ? 308405 : 181188))) >>> 16);
    }

    private static int getMaximumHDDivsteps(int i) {
        return (int) (((((long) i) * 150964) + 99243) >>> 16);
    }

    private static int hddivsteps30(int i, int i2, int i3, int[] iArr) {
        int i5 = 1073741824;
        int i6 = 1073741824;
        int i21 = 0;
        int i22 = 0;
        for (int i32 = 0; i32 < 30; i32++) {
            int i33 = i >> 31;
            int i43 = -(i3 & 1);
            int i59 = i3 - ((i2 ^ i33) & i43);
            int i66 = i22 - ((i5 ^ i33) & i43);
            int i74 = i6 - ((i21 ^ i33) & i43);
            int i92 = (~i33) & i43;
            i = (i ^ i92) + 1;
            i2 += i59 & i92;
            i5 += i66 & i92;
            i21 += i92 & i74;
            i3 = i59 >> 1;
            i22 = i66 >> 1;
            i6 = i74 >> 1;
        }
        iArr[0] = i5;
        iArr[1] = i21;
        iArr[2] = i22;
        iArr[3] = i6;
        return i;
    }

    public static int inverse32(int i) {
        int i2 = (2 - (i * i)) * i;
        int i3 = (2 - (i * i2)) * i2;
        int i5 = (2 - (i * i3)) * i3;
        return (2 - (i * i5)) * i5;
    }

    public static int modOddInverse(int[] iArr, int[] iArr2, int[] iArr3) {
        int length = iArr.length;
        int iNumberOfLeadingZeros = (length * 32) - Integers.numberOfLeadingZeros(iArr[length - 1]);
        int i = (iNumberOfLeadingZeros + 29) / 30;
        int[] iArr4 = new int[4];
        int[] iArr5 = new int[i];
        int[] iArr6 = new int[i];
        int[] iArr7 = new int[i];
        int[] iArr8 = new int[i];
        int[] iArr9 = new int[i];
        iArr6[0] = 1;
        encode30(iNumberOfLeadingZeros, iArr2, iArr8);
        encode30(iNumberOfLeadingZeros, iArr, iArr9);
        System.arraycopy(iArr9, 0, iArr7, 0, i);
        int iInverse32 = inverse32(iArr9[0]);
        int maximumHDDivsteps = getMaximumHDDivsteps(iNumberOfLeadingZeros);
        int iHddivsteps30 = 0;
        for (int i2 = 0; i2 < maximumHDDivsteps; i2 += 30) {
            iHddivsteps30 = hddivsteps30(iHddivsteps30, iArr7[0], iArr8[0], iArr4);
            updateDE30(i, iArr5, iArr6, iArr4, iInverse32, iArr9);
            updateFG30(i, iArr7, iArr8, iArr4);
        }
        int i3 = iArr7[i - 1] >> 31;
        cnegate30(i, i3, iArr7);
        cnormalize30(i, i3, iArr5, iArr9);
        decode30(iNumberOfLeadingZeros, iArr5, iArr3);
        return equalTo(i, iArr7, 1) & equalTo(i, iArr8, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r16v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    public static boolean modOddInverseVar(int[] iArr, int[] iArr2, int[] iArr3) {
        int length = iArr.length;
        int iNumberOfLeadingZeros = (length * 32) - Integers.numberOfLeadingZeros(iArr[length - 1]);
        int i = (iNumberOfLeadingZeros + 29) / 30;
        int bitLength = iNumberOfLeadingZeros - Nat.getBitLength(length, iArr2);
        int[] iArr4 = new int[4];
        int[] iArr5 = new int[i];
        int[] iArr6 = new int[i];
        int[] iArr7 = new int[i];
        int[] iArr8 = new int[i];
        int[] iArr9 = new int[i];
        ?? r122 = 0;
        iArr6[0] = 1;
        encode30(iNumberOfLeadingZeros, iArr2, iArr8);
        encode30(iNumberOfLeadingZeros, iArr, iArr9);
        System.arraycopy(iArr9, 0, iArr7, 0, i);
        int iDivsteps30Var = -bitLength;
        int iInverse32 = inverse32(iArr9[0]);
        int maximumDivsteps = getMaximumDivsteps(iNumberOfLeadingZeros);
        int iTrimFG30 = i;
        while (!equalToVar(iTrimFG30, iArr8, r122)) {
            if (bitLength >= maximumDivsteps) {
                return r122;
            }
            bitLength += 30;
            ?? r162 = r122;
            iDivsteps30Var = divsteps30Var(iDivsteps30Var, iArr7[r122], iArr8[r162 == true ? 1 : 0], iArr4);
            updateDE30(i, iArr5, iArr6, iArr4, iInverse32, iArr9);
            updateFG30(iTrimFG30, iArr7, iArr8, iArr4);
            iTrimFG30 = trimFG30(iTrimFG30, iArr7, iArr8);
            r122 = r162 == true ? 1 : 0;
        }
        ?? r163 = r122;
        int i2 = iArr7[iTrimFG30 - 1] >> 31;
        int iNegate30 = iArr5[i - 1] >> 31;
        if (iNegate30 < 0) {
            iNegate30 = add30(i, iArr5, iArr9);
        }
        if (i2 < 0) {
            iNegate30 = negate30(i, iArr5);
            negate30(iTrimFG30, iArr7);
        }
        if (!equalToVar(iTrimFG30, iArr7, 1)) {
            return r163;
        }
        if (iNegate30 < 0) {
            add30(i, iArr5, iArr9);
        }
        decode30(iNumberOfLeadingZeros, iArr5, iArr3);
        return true;
    }

    public static int modOddIsCoprime(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int iNumberOfLeadingZeros = (length * 32) - Integers.numberOfLeadingZeros(iArr[length - 1]);
        int i = (iNumberOfLeadingZeros + 29) / 30;
        int[] iArr3 = new int[4];
        int[] iArr4 = new int[i];
        int[] iArr5 = new int[i];
        int[] iArr6 = new int[i];
        encode30(iNumberOfLeadingZeros, iArr2, iArr5);
        encode30(iNumberOfLeadingZeros, iArr, iArr6);
        System.arraycopy(iArr6, 0, iArr4, 0, i);
        int maximumHDDivsteps = getMaximumHDDivsteps(iNumberOfLeadingZeros);
        int iHddivsteps30 = 0;
        for (int i2 = 0; i2 < maximumHDDivsteps; i2 += 30) {
            iHddivsteps30 = hddivsteps30(iHddivsteps30, iArr4[0], iArr5[0], iArr3);
            updateFG30(i, iArr4, iArr5, iArr3);
        }
        cnegate30(i, iArr4[i - 1] >> 31, iArr4);
        return equalTo(i, iArr5, 0) & equalTo(i, iArr4, 1);
    }

    public static boolean modOddIsCoprimeVar(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int iNumberOfLeadingZeros = (length * 32) - Integers.numberOfLeadingZeros(iArr[length - 1]);
        int iTrimFG30 = (iNumberOfLeadingZeros + 29) / 30;
        int bitLength = iNumberOfLeadingZeros - Nat.getBitLength(length, iArr2);
        int[] iArr3 = new int[4];
        int[] iArr4 = new int[iTrimFG30];
        int[] iArr5 = new int[iTrimFG30];
        int[] iArr6 = new int[iTrimFG30];
        encode30(iNumberOfLeadingZeros, iArr2, iArr5);
        encode30(iNumberOfLeadingZeros, iArr, iArr6);
        System.arraycopy(iArr6, 0, iArr4, 0, iTrimFG30);
        int iDivsteps30Var = -bitLength;
        int maximumDivsteps = getMaximumDivsteps(iNumberOfLeadingZeros);
        while (!equalToVar(iTrimFG30, iArr5, 0)) {
            if (bitLength >= maximumDivsteps) {
                return false;
            }
            bitLength += 30;
            iDivsteps30Var = divsteps30Var(iDivsteps30Var, iArr4[0], iArr5[0], iArr3);
            updateFG30(iTrimFG30, iArr4, iArr5, iArr3);
            iTrimFG30 = trimFG30(iTrimFG30, iArr4, iArr5);
        }
        if ((iArr4[iTrimFG30 - 1] >> 31) < 0) {
            negate30(iTrimFG30, iArr4);
        }
        return equalToVar(iTrimFG30, iArr4, 1);
    }

    private static int negate30(int i, int[] iArr) {
        int i2 = i - 1;
        int i3 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = i3 - iArr[i5];
            iArr[i5] = M30 & i6;
            i3 = i6 >> 30;
        }
        int i21 = i3 - iArr[i2];
        iArr[i2] = i21;
        return i21 >> 30;
    }

    public static int[] random(int[] iArr) {
        int length = iArr.length;
        Random random = new Random();
        int[] iArrCreate = Nat.create(length);
        int i = length - 1;
        int i2 = iArr[i];
        int i3 = i2 | (i2 >>> 1);
        int i5 = i3 | (i3 >>> 2);
        int i6 = i5 | (i5 >>> 4);
        int i21 = i6 | (i6 >>> 8);
        int i22 = i21 | (i21 >>> 16);
        do {
            for (int i32 = 0; i32 != length; i32++) {
                iArrCreate[i32] = random.nextInt();
            }
            iArrCreate[i] = iArrCreate[i] & i22;
        } while (Nat.gte(length, iArrCreate, iArr));
        return iArrCreate;
    }

    private static int trimFG30(int i, int[] iArr, int[] iArr2) {
        int i2 = i - 1;
        int i3 = iArr[i2];
        int i5 = iArr2[i2];
        int i6 = i - 2;
        if (((i6 >> 31) | ((i3 >> 31) ^ i3) | ((i5 >> 31) ^ i5)) != 0) {
            return i;
        }
        iArr[i6] = (i3 << 30) | iArr[i6];
        iArr2[i6] = iArr2[i6] | (i5 << 30);
        return i - 1;
    }

    private static void updateDE30(int i, int[] iArr, int[] iArr2, int[] iArr3, int i2, int[] iArr4) {
        int i3 = i;
        int i5 = iArr3[0];
        int i6 = iArr3[1];
        int i21 = iArr3[2];
        int i22 = iArr3[3];
        int i32 = i3 - 1;
        int i33 = iArr[i32] >> 31;
        int i43 = iArr2[i32] >> 31;
        int i59 = (i5 & i33) + (i6 & i43);
        int i66 = (i33 & i21) + (i43 & i22);
        int i74 = iArr4[0];
        long j2 = i5;
        long j3 = iArr[0];
        long j5 = i6;
        long j16 = iArr2[0];
        long j22 = (j5 * j16) + (j2 * j3);
        long j42 = i21;
        long j46 = i22;
        long j47 = (j46 * j16) + (j3 * j42);
        int i92 = i59 - (((((int) j22) * i2) + i59) & M30);
        long j57 = i74;
        long j58 = i92;
        long j65 = (j57 * j58) + j22;
        long j69 = i66 - (((((int) j47) * i2) + i66) & M30);
        char c2 = 30;
        long j76 = j65 >> 30;
        long j85 = ((j57 * j69) + j47) >> 30;
        int i96 = 1;
        while (i96 < i3) {
            int i99 = iArr4[i96];
            char c3 = c2;
            long j100 = j69;
            long j101 = iArr[i96];
            long j102 = j2 * j101;
            long j103 = iArr2[i96];
            long j104 = i99;
            long j105 = j58;
            long jD = a.d(j104, j105, (j5 * j103) + j102, j76);
            long jD2 = a.d(j104, j100, (j103 * j46) + (j42 * j101), j85);
            int i100 = i96 - 1;
            iArr[i100] = ((int) jD) & M30;
            j76 = jD >> c3;
            iArr2[i100] = ((int) jD2) & M30;
            j85 = jD2 >> c3;
            i96++;
            i3 = i;
            c2 = c3;
            j58 = j105;
            j69 = j100;
        }
        iArr[i32] = (int) j76;
        iArr2[i32] = (int) j85;
    }

    private static void updateFG30(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        int i2 = iArr3[0];
        int i3 = 1;
        int i5 = iArr3[1];
        int i6 = iArr3[2];
        int i21 = iArr3[3];
        long j2 = i2;
        long j3 = iArr[0];
        long j5 = i5;
        long j16 = iArr2[0];
        long j22 = (j5 * j16) + (j2 * j3);
        long j42 = i6;
        long j46 = i21;
        long j47 = ((j16 * j46) + (j3 * j42)) >> 30;
        int i22 = 1;
        long j57 = j22 >> 30;
        while (i22 < i) {
            long j58 = iArr[i22];
            int i32 = i3;
            long j65 = j42;
            long j69 = iArr2[i22];
            long jD = a.d(j5, j69, j2 * j58, j57);
            long j76 = j46;
            long jD2 = a.d(j76, j69, j65 * j58, j47);
            int i33 = i22 - 1;
            iArr[i33] = ((int) jD) & M30;
            j57 = jD >> 30;
            iArr2[i33] = ((int) jD2) & M30;
            j47 = jD2 >> 30;
            i22++;
            i3 = i32;
            j46 = j76;
            j42 = j65;
        }
        int i43 = i - i3;
        iArr[i43] = (int) j57;
        iArr2[i43] = (int) j47;
    }
}
