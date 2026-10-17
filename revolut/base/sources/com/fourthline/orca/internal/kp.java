package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class kp implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hp f30352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f30353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f30354c;

    private kp(hp hpVar, e4m.e eVar, e4m.e eVar2) {
        this.f30352a = hpVar;
        this.f30353b = eVar;
        this.f30354c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public rh get() {
        return a(this.f30352a, (c80) this.f30353b.get(), (sg0) this.f30354c.get());
    }

    public static kp a(hp hpVar, e4m.e eVar, e4m.e eVar2) {
        return new kp(hpVar, eVar, eVar2);
    }

    public static rh a(hp hpVar, c80 c80Var, sg0 sg0Var) {
        rh rhVarA = hpVar.a(c80Var, sg0Var);
        vc.s.k(rhVarA);
        return rhVarA;
    }
}
