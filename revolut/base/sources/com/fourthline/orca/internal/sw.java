package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class sw implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ow f33148a;

    private sw(ow owVar) {
        this.f33148a = owVar;
    }

    public static vp0 b(ow owVar) {
        vp0 vp0VarB = owVar.b();
        vc.s.k(vp0VarB);
        return vp0VarB;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public vp0 get() {
        return b(this.f33148a);
    }

    public static sw a(ow owVar) {
        return new sw(owVar);
    }
}
