package com.fourthline.orca.internal;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public class ej0 implements p71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function0 f28156a;

    public ej0(Function0 resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.f28156a = resources;
    }

    @Override // com.fourthline.orca.internal.p71
    public k20 a(String input, List suggestedCountries) {
        c81 name;
        String strA;
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(suggestedCountries, "suggestedCountries");
        a01 a01Var = (a01) zhm.d0.d0(suggestedCountries);
        boolean zF = Intrinsics.f((a01Var == null || (name = a01Var.getName()) == null || (strA = d81.a(name, this.f28156a)) == null) ? null : ba.a(strA), ba.a(input));
        if (input.length() == 0) {
            return k20.f30106a;
        }
        if (input.length() > 0 && !zF) {
            return k20.f30107b;
        }
        if (input.length() <= 0 || !suggestedCountries.isEmpty()) {
            return null;
        }
        return k20.f30107b;
    }
}
