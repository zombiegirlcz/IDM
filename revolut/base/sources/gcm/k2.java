package gcm;

import com.google.common.math.LongMath;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public abstract class k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f142705a = TimeUnit.SECONDS.toNanos(1);

    public static void a(List list) {
        for (int i = 0; i < list.size(); i++) {
            if (!(list.get(i) instanceof Map)) {
                throw new ClassCastException(String.format(Locale.US, "value %s for idx %d in %s is not object", list.get(i), Integer.valueOf(i), list));
            }
        }
    }

    public static Boolean b(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj2 = map.get(str);
        if (obj2 instanceof Boolean) {
            return (Boolean) obj2;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Boolean", obj2, str, map));
    }

    public static List c(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj2 = map.get(str);
        if (obj2 instanceof List) {
            return (List) obj2;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not List", obj2, str, map));
    }

    public static List d(String str, Map map) {
        List listC = c(str, map);
        if (listC == null) {
            return null;
        }
        for (int i = 0; i < listC.size(); i++) {
            if (!(listC.get(i) instanceof String)) {
                throw new ClassCastException(String.format(Locale.US, "value '%s' for idx %d in '%s' is not string", listC.get(i), Integer.valueOf(i), listC));
            }
        }
        return listC;
    }

    public static Double e(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj2 = map.get(str);
        if (obj2 instanceof Double) {
            return (Double) obj2;
        }
        if (!(obj2 instanceof String)) {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' in '%s' is not a number", obj2, str, map));
        }
        try {
            return Double.valueOf(Double.parseDouble((String) obj2));
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not a double", obj2, str));
        }
    }

    public static Integer f(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj2 = map.get(str);
        if (!(obj2 instanceof Double)) {
            if (!(obj2 instanceof String)) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj2, str));
            }
            try {
                return Integer.valueOf(Integer.parseInt((String) obj2));
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj2, str));
            }
        }
        Double d = (Double) obj2;
        int iIntValue = d.intValue();
        if (iIntValue == d.doubleValue()) {
            return Integer.valueOf(iIntValue);
        }
        throw new ClassCastException("Number expected to be integer: " + d);
    }

    public static Map g(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj2 = map.get(str);
        if (obj2 instanceof Map) {
            return (Map) obj2;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not object", obj2, str, map));
    }

    public static String h(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj2 = map.get(str);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not String", obj2, str, map));
    }

    public static Long i(String str, Map map) {
        String strH = h(str, map);
        if (strH == null) {
            return null;
        }
        try {
            return Long.valueOf(k(strH));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static long j(int i, long j2) {
        long j3 = i;
        long j5 = f142705a;
        if (j3 <= (-j5) || j3 >= j5) {
            j2 = LongMath.checkedAdd(j2, j3 / j5);
            i = (int) (j3 % j5);
        }
        if (j2 > 0 && i < 0) {
            i = (int) (((long) i) + j5);
            j2--;
        }
        if (j2 < 0 && i > 0) {
            i = (int) (((long) i) - j5);
            j2++;
        }
        if (j2 >= -315576000000L && j2 <= 315576000000L) {
            long j16 = i;
            if (j16 >= -999999999 && j16 < j5 && ((j2 >= 0 && i >= 0) || (j2 <= 0 && i <= 0))) {
                long nanos = TimeUnit.SECONDS.toNanos(j2);
                long j22 = i;
                long j42 = nanos + j22;
                return (((j22 ^ nanos) > 0L ? 1 : ((j22 ^ nanos) == 0L ? 0 : -1)) < 0) | ((nanos ^ j42) >= 0) ? j42 : ((j42 >>> 63) ^ 1) + Long.MAX_VALUE;
            }
        }
        throw new IllegalArgumentException("Duration is not valid. See proto definition for valid values. Seconds (" + j2 + ") must be in range [-315,576,000,000, +315,576,000,000]. Nanos (" + i + ") must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds");
    }

    public static long k(String str) throws ParseException {
        boolean z;
        String strSubstring;
        int iCharAt;
        if (str.isEmpty() || str.charAt(str.length() - 1) != 's') {
            throw new ParseException("Invalid duration string: ".concat(str), 0);
        }
        if (str.charAt(0) == '-') {
            str = str.substring(1);
            z = true;
        } else {
            z = false;
        }
        String strO = a0.d.o(str, 1, 0);
        int iIndexOf = strO.indexOf(46);
        if (iIndexOf != -1) {
            strSubstring = strO.substring(iIndexOf + 1);
            strO = strO.substring(0, iIndexOf);
        } else {
            strSubstring = "";
        }
        long j2 = Long.parseLong(strO);
        if (strSubstring.isEmpty()) {
            iCharAt = 0;
        } else {
            iCharAt = 0;
            for (int i = 0; i < 9; i++) {
                iCharAt *= 10;
                if (i < strSubstring.length()) {
                    if (strSubstring.charAt(i) < '0' || strSubstring.charAt(i) > '9') {
                        throw new ParseException("Invalid nanoseconds.", 0);
                    }
                    iCharAt = (strSubstring.charAt(i) - '0') + iCharAt;
                }
            }
        }
        if (j2 < 0) {
            throw new ParseException("Invalid duration string: ".concat(str), 0);
        }
        if (z) {
            j2 = -j2;
            iCharAt = -iCharAt;
        }
        try {
            return j(iCharAt, j2);
        } catch (IllegalArgumentException unused) {
            throw new ParseException("Duration value is out of range.", 0);
        }
    }
}
