package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class wd0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pd0 f34646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f34648c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e4m.e f34649g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final e4m.e f34650h;
    private final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final e4m.e f34651j;

    private wd0(pd0 pd0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6, e4m.e eVar7, e4m.e eVar8, e4m.e eVar9) {
        this.f34646a = pd0Var;
        this.f34647b = eVar;
        this.f34648c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
        this.f34649g = eVar6;
        this.f34650h = eVar7;
        this.i = eVar8;
        this.f34651j = eVar9;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public aq0 get() {
        return a(this.f34646a, (r70) this.f34647b.get(), (gj) this.f34648c.get(), (wr) this.d.get(), (bq0) this.e.get(), (fh0) this.f.get(), (o80) this.f34649g.get(), (l70) this.f34650h.get(), (v10) this.i.get(), (ke0) this.f34651j.get());
    }

    public static wd0 a(pd0 pd0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6, e4m.e eVar7, e4m.e eVar8, e4m.e eVar9) {
        return new wd0(pd0Var, eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9);
    }

    public static aq0 a(pd0 pd0Var, r70 r70Var, gj gjVar, wr wrVar, bq0 bq0Var, fh0 fh0Var, o80 o80Var, l70 l70Var, v10 v10Var, ke0 ke0Var) {
        aq0 aq0VarA = pd0Var.a(r70Var, gjVar, wrVar, bq0Var, fh0Var, o80Var, l70Var, v10Var, ke0Var);
        vc.s.k(aq0VarA);
        return aq0VarA;
    }
}
