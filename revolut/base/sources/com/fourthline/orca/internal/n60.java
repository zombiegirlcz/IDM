package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class n60 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g60 f31338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31339b;

    private n60(g60 g60Var, e4m.e eVar) {
        this.f31338a = g60Var;
        this.f31339b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e70 get() {
        return a(this.f31338a, (l70) this.f31339b.get());
    }

    public static n60 a(g60 g60Var, e4m.e eVar) {
        return new n60(g60Var, eVar);
    }

    public static e70 a(g60 g60Var, l70 l70Var) {
        e70 e70VarA = g60Var.a(l70Var);
        vc.s.k(e70VarA);
        return e70VarA;
    }
}
