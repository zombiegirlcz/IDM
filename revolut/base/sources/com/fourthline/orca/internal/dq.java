package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class dq implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hp f27895a;

    private dq(hp hpVar) {
        this.f27895a = hpVar;
    }

    public static zc0 b(hp hpVar) {
        zc0 zc0VarB = hpVar.b();
        vc.s.k(zc0VarB);
        return zc0VarB;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public zc0 get() {
        return b(this.f27895a);
    }

    public static dq a(hp hpVar) {
        return new dq(hpVar);
    }
}
