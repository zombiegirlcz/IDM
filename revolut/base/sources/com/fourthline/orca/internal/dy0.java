package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class dy0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wx0 f27947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f27948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f27949c;

    private dy0(wx0 wx0Var, e4m.e eVar, e4m.e eVar2) {
        this.f27947a = wx0Var;
        this.f27948b = eVar;
        this.f27949c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public bw0 get() {
        return a(this.f27947a, (ls0) this.f27948b.get(), (ib0) this.f27949c.get());
    }

    public static dy0 a(wx0 wx0Var, e4m.e eVar, e4m.e eVar2) {
        return new dy0(wx0Var, eVar, eVar2);
    }

    public static bw0 a(wx0 wx0Var, ls0 ls0Var, ib0 ib0Var) {
        bw0 bw0VarA = wx0Var.a(ls0Var, ib0Var);
        vc.s.k(bw0VarA);
        return bw0VarA;
    }
}
