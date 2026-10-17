package org.joda.time.field;

import a0.d;
import com.google.android.gms.internal.mlkit_vision_face.a;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;

/* JADX INFO: loaded from: classes13.dex */
public class FieldUtils {
    private FieldUtils() {
    }

    public static boolean equals(Object obj2, Object obj3) {
        if (obj2 == obj3) {
            return true;
        }
        if (obj2 == null || obj3 == null) {
            return false;
        }
        return obj2.equals(obj3);
    }

    public static int getWrappedValue(int i, int i2, int i3, int i5) {
        return getWrappedValue(i + i2, i3, i5);
    }

    public static int safeAdd(int i, int i2) {
        int i3 = i + i2;
        if ((i ^ i3) >= 0 || (i ^ i2) < 0) {
            return i3;
        }
        throw new ArithmeticException(d.g(i, i2, "The calculation caused an overflow: ", " + "));
    }

    public static long safeDivide(long j2, long j3) {
        if (j2 != Long.MIN_VALUE || j3 != -1) {
            return j2 / j3;
        }
        StringBuilder sbV = a.v(j2, "Multiplication overflows a long: ", " / ");
        sbV.append(j3);
        throw new ArithmeticException(sbV.toString());
    }

    public static int safeMultiply(int i, int i2) {
        long j2 = ((long) i) * ((long) i2);
        if (j2 < -2147483648L || j2 > 2147483647L) {
            throw new ArithmeticException(d.g(i, i2, "Multiplication overflows an int: ", " * "));
        }
        return (int) j2;
    }

    public static int safeMultiplyToInt(long j2, long j3) {
        return safeToInt(safeMultiply(j2, j3));
    }

    public static int safeNegate(int i) {
        if (i != Integer.MIN_VALUE) {
            return -i;
        }
        throw new ArithmeticException("Integer.MIN_VALUE cannot be negated");
    }

    public static long safeSubtract(long j2, long j3) {
        long j5 = j2 - j3;
        if ((j2 ^ j5) >= 0 || (j2 ^ j3) >= 0) {
            return j5;
        }
        StringBuilder sbV = a.v(j2, "The calculation caused an overflow: ", " - ");
        sbV.append(j3);
        throw new ArithmeticException(sbV.toString());
    }

    public static int safeToInt(long j2) {
        if (-2147483648L > j2 || j2 > 2147483647L) {
            throw new ArithmeticException(p.a.m(j2, "Value cannot fit in an int: "));
        }
        return (int) j2;
    }

    public static void verifyValueBounds(DateTimeField dateTimeField, int i, int i2, int i3) {
        if (i < i2 || i > i3) {
            throw new IllegalFieldValueException(dateTimeField.getType(), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }

    public static int getWrappedValue(int i, int i2, int i3) {
        if (i2 >= i3) {
            throw new IllegalArgumentException("MIN > MAX");
        }
        int i5 = (i3 - i2) + 1;
        int i6 = i - i2;
        if (i6 >= 0) {
            return (i6 % i5) + i2;
        }
        int i21 = (-i6) % i5;
        return i21 == 0 ? i2 : (i5 - i21) + i2;
    }

    public static void verifyValueBounds(DateTimeFieldType dateTimeFieldType, int i, int i2, int i3) {
        if (i < i2 || i > i3) {
            throw new IllegalFieldValueException(dateTimeFieldType, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }

    public static void verifyValueBounds(String str, int i, int i2, int i3) {
        if (i < i2 || i > i3) {
            throw new IllegalFieldValueException(str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }

    public static long safeDivide(long j2, long j3, RoundingMode roundingMode) {
        if (j2 == Long.MIN_VALUE && j3 == -1) {
            StringBuilder sbV = a.v(j2, "Multiplication overflows a long: ", " / ");
            sbV.append(j3);
            throw new ArithmeticException(sbV.toString());
        }
        return new BigDecimal(j2).divide(new BigDecimal(j3), roundingMode).longValue();
    }

    public static long safeAdd(long j2, long j3) {
        long j5 = j2 + j3;
        if ((j2 ^ j5) >= 0 || (j2 ^ j3) < 0) {
            return j5;
        }
        StringBuilder sbV = a.v(j2, "The calculation caused an overflow: ", " + ");
        sbV.append(j3);
        throw new ArithmeticException(sbV.toString());
    }

    public static long safeMultiply(long j2, int i) {
        if (i == -1) {
            if (j2 != Long.MIN_VALUE) {
                return -j2;
            }
            throw new ArithmeticException("Multiplication overflows a long: " + j2 + " * " + i);
        }
        if (i == 0) {
            return 0L;
        }
        if (i == 1) {
            return j2;
        }
        long j3 = i;
        long j5 = j2 * j3;
        if (j5 / j3 == j2) {
            return j5;
        }
        throw new ArithmeticException("Multiplication overflows a long: " + j2 + " * " + i);
    }

    public static long safeMultiply(long j2, long j3) {
        if (j3 == 1) {
            return j2;
        }
        if (j2 == 1) {
            return j3;
        }
        if (j2 == 0 || j3 == 0) {
            return 0L;
        }
        long j5 = j2 * j3;
        if (j5 / j3 == j2 && ((j2 != Long.MIN_VALUE || j3 != -1) && (j3 != Long.MIN_VALUE || j2 != -1))) {
            return j5;
        }
        StringBuilder sbV = a.v(j2, "Multiplication overflows a long: ", " * ");
        sbV.append(j3);
        throw new ArithmeticException(sbV.toString());
    }
}
