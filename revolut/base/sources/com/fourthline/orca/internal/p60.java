package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class p60 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g60 f31855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f31857c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e4m.e f31858g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final e4m.e f31859h;

    private p60(g60 g60Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6, e4m.e eVar7) {
        this.f31855a = g60Var;
        this.f31856b = eVar;
        this.f31857c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
        this.f31858g = eVar6;
        this.f31859h = eVar7;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public aq0 get() {
        return a(this.f31855a, (r70) this.f31856b.get(), (wr) this.f31857c.get(), (fh0) this.d.get(), (o80) this.e.get(), (bq0) this.f.get(), (l70) this.f31858g.get(), (v10) this.f31859h.get());
    }

    public static p60 a(g60 g60Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6, e4m.e eVar7) {
        return new p60(g60Var, eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7);
    }

    public static aq0 a(g60 g60Var, r70 r70Var, wr wrVar, fh0 fh0Var, o80 o80Var, bq0 bq0Var, l70 l70Var, v10 v10Var) {
        aq0 aq0VarA = g60Var.a(r70Var, wrVar, fh0Var, o80Var, bq0Var, l70Var, v10Var);
        vc.s.k(aq0VarA);
        return aq0VarA;
    }
}
