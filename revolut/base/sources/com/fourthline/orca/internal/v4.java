package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class v4 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e4 f34239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34240b;

    private v4(e4 e4Var, e4m.e eVar) {
        this.f34239a = e4Var;
        this.f34240b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public j5 get() {
        return a(this.f34239a, (d3) this.f34240b.get());
    }

    public static v4 a(e4 e4Var, e4m.e eVar) {
        return new v4(e4Var, eVar);
    }

    public static j5 a(e4 e4Var, d3 d3Var) {
        j5 j5VarC = e4Var.c(d3Var);
        vc.s.k(j5VarC);
        return j5VarC;
    }
}
