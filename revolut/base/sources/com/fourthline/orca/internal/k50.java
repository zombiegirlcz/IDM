package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class k50 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h50 f30131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f30132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f30133c;
    private final e4m.e d;
    private final e4m.e e;

    private k50(h50 h50Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        this.f30131a = h50Var;
        this.f30132b = eVar;
        this.f30133c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public sc1 get() {
        return a(this.f30131a, (je) this.f30132b.get(), (ef) this.f30133c.get(), (r70) this.d.get(), (sg0) this.e.get());
    }

    public static k50 a(h50 h50Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        return new k50(h50Var, eVar, eVar2, eVar3, eVar4);
    }

    public static sc1 a(h50 h50Var, je jeVar, ef efVar, r70 r70Var, sg0 sg0Var) {
        sc1 sc1VarA = h50Var.a(jeVar, efVar, r70Var, sg0Var);
        vc.s.k(sc1VarA);
        return sc1VarA;
    }
}
