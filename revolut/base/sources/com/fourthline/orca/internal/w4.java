package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class w4 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e4 f34501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f34503c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e4m.e f34504g;

    private w4(e4 e4Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6) {
        this.f34501a = e4Var;
        this.f34502b = eVar;
        this.f34503c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
        this.f34504g = eVar6;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public aq0 get() {
        return a(this.f34501a, (r70) this.f34502b.get(), (bq0) this.f34503c.get(), (d4) this.d.get(), (fh0) this.e.get(), (o80) this.f.get(), (v10) this.f34504g.get());
    }

    public static w4 a(e4 e4Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6) {
        return new w4(e4Var, eVar, eVar2, eVar3, eVar4, eVar5, eVar6);
    }

    public static aq0 a(e4 e4Var, r70 r70Var, bq0 bq0Var, d4 d4Var, fh0 fh0Var, o80 o80Var, v10 v10Var) {
        aq0 aq0VarA = e4Var.a(r70Var, bq0Var, d4Var, fh0Var, o80Var, v10Var);
        vc.s.k(aq0VarA);
        return aq0VarA;
    }
}
