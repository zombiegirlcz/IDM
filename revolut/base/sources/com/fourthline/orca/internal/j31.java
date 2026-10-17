package com.fourthline.orca.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes23.dex */
public final class j31 implements ab1 {
    private final boolean b(String str, String str2) {
        return Intrinsics.f(String.valueOf("JABCDEFGHI".charAt(b(str) % 10)), str2);
    }

    private final boolean c(String str) {
        if (str.length() < 9) {
            return false;
        }
        String strValueOf = String.valueOf(kotlin.text.f0.P0(str));
        Intrinsics.i(strValueOf, "null cannot be cast to non-null type java.lang.String");
        Locale locale = Locale.ROOT;
        String upperCase = strValueOf.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        String strValueOf2 = String.valueOf(kotlin.text.f0.S0(str));
        Intrinsics.i(strValueOf2, "null cannot be cast to non-null type java.lang.String");
        String upperCase2 = strValueOf2.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
        if (!Intrinsics.f(upperCase, "X") && str.length() > 9) {
            return false;
        }
        if (Intrinsics.f(upperCase, "X") && str.length() > 10) {
            return false;
        }
        String strSubstring = str.substring(1, str.length() - 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        if (Character.isDigit(kotlin.text.f0.P0(str))) {
            return a(upperCase + strSubstring, upperCase2);
        }
        if (Intrinsics.f(upperCase, "X")) {
            return a("0" + strSubstring, upperCase2);
        }
        if (Intrinsics.f(upperCase, "Y")) {
            return a("1" + strSubstring, upperCase2);
        }
        if (Intrinsics.f(upperCase, "Z")) {
            return a("2" + strSubstring, upperCase2);
        }
        if (new Regex("[ABCDEFGHJUV]").f(upperCase)) {
            return c(strSubstring, upperCase2);
        }
        if (new Regex("[NPQRSW]").f(upperCase)) {
            return b(strSubstring, upperCase2);
        }
        return false;
    }

    private final boolean d(String str) {
        int length = str.length();
        return 9 <= length && length < 11;
    }

    @Override // com.fourthline.orca.internal.ab1
    public za1 a(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        String strD = kotlin.text.a0.D(input, "-", "", false);
        return !d(strD) ? za1.f35554c : !c(strD) ? za1.d : za1.f35552a;
    }

    private final int b(String str) {
        List listK = zhm.v.k(new ArrayList(), new ArrayList());
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            ((List) listK.get(a(i2))).add(Integer.valueOf(kotlin.text.a.a(str.charAt(i))));
            i++;
            i2++;
        }
        List list = (List) listK.get(0);
        Iterator it8 = ((List) listK.get(1)).iterator();
        if (it8.hasNext()) {
            Object next = it8.next();
            while (it8.hasNext()) {
                next = Integer.valueOf(((Number) next).intValue() + ((Number) it8.next()).intValue());
            }
            int iIntValue = ((Number) next).intValue();
            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
            Iterator it9 = list.iterator();
            while (it9.hasNext()) {
                String string = Integer.toString(((Number) it9.next()).intValue() * 2, CharsKt.checkRadix(10));
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                arrayList.add(kotlin.text.f0.M0(1, string));
            }
            Iterator it10 = zhm.w.u(arrayList).iterator();
            int i3 = 0;
            while (it10.hasNext()) {
                i3 += Integer.parseInt((String) it10.next(), CharsKt.checkRadix(10));
            }
            int i5 = (iIntValue + i3) % 10;
            if (i5 == 0) {
                return 0;
            }
            return 10 - i5;
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    private final boolean a(String str, String str2) {
        return Intrinsics.f(String.valueOf("TRWAGMYFPDXBNJZSQVHLCKE".charAt(Integer.parseInt(str, CharsKt.checkRadix(10)) % 23)), str2);
    }

    private final int a(int i) {
        return i % 2;
    }

    private final boolean c(String str, String str2) {
        return b(str) == Integer.parseInt(str2, CharsKt.checkRadix(10));
    }
}
