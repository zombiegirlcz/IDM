package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class pk implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rj f31983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31984b;

    private pk(rj rjVar, e4m.e eVar) {
        this.f31983a = rjVar;
        this.f31984b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public dx get() {
        return a(this.f31983a, (m81) this.f31984b.get());
    }

    public static pk a(rj rjVar, e4m.e eVar) {
        return new pk(rjVar, eVar);
    }

    public static dx a(rj rjVar, m81 m81Var) {
        dx dxVarA = rjVar.a(m81Var);
        vc.s.k(dxVarA);
        return dxVarA;
    }
}
