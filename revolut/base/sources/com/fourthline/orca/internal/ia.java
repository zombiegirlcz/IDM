package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class ia implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ga f29539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f29540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f29541c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    private ia(ga gaVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        this.f29539a = gaVar;
        this.f29540b = eVar;
        this.f29541c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public aq0 get() {
        return a(this.f29539a, (o80) this.f29540b.get(), (r70) this.f29541c.get(), (fh0) this.d.get(), (bq0) this.e.get(), (v10) this.f.get());
    }

    public static ia a(ga gaVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        return new ia(gaVar, eVar, eVar2, eVar3, eVar4, eVar5);
    }

    public static aq0 a(ga gaVar, o80 o80Var, r70 r70Var, fh0 fh0Var, bq0 bq0Var, v10 v10Var) {
        aq0 aq0VarA = gaVar.a(o80Var, r70Var, fh0Var, bq0Var, v10Var);
        vc.s.k(aq0VarA);
        return aq0VarA;
    }
}
