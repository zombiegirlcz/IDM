package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class b91 implements a91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m81 f27060a;

    public b91(m81 tinBundle) {
        Intrinsics.checkNotNullParameter(tinBundle, "tinBundle");
        this.f27060a = tinBundle;
    }

    @Override // com.fourthline.orca.internal.a91
    public void a(z81 tinDetails) {
        Intrinsics.checkNotNullParameter(tinDetails, "tinDetails");
        n81 n81VarJ = this.f27060a.j();
        n81VarJ.a(tinDetails.b().d());
        n81VarJ.b(tinDetails.a());
    }
}
