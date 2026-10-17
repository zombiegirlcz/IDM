package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class n10 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l10 f31308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f31310c;

    private n10(l10 l10Var, e4m.e eVar, e4m.e eVar2) {
        this.f31308a = l10Var;
        this.f31309b = eVar;
        this.f31310c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public oc1 get() {
        return a(this.f31308a, (r70) this.f31309b.get(), (ib0) this.f31310c.get());
    }

    public static n10 a(l10 l10Var, e4m.e eVar, e4m.e eVar2) {
        return new n10(l10Var, eVar, eVar2);
    }

    public static oc1 a(l10 l10Var, r70 r70Var, ib0 ib0Var) {
        oc1 oc1VarA = l10Var.a(r70Var, ib0Var);
        vc.s.k(oc1VarA);
        return oc1VarA;
    }
}
