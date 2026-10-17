package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class z61 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u61 f35534a;

    private z61(u61 u61Var) {
        this.f35534a = u61Var;
    }

    public static s61 b(u61 u61Var) {
        s61 s61VarD = u61Var.d();
        vc.s.k(s61VarD);
        return s61VarD;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public s61 get() {
        return b(this.f35534a);
    }

    public static z61 a(u61 u61Var) {
        return new z61(u61Var);
    }
}
