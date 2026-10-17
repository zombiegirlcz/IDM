package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class mk implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rj f31206a;

    private mk(rj rjVar) {
        this.f31206a = rjVar;
    }

    public static zc0 b(rj rjVar) {
        zc0 zc0VarB = rjVar.b();
        vc.s.k(zc0VarB);
        return zc0VarB;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public zc0 get() {
        return b(this.f31206a);
    }

    public static mk a(rj rjVar) {
        return new mk(rjVar);
    }
}
