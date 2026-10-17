package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class y4 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e4 f35153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f35154b;

    private y4(e4 e4Var, e4m.e eVar) {
        this.f35153a = e4Var;
        this.f35154b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z6 get() {
        return a(this.f35153a, (d3) this.f35154b.get());
    }

    public static y4 a(e4 e4Var, e4m.e eVar) {
        return new y4(e4Var, eVar);
    }

    public static z6 a(e4 e4Var, d3 d3Var) {
        z6 z6VarD = e4Var.d(d3Var);
        vc.s.k(z6VarD);
        return z6VarD;
    }
}
