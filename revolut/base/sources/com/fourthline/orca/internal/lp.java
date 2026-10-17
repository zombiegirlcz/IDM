package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class lp implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hp f30721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f30722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f30723c;

    private lp(hp hpVar, e4m.e eVar, e4m.e eVar2) {
        this.f30721a = hpVar;
        this.f30722b = eVar;
        this.f30723c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public yh get() {
        return a(this.f30721a, (gj) this.f30722b.get(), (List) this.f30723c.get());
    }

    public static lp a(hp hpVar, e4m.e eVar, e4m.e eVar2) {
        return new lp(hpVar, eVar, eVar2);
    }

    public static yh a(hp hpVar, gj gjVar, List list) {
        yh yhVarA = hpVar.a(gjVar, list);
        vc.s.k(yhVarA);
        return yhVarA;
    }
}
