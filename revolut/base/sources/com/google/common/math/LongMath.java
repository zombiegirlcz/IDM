package com.google.common.math;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.primitives.UnsignedLongs;
import com.youTransactor.uCube.rpc.Constants;
import java.math.RoundingMode;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;
import p.a;

/* JADX INFO: loaded from: classes.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
public final class LongMath {

    @VisibleForTesting
    static final long FLOOR_SQRT_MAX_LONG = 3037000499L;

    @VisibleForTesting
    static final long MAX_POWER_OF_SQRT2_UNSIGNED = -5402926248376769404L;

    @VisibleForTesting
    static final long MAX_SIGNED_POWER_OF_TWO = 4611686018427387904L;
    private static final int SIEVE_30 = -545925251;

    @VisibleForTesting
    static final byte[] maxLog10ForLeadingZeros = {19, 18, 18, 18, 18, 17, 17, 17, 16, 16, 16, 15, 15, 15, 15, 14, 14, 14, 13, 13, 13, 12, 12, 12, 12, 11, 11, 11, 10, 10, 10, 9, 9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0};

    @VisibleForTesting
    @GwtIncompatible
    static final long[] powersOf10 = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L, 100000000000L, 1000000000000L, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, 1000000000000000000L};

    @VisibleForTesting
    @GwtIncompatible
    static final long[] halfPowersOf10 = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, 3162277660L, 31622776601L, 316227766016L, 3162277660168L, 31622776601683L, 316227766016837L, 3162277660168379L, 31622776601683793L, 316227766016837933L, 3162277660168379331L};
    static final long[] factorials = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600, 6227020800L, 87178291200L, 1307674368000L, 20922789888000L, 355687428096000L, 6402373705728000L, 121645100408832000L, 2432902008176640000L};
    static final int[] biggestBinomials = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 3810779, 121977, 16175, 4337, 1733, 887, 534, 361, 265, 206, 169, 143, ISO781611.SMT_TAG, LDSFile.EF_DG15_TAG, 101, 94, 88, 83, 79, 76, 74, 72, 70, 69, 68, 67, 67, 66, 66, 66, 66};

    @VisibleForTesting
    static final int[] biggestSimpleBinomials = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 2642246, 86251, 11724, 3218, 1313, 684, 419, 287, Constants.TAG_EMV_L1_CHECKSUM, 169, 139, LDSFile.EF_SOD_TAG, 105, 95, 87, 81, 76, 73, 70, 68, 66, 64, 63, 62, 62, 61, 61, 61};
    private static final long[][] millerRabinBaseSets = {new long[]{291830, 126401071349994536L}, new long[]{885594168, 725270293939359937L, 3569819667048198375L}, new long[]{273919523040L, 15, 7363882082L, 992620450144556L}, new long[]{47636622961200L, 2, 2570940, 211991001, 3749873356L}, new long[]{7999252175582850L, 2, 4130806001517L, 149795463772692060L, 186635894390467037L, 3967304179347715805L}, new long[]{585226005592931976L, 2, 123635709730000L, 9233062284813009L, 43835965440333360L, 761179012939631437L, 1263739024124850375L}, new long[]{Long.MAX_VALUE, 2, 325, 9375, 28178, 450775, 9780504, 1795265022}};

    /* JADX INFO: renamed from: com.google.common.math.LongMath$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes17.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$math$RoundingMode;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            $SwitchMap$java$math$RoundingMode = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public enum MillerRabinTester {
        SMALL { // from class: com.google.common.math.LongMath.MillerRabinTester.1
            @Override // com.google.common.math.LongMath.MillerRabinTester
            public long mulMod(long j2, long j3, long j5) {
                return (j2 * j3) % j5;
            }

            @Override // com.google.common.math.LongMath.MillerRabinTester
            public long squareMod(long j2, long j3) {
                return (j2 * j2) % j3;
            }
        },
        LARGE { // from class: com.google.common.math.LongMath.MillerRabinTester.2
            private long plusMod(long j2, long j3, long j5) {
                long j16 = j2 + j3;
                return j2 >= j5 - j3 ? j16 - j5 : j16;
            }

            private long times2ToThe32Mod(long j2, long j3) {
                int i = 32;
                do {
                    int iMin = Math.min(i, Long.numberOfLeadingZeros(j2));
                    j2 = UnsignedLongs.remainder(j2 << iMin, j3);
                    i -= iMin;
                } while (i > 0);
                return j2;
            }

            @Override // com.google.common.math.LongMath.MillerRabinTester
            public long mulMod(long j2, long j3, long j5) {
                long j16 = j2 >>> 32;
                long j22 = j3 >>> 32;
                long j42 = j2 & BodyPartID.bodyIdMax;
                long j46 = j3 & BodyPartID.bodyIdMax;
                long jTimes2ToThe32Mod = (j16 * j46) + times2ToThe32Mod(j16 * j22, j5);
                if (jTimes2ToThe32Mod < 0) {
                    jTimes2ToThe32Mod = UnsignedLongs.remainder(jTimes2ToThe32Mod, j5);
                }
                return plusMod(times2ToThe32Mod((j22 * j42) + jTimes2ToThe32Mod, j5), UnsignedLongs.remainder(j42 * j46, j5), j5);
            }

            @Override // com.google.common.math.LongMath.MillerRabinTester
            public long squareMod(long j2, long j3) {
                long j5 = j2 >>> 32;
                long j16 = j2 & BodyPartID.bodyIdMax;
                long jTimes2ToThe32Mod = times2ToThe32Mod(j5 * j5, j3);
                long jRemainder = j5 * j16 * 2;
                if (jRemainder < 0) {
                    jRemainder = UnsignedLongs.remainder(jRemainder, j3);
                }
                return plusMod(times2ToThe32Mod(jTimes2ToThe32Mod + jRemainder, j3), UnsignedLongs.remainder(j16 * j16, j3), j3);
            }
        };

        private long powMod(long j2, long j3, long j5) {
            long jSquareMod = j2;
            long jMulMod = 1;
            while (j3 != 0) {
                long j16 = j5;
                if ((j3 & 1) != 0) {
                    jMulMod = mulMod(jMulMod, jSquareMod, j16);
                }
                jSquareMod = squareMod(jSquareMod, j16);
                j3 >>= 1;
                j5 = j16;
            }
            return jMulMod;
        }

        public static boolean test(long j2, long j3) {
            return (j3 <= LongMath.FLOOR_SQRT_MAX_LONG ? SMALL : LARGE).testWitness(j2, j3);
        }

        private boolean testWitness(long j2, long j3) {
            long j5 = j3 - 1;
            int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j5);
            long j16 = j5 >> iNumberOfTrailingZeros;
            long j22 = j2 % j3;
            if (j22 == 0) {
                return true;
            }
            long jPowMod = powMod(j22, j16, j3);
            if (jPowMod == 1) {
                return true;
            }
            int i = 0;
            while (jPowMod != j5) {
                i++;
                if (i == iNumberOfTrailingZeros) {
                    return false;
                }
                jPowMod = squareMod(jPowMod, j3);
            }
            return true;
        }

        public abstract long mulMod(long j2, long j3, long j5);

        public abstract long squareMod(long j2, long j3);

        /* synthetic */ MillerRabinTester(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    private LongMath() {
    }

    public static long binomial(int i, int i2) {
        MathPreconditions.checkNonNegative("n", i);
        MathPreconditions.checkNonNegative("k", i2);
        Preconditions.checkArgument(i2 <= i, "k (%s) > n (%s)", i2, i);
        if (i2 > (i >> 1)) {
            i2 = i - i2;
        }
        long jMultiplyFraction = 1;
        if (i2 == 0) {
            return 1L;
        }
        if (i2 == 1) {
            return i;
        }
        long[] jArr = factorials;
        if (i < jArr.length) {
            return jArr[i] / (jArr[i2] * jArr[i - i2]);
        }
        int[] iArr = biggestBinomials;
        if (i2 >= iArr.length || i > iArr[i2]) {
            return Long.MAX_VALUE;
        }
        int[] iArr2 = biggestSimpleBinomials;
        if (i2 < iArr2.length && i <= iArr2[i2]) {
            int i3 = i - 1;
            long j2 = i;
            for (int i5 = 2; i5 <= i2; i5++) {
                j2 = (j2 * ((long) i3)) / ((long) i5);
                i3--;
            }
            return j2;
        }
        long j3 = i;
        int iLog2 = log2(j3, RoundingMode.CEILING);
        int i6 = i - 1;
        int i21 = iLog2;
        int i22 = 2;
        long j5 = j3;
        long j16 = 1;
        while (i22 <= i2) {
            i21 += iLog2;
            if (i21 < 63) {
                j5 *= (long) i6;
                j16 *= (long) i22;
            } else {
                jMultiplyFraction = multiplyFraction(jMultiplyFraction, j5, j16);
                j5 = i6;
                j16 = i22;
                i21 = iLog2;
            }
            i22++;
            i6--;
        }
        return multiplyFraction(jMultiplyFraction, j5, j16);
    }

    public static long ceilingPowerOfTwo(long j2) {
        MathPreconditions.checkPositive("x", j2);
        if (j2 <= 4611686018427387904L) {
            return 1 << (-Long.numberOfLeadingZeros(j2 - 1));
        }
        throw new ArithmeticException(a.n(j2, "ceilingPowerOfTwo(", ") is not representable as a long"));
    }

    public static long checkedAdd(long j2, long j3) {
        long j5 = j2 + j3;
        MathPreconditions.checkNoOverflow(((j2 ^ j3) < 0) | ((j2 ^ j5) >= 0), "checkedAdd", j2, j3);
        return j5;
    }

    public static long checkedMultiply(long j2, long j3) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j3) + Long.numberOfLeadingZeros(j3) + Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2);
        if (iNumberOfLeadingZeros > 65) {
            return j2 * j3;
        }
        MathPreconditions.checkNoOverflow(iNumberOfLeadingZeros >= 64, "checkedMultiply", j2, j3);
        MathPreconditions.checkNoOverflow((j2 >= 0) | (j3 != Long.MIN_VALUE), "checkedMultiply", j2, j3);
        long j5 = j2 * j3;
        MathPreconditions.checkNoOverflow(j2 == 0 || j5 / j2 == j3, "checkedMultiply", j2, j3);
        return j5;
    }

    @GwtIncompatible
    public static long checkedPow(long j2, int i) {
        int i2 = i;
        MathPreconditions.checkNonNegative("exponent", i2);
        long jCheckedMultiply = 1;
        if (!(j2 >= -2) || !(j2 <= 2)) {
            long j3 = j2;
            while (i2 != 0) {
                if (i2 == 1) {
                    return checkedMultiply(jCheckedMultiply, j3);
                }
                if ((i2 & 1) != 0) {
                    jCheckedMultiply = checkedMultiply(jCheckedMultiply, j3);
                }
                i2 >>= 1;
                if (i2 > 0) {
                    MathPreconditions.checkNoOverflow(-3037000499L <= j3 && j3 <= FLOOR_SQRT_MAX_LONG, "checkedPow", j3, i2);
                    j3 *= j3;
                }
            }
            return jCheckedMultiply;
        }
        int i3 = (int) j2;
        if (i3 == -2) {
            MathPreconditions.checkNoOverflow(i2 < 64, "checkedPow", j2, i2);
            return (i2 & 1) == 0 ? 1 << i2 : (-1) << i2;
        }
        if (i3 == -1) {
            return (i2 & 1) == 0 ? 1L : -1L;
        }
        if (i3 == 0) {
            return i2 == 0 ? 1L : 0L;
        }
        if (i3 == 1) {
            return 1L;
        }
        if (i3 != 2) {
            throw new AssertionError();
        }
        MathPreconditions.checkNoOverflow(i2 < 63, "checkedPow", j2, i2);
        return 1 << i2;
    }

    @GwtIncompatible
    public static long checkedSubtract(long j2, long j3) {
        long j5 = j2 - j3;
        MathPreconditions.checkNoOverflow(((j2 ^ j3) >= 0) | ((j2 ^ j5) >= 0), "checkedSubtract", j2, j3);
        return j5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @GwtIncompatible
    public static long divide(long j2, long j3, RoundingMode roundingMode) {
        Preconditions.checkNotNull(roundingMode);
        long j5 = j2 / j3;
        long j16 = j2 - (j3 * j5);
        if (j16 == 0) {
            return j5;
        }
        int i = ((int) ((j2 ^ j3) >> 63)) | 1;
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(j16 == 0);
                return j5;
            case 2:
                return j5;
            case 3:
                if (i >= 0) {
                    return j5;
                }
                return j5 + ((long) i);
            case 4:
                return j5 + ((long) i);
            case 5:
                if (i <= 0) {
                    return j5;
                }
                return j5 + ((long) i);
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j16);
                long jAbs2 = jAbs - (Math.abs(j3) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j5) == 0)) {
                        return j5;
                    }
                } else if (jAbs2 <= 0) {
                    return j5;
                }
                return j5 + ((long) i);
            default:
                throw new AssertionError();
        }
    }

    @GwtIncompatible
    public static long factorial(int i) {
        MathPreconditions.checkNonNegative("n", i);
        long[] jArr = factorials;
        if (i < jArr.length) {
            return jArr[i];
        }
        return Long.MAX_VALUE;
    }

    public static boolean fitsInInt(long j2) {
        return ((long) ((int) j2)) == j2;
    }

    public static long floorPowerOfTwo(long j2) {
        MathPreconditions.checkPositive("x", j2);
        return 1 << (63 - Long.numberOfLeadingZeros(j2));
    }

    public static long gcd(long j2, long j3) {
        MathPreconditions.checkNonNegative("a", j2);
        MathPreconditions.checkNonNegative("b", j3);
        if (j2 == 0) {
            return j3;
        }
        if (j3 == 0) {
            return j2;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j2);
        long jNumberOfTrailingZeros = j2 >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j3);
        long j5 = j3 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j5) {
            long j16 = jNumberOfTrailingZeros - j5;
            long j22 = (j16 >> 63) & j16;
            long j42 = (j16 - j22) - j22;
            j5 += j22;
            jNumberOfTrailingZeros = j42 >> Long.numberOfTrailingZeros(j42);
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static boolean isPowerOfTwo(long j2) {
        return (j2 > 0) & ((j2 & (j2 - 1)) == 0);
    }

    @GwtIncompatible
    public static boolean isPrime(long j2) {
        if (j2 < 2) {
            MathPreconditions.checkNonNegative("n", j2);
            return false;
        }
        if (j2 < 66) {
            return ((722865708377213483 >> (((int) j2) + (-2))) & 1) != 0;
        }
        if (((1 << ((int) (j2 % 30))) & SIEVE_30) != 0 || j2 % 7 == 0 || j2 % 11 == 0 || j2 % 13 == 0) {
            return false;
        }
        if (j2 < 289) {
            return true;
        }
        for (long[] jArr : millerRabinBaseSets) {
            if (j2 <= jArr[0]) {
                for (int i = 1; i < jArr.length; i++) {
                    if (!MillerRabinTester.test(jArr[i], j2)) {
                        return false;
                    }
                }
                return true;
            }
        }
        throw new AssertionError();
    }

    @VisibleForTesting
    public static int lessThanBranchFree(long j2, long j3) {
        return (int) ((~(~(j2 - j3))) >>> 63);
    }

    @GwtIncompatible
    public static int log10(long j2, RoundingMode roundingMode) {
        int iLessThanBranchFree;
        MathPreconditions.checkPositive("x", j2);
        int iLog10Floor = log10Floor(j2);
        long j3 = powersOf10[iLog10Floor];
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(j2 == j3);
                return iLog10Floor;
            case 2:
            case 3:
                return iLog10Floor;
            case 4:
            case 5:
                iLessThanBranchFree = lessThanBranchFree(j3, j2);
                break;
            case 6:
            case 7:
            case 8:
                iLessThanBranchFree = lessThanBranchFree(halfPowersOf10[iLog10Floor], j2);
                break;
            default:
                throw new AssertionError();
        }
        return iLessThanBranchFree + iLog10Floor;
    }

    @GwtIncompatible
    public static int log10Floor(long j2) {
        byte b4 = maxLog10ForLeadingZeros[Long.numberOfLeadingZeros(j2)];
        return b4 - lessThanBranchFree(j2, powersOf10[b4]);
    }

    public static int log2(long j2, RoundingMode roundingMode) {
        MathPreconditions.checkPositive("x", j2);
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(isPowerOfTwo(j2));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 64 - Long.numberOfLeadingZeros(j2 - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j2);
                return lessThanBranchFree(MAX_POWER_OF_SQRT2_UNSIGNED >>> iNumberOfLeadingZeros, j2) + (63 - iNumberOfLeadingZeros);
            default:
                throw new AssertionError("impossible");
        }
        return 63 - Long.numberOfLeadingZeros(j2);
    }

    public static long mean(long j2, long j3) {
        return (j2 & j3) + ((j2 ^ j3) >> 1);
    }

    @GwtIncompatible
    public static int mod(long j2, int i) {
        return (int) mod(j2, i);
    }

    public static long multiplyFraction(long j2, long j3, long j5) {
        if (j2 == 1) {
            return j3 / j5;
        }
        long jGcd = gcd(j2, j5);
        return (j3 / (j5 / jGcd)) * (j2 / jGcd);
    }

    @GwtIncompatible
    public static long pow(long j2, int i) {
        MathPreconditions.checkNonNegative("exponent", i);
        if (-2 > j2 || j2 > 2) {
            long j3 = 1;
            while (i != 0) {
                if (i == 1) {
                    return j3 * j2;
                }
                j3 *= (i & 1) == 0 ? 1L : j2;
                j2 *= j2;
                i >>= 1;
            }
            return j3;
        }
        int i2 = (int) j2;
        if (i2 == -2) {
            if (i < 64) {
                return (i & 1) == 0 ? 1 << i : -(1 << i);
            }
            return 0L;
        }
        if (i2 == -1) {
            return (i & 1) == 0 ? 1L : -1L;
        }
        if (i2 == 0) {
            return i == 0 ? 1L : 0L;
        }
        if (i2 == 1) {
            return 1L;
        }
        if (i2 != 2) {
            throw new AssertionError();
        }
        if (i < 64) {
            return 1 << i;
        }
        return 0L;
    }

    @GwtIncompatible
    public static double roundToDouble(long j2, RoundingMode roundingMode) {
        long j3;
        double dNextUp;
        long jCeil;
        double d = j2;
        long j5 = (long) d;
        int iCompare = j5 == Long.MAX_VALUE ? -1 : Long.compare(j2, j5);
        int[] iArr = AnonymousClass1.$SwitchMap$java$math$RoundingMode;
        switch (iArr[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(iCompare == 0);
                return d;
            case 2:
                if (j2 >= 0) {
                    if (iCompare < 0) {
                        return DoubleUtils.nextDown(d);
                    }
                } else if (iCompare > 0) {
                    return Math.nextUp(d);
                }
                return d;
            case 3:
                if (iCompare < 0) {
                    return DoubleUtils.nextDown(d);
                }
                return d;
            case 4:
                if (j2 >= 0) {
                    if (iCompare > 0) {
                        return Math.nextUp(d);
                    }
                } else if (iCompare < 0) {
                    return DoubleUtils.nextDown(d);
                }
                return d;
            case 5:
                if (iCompare > 0) {
                    return Math.nextUp(d);
                }
                return d;
            case 6:
            case 7:
            case 8:
                if (iCompare >= 0) {
                    dNextUp = Math.nextUp(d);
                    j3 = Long.MAX_VALUE;
                    jCeil = (long) Math.ceil(dNextUp);
                } else {
                    j3 = Long.MAX_VALUE;
                    double dNextDown = DoubleUtils.nextDown(d);
                    long jFloor = (long) Math.floor(dNextDown);
                    dNextUp = d;
                    d = dNextDown;
                    jCeil = j5;
                    j5 = jFloor;
                }
                long j16 = j2 - j5;
                long j22 = jCeil - j2;
                if (jCeil == j3) {
                    j22++;
                }
                int iCompare2 = Long.compare(j16, j22);
                if (iCompare2 >= 0) {
                    if (iCompare2 <= 0) {
                        int i = iArr[roundingMode.ordinal()];
                        if (i != 6) {
                            if (i != 7) {
                                if (i != 8) {
                                    throw new AssertionError("impossible");
                                }
                                if ((DoubleUtils.getSignificand(d) & 1) == 0) {
                                }
                            } else if (j2 >= 0) {
                            }
                        } else if (j2 >= 0) {
                        }
                    }
                    return dNextUp;
                }
                return d;
            default:
                throw new AssertionError("impossible");
        }
    }

    public static long saturatedAdd(long j2, long j3) {
        long j5 = j2 + j3;
        return (((j3 ^ j2) > 0L ? 1 : ((j3 ^ j2) == 0L ? 0 : -1)) < 0) | ((j2 ^ j5) >= 0) ? j5 : ((j5 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    public static long saturatedMultiply(long j2, long j3) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j3) + Long.numberOfLeadingZeros(j3) + Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2);
        if (iNumberOfLeadingZeros > 65) {
            return j2 * j3;
        }
        long j5 = ((j2 ^ j3) >>> 63) + Long.MAX_VALUE;
        if (!((iNumberOfLeadingZeros < 64) | ((j3 == Long.MIN_VALUE) & (j2 < 0)))) {
            long j16 = j2 * j3;
            if (j2 == 0 || j16 / j2 == j3) {
                return j16;
            }
        }
        return j5;
    }

    public static long saturatedPow(long j2, int i) {
        MathPreconditions.checkNonNegative("exponent", i);
        long jSaturatedMultiply = 1;
        if (!(j2 >= -2) || !(j2 <= 2)) {
            long j3 = ((j2 >>> 63) & ((long) (i & 1))) + Long.MAX_VALUE;
            while (i != 0) {
                if (i == 1) {
                    return saturatedMultiply(jSaturatedMultiply, j2);
                }
                if ((i & 1) != 0) {
                    jSaturatedMultiply = saturatedMultiply(jSaturatedMultiply, j2);
                }
                i >>= 1;
                if (i > 0) {
                    if ((-3037000499L > j2) || (j2 > FLOOR_SQRT_MAX_LONG)) {
                        return j3;
                    }
                    j2 *= j2;
                }
            }
            return jSaturatedMultiply;
        }
        int i2 = (int) j2;
        if (i2 == -2) {
            return i >= 64 ? ((long) (i & 1)) + Long.MAX_VALUE : (i & 1) == 0 ? 1 << i : (-1) << i;
        }
        if (i2 == -1) {
            return (i & 1) == 0 ? 1L : -1L;
        }
        if (i2 == 0) {
            return i == 0 ? 1L : 0L;
        }
        if (i2 == 1) {
            return 1L;
        }
        if (i2 != 2) {
            throw new AssertionError();
        }
        if (i >= 63) {
            return Long.MAX_VALUE;
        }
        return 1 << i;
    }

    public static long saturatedSubtract(long j2, long j3) {
        long j5 = j2 - j3;
        return (((j3 ^ j2) > 0L ? 1 : ((j3 ^ j2) == 0L ? 0 : -1)) >= 0) | ((j2 ^ j5) >= 0) ? j5 : ((j5 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    @GwtIncompatible
    public static long sqrt(long j2, RoundingMode roundingMode) {
        MathPreconditions.checkNonNegative("x", j2);
        if (fitsInInt(j2)) {
            return IntMath.sqrt((int) j2, roundingMode);
        }
        long jSqrt = (long) Math.sqrt(j2);
        long j3 = jSqrt * jSqrt;
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(j3 == j2);
                return jSqrt;
            case 2:
            case 3:
                return j2 < j3 ? jSqrt - 1 : jSqrt;
            case 4:
            case 5:
                return j2 > j3 ? jSqrt + 1 : jSqrt;
            case 6:
            case 7:
            case 8:
                long j5 = jSqrt - ((long) (j2 < j3 ? 1 : 0));
                return j5 + ((long) lessThanBranchFree((j5 * j5) + j5, j2));
            default:
                throw new AssertionError();
        }
    }

    @GwtIncompatible
    public static long mod(long j2, long j3) {
        if (j3 <= 0) {
            throw new ArithmeticException("Modulus must be positive");
        }
        long j5 = j2 % j3;
        return j5 >= 0 ? j5 : j5 + j3;
    }
}
