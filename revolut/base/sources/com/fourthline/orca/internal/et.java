package com.fourthline.orca.internal;

import com.fourthline.core.eid.EidServiceProvider;

/* JADX INFO: loaded from: classes23.dex */
public final class et implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ct f28261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f28262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f28263c;

    private et(ct ctVar, e4m.e eVar, e4m.e eVar2) {
        this.f28261a = ctVar;
        this.f28262b = eVar;
        this.f28263c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public zr get() {
        return a(this.f28261a, (bs) this.f28262b.get(), (EidServiceProvider) this.f28263c.get());
    }

    public static et a(ct ctVar, e4m.e eVar, e4m.e eVar2) {
        return new et(ctVar, eVar, eVar2);
    }

    public static zr a(ct ctVar, bs bsVar, EidServiceProvider eidServiceProvider) {
        zr zrVarB = ctVar.b(bsVar, eidServiceProvider);
        vc.s.k(zrVarB);
        return zrVarB;
    }
}
