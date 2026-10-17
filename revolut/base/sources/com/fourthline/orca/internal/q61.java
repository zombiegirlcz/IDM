package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class q61 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l61 f32209a;

    private q61(l61 l61Var) {
        this.f32209a = l61Var;
    }

    public static nx0 b(l61 l61Var) {
        nx0 nx0VarD = l61Var.d();
        vc.s.k(nx0VarD);
        return nx0VarD;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public nx0 get() {
        return b(this.f32209a);
    }

    public static q61 a(l61 l61Var) {
        return new q61(l61Var);
    }
}
