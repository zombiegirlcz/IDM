package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class zk0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fk0 f35621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f35622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f35623c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e4m.e f35624g;

    private zk0(fk0 fk0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6) {
        this.f35621a = fk0Var;
        this.f35622b = eVar;
        this.f35623c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
        this.f35624g = eVar6;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public aq0 get() {
        return a(this.f35621a, (r70) this.f35622b.get(), (ek0) this.f35623c.get(), (fh0) this.d.get(), (o80) this.e.get(), (bq0) this.f.get(), (v10) this.f35624g.get());
    }

    public static zk0 a(fk0 fk0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6) {
        return new zk0(fk0Var, eVar, eVar2, eVar3, eVar4, eVar5, eVar6);
    }

    public static aq0 a(fk0 fk0Var, r70 r70Var, ek0 ek0Var, fh0 fh0Var, o80 o80Var, bq0 bq0Var, v10 v10Var) {
        aq0 aq0VarA = fk0Var.a(r70Var, ek0Var, fh0Var, o80Var, bq0Var, v10Var);
        vc.s.k(aq0VarA);
        return aq0VarA;
    }
}
