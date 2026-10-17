package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class vp implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hp f34423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34424b;

    private vp(hp hpVar, e4m.e eVar) {
        this.f34423a = hpVar;
        this.f34424b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public vq get() {
        return a(this.f34423a, (gj) this.f34424b.get());
    }

    public static vp a(hp hpVar, e4m.e eVar) {
        return new vp(hpVar, eVar);
    }

    public static vq a(hp hpVar, gj gjVar) {
        vq vqVarA = hpVar.a(gjVar);
        vc.s.k(vqVarA);
        return vqVarA;
    }
}
