package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class m60 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g60 f31013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31014b;

    private m60(g60 g60Var, e4m.e eVar) {
        this.f31013a = g60Var;
        this.f31014b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public c70 get() {
        return a(this.f31013a, (r60) this.f31014b.get());
    }

    public static m60 a(g60 g60Var, e4m.e eVar) {
        return new m60(g60Var, eVar);
    }

    public static c70 a(g60 g60Var, r60 r60Var) {
        c70 c70VarA = g60Var.a(r60Var);
        vc.s.k(c70VarA);
        return c70VarA;
    }
}
