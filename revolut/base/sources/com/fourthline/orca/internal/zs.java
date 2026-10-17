package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class zs implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xs f35703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f35704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f35705c;
    private final e4m.e d;

    private zs(xs xsVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        this.f35703a = xsVar;
        this.f35704b = eVar;
        this.f35705c = eVar2;
        this.d = eVar3;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ws get() {
        return a(this.f35703a, (o80) this.f35704b.get(), (bq0) this.f35705c.get(), (v10) this.d.get());
    }

    public static zs a(xs xsVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        return new zs(xsVar, eVar, eVar2, eVar3);
    }

    public static ws a(xs xsVar, o80 o80Var, bq0 bq0Var, v10 v10Var) {
        ws wsVarA = xsVar.a(o80Var, bq0Var, v10Var);
        vc.s.k(wsVarA);
        return wsVarA;
    }
}
