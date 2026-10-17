package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class m implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f30915a;

    private m(d dVar) {
        this.f30915a = dVar;
    }

    public static jy b(d dVar) {
        jy jyVarH = dVar.h();
        vc.s.k(jyVarH);
        return jyVarH;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public jy get() {
        return b(this.f30915a);
    }

    public static m a(d dVar) {
        return new m(dVar);
    }
}
