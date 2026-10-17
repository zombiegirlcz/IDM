package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class wa1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r91 f34565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f34567c;

    private wa1(r91 r91Var, e4m.e eVar, e4m.e eVar2) {
        this.f34565a = r91Var;
        this.f34566b = eVar;
        this.f34567c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public rb1 get() {
        return a(this.f34565a, (m81) this.f34566b.get(), (gj) this.f34567c.get());
    }

    public static wa1 a(r91 r91Var, e4m.e eVar, e4m.e eVar2) {
        return new wa1(r91Var, eVar, eVar2);
    }

    public static rb1 a(r91 r91Var, m81 m81Var, gj gjVar) {
        rb1 rb1VarA = r91Var.a(m81Var, gjVar);
        vc.s.k(rb1VarA);
        return rb1VarA;
    }
}
