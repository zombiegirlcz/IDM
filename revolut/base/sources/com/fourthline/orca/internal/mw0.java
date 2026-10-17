package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class mw0 implements lw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kt0 f31286a;

    public mw0(kt0 bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        this.f31286a = bundle;
    }

    @Override // com.fourthline.orca.internal.lw0
    public String a() {
        return this.f31286a.e();
    }
}
