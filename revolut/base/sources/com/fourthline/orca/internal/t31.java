package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class t31 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p31 f33190a;

    private t31(p31 p31Var) {
        this.f33190a = p31Var;
    }

    public static gf1 b(p31 p31Var) {
        gf1 gf1VarD = p31Var.d();
        vc.s.k(gf1VarD);
        return gf1VarD;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gf1 get() {
        return b(this.f33190a);
    }

    public static t31 a(p31 p31Var) {
        return new t31(p31Var);
    }
}
