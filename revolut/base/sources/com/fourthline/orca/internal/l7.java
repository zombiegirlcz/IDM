package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class l7 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g7 f30529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f30530b;

    private l7(g7 g7Var, e4m.e eVar) {
        this.f30529a = g7Var;
        this.f30530b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public v3 get() {
        return a(this.f30529a, (ib0) this.f30530b.get());
    }

    public static l7 a(g7 g7Var, e4m.e eVar) {
        return new l7(g7Var, eVar);
    }

    public static v3 a(g7 g7Var, ib0 ib0Var) {
        v3 v3VarB = g7Var.b(ib0Var);
        vc.s.k(v3VarB);
        return v3VarB;
    }
}
