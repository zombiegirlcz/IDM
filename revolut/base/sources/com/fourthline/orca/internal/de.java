package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class de implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xd f27713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f27714b;

    private de(xd xdVar, e4m.e eVar) {
        this.f27713a = xdVar;
        this.f27714b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public mc1 get() {
        return a(this.f27713a, (ef) this.f27714b.get());
    }

    public static de a(xd xdVar, e4m.e eVar) {
        return new de(xdVar, eVar);
    }

    public static mc1 a(xd xdVar, ef efVar) {
        mc1 mc1VarA = xdVar.a(efVar);
        vc.s.k(mc1VarA);
        return mc1VarA;
    }
}
