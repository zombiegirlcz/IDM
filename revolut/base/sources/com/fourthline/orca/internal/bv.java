package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class bv implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xu f27235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f27236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f27237c;
    private final e4m.e d;

    private bv(xu xuVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        this.f27235a = xuVar;
        this.f27236b = eVar;
        this.f27237c = eVar2;
        this.d = eVar3;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public lf0 get() {
        return a(this.f27235a, (mf0) this.f27236b.get(), (l70) this.f27237c.get(), (v10) this.d.get());
    }

    public static bv a(xu xuVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        return new bv(xuVar, eVar, eVar2, eVar3);
    }

    public static lf0 a(xu xuVar, mf0 mf0Var, l70 l70Var, v10 v10Var) {
        lf0 lf0VarA = xuVar.a(mf0Var, l70Var, v10Var);
        vc.s.k(lf0VarA);
        return lf0VarA;
    }
}
