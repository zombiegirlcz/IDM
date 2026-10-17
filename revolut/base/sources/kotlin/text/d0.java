package kotlin.text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes13.dex */
public class d0 extends a0 {
    public static String A0(char c2, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iS = S(missingDelimiterValue, c2, 0, 6);
        if (iS == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(0, iS);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String B0(char c2, String str, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iX = X(str, c2, 0, 6);
        if (iX == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iX);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String C0(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iY = Y(str, delimiter, 0, 6);
        if (iY == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iY);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static boolean D0(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.equals("true")) {
            return true;
        }
        if (str.equals("false")) {
            return false;
        }
        throw new IllegalArgumentException("The string doesn't represent a boolean value: ".concat(str));
    }

    public static Boolean E0(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (Intrinsics.f(str, "true")) {
            return Boolean.TRUE;
        }
        if (Intrinsics.f(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static CharSequence F0(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zE = CharsKt.e(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zE) {
                    break;
                }
                length--;
            } else if (zE) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static String G0(String str, char... chars) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zF = kotlin.collections.d.F(chars, str.charAt(!z ? i : length));
            if (z) {
                if (!zF) {
                    break;
                }
                length--;
            } else if (zF) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1).toString();
    }

    public static CharSequence H0(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i = length - 1;
            if (!CharsKt.e(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i < 0) {
                return "";
            }
            length = i;
        }
    }

    public static String I0(String str, char... chars) {
        CharSequence charSequenceSubSequence;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!kotlin.collections.d.F(chars, str.charAt(length))) {
                    charSequenceSubSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
            charSequenceSubSequence = "";
        } else {
            charSequenceSubSequence = "";
        }
        return charSequenceSubSequence.toString();
    }

    public static boolean J(CharSequence charSequence, CharSequence other, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (other instanceof String) {
            if (T(charSequence, (String) other, 0, z, 2) >= 0) {
                return true;
            }
        } else if (R(charSequence, other, 0, charSequence.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }

    public static CharSequence J0(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!CharsKt.e(str.charAt(i))) {
                return str.subSequence(i, str.length());
            }
        }
        return "";
    }

    public static boolean K(CharSequence charSequence, char c2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return S(charSequence, c2, 0, 2) >= 0;
    }

    public static String K0(String str, char... chars) {
        CharSequence charSequenceSubSequence;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                charSequenceSubSequence = "";
                break;
            }
            if (!kotlin.collections.d.F(chars, str.charAt(i))) {
                charSequenceSubSequence = str.subSequence(i, str.length());
                break;
            }
            i++;
        }
        return charSequenceSubSequence.toString();
    }

    public static boolean L(CharSequence charSequence, char c2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() > 0 && a.d(charSequence.charAt(P(charSequence)), c2, false);
    }

    public static boolean M(CharSequence charSequence, CharSequence suffix) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return ((charSequence instanceof String) && (suffix instanceof String)) ? a0.y((String) charSequence, (String) suffix, false) : d0(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), false);
    }

    public static final Pair N(CharSequence charSequence, Collection collection, int i) {
        boolean z;
        CharSequence charSequence2;
        Object next;
        Object next2;
        if (collection.size() == 1) {
            String str = (String) zhm.d0.J0(collection);
            int iT = T(charSequence, str, i, false, 4);
            if (iT >= 0) {
                return new Pair(Integer.valueOf(iT), str);
            }
        } else {
            if (i < 0) {
                i = 0;
            }
            IntRange intRange = new IntRange(i, charSequence.length(), 1);
            boolean z3 = charSequence instanceof String;
            boolean z4 = false;
            int i2 = intRange.f186450c;
            int i3 = intRange.f186449b;
            if (z3) {
                if ((i2 > 0 && i <= i3) || (i2 < 0 && i3 <= i)) {
                    int i5 = i;
                    while (true) {
                        Iterator it8 = collection.iterator();
                        while (true) {
                            if (!it8.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it8.next();
                            String str2 = (String) next2;
                            if (a0.B(str2, 0, false, (String) charSequence, i5, str2.length())) {
                                break;
                            }
                        }
                        String str3 = (String) next2;
                        if (str3 == null) {
                            if (i5 == i3) {
                                break;
                            }
                            i5 += i2;
                        } else {
                            return new Pair(Integer.valueOf(i5), str3);
                        }
                    }
                }
            } else if ((i2 > 0 && i <= i3) || (i2 < 0 && i3 <= i)) {
                int i6 = i;
                while (true) {
                    Iterator it9 = collection.iterator();
                    while (true) {
                        if (!it9.hasNext()) {
                            z = z4;
                            charSequence2 = charSequence;
                            next = null;
                            break;
                        }
                        next = it9.next();
                        String str4 = (String) next;
                        z = z4;
                        charSequence2 = charSequence;
                        if (d0(str4, 0, charSequence2, i6, str4.length(), z)) {
                            break;
                        }
                        charSequence = charSequence2;
                        z4 = z;
                    }
                    String str5 = (String) next;
                    if (str5 == null) {
                        if (i6 == i3) {
                            break;
                        }
                        i6 += i2;
                        charSequence = charSequence2;
                        z4 = z;
                    } else {
                        return new Pair(Integer.valueOf(i6), str5);
                    }
                }
            }
        }
        return null;
    }

    public static IntRange O(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return new IntRange(0, charSequence.length() - 1, 1);
    }

    public static int P(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static int Q(CharSequence charSequence, String string, int i, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        return (z || !(charSequence instanceof String)) ? R(charSequence, string, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(string, i);
    }

    public static final int R(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z3) {
        kotlin.ranges.c cVarL;
        int i3 = i;
        int i5 = i2;
        if (z3) {
            int iP = P(charSequence);
            if (i3 > iP) {
                i3 = iP;
            }
            if (i5 < 0) {
                i5 = 0;
            }
            cVarL = kotlin.ranges.f.l(i3, i5);
        } else {
            if (i3 < 0) {
                i3 = 0;
            }
            int length = charSequence.length();
            if (i5 > length) {
                i5 = length;
            }
            cVarL = new IntRange(i3, i5, 1);
        }
        int i6 = cVarL.f186450c;
        int i21 = cVarL.f186449b;
        int i22 = cVarL.f186448a;
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            if ((i6 <= 0 || i22 > i21) && (i6 >= 0 || i21 > i22)) {
                return -1;
            }
            int i32 = i22;
            while (!d0(charSequence2, 0, charSequence, i32, charSequence2.length(), z)) {
                if (i32 == i21) {
                    return -1;
                }
                i32 += i6;
            }
            return i32;
        }
        if ((i6 <= 0 || i22 > i21) && (i6 >= 0 || i21 > i22)) {
            return -1;
        }
        int i33 = i22;
        while (true) {
            String str = (String) charSequence2;
            if (a0.B(str, 0, z, (String) charSequence, i33, str.length())) {
                return i33;
            }
            if (i33 == i21) {
                return -1;
            }
            i33 += i6;
        }
    }

    public static int S(CharSequence charSequence, char c2, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return !(charSequence instanceof String) ? U(charSequence, new char[]{c2}, i, false) : ((String) charSequence).indexOf(c2, i);
    }

    public static /* synthetic */ int T(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return Q(charSequence, str, i, z);
    }

    public static final int U(CharSequence charSequence, char[] chars, int i, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (!z && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(kotlin.collections.d.i0(chars), i);
        }
        if (i < 0) {
            i = 0;
        }
        int iP = P(charSequence);
        if (i > iP) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c2 : chars) {
                if (a.d(c2, cCharAt, z)) {
                    return i;
                }
            }
            if (i == iP) {
                return -1;
            }
            i++;
        }
    }

    public static int V(String str, ArrayList strings) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(strings, "strings");
        Pair pairN = N(str, strings, 0);
        if (pairN != null) {
            return ((Number) pairN.f186385a).intValue();
        }
        return -1;
    }

    public static boolean W(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        for (int i = 0; i < charSequence.length(); i++) {
            if (!CharsKt.e(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int X(CharSequence charSequence, char c2, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = P(charSequence);
        }
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c2, i);
        }
        char[] chars = {c2};
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(kotlin.collections.d.i0(chars), i);
        }
        int iP = P(charSequence);
        if (i > iP) {
            i = iP;
        }
        while (-1 < i) {
            if (a.d(chars[0], charSequence.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static int Y(CharSequence charSequence, String string, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = P(charSequence);
        }
        int i3 = i;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        return !(charSequence instanceof String) ? R(charSequence, string, i3, 0, false, true) : ((String) charSequence).lastIndexOf(string, i3);
    }

    public static c0 Z(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return new c0(0, charSequence);
    }

    public static String a0(String str, int i, char c2) {
        CharSequence charSequenceSubSequence;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(j6.a.l(i, "Desired length ", " is less than zero."));
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb6 = new StringBuilder(i);
            sb6.append((CharSequence) str);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb6.append(c2);
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            charSequenceSubSequence = sb6;
        }
        return charSequenceSubSequence.toString();
    }

    public static String b0(String str, int i, char c2) {
        CharSequence charSequenceSubSequence;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(j6.a.l(i, "Desired length ", " is less than zero."));
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb6 = new StringBuilder(i);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb6.append(c2);
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb6.append((CharSequence) str);
            charSequenceSubSequence = sb6;
        }
        return charSequenceSubSequence.toString();
    }

    public static c c0(CharSequence charSequence, char[] cArr, int i) {
        k0(i);
        return new c(charSequence, i, new akl.t(cArr, 4));
    }

    public static final boolean d0(CharSequence charSequence, int i, CharSequence other, int i2, int i3, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > other.length() - i3) {
            return false;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            if (!a.d(charSequence.charAt(i + i5), other.charAt(i2 + i5), z)) {
                return false;
            }
        }
        return true;
    }

    public static String e0(String str, CharSequence prefix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (!p0(str, prefix, false)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static CharSequence f0(CharSequence charSequence, int i, int i2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i2 < i) {
            throw new IndexOutOfBoundsException(com.google.android.gms.internal.mlkit_vision_face.a.m("End index (", i2, i, ") is less than start index (", ")."));
        }
        if (i2 == i) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb6 = new StringBuilder(charSequence.length() - (i2 - i));
        sb6.append(charSequence, 0, i);
        Intrinsics.checkNotNullExpressionValue(sb6, "append(...)");
        sb6.append(charSequence, i2, charSequence.length());
        Intrinsics.checkNotNullExpressionValue(sb6, "append(...)");
        return sb6;
    }

    public static String g0(String str, String suffix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (!M(str, suffix)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - suffix.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String h0(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter("\"", "delimiter");
        return i0(str, "\"", "\"");
    }

    public static String i0(String str, String prefix, String suffix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (str.length() < suffix.length() + prefix.length() || !p0(str, prefix, false) || !M(str, suffix)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length(), str.length() - suffix.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static StringBuilder j0(CharSequence charSequence, int i, int i2, CharSequence replacement) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        if (i2 < i) {
            throw new IndexOutOfBoundsException(com.google.android.gms.internal.mlkit_vision_face.a.m("End index (", i2, i, ") is less than start index (", ")."));
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(charSequence, 0, i);
        Intrinsics.checkNotNullExpressionValue(sb6, "append(...)");
        sb6.append(replacement);
        sb6.append(charSequence, i2, charSequence.length());
        Intrinsics.checkNotNullExpressionValue(sb6, "append(...)");
        return sb6;
    }

    public static final void k0(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(a0.d.n("Limit must be non-negative, but was ", i).toString());
        }
    }

    public static final List l0(CharSequence charSequence, int i, String str) {
        k0(i);
        int iQ = Q(charSequence, str, 0, false);
        if (iQ == -1 || i == 1) {
            return zhm.u.c(charSequence.toString());
        }
        boolean z = i > 0;
        int i2 = 10;
        if (z && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iQ).toString());
            length = str.length() + iQ;
            if (z && arrayList.size() == i - 1) {
                break;
            }
            iQ = Q(charSequence, str, length, false);
        } while (iQ != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static List m0(CharSequence charSequence, char[] delimiters, int i) {
        int i2 = (i & 4) != 0 ? 0 : 2;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return l0(charSequence, i2, String.valueOf(delimiters[0]));
        }
        c cVarC0 = c0(charSequence, delimiters, i2);
        Intrinsics.checkNotNullParameter(cVarC0, "<this>");
        ge0.b bVar = new ge0.b(cVarC0, 2);
        ArrayList arrayList = new ArrayList(zhm.w.t(bVar, 10));
        Iterator it8 = bVar.iterator();
        while (it8.hasNext()) {
            arrayList.add(s0(charSequence, (IntRange) it8.next()));
        }
        return arrayList;
    }

    public static List n0(CharSequence charSequence, String[] delimiters, int i, int i2) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (str.length() != 0) {
                return l0(charSequence, i, str);
            }
        }
        k0(i);
        c cVar = new c(charSequence, i, new akl.t(zhm.p.c(delimiters), 5));
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        ge0.b bVar = new ge0.b(cVar, 2);
        ArrayList arrayList = new ArrayList(zhm.w.t(bVar, 10));
        Iterator it8 = bVar.iterator();
        while (it8.hasNext()) {
            arrayList.add(s0(charSequence, (IntRange) it8.next()));
        }
        return arrayList;
    }

    public static nkm.d0 o0(String str, char[] delimiters) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        return nkm.y.x(c0(str, delimiters, 0), new akl.s(str, 24));
    }

    public static boolean p0(CharSequence charSequence, CharSequence prefix, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return (!z && (charSequence instanceof String) && (prefix instanceof String)) ? a0.H((String) charSequence, (String) prefix, false) : d0(charSequence, 0, prefix, 0, prefix.length(), z);
    }

    public static boolean q0(CharSequence charSequence, String prefix, int i, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return (z || !(charSequence instanceof String)) ? d0(charSequence, i, prefix, 0, prefix.length(), z) : a0.G(i, (String) charSequence, false, prefix);
    }

    public static boolean r0(char c2, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.length() > 0 && a.d(str.charAt(0), c2, false);
    }

    public static final String s0(CharSequence charSequence, IntRange range) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        return charSequence.subSequence(range.f186448a, range.f186449b + 1).toString();
    }

    public static String t0(String str, IntRange range) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        String strSubstring = str.substring(range.f186448a, range.f186449b + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String u0(char c2, String str, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iS = S(str, c2, 0, 6);
        if (iS == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iS + 1, str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String v0(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iT = T(str, delimiter, 0, false, 6);
        if (iT == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(delimiter.length() + iT, str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String w0(char c2, String str, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iX = X(str, c2, 0, 6);
        if (iX == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iX + 1, str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String x0(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iY = Y(str, delimiter, 0, 6);
        if (iY == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(delimiter.length() + iY, str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String z0(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iT = T(str, delimiter, 0, false, 6);
        if (iT == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iT);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }
}
