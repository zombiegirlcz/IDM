package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class cy0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wx0 f27589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f27590b;

    private cy0(wx0 wx0Var, e4m.e eVar) {
        this.f27589a = wx0Var;
        this.f27590b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public fv0 get() {
        return a(this.f27589a, (kh1) this.f27590b.get());
    }

    public static cy0 a(wx0 wx0Var, e4m.e eVar) {
        return new cy0(wx0Var, eVar);
    }

    public static fv0 a(wx0 wx0Var, kh1 kh1Var) {
        fv0 fv0VarA = wx0Var.a(kh1Var);
        vc.s.k(fv0VarA);
        return fv0VarA;
    }
}
