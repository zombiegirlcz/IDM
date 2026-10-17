package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class ph implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lh f31963a;

    private ph(lh lhVar) {
        this.f31963a = lhVar;
    }

    public static sy b(lh lhVar) {
        sy syVarD = lhVar.d();
        vc.s.k(syVarD);
        return syVarD;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public sy get() {
        return b(this.f31963a);
    }

    public static ph a(lh lhVar) {
        return new ph(lhVar);
    }
}
