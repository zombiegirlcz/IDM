package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class h4 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e4 f29132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f29133b;

    private h4(e4 e4Var, e4m.e eVar) {
        this.f29132a = e4Var;
        this.f29133b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public r3 get() {
        return a(this.f29132a, (d3) this.f29133b.get());
    }

    public static h4 a(e4 e4Var, e4m.e eVar) {
        return new h4(e4Var, eVar);
    }

    public static r3 a(e4 e4Var, d3 d3Var) {
        r3 r3VarB = e4Var.b(d3Var);
        vc.s.k(r3VarB);
        return r3VarB;
    }
}
