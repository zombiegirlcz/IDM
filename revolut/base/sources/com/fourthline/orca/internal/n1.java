package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class n1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l1 f31306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31307b;

    private n1(l1 l1Var, e4m.e eVar) {
        this.f31306a = l1Var;
        this.f31307b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public k80 get() {
        return a(this.f31306a, (sg0) this.f31307b.get());
    }

    public static n1 a(l1 l1Var, e4m.e eVar) {
        return new n1(l1Var, eVar);
    }

    public static k80 a(l1 l1Var, sg0 sg0Var) {
        k80 k80VarA = l1Var.a(sg0Var);
        vc.s.k(k80VarA);
        return k80VarA;
    }
}
