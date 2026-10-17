package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class p61 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l61 f31860a;

    private p61(l61 l61Var) {
        this.f31860a = l61Var;
    }

    public static kx0 b(l61 l61Var) {
        kx0 kx0VarC = l61Var.c();
        vc.s.k(kx0VarC);
        return kx0VarC;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public kx0 get() {
        return b(this.f31860a);
    }

    public static p61 a(l61 l61Var) {
        return new p61(l61Var);
    }
}
