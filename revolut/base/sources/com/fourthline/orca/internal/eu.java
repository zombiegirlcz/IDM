package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class eu implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final cu f28267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f28268b;

    private eu(cu cuVar, e4m.e eVar) {
        this.f28267a = cuVar;
        this.f28268b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public hu get() {
        return a(this.f28267a, (bs) this.f28268b.get());
    }

    public static eu a(cu cuVar, e4m.e eVar) {
        return new eu(cuVar, eVar);
    }

    public static hu a(cu cuVar, bs bsVar) {
        hu huVarA = cuVar.a(bsVar);
        vc.s.k(huVarA);
        return huVarA;
    }
}
