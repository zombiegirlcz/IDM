package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class aq implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hp f26869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f26870b;

    private aq(hp hpVar, e4m.e eVar) {
        this.f26869a = hpVar;
        this.f26870b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public or get() {
        return a(this.f26869a, (gj) this.f26870b.get());
    }

    public static aq a(hp hpVar, e4m.e eVar) {
        return new aq(hpVar, eVar);
    }

    public static or a(hp hpVar, gj gjVar) {
        or orVarB = hpVar.b(gjVar);
        vc.s.k(orVarB);
        return orVarB;
    }
}
