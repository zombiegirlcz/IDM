package kotlin.ranges;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import vim.i;

/* JADX INFO: loaded from: classes13.dex */
public class f extends i {
    public static Comparable c(Comparable comparable, Comparable minimumValue) {
        Intrinsics.checkNotNullParameter(comparable, "<this>");
        Intrinsics.checkNotNullParameter(minimumValue, "minimumValue");
        return comparable.compareTo(minimumValue) < 0 ? minimumValue : comparable;
    }

    public static Comparable d(Comparable comparable, Comparable maximumValue) {
        Intrinsics.checkNotNullParameter(comparable, "<this>");
        Intrinsics.checkNotNullParameter(maximumValue, "maximumValue");
        return comparable.compareTo(maximumValue) > 0 ? maximumValue : comparable;
    }

    public static double e(double d, double d5, double d6) {
        if (d5 <= d6) {
            return d < d5 ? d5 : d > d6 ? d6 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d6 + " is less than minimum " + d5 + CoreConstants.DOT);
    }

    public static float f(float f, float f4, float f5) {
        if (f4 <= f5) {
            return f < f4 ? f4 : f > f5 ? f5 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f5 + " is less than minimum " + f4 + CoreConstants.DOT);
    }

    public static int g(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + CoreConstants.DOT);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int h(int i, IntRange range) {
        int i2 = range.f186449b;
        int i3 = range.f186448a;
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return ((Number) k(Integer.valueOf(i), (ClosedFloatingPointRange) range)).intValue();
        }
        if (!range.isEmpty()) {
            return i < Integer.valueOf(i3).intValue() ? Integer.valueOf(i3).intValue() : i > Integer.valueOf(i2).intValue() ? Integer.valueOf(i2).intValue() : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + CoreConstants.DOT);
    }

    public static long i(long j2, long j3, long j5) {
        if (j3 <= j5) {
            return j2 < j3 ? j3 : j2 > j5 ? j5 : j2;
        }
        throw new IllegalArgumentException(a0.d.t(com.google.android.gms.internal.mlkit_vision_face.a.v(j5, "Cannot coerce value to an empty range: maximum ", " is less than minimum "), j3, CoreConstants.DOT));
    }

    public static Comparable j(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        Intrinsics.checkNotNullParameter(comparable, "<this>");
        if (comparable2 == null || comparable3 == null) {
            if (comparable2 != null && comparable.compareTo(comparable2) < 0) {
                return comparable2;
            }
            if (comparable3 != null && comparable.compareTo(comparable3) > 0) {
                return comparable3;
            }
        } else {
            if (comparable2.compareTo(comparable3) > 0) {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + comparable3 + " is less than minimum " + comparable2 + CoreConstants.DOT);
            }
            if (comparable.compareTo(comparable2) < 0) {
                return comparable2;
            }
            if (comparable.compareTo(comparable3) > 0) {
                return comparable3;
            }
        }
        return comparable;
    }

    public static Comparable k(Comparable comparable, ClosedFloatingPointRange range) {
        Intrinsics.checkNotNullParameter(comparable, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (!range.isEmpty()) {
            return (!range.a(comparable, range.getStart()) || range.a(range.getStart(), comparable)) ? (!range.a(range.b(), comparable) || range.a(comparable, range.b())) ? comparable : range.b() : range.getStart();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + CoreConstants.DOT);
    }

    public static c l(int i, int i2) {
        c.INSTANCE.getClass();
        return new c(i, i2, -1);
    }

    public static c m(IntRange intRange) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        c.Companion companion = c.INSTANCE;
        int i = intRange.f186449b;
        int i2 = intRange.f186448a;
        int i3 = -intRange.f186450c;
        companion.getClass();
        return new c(i, i2, i3);
    }

    public static c n(int i, IntRange intRange) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        i.a(i > 0, Integer.valueOf(i));
        c.Companion companion = c.INSTANCE;
        int i2 = intRange.f186448a;
        int i3 = intRange.f186449b;
        if (intRange.f186450c <= 0) {
            i = -i;
        }
        companion.getClass();
        return new c(i2, i3, i);
    }

    public static IntRange o(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new IntRange(i, i2 - 1, 1);
        }
        IntRange.INSTANCE.getClass();
        return IntRange.d;
    }
}
