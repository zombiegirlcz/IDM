package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class xx0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wx0 f35105a;

    private xx0(wx0 wx0Var) {
        this.f35105a = wx0Var;
    }

    public static ls0 b(wx0 wx0Var) {
        ls0 ls0VarA = wx0Var.a();
        vc.s.k(ls0VarA);
        return ls0VarA;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ls0 get() {
        return b(this.f35105a);
    }

    public static xx0 a(wx0 wx0Var) {
        return new xx0(wx0Var);
    }
}
