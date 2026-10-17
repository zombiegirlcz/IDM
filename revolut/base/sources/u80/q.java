package u80;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BigDecimal f278069a = new BigDecimal(String.valueOf(0.1d));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final BigDecimal f278070b = new BigDecimal(String.valueOf(99999.0d));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final BigDecimal f278071c;
    public static final BigDecimal d;
    public static final BigDecimal e;
    public static final BigDecimal f;

    static {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(10);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        f278071c = bigDecimalValueOf;
        d = new BigDecimal(String.valueOf(0.1d));
        e = BigDecimal.valueOf(Long.MAX_VALUE);
        f = BigDecimal.valueOf(Long.MIN_VALUE);
    }

    public static final dj0.d a(BigDecimal number, xi0.b currency) {
        h hVar;
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(currency, "currency");
        int iScale = number.scale();
        if (iScale < 0) {
            return new dj0.d(number.setScale(0).longValue(), xi0.b.a(currency, 0));
        }
        BigDecimal bigDecimalMovePointRight = number.movePointRight(iScale);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMovePointRight, "movePointRight(...)");
        RoundingMode roundingMode = RoundingMode.DOWN;
        BigDecimal scale = bigDecimalMovePointRight.setScale(0, roundingMode);
        BigDecimal LONG_MAX_BOUND = e;
        Intrinsics.checkNotNullExpressionValue(LONG_MAX_BOUND, "LONG_MAX_BOUND");
        BigDecimal bigDecimal = f;
        if (vim.i.b(bigDecimal, LONG_MAX_BOUND).contains(scale)) {
            hVar = new h(scale.longValueExact(), 0);
        } else {
            int iPrecision = scale.precision() - 19;
            if (iPrecision < 0) {
                iPrecision = 0;
            }
            BigDecimal scale2 = scale.movePointLeft(iPrecision).setScale(0, roundingMode);
            Intrinsics.checkNotNullExpressionValue(scale2, "setScale(...)");
            Intrinsics.checkNotNullExpressionValue(LONG_MAX_BOUND, "LONG_MAX_BOUND");
            int i = (scale2.compareTo(LONG_MAX_BOUND) > 0 || scale2.compareTo(bigDecimal) < 0) ? 0 : 1;
            int i2 = i ^ 1;
            if (i == 0) {
                scale2 = scale2.movePointLeft(1).setScale(0, roundingMode);
                Intrinsics.checkNotNullExpressionValue(scale2, "setScale(...)");
            }
            hVar = new h(scale2.longValueExact(), iPrecision + i2);
        }
        return new dj0.d(hVar.f278040a, xi0.b.a(currency, Integer.valueOf(iScale - hVar.f278041b)));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.math.BigDecimal b(java.math.BigDecimal r7) {
        /*
            java.lang.String r0 = "number"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.math.BigDecimal r0 = r7.abs()
            r1 = 10000(0x2710, float:1.4013E-41)
            long r1 = (long) r1
            java.math.BigDecimal r3 = java.math.BigDecimal.valueOf(r1)
            java.lang.String r4 = "valueOf(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            int r3 = r0.compareTo(r3)
            if (r3 < 0) goto L23
            r0 = 0
            java.math.RoundingMode r1 = java.math.RoundingMode.DOWN
            java.math.BigDecimal r7 = r7.setScale(r0, r1)
            goto L6b
        L23:
            r3 = 100
            long r5 = (long) r3
            java.math.BigDecimal r3 = java.math.BigDecimal.valueOf(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            int r3 = r0.compareTo(r3)
            r5 = 2
            if (r3 < 0) goto L48
            java.math.BigDecimal r1 = java.math.BigDecimal.valueOf(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            int r0 = r0.compareTo(r1)
            if (r0 >= 0) goto L48
            java.math.RoundingMode r0 = java.math.RoundingMode.DOWN
            java.math.BigDecimal r7 = r7.setScale(r5, r0)
            goto L6b
        L48:
            java.math.RoundingMode r0 = java.math.RoundingMode.DOWN
            r1 = 4
            java.math.BigDecimal r1 = d9.e1.M(r7, r5, r1)
            int r1 = r1.scale()
            r2 = 8
            if (r1 <= r2) goto L58
            r1 = r2
        L58:
            java.math.BigDecimal r1 = r7.setScale(r1, r0)
            kotlin.jvm.internal.Intrinsics.h(r1)
            boolean r2 = d9.e1.I(r1)
            if (r2 == 0) goto L6a
            java.math.BigDecimal r7 = r7.setScale(r5, r0)
            goto L6b
        L6a:
            r7 = r1
        L6b:
            java.lang.String r0 = "run(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: u80.q.b(java.math.BigDecimal):java.math.BigDecimal");
    }

    public static final BigDecimal c(BigDecimal number) {
        BigDecimal scale;
        int i;
        Intrinsics.checkNotNullParameter(number, "number");
        BigDecimal value = number.abs();
        int iCompareTo = value.compareTo(f278069a);
        BigDecimal bigDecimal = f278070b;
        if (iCompareTo >= 0 && value.compareTo(bigDecimal) <= 0) {
            Intrinsics.checkNotNullParameter(value, "value");
            BigDecimal bigDecimalAbs = rzl.a.b(value).abs();
            if (Intrinsics.f(bigDecimalAbs, BigDecimal.ZERO)) {
                i = 1;
            } else {
                int i2 = 0;
                while (!Intrinsics.f(bigDecimalAbs, BigDecimal.ZERO)) {
                    bigDecimalAbs = bigDecimalAbs.divide(new BigDecimal(String.valueOf(10.0d)), MathContext.DECIMAL128).setScale(0, RoundingMode.FLOOR);
                    i2++;
                }
                i = i2;
            }
            scale = value.setScale(5 - i, RoundingMode.HALF_EVEN);
        } else if (value.compareTo(bigDecimal) > 0) {
            scale = value.setScale(0, RoundingMode.HALF_EVEN);
        } else {
            BigDecimal bigDecimalA = rzl.a.a(value);
            BigDecimal bigDecimal2 = BigDecimal.ZERO;
            if (Intrinsics.f(bigDecimalA, bigDecimal2)) {
                scale = bigDecimal2;
            } else {
                int i3 = -1;
                while (bigDecimalA.compareTo(BigDecimal.ONE) < 0) {
                    bigDecimalA = bigDecimalA.multiply(new BigDecimal(String.valueOf(10.0d)));
                    Intrinsics.checkNotNullExpressionValue(bigDecimalA, "multiply(...)");
                    i3++;
                }
                scale = value.setScale(i3 + 5, RoundingMode.HALF_EVEN);
            }
        }
        Intrinsics.h(scale);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(number.signum());
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        BigDecimal bigDecimalMultiply = scale.multiply(bigDecimalValueOf);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        return bigDecimalMultiply;
    }

    public static final BigDecimal d(BigDecimal number, xi0.b currency) {
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(currency, "currency");
        BigDecimal bigDecimal = number.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : number.stripTrailingZeros();
        int iMax = Math.max(bigDecimal.scale(), currency.c());
        BigDecimal bigDecimalAbs = bigDecimal.abs();
        BigDecimal scale = bigDecimal.setScale(Intrinsics.f(bigDecimalAbs, BigDecimal.ZERO) ? 0 : bigDecimalAbs.compareTo(f278071c) >= 0 ? 2 : bigDecimalAbs.compareTo(d) < 0 ? Integer.min(iMax, 6) : Integer.min(iMax, 4), RoundingMode.HALF_UP);
        Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
        return scale;
    }
}
