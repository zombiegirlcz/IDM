package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class fc implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ec f28409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f28410b;

    private fc(ec ecVar, e4m.e eVar) {
        this.f28409a = ecVar;
        this.f28410b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public hb get() {
        return a(this.f28409a, (sg0) this.f28410b.get());
    }

    public static fc a(ec ecVar, e4m.e eVar) {
        return new fc(ecVar, eVar);
    }

    public static hb a(ec ecVar, sg0 sg0Var) {
        hb hbVarA = ecVar.a(sg0Var);
        vc.s.k(hbVarA);
        return hbVarA;
    }
}
