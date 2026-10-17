package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class j60 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g60 f29811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f29812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f29813c;
    private final e4m.e d;

    private j60(g60 g60Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        this.f29811a = g60Var;
        this.f29812b = eVar;
        this.f29813c = eVar2;
        this.d = eVar3;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public f60 get() {
        return a(this.f29811a, (o80) this.f29812b.get(), (bq0) this.f29813c.get(), (v10) this.d.get());
    }

    public static j60 a(g60 g60Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        return new j60(g60Var, eVar, eVar2, eVar3);
    }

    public static f60 a(g60 g60Var, o80 o80Var, bq0 bq0Var, v10 v10Var) {
        f60 f60VarA = g60Var.a(o80Var, bq0Var, v10Var);
        vc.s.k(f60VarA);
        return f60VarA;
    }
}
