package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class xm0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pm0 f35044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f35045b;

    private xm0(pm0 pm0Var, e4m.e eVar) {
        this.f35044a = pm0Var;
        this.f35045b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public lb1 get() {
        return a(this.f35044a, (bp0) this.f35045b.get());
    }

    public static xm0 a(pm0 pm0Var, e4m.e eVar) {
        return new xm0(pm0Var, eVar);
    }

    public static lb1 a(pm0 pm0Var, bp0 bp0Var) {
        lb1 lb1VarB = pm0Var.b(bp0Var);
        vc.s.k(lb1VarB);
        return lb1VarB;
    }
}
