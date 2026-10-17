package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class v7 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u7 f34260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34261b;

    private v7(u7 u7Var, e4m.e eVar) {
        this.f34260a = u7Var;
        this.f34261b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ww get() {
        return a(this.f34260a, (fe1) this.f34261b.get());
    }

    public static v7 a(u7 u7Var, e4m.e eVar) {
        return new v7(u7Var, eVar);
    }

    public static ww a(u7 u7Var, fe1 fe1Var) {
        ww wwVarA = u7Var.a(fe1Var);
        vc.s.k(wwVarA);
        return wwVarA;
    }
}
