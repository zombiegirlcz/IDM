package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes23.dex */
public final class l40 implements ab1 {
    private final boolean b(String str) {
        return Intrinsics.f(new Regex("[A-Z]").replace(new Regex("\\d").replace(str, "9"), "L"), "LLLLLL99L99L999L");
    }

    private final boolean c(String str) {
        return str.length() == 16;
    }

    @Override // com.fourthline.orca.internal.ab1
    public za1 a(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        String string = kotlin.text.d0.F0(input).toString();
        return !c(string) ? za1.f35554c : !b(string) ? za1.d : za1.f35552a;
    }
}
