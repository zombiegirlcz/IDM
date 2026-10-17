package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class lc0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zb0 f30568a;

    private lc0(zb0 zb0Var) {
        this.f30568a = zb0Var;
    }

    public static af0 b(zb0 zb0Var) {
        af0 af0VarB = zb0Var.b();
        vc.s.k(af0VarB);
        return af0VarB;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public af0 get() {
        return b(this.f30568a);
    }

    public static lc0 a(zb0 zb0Var) {
        return new lc0(zb0Var);
    }
}
