package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class sp implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hp f33080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f33081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f33082c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e4m.e f33083g;

    private sp(hp hpVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6) {
        this.f33080a = hpVar;
        this.f33081b = eVar;
        this.f33082c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
        this.f33083g = eVar6;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gp get() {
        return a(this.f33080a, (o80) this.f33081b.get(), (sj0) this.f33082c.get(), (bq0) this.d.get(), (c80) this.e.get(), (l70) this.f.get(), (v10) this.f33083g.get());
    }

    public static sp a(hp hpVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6) {
        return new sp(hpVar, eVar, eVar2, eVar3, eVar4, eVar5, eVar6);
    }

    public static gp a(hp hpVar, o80 o80Var, sj0 sj0Var, bq0 bq0Var, c80 c80Var, l70 l70Var, v10 v10Var) {
        gp gpVarA = hpVar.a(o80Var, sj0Var, bq0Var, c80Var, l70Var, v10Var);
        vc.s.k(gpVarA);
        return gpVarA;
    }
}
