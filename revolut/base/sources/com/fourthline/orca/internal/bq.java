package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class bq implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hp f27191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f27192b;

    private bq(hp hpVar, e4m.e eVar) {
        this.f27191a = hpVar;
        this.f27192b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public wd1 get() {
        return a(this.f27191a, (iq) this.f27192b.get());
    }

    public static bq a(hp hpVar, e4m.e eVar) {
        return new bq(hpVar, eVar);
    }

    public static wd1 a(hp hpVar, iq iqVar) {
        wd1 wd1VarA = hpVar.a(iqVar);
        vc.s.k(wd1VarA);
        return wd1VarA;
    }
}
