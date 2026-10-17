package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class cc0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zb0 f27437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f27438b;

    private cc0(zb0 zb0Var, e4m.e eVar) {
        this.f27437a = zb0Var;
        this.f27438b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public yb0 get() {
        return a(this.f27437a, (o80) this.f27438b.get());
    }

    public static cc0 a(zb0 zb0Var, e4m.e eVar) {
        return new cc0(zb0Var, eVar);
    }

    public static yb0 a(zb0 zb0Var, o80 o80Var) {
        yb0 yb0VarA = zb0Var.a(o80Var);
        vc.s.k(yb0VarA);
        return yb0VarA;
    }
}
