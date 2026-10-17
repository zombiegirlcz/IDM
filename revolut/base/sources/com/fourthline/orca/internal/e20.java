package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class e20 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c20 f27974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f27975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f27976c;
    private final e4m.e d;

    private e20(c20 c20Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        this.f27974a = c20Var;
        this.f27975b = eVar;
        this.f27976c = eVar2;
        this.d = eVar3;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public q01 get() {
        return a(this.f27974a, (o80) this.f27975b.get(), (j11) this.f27976c.get(), (g20) this.d.get());
    }

    public static e20 a(c20 c20Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        return new e20(c20Var, eVar, eVar2, eVar3);
    }

    public static q01 a(c20 c20Var, o80 o80Var, j11 j11Var, g20 g20Var) {
        q01 q01VarA = c20Var.a(o80Var, j11Var, g20Var);
        vc.s.k(q01VarA);
        return q01VarA;
    }
}
