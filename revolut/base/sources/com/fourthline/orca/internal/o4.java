package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class o4 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e4 f31558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31559b;

    private o4(e4 e4Var, e4m.e eVar) {
        this.f31558a = e4Var;
        this.f31559b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public r5 get() {
        return a(this.f31558a, (l70) this.f31559b.get());
    }

    public static o4 a(e4 e4Var, e4m.e eVar) {
        return new o4(e4Var, eVar);
    }

    public static r5 a(e4 e4Var, l70 l70Var) {
        r5 r5VarA = e4Var.a(l70Var);
        vc.s.k(r5VarA);
        return r5VarA;
    }
}
