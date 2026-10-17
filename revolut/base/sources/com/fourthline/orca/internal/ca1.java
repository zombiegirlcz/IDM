package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class ca1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r91 f27433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f27434b;

    private ca1(r91 r91Var, e4m.e eVar) {
        this.f27433a = r91Var;
        this.f27434b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public dx get() {
        return a(this.f27433a, (m81) this.f27434b.get());
    }

    public static ca1 a(r91 r91Var, e4m.e eVar) {
        return new ca1(r91Var, eVar);
    }

    public static dx a(r91 r91Var, m81 m81Var) {
        dx dxVarA = r91Var.a(m81Var);
        vc.s.k(dxVarA);
        return dxVarA;
    }
}
