package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class wp implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hp f34763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f34765c;

    private wp(hp hpVar, e4m.e eVar, e4m.e eVar2) {
        this.f34763a = hpVar;
        this.f34764b = eVar;
        this.f34765c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public zq get() {
        return a(this.f34763a, (om) this.f34764b.get(), (v10) this.f34765c.get());
    }

    public static wp a(hp hpVar, e4m.e eVar, e4m.e eVar2) {
        return new wp(hpVar, eVar, eVar2);
    }

    public static zq a(hp hpVar, om omVar, v10 v10Var) {
        zq zqVarA = hpVar.a(omVar, v10Var);
        vc.s.k(zqVarA);
        return zqVarA;
    }
}
