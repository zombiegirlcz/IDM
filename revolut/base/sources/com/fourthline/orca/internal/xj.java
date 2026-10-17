package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class xj implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rj f35010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f35011b;

    private xj(rj rjVar, e4m.e eVar) {
        this.f35010a = rjVar;
        this.f35011b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public fi get() {
        return a(this.f35010a, (uk) this.f35011b.get());
    }

    public static xj a(rj rjVar, e4m.e eVar) {
        return new xj(rjVar, eVar);
    }

    public static fi a(rj rjVar, uk ukVar) {
        fi fiVarA = rjVar.a(ukVar);
        vc.s.k(fiVarA);
        return fiVarA;
    }
}
