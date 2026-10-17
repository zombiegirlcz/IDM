package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class zj implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rj f35609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f35610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f35611c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    private zj(rj rjVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        this.f35609a = rjVar;
        this.f35610b = eVar;
        this.f35611c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public oi get() {
        return a(this.f35609a, (v10) this.f35610b.get(), (mi) this.f35611c.get(), (fi) this.d.get(), (jy) this.e.get(), (sg0) this.f.get());
    }

    public static zj a(rj rjVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        return new zj(rjVar, eVar, eVar2, eVar3, eVar4, eVar5);
    }

    public static oi a(rj rjVar, v10 v10Var, mi miVar, fi fiVar, jy jyVar, sg0 sg0Var) {
        oi oiVarA = rjVar.a(v10Var, miVar, fiVar, jyVar, sg0Var);
        vc.s.k(oiVarA);
        return oiVarA;
    }
}
