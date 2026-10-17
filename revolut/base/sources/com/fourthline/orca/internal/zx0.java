package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class zx0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wx0 f35746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f35747b;

    private zx0(wx0 wx0Var, e4m.e eVar) {
        this.f35746a = wx0Var;
        this.f35747b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public yv0 get() {
        return a(this.f35746a, (fv0) this.f35747b.get());
    }

    public static zx0 a(wx0 wx0Var, e4m.e eVar) {
        return new zx0(wx0Var, eVar);
    }

    public static yv0 a(wx0 wx0Var, fv0 fv0Var) {
        yv0 yv0VarA = wx0Var.a(fv0Var);
        vc.s.k(yv0VarA);
        return yv0VarA;
    }
}
