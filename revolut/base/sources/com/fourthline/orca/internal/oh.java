package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class oh implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lh f31667a;

    private oh(lh lhVar) {
        this.f31667a = lhVar;
    }

    public static zq0 b(lh lhVar) {
        zq0 zq0VarC = lhVar.c();
        vc.s.k(zq0VarC);
        return zq0VarC;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public zq0 get() {
        return b(this.f31667a);
    }

    public static oh a(lh lhVar) {
        return new oh(lhVar);
    }
}
