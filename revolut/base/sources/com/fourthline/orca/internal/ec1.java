package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class ec1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final cc1 f28106a;

    private ec1(cc1 cc1Var) {
        this.f28106a = cc1Var;
    }

    public static ub1 b(cc1 cc1Var) {
        ub1 ub1VarA = cc1Var.a();
        vc.s.k(ub1VarA);
        return ub1VarA;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ub1 get() {
        return b(this.f28106a);
    }

    public static ec1 a(cc1 cc1Var) {
        return new ec1(cc1Var);
    }
}
