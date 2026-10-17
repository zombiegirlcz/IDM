package org.slf4j.helpers;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class MessageFormatter {
    static final char DELIM_START = '{';
    static final char DELIM_STOP = '}';
    static final String DELIM_STR = "{}";
    private static final char ESCAPE_CHAR = '\\';

    public static final FormattingTuple arrayFormat(String str, Object[] objArr) {
        Throwable throwableCandidate = getThrowableCandidate(objArr);
        if (throwableCandidate != null) {
            objArr = trimmedCopy(objArr);
        }
        return arrayFormat(str, objArr, throwableCandidate);
    }

    public static final String basicArrayFormat(String str, Object[] objArr) {
        return arrayFormat(str, objArr, null).getMessage();
    }

    private static void booleanArrayAppend(StringBuilder sb6, boolean[] zArr) {
        sb6.append('[');
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            sb6.append(zArr[i]);
            if (i != length - 1) {
                sb6.append(", ");
            }
        }
        sb6.append(']');
    }

    private static void byteArrayAppend(StringBuilder sb6, byte[] bArr) {
        sb6.append('[');
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            sb6.append((int) bArr[i]);
            if (i != length - 1) {
                sb6.append(", ");
            }
        }
        sb6.append(']');
    }

    private static void charArrayAppend(StringBuilder sb6, char[] cArr) {
        sb6.append('[');
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            sb6.append(cArr[i]);
            if (i != length - 1) {
                sb6.append(", ");
            }
        }
        sb6.append(']');
    }

    private static void deeplyAppendParameter(StringBuilder sb6, Object obj2, Map<Object[], Object> map) {
        if (obj2 == null) {
            sb6.append("null");
            return;
        }
        if (!obj2.getClass().isArray()) {
            safeObjectAppend(sb6, obj2);
            return;
        }
        if (obj2 instanceof boolean[]) {
            booleanArrayAppend(sb6, (boolean[]) obj2);
            return;
        }
        if (obj2 instanceof byte[]) {
            byteArrayAppend(sb6, (byte[]) obj2);
            return;
        }
        if (obj2 instanceof char[]) {
            charArrayAppend(sb6, (char[]) obj2);
            return;
        }
        if (obj2 instanceof short[]) {
            shortArrayAppend(sb6, (short[]) obj2);
            return;
        }
        if (obj2 instanceof int[]) {
            intArrayAppend(sb6, (int[]) obj2);
            return;
        }
        if (obj2 instanceof long[]) {
            longArrayAppend(sb6, (long[]) obj2);
            return;
        }
        if (obj2 instanceof float[]) {
            floatArrayAppend(sb6, (float[]) obj2);
        } else if (obj2 instanceof double[]) {
            doubleArrayAppend(sb6, (double[]) obj2);
        } else {
            objectArrayAppend(sb6, (Object[]) obj2, map);
        }
    }

    private static void doubleArrayAppend(StringBuilder sb6, double[] dArr) {
        sb6.append('[');
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            sb6.append(dArr[i]);
            if (i != length - 1) {
                sb6.append(", ");
            }
        }
        sb6.append(']');
    }

    private static void floatArrayAppend(StringBuilder sb6, float[] fArr) {
        sb6.append('[');
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            sb6.append(fArr[i]);
            if (i != length - 1) {
                sb6.append(", ");
            }
        }
        sb6.append(']');
    }

    public static final FormattingTuple format(String str, Object obj2) {
        return arrayFormat(str, new Object[]{obj2});
    }

    public static Throwable getThrowableCandidate(Object[] objArr) {
        return NormalizedParameters.getThrowableCandidate(objArr);
    }

    private static void intArrayAppend(StringBuilder sb6, int[] iArr) {
        sb6.append('[');
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            sb6.append(iArr[i]);
            if (i != length - 1) {
                sb6.append(", ");
            }
        }
        sb6.append(']');
    }

    public static final boolean isDoubleEscaped(String str, int i) {
        return i >= 2 && str.charAt(i - 2) == '\\';
    }

    public static final boolean isEscapedDelimeter(String str, int i) {
        return i != 0 && str.charAt(i - 1) == '\\';
    }

    private static void longArrayAppend(StringBuilder sb6, long[] jArr) {
        sb6.append('[');
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            sb6.append(jArr[i]);
            if (i != length - 1) {
                sb6.append(", ");
            }
        }
        sb6.append(']');
    }

    private static void objectArrayAppend(StringBuilder sb6, Object[] objArr, Map<Object[], Object> map) {
        sb6.append('[');
        if (map.containsKey(objArr)) {
            sb6.append("...");
        } else {
            map.put(objArr, null);
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                deeplyAppendParameter(sb6, objArr[i], map);
                if (i != length - 1) {
                    sb6.append(", ");
                }
            }
            map.remove(objArr);
        }
        sb6.append(']');
    }

    private static void safeObjectAppend(StringBuilder sb6, Object obj2) {
        try {
            sb6.append(obj2.toString());
        } catch (Throwable th10) {
            Reporter.error("Failed toString() invocation on an object of type [" + obj2.getClass().getName() + "]", th10);
            sb6.append("[FAILED toString()]");
        }
    }

    private static void shortArrayAppend(StringBuilder sb6, short[] sArr) {
        sb6.append('[');
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            sb6.append((int) sArr[i]);
            if (i != length - 1) {
                sb6.append(", ");
            }
        }
        sb6.append(']');
    }

    public static Object[] trimmedCopy(Object[] objArr) {
        return NormalizedParameters.trimmedCopy(objArr);
    }

    public static final FormattingTuple format(String str, Object obj2, Object obj3) {
        return arrayFormat(str, new Object[]{obj2, obj3});
    }

    public static String basicArrayFormat(NormalizedParameters normalizedParameters) {
        return basicArrayFormat(normalizedParameters.getMessage(), normalizedParameters.getArguments());
    }

    public static final FormattingTuple arrayFormat(String str, Object[] objArr, Throwable th10) {
        int i;
        if (str == null) {
            return new FormattingTuple(null, objArr, th10);
        }
        if (objArr == null) {
            return new FormattingTuple(str);
        }
        StringBuilder sb6 = new StringBuilder(str.length() + 50);
        int i2 = 0;
        int i3 = 0;
        while (i2 < objArr.length) {
            int iIndexOf = str.indexOf("{}", i3);
            if (iIndexOf == -1) {
                if (i3 == 0) {
                    return new FormattingTuple(str, objArr, th10);
                }
                sb6.append((CharSequence) str, i3, str.length());
                return new FormattingTuple(sb6.toString(), objArr, th10);
            }
            if (isEscapedDelimeter(str, iIndexOf)) {
                if (!isDoubleEscaped(str, iIndexOf)) {
                    i2--;
                    sb6.append((CharSequence) str, i3, iIndexOf - 1);
                    sb6.append('{');
                    i = iIndexOf + 1;
                    i3 = i;
                    i2++;
                } else {
                    sb6.append((CharSequence) str, i3, iIndexOf - 1);
                    deeplyAppendParameter(sb6, objArr[i2], new HashMap());
                }
            } else {
                sb6.append((CharSequence) str, i3, iIndexOf);
                deeplyAppendParameter(sb6, objArr[i2], new HashMap());
            }
            i = iIndexOf + 2;
            i3 = i;
            i2++;
        }
        sb6.append((CharSequence) str, i3, str.length());
        return new FormattingTuple(sb6.toString(), objArr, th10);
    }
}
