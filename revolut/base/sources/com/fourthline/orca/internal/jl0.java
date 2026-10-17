package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class jl0 implements il0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yj0 f29945a;

    public jl0(yj0 personBundle) {
        Intrinsics.checkNotNullParameter(personBundle, "personBundle");
        this.f29945a = personBundle;
    }

    public void a(fd fdVar) {
        this.f29945a.t().d(fdVar != null ? fdVar.c() : null);
    }

    @Override // com.fourthline.orca.internal.il0
    public void b(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f29945a.t().a(value);
    }

    @Override // com.fourthline.orca.internal.m40
    public void a(a01 a01Var) {
        kl0 kl0Var = a01Var instanceof kl0 ? (kl0) a01Var : null;
        a(kl0Var != null ? kl0Var.b() : null);
    }
}
