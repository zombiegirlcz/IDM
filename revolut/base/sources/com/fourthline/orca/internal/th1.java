package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class th1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final oh1 f33779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f33780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f33781c;

    private th1(oh1 oh1Var, e4m.e eVar, e4m.e eVar2) {
        this.f33779a = oh1Var;
        this.f33780b = eVar;
        this.f33781c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public jz get() {
        return a(this.f33779a, (r70) this.f33780b.get(), (ib0) this.f33781c.get());
    }

    public static th1 a(oh1 oh1Var, e4m.e eVar, e4m.e eVar2) {
        return new th1(oh1Var, eVar, eVar2);
    }

    public static jz a(oh1 oh1Var, r70 r70Var, ib0 ib0Var) {
        jz jzVarA = oh1Var.a(r70Var, ib0Var);
        vc.s.k(jzVarA);
        return jzVarA;
    }
}
