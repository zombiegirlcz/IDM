package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class kf1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hf1 f30268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f30269b;

    private kf1(hf1 hf1Var, e4m.e eVar) {
        this.f30268a = hf1Var;
        this.f30269b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public t90 get() {
        return a(this.f30268a, (gf1) this.f30269b.get());
    }

    public static kf1 a(hf1 hf1Var, e4m.e eVar) {
        return new kf1(hf1Var, eVar);
    }

    public static t90 a(hf1 hf1Var, gf1 gf1Var) {
        t90 t90VarA = hf1Var.a(gf1Var);
        vc.s.k(t90VarA);
        return t90VarA;
    }
}
