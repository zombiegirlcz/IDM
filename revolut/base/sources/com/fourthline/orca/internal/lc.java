package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class lc implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ec f30567a;

    private lc(ec ecVar) {
        this.f30567a = ecVar;
    }

    public static od b(ec ecVar) {
        od odVarA = ecVar.a();
        vc.s.k(odVarA);
        return odVarA;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public od get() {
        return b(this.f30567a);
    }

    public static lc a(ec ecVar) {
        return new lc(ecVar);
    }
}
