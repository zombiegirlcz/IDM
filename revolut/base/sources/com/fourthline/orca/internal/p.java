package com.fourthline.orca.internal;

import com.fourthline.core.location.LocationProvider;

/* JADX INFO: loaded from: classes23.dex */
public final class p implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f31785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31786b;

    private p(d dVar, e4m.e eVar) {
        this.f31785a = dVar;
        this.f31786b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public LocationProvider get() {
        return a(this.f31785a, (sg0) this.f31786b.get());
    }

    public static p a(d dVar, e4m.e eVar) {
        return new p(dVar, eVar);
    }

    public static LocationProvider a(d dVar, sg0 sg0Var) {
        LocationProvider locationProviderA = dVar.a(sg0Var);
        vc.s.k(locationProviderA);
        return locationProviderA;
    }
}
