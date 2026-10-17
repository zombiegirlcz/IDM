package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class dm0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zl0 f27821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f27822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f27823c;

    private dm0(zl0 zl0Var, e4m.e eVar, e4m.e eVar2) {
        this.f27821a = zl0Var;
        this.f27822b = eVar;
        this.f27823c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public o71 get() {
        return a(this.f27821a, (mb.d) this.f27822b.get(), (ib0) this.f27823c.get());
    }

    public static dm0 a(zl0 zl0Var, e4m.e eVar, e4m.e eVar2) {
        return new dm0(zl0Var, eVar, eVar2);
    }

    public static o71 a(zl0 zl0Var, mb.d dVar, ib0 ib0Var) {
        o71 o71VarA = zl0Var.a(dVar, ib0Var);
        vc.s.k(o71VarA);
        return o71VarA;
    }
}
