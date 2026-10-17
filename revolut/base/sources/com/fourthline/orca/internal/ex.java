package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ex implements dx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m81 f28285a;

    public ex(m81 tinBundle) {
        Intrinsics.checkNotNullParameter(tinBundle, "tinBundle");
        this.f28285a = tinBundle;
    }

    @Override // com.fourthline.orca.internal.dx
    public void a(String tin, x71 taxationCountry) {
        Intrinsics.checkNotNullParameter(tin, "tin");
        Intrinsics.checkNotNullParameter(taxationCountry, "taxationCountry");
        n81 n81VarG = this.f28285a.g();
        if (this.f28285a.a() == null) {
            n81VarG.a(taxationCountry.d());
            n81VarG.b(tin);
        }
    }
}
