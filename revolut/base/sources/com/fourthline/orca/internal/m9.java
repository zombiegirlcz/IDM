package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class m9 implements l9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gj f31105a;

    public m9(gj bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        this.f31105a = bundle;
    }

    @Override // com.fourthline.orca.internal.l9
    public String a() {
        return this.f31105a.d();
    }
}
