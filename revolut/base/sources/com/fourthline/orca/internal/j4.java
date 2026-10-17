package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class j4 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e4 f29795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f29796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f29797c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    private j4(e4 e4Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        this.f29795a = e4Var;
        this.f29796b = eVar;
        this.f29797c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public t3 get() {
        return a(this.f29795a, (r3) this.f29796b.get(), (j5) this.f29797c.get(), (v10) this.d.get(), (l70) this.e.get(), (sg0) this.f.get());
    }

    public static j4 a(e4 e4Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        return new j4(e4Var, eVar, eVar2, eVar3, eVar4, eVar5);
    }

    public static t3 a(e4 e4Var, r3 r3Var, j5 j5Var, v10 v10Var, l70 l70Var, sg0 sg0Var) {
        t3 t3VarA = e4Var.a(r3Var, j5Var, v10Var, l70Var, sg0Var);
        vc.s.k(t3VarA);
        return t3VarA;
    }
}
