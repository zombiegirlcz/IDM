package kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import vim.f;

/* JADX INFO: loaded from: classes14.dex */
public final class CapitalizeDecapitalizeKt {
    public static final boolean a(int i, String str, boolean z) {
        char cCharAt = str.charAt(i);
        return z ? 'A' <= cCharAt && cCharAt < '[' : Character.isUpperCase(cCharAt);
    }

    @NotNull
    public static final String capitalizeAsciiOnly(@NotNull String str) {
        char cCharAt;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 0 || 'a' > (cCharAt = str.charAt(0)) || cCharAt >= '{') {
            return str;
        }
        StringBuilder sb6 = new StringBuilder(str.length());
        sb6.append(Character.toUpperCase(cCharAt));
        sb6.append((CharSequence) str, 1, str.length());
        return sb6.toString();
    }

    @NotNull
    public static final String decapitalizeAsciiOnly(@NotNull String str) {
        char cCharAt;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 0 || 'A' > (cCharAt = str.charAt(0)) || cCharAt >= '[') {
            return str;
        }
        char lowerCase = Character.toLowerCase(cCharAt);
        String strSubstring = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return lowerCase + strSubstring;
    }

    @NotNull
    public static final String decapitalizeSmartForCompiler(@NotNull String str, boolean z) {
        Object next;
        String lowerCase;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 0 || !a(0, str, z)) {
            return str;
        }
        if (str.length() == 1 || !a(1, str, z)) {
            if (z) {
                return decapitalizeAsciiOnly(str);
            }
            if (str.length() <= 0) {
                return str;
            }
            char lowerCase2 = Character.toLowerCase(str.charAt(0));
            String strSubstring = str.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return lowerCase2 + strSubstring;
        }
        f it8 = d0.O(str).iterator();
        while (true) {
            if (!it8.f289625c) {
                next = null;
                break;
            }
            next = it8.next();
            if (!a(((Number) next).intValue(), str, z)) {
                break;
            }
        }
        Integer num = (Integer) next;
        if (num == null) {
            if (z) {
                return toLowerCaseAsciiOnly(str);
            }
            String lowerCase3 = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
            return lowerCase3;
        }
        int iIntValue = num.intValue() - 1;
        StringBuilder sb6 = new StringBuilder();
        String strSubstring2 = str.substring(0, iIntValue);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        if (z) {
            lowerCase = toLowerCaseAsciiOnly(strSubstring2);
        } else {
            lowerCase = strSubstring2.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        }
        sb6.append(lowerCase);
        String strSubstring3 = str.substring(iIntValue);
        Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
        sb6.append(strSubstring3);
        return sb6.toString();
    }

    @NotNull
    public static final String toLowerCaseAsciiOnly(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        StringBuilder sb6 = new StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('A' <= cCharAt && cCharAt < '[') {
                cCharAt = Character.toLowerCase(cCharAt);
            }
            sb6.append(cCharAt);
        }
        String string = sb6.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
