package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class yj implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rj f35358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f35359b;

    private yj(rj rjVar, e4m.e eVar) {
        this.f35358a = rjVar;
        this.f35359b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public mi get() {
        return a(this.f35358a, (uk) this.f35359b.get());
    }

    public static yj a(rj rjVar, e4m.e eVar) {
        return new yj(rjVar, eVar);
    }

    public static mi a(rj rjVar, uk ukVar) {
        mi miVarB = rjVar.b(ukVar);
        vc.s.k(miVarB);
        return miVarB;
    }
}
