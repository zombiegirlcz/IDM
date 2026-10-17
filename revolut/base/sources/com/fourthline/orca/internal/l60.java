package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class l60 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g60 f30527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f30528b;

    private l60(g60 g60Var, e4m.e eVar) {
        this.f30527a = g60Var;
        this.f30528b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public x60 get() {
        return a(this.f30527a, (sg0) this.f30528b.get());
    }

    public static l60 a(g60 g60Var, e4m.e eVar) {
        return new l60(g60Var, eVar);
    }

    public static x60 a(g60 g60Var, sg0 sg0Var) {
        x60 x60VarA = g60Var.a(sg0Var);
        vc.s.k(x60VarA);
        return x60VarA;
    }
}
