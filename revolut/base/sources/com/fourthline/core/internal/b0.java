package com.fourthline.core.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class b0 {
    private static final boolean a(char c2) {
        if ('A' > c2 || c2 >= '[') {
            return '0' <= c2 && c2 < ':';
        }
        return true;
    }

    public static final String b(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return f(j(str));
    }

    public static final String c(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return f(i(str));
    }

    public static final boolean d(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.length() > 0 && Intrinsics.f(String.valueOf(kotlin.text.f0.S0(str)), "<");
    }

    public static final String e(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (a(str.charAt(i))) {
                break;
            }
            i++;
        }
        Integer numValueOf = Integer.valueOf(i);
        if (i == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            String strSubstring = str.substring(numValueOf.intValue(), str.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            if (strSubstring != null) {
                return strSubstring;
            }
        }
        int i2 = 0;
        while (true) {
            if (i2 >= str.length()) {
                z = true;
                break;
            }
            if (!a(str.charAt(i2))) {
                break;
            }
            i2++;
        }
        return (z ? null : Boolean.valueOf(z)) != null ? "" : str;
    }

    public static final String f(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (a(str.charAt(length))) {
                    break;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
            length = -1;
        } else {
            length = -1;
        }
        Integer numValueOf = Integer.valueOf(length);
        if (length == -1) {
            numValueOf = null;
        }
        boolean z = false;
        if (numValueOf != null) {
            String strSubstring = str.substring(0, numValueOf.intValue() + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            if (strSubstring != null) {
                return strSubstring;
            }
        }
        int i2 = 0;
        while (true) {
            if (i2 >= str.length()) {
                z = true;
                break;
            }
            if (!a(str.charAt(i2))) {
                break;
            }
            i2++;
        }
        return (z ? null : Boolean.valueOf(z)) != null ? "" : str;
    }

    public static final String g(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return kotlin.text.a0.E(kotlin.text.a0.E(kotlin.text.a0.E(kotlin.text.a0.E(kotlin.text.a0.E(kotlin.text.a0.E(str, 'b', '6'), '!', 'I'), '|', 'I'), 'i', 'I'), 'g', '9'), 'q', '9');
    }

    public static final String h(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return kotlin.text.a0.E(str, 'O', '0');
    }

    public static final String i(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return kotlin.text.a0.E(kotlin.text.a0.E(kotlin.text.a0.E(kotlin.text.a0.E(kotlin.text.a0.E(kotlin.text.a0.E(kotlin.text.a0.E(kotlin.text.a0.E(kotlin.text.a0.E(kotlin.text.a0.E(kotlin.text.a0.E(kotlin.text.a0.E(kotlin.text.a0.E(kotlin.text.a0.E(str, 'O', '0'), 'D', '0'), 'I', '1'), '!', '1'), '|', '1'), 'l', '1'), 'L', '1'), 'i', '1'), 'S', '5'), 'b', '6'), 'G', '6'), 'B', '8'), 'q', '9'), 'g', '9');
    }

    public static final String j(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return kotlin.text.a0.E(kotlin.text.a0.E(kotlin.text.a0.E(kotlin.text.a0.E(kotlin.text.a0.E(kotlin.text.a0.E(kotlin.text.a0.E(str, '0', 'O'), '6', 'G'), '5', 'S'), '1', 'I'), '!', 'I'), '|', 'I'), '8', 'B');
    }

    public static final String a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return f(g(str));
    }
}
