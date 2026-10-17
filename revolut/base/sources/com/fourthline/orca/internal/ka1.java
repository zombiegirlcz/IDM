package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class ka1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r91 f30195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f30196b;

    private ka1(r91 r91Var, e4m.e eVar) {
        this.f30195a = r91Var;
        this.f30196b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public w81 get() {
        return a(this.f30195a, (gj) this.f30196b.get());
    }

    public static ka1 a(r91 r91Var, e4m.e eVar) {
        return new ka1(r91Var, eVar);
    }

    public static w81 a(r91 r91Var, gj gjVar) {
        w81 w81VarE = r91Var.e(gjVar);
        vc.s.k(w81VarE);
        return w81VarE;
    }
}
