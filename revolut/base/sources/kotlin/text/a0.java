package kotlin.text;

import ch.qos.logback.core.CoreConstants;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Comparator;
import java.util.Locale;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes13.dex */
public class a0 extends z {
    public static void A(t0 t0Var) {
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        Intrinsics.checkNotNullExpressionValue(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
    }

    public static boolean B(String str, int i, boolean z, String other, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return !z ? str.regionMatches(i, other, i2, i3) : str.regionMatches(z, i, other, i2, i3);
    }

    public static String C(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(p.a.k(CoreConstants.DOT, "Count 'n' must be non-negative, but was ", i).toString());
        }
        if (i == 0) {
            return "";
        }
        int i2 = 1;
        if (i == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = str.charAt(0);
            char[] cArr = new char[i];
            for (int i3 = 0; i3 < i; i3++) {
                cArr[i3] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb6 = new StringBuilder(str.length() * i);
        if (1 <= i) {
            while (true) {
                sb6.append((CharSequence) str);
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        String string = sb6.toString();
        Intrinsics.h(string);
        return string;
    }

    public static String D(String str, String oldValue, String newValue, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        int i = 0;
        int iQ = d0.Q(str, oldValue, 0, z);
        if (iQ < 0) {
            return str;
        }
        int length = oldValue.length();
        int i2 = length >= 1 ? length : 1;
        int length2 = newValue.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb6 = new StringBuilder(length2);
        do {
            sb6.append((CharSequence) str, i, iQ);
            sb6.append(newValue);
            i = iQ + length;
            if (iQ >= str.length()) {
                break;
            }
            iQ = d0.Q(str, oldValue, iQ + i2, z);
        } while (iQ > 0);
        sb6.append((CharSequence) str, i, str.length());
        String string = sb6.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static String E(String str, char c2, char c3) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String strReplace = str.replace(c2, c3);
        Intrinsics.checkNotNullExpressionValue(strReplace, "replace(...)");
        return strReplace;
    }

    public static String F(String str, String oldValue, String newValue, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        int iT = d0.T(str, oldValue, 0, z, 2);
        return iT < 0 ? str : d0.j0(str, iT, oldValue.length() + iT, newValue).toString();
    }

    public static boolean G(int i, String str, boolean z, String prefix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return !z ? str.startsWith(prefix, i) : B(str, i, z, prefix, 0, prefix.length());
    }

    public static boolean H(String str, String prefix, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return !z ? str.startsWith(prefix) : B(str, 0, z, prefix, 0, prefix.length());
    }

    public static String o(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        return p(str, locale);
    }

    public static String p(String str, Locale locale) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        if (str.length() <= 0) {
            return str;
        }
        char cCharAt = str.charAt(0);
        if (!Character.isLowerCase(cCharAt)) {
            return str;
        }
        StringBuilder sb6 = new StringBuilder();
        char titleCase = Character.toTitleCase(cCharAt);
        if (titleCase != Character.toUpperCase(cCharAt)) {
            sb6.append(titleCase);
        } else {
            String strSubstring = str.substring(0, 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            Intrinsics.i(strSubstring, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strSubstring.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            sb6.append(upperCase);
        }
        String strSubstring2 = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        sb6.append(strSubstring2);
        return sb6.toString();
    }

    public static int q(String str, String other) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return str.compareToIgnoreCase(other);
    }

    public static String r(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return new String(cArr);
    }

    public static String s(char[] cArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        a.Companion c1058a = kotlin.collections.a.INSTANCE;
        int length = cArr.length;
        c1058a.getClass();
        a.Companion.a(i, i2, length);
        return new String(cArr, i, i2 - i);
    }

    public static boolean t(String str, CharSequence charSequence) {
        if (charSequence instanceof String) {
            return str.equalsIgnoreCase((String) charSequence);
        }
        if (str != charSequence) {
            if (charSequence != null && str.length() == charSequence.length()) {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    if (a.d(str.charAt(i), charSequence.charAt(i), true)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static String u(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new String(bArr, Charsets.UTF_8);
    }

    public static String v(int i, byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        a.Companion c1058a = kotlin.collections.a.INSTANCE;
        int length = bArr.length;
        c1058a.getClass();
        a.Companion.a(0, i, length);
        return new String(bArr, 0, i, Charsets.UTF_8);
    }

    public static byte[] w(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }

    public static byte[] x(String str) throws CharacterCodingException {
        int length = str.length();
        Intrinsics.checkNotNullParameter(str, "<this>");
        a.Companion c1058a = kotlin.collections.a.INSTANCE;
        int length2 = str.length();
        c1058a.getClass();
        a.Companion.a(0, length, length2);
        CharsetEncoder charsetEncoderNewEncoder = Charsets.UTF_8.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        ByteBuffer byteBufferEncode = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).encode(CharBuffer.wrap(str, 0, length));
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            int iRemaining = byteBufferEncode.remaining();
            byte[] bArrArray = byteBufferEncode.array();
            Intrinsics.h(bArrArray);
            if (iRemaining == bArrArray.length) {
                byte[] bArrArray2 = byteBufferEncode.array();
                Intrinsics.h(bArrArray2);
                return bArrArray2;
            }
        }
        byte[] bArr = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr);
        return bArr;
    }

    public static boolean y(String str, String suffix, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return !z ? str.endsWith(suffix) : B(str, str.length() - suffix.length(), true, suffix, 0, suffix.length());
    }

    public static boolean z(String str, String str2, boolean z) {
        return str == null ? str2 == null : !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }
}
