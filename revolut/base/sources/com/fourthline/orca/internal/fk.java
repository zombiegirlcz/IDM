package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class fk implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rj f28542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f28543b;

    private fk(rj rjVar, e4m.e eVar) {
        this.f28542a = rjVar;
        this.f28543b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public an get() {
        return a(this.f28542a, (sg0) this.f28543b.get());
    }

    public static fk a(rj rjVar, e4m.e eVar) {
        return new fk(rjVar, eVar);
    }

    public static an a(rj rjVar, sg0 sg0Var) {
        an anVarB = rjVar.b(sg0Var);
        vc.s.k(anVarB);
        return anVarB;
    }
}
