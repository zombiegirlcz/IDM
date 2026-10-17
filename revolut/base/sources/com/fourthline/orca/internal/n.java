package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class n implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f31297a;

    private n(d dVar) {
        this.f31297a = dVar;
    }

    public static tz b(d dVar) {
        tz tzVarI = dVar.i();
        vc.s.k(tzVarI);
        return tzVarI;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public tz get() {
        return b(this.f31297a);
    }

    public static n a(d dVar) {
        return new n(dVar);
    }
}
