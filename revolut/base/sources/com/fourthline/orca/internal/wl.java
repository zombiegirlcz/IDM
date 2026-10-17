package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class wl implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ol f34732a;

    private wl(ol olVar) {
        this.f34732a = olVar;
    }

    public static kh b(ol olVar) {
        kh khVarB = olVar.b();
        vc.s.k(khVarB);
        return khVarB;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public kh get() {
        return b(this.f34732a);
    }

    public static wl a(ol olVar) {
        return new wl(olVar);
    }
}
