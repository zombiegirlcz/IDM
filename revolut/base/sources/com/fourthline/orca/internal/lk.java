package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class lk implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rj f30662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f30663b;

    private lk(rj rjVar, e4m.e eVar) {
        this.f30662a = rjVar;
        this.f30663b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public qo get() {
        return a(this.f30662a, (gj) this.f30663b.get());
    }

    public static lk a(rj rjVar, e4m.e eVar) {
        return new lk(rjVar, eVar);
    }

    public static qo a(rj rjVar, gj gjVar) {
        qo qoVarA = rjVar.a(gjVar);
        vc.s.k(qoVarA);
        return qoVarA;
    }
}
