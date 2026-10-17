package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class y41 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v41 f35157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f35158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f35159c;

    private y41(v41 v41Var, e4m.e eVar, e4m.e eVar2) {
        this.f35157a = v41Var;
        this.f35158b = eVar;
        this.f35159c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public u41 get() {
        return a(this.f35157a, (fl) this.f35158b.get(), (nc1) this.f35159c.get());
    }

    public static y41 a(v41 v41Var, e4m.e eVar, e4m.e eVar2) {
        return new y41(v41Var, eVar, eVar2);
    }

    public static u41 a(v41 v41Var, fl flVar, nc1 nc1Var) {
        u41 u41VarA = v41Var.a(flVar, nc1Var);
        vc.s.k(u41VarA);
        return u41VarA;
    }
}
