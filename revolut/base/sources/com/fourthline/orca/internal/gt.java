package com.fourthline.orca.internal;

import com.fourthline.core.eid.EidServiceProvider;

/* JADX INFO: loaded from: classes23.dex */
public final class gt implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ct f28993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f28994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f28995c;

    private gt(ct ctVar, e4m.e eVar, e4m.e eVar2) {
        this.f28993a = ctVar;
        this.f28994b = eVar;
        this.f28995c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ov get() {
        return a(this.f28993a, (bs) this.f28994b.get(), (EidServiceProvider) this.f28995c.get());
    }

    public static gt a(ct ctVar, e4m.e eVar, e4m.e eVar2) {
        return new gt(ctVar, eVar, eVar2);
    }

    public static ov a(ct ctVar, bs bsVar, EidServiceProvider eidServiceProvider) {
        ov ovVarC = ctVar.c(bsVar, eidServiceProvider);
        vc.s.k(ovVarC);
        return ovVarC;
    }
}
