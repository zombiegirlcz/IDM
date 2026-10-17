package com.fourthline.orca.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class nd implements n40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f31388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ux f31389b;

    public nd(List countries, ux filterCountriesUseCase) {
        Intrinsics.checkNotNullParameter(countries, "countries");
        Intrinsics.checkNotNullParameter(filterCountriesUseCase, "filterCountriesUseCase");
        this.f31388a = countries;
        this.f31389b = filterCountriesUseCase;
    }

    @Override // com.fourthline.orca.internal.n40
    public List a(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f31389b.a(kotlin.text.d0.F0(value).toString(), this.f31388a);
    }
}
