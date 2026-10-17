package com.fourthline.orca.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class j80 implements i80, p71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p71 f29824a;

    public j80(p71 inputValidator) {
        Intrinsics.checkNotNullParameter(inputValidator, "inputValidator");
        this.f29824a = inputValidator;
    }

    @Override // com.fourthline.orca.internal.p71
    public k20 a(String input, List suggestedCountries) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(suggestedCountries, "suggestedCountries");
        return this.f29824a.a(input, suggestedCountries);
    }

    @Override // com.fourthline.orca.internal.i80
    public boolean a(fd country, di diVar) {
        List listA;
        Intrinsics.checkNotNullParameter(country, "country");
        if (diVar == null || (listA = diVar.a()) == null) {
            return true;
        }
        return listA.contains(country.c());
    }
}
