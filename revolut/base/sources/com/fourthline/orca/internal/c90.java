package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes23.dex */
public final class c90 implements ab1 {
    private final boolean b(String str) {
        try {
            if (!new Regex("[\\d]{8,9}").f(str)) {
                return false;
            }
            if (str.length() == 8) {
                str = "0".concat(str);
            }
            int iA = (a(str, 0) * 9) + (a(str, 1) * 8) + (a(str, 2) * 7) + (a(str, 3) * 6) + (a(str, 4) * 5) + (a(str, 5) * 4) + (a(str, 6) * 3) + (a(str, 7) * 2) + (a(str, 8) * (-1));
            if (iA != 0) {
                if (iA % 11 == 0) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    private final boolean c(String str) {
        return str.length() == 9;
    }

    @Override // com.fourthline.orca.internal.ab1
    public za1 a(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        String string = kotlin.text.d0.F0(input).toString();
        return !c(string) ? za1.f35554c : !b(string) ? za1.d : za1.f35552a;
    }

    private static final int a(String str, int i) {
        return kotlin.text.a.a(str.charAt(i));
    }
}
