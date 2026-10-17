package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class as0 implements zr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kt0 f26895a;

    public as0(kt0 bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        this.f26895a = bundle;
    }

    @Override // com.fourthline.orca.internal.zr0
    public String a() {
        return this.f26895a.e();
    }

    @Override // com.fourthline.orca.internal.zr0
    public xg1 b() {
        return this.f26895a.c();
    }
}
