package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class jt implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ct f30028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f30029b;

    private jt(ct ctVar, e4m.e eVar) {
        this.f30028a = ctVar;
        this.f30029b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public uy get() {
        return a(this.f30028a, (sg0) this.f30029b.get());
    }

    public static jt a(ct ctVar, e4m.e eVar) {
        return new jt(ctVar, eVar);
    }

    public static uy a(ct ctVar, sg0 sg0Var) {
        uy uyVarA = ctVar.a(sg0Var);
        vc.s.k(uyVarA);
        return uyVarA;
    }
}
