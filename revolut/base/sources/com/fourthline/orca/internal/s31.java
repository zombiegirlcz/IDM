package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class s31 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p31 f32897a;

    private s31(p31 p31Var) {
        this.f32897a = p31Var;
    }

    public static mb.d b(p31 p31Var) {
        mb.d dVarC = p31Var.c();
        vc.s.k(dVarC);
        return dVarC;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public mb.d get() {
        return b(this.f32897a);
    }

    public static s31 a(p31 p31Var) {
        return new s31(p31Var);
    }
}
