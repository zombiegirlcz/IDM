package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class lj implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jj f30637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f30638b;

    private lj(jj jjVar, e4m.e eVar) {
        this.f30637a = jjVar;
        this.f30638b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z40 get() {
        return a(this.f30637a, (fj) this.f30638b.get());
    }

    public static lj a(jj jjVar, e4m.e eVar) {
        return new lj(jjVar, eVar);
    }

    public static z40 a(jj jjVar, fj fjVar) {
        z40 z40VarB = jjVar.b(fjVar);
        vc.s.k(z40VarB);
        return z40VarB;
    }
}
