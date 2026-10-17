package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class w21 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v21 f34495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34496b;

    private w21(v21 v21Var, e4m.e eVar) {
        this.f34495a = v21Var;
        this.f34496b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public c00 get() {
        return a(this.f34495a, (ib0) this.f34496b.get());
    }

    public static w21 a(v21 v21Var, e4m.e eVar) {
        return new w21(v21Var, eVar);
    }

    public static c00 a(v21 v21Var, ib0 ib0Var) {
        c00 c00VarA = v21Var.a(ib0Var);
        vc.s.k(c00VarA);
        return c00VarA;
    }
}
