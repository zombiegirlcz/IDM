package com.fourthline.orca.internal;

import com.fourthline.core.eid.EidServiceProvider;

/* JADX INFO: loaded from: classes23.dex */
public final class dt implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ct f27910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f27911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f27912c;

    private dt(ct ctVar, e4m.e eVar, e4m.e eVar2) {
        this.f27910a = ctVar;
        this.f27911b = eVar;
        this.f27912c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public xr get() {
        return a(this.f27910a, (bs) this.f27911b.get(), (EidServiceProvider) this.f27912c.get());
    }

    public static dt a(ct ctVar, e4m.e eVar, e4m.e eVar2) {
        return new dt(ctVar, eVar, eVar2);
    }

    public static xr a(ct ctVar, bs bsVar, EidServiceProvider eidServiceProvider) {
        xr xrVarA = ctVar.a(bsVar, eidServiceProvider);
        vc.s.k(xrVarA);
        return xrVarA;
    }
}
