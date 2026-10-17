package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class o9 implements n9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gj f31607a;

    public o9(gj bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        this.f31607a = bundle;
    }

    @Override // com.fourthline.orca.internal.n9
    public void a(String canNumber) {
        Intrinsics.checkNotNullParameter(canNumber, "canNumber");
        this.f31607a.b(canNumber);
    }
}
