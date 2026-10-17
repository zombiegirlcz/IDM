package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class o61 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l61 f31597a;

    private o61(l61 l61Var) {
        this.f31597a = l61Var;
    }

    public static fx0 b(l61 l61Var) {
        fx0 fx0VarB = l61Var.b();
        vc.s.k(fx0VarB);
        return fx0VarB;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public fx0 get() {
        return b(this.f31597a);
    }

    public static o61 a(l61 l61Var) {
        return new o61(l61Var);
    }
}
