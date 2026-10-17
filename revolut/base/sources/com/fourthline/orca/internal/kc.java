package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class kc implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ec f30198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f30199b;

    private kc(ec ecVar, e4m.e eVar) {
        this.f30198a = ecVar;
        this.f30199b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public bc get() {
        return a(this.f30198a, (r70) this.f30199b.get());
    }

    public static kc a(ec ecVar, e4m.e eVar) {
        return new kc(ecVar, eVar);
    }

    public static bc a(ec ecVar, r70 r70Var) {
        bc bcVarA = ecVar.a(r70Var);
        vc.s.k(bcVarA);
        return bcVarA;
    }
}
