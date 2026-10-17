package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class vm0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pm0 f34400a;

    private vm0(pm0 pm0Var) {
        this.f34400a = pm0Var;
    }

    public static qp0 b(pm0 pm0Var) {
        qp0 qp0VarA = pm0Var.a();
        vc.s.k(qp0VarA);
        return qp0VarA;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public qp0 get() {
        return b(this.f34400a);
    }

    public static vm0 a(pm0 pm0Var) {
        return new vm0(pm0Var);
    }
}
