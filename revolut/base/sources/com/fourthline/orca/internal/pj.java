package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class pj implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jj f31976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f31978c;

    private pj(jj jjVar, e4m.e eVar, e4m.e eVar2) {
        this.f31976a = jjVar;
        this.f31977b = eVar;
        this.f31978c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public tm get() {
        return a(this.f31976a, (qo) this.f31977b.get(), (v10) this.f31978c.get());
    }

    public static pj a(jj jjVar, e4m.e eVar, e4m.e eVar2) {
        return new pj(jjVar, eVar, eVar2);
    }

    public static tm a(jj jjVar, qo qoVar, v10 v10Var) {
        tm tmVarA = jjVar.a(qoVar, v10Var);
        vc.s.k(tmVarA);
        return tmVarA;
    }
}
