package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class wm0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pm0 f34742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f34744c;
    private final e4m.e d;
    private final e4m.e e;

    private wm0(pm0 pm0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        this.f34742a = pm0Var;
        this.f34743b = eVar;
        this.f34744c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public aq0 get() {
        return a(this.f34742a, (vo0) this.f34743b.get(), (bn0) this.f34744c.get(), (bq0) this.d.get(), (v10) this.e.get());
    }

    public static wm0 a(pm0 pm0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        return new wm0(pm0Var, eVar, eVar2, eVar3, eVar4);
    }

    public static aq0 a(pm0 pm0Var, vo0 vo0Var, bn0 bn0Var, bq0 bq0Var, v10 v10Var) {
        aq0 aq0VarA = pm0Var.a(vo0Var, bn0Var, bq0Var, v10Var);
        vc.s.k(aq0VarA);
        return aq0VarA;
    }
}
