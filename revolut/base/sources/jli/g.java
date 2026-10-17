package jli;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes13.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Regex f175847a = new Regex("[\\D]");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Regex f175848b = new Regex("(\\s|^)(\\w+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Regex f175849c = new Regex("\\p{InCombiningDiacriticalMarks}+");

    static {
        Regex[] elements = {new Regex("^(\\w{2}\\d\\w)(\\d\\w{2})$"), new Regex("^(\\w\\d\\w)(\\d\\w{2})$"), new Regex("^(\\w\\d)(\\d\\w{2})$"), new Regex("^(\\w\\d{2})(\\d\\w{2})$"), new Regex("^(\\w{2}\\d)(\\d\\w{2})$"), new Regex("^(\\w{2}\\d{2})(\\d\\w{2})$")};
        Intrinsics.checkNotNullParameter(elements, "elements");
        kotlin.collections.d.y0(elements);
    }

    public static final boolean a(String str, String str2) {
        String string;
        List listJ;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str2 != null && (string = d0.F0(str2).toString()) != null && (listJ = j(string)) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listJ) {
                if (!d0.W((String) obj2)) {
                    arrayList.add(obj2);
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            if (arrayList != null) {
                List listJ2 = j(d0.F0(str).toString());
                ArrayList<String> arrayList2 = new ArrayList();
                for (Object obj3 : listJ2) {
                    if (!d0.W((String) obj3)) {
                        arrayList2.add(obj3);
                    }
                }
                if (arrayList2.isEmpty()) {
                    return false;
                }
                for (String str3 : arrayList2) {
                    if (!arrayList.isEmpty()) {
                        Iterator it8 = arrayList.iterator();
                        while (it8.hasNext()) {
                            if (a0.H(str3, (String) it8.next(), true)) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public static final String b(String str) {
        String strValueOf;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb6 = new StringBuilder();
        char cCharAt = str.charAt(0);
        if (Character.isLowerCase(cCharAt)) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            strValueOf = CharsKt.f(cCharAt, locale);
        } else {
            strValueOf = String.valueOf(cCharAt);
        }
        sb6.append((Object) strValueOf);
        String strSubstring = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        sb6.append(strSubstring);
        return sb6.toString();
    }

    public static final String c(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return f175848b.h(str, new jj3.a(25));
    }

    public static final boolean d(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String strE = e(d0.F0(lowerCase).toString());
        Locale locale2 = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale2, "getDefault(...)");
        String lowerCase2 = str2.toLowerCase(locale2);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        return d0.J(strE, e(d0.F0(lowerCase2).toString()), false);
    }

    public static final String e(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String strNormalize = Normalizer.normalize(str, Normalizer.Form.NFD);
        Intrinsics.checkNotNullExpressionValue(strNormalize, "normalize(...)");
        return f175849c.replace(strNormalize, "");
    }

    public static final String f(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return f175847a.replace(str, "");
    }

    public static final String g(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return a0.D(str, " ", " ", false);
    }

    public static final boolean h(String str, String str2) {
        String string;
        List listN0;
        if (str != null) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            String lowerCase = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            String string2 = d0.F0(lowerCase).toString();
            if (str2 != null) {
                Locale locale2 = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale2, "getDefault(...)");
                String lowerCase2 = str2.toLowerCase(locale2);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                if (lowerCase2 != null && (string = d0.F0(lowerCase2).toString()) != null && (listN0 = d0.n0(string, new String[]{" "}, 0, 6)) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : listN0) {
                        if (!d0.W((String) obj2)) {
                            arrayList.add(obj2);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        Iterator it8 = arrayList.iterator();
                        while (it8.hasNext()) {
                            if (d0.J(string2, (String) it8.next(), false)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final String i(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return kotlin.collections.d.a0(bArr, "", null, null, new f(0), 30);
    }

    public static final List j(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new Regex("\\s+").k(str);
    }
}
