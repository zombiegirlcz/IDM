package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class c41 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a41 f27363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f27364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f27365c;

    private c41(a41 a41Var, e4m.e eVar, e4m.e eVar2) {
        this.f27363a = a41Var;
        this.f27364b = eVar;
        this.f27365c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public je get() {
        return a(this.f27363a, (mb.d) this.f27364b.get(), (ib0) this.f27365c.get());
    }

    public static c41 a(a41 a41Var, e4m.e eVar, e4m.e eVar2) {
        return new c41(a41Var, eVar, eVar2);
    }

    public static je a(a41 a41Var, mb.d dVar, ib0 ib0Var) {
        je jeVarA = a41Var.a(dVar, ib0Var);
        vc.s.k(jeVarA);
        return jeVarA;
    }
}
