package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class zp implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hp f35661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f35662b;

    private zp(hp hpVar, e4m.e eVar) {
        this.f35661a = hpVar;
        this.f35662b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gr get() {
        return a(this.f35661a, (sg0) this.f35662b.get());
    }

    public static zp a(hp hpVar, e4m.e eVar) {
        return new zp(hpVar, eVar);
    }

    public static gr a(hp hpVar, sg0 sg0Var) {
        gr grVarB = hpVar.b(sg0Var);
        vc.s.k(grVarB);
        return grVarB;
    }
}
