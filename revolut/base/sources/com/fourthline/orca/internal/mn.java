package com.fourthline.orca.internal;

import com.google.common.base.Optional;

/* JADX INFO: loaded from: classes23.dex */
public final class mn implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ln f31228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31229b;

    private mn(ln lnVar, e4m.e eVar) {
        this.f31228a = lnVar;
        this.f31229b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public bg get() {
        return a(this.f31228a, (Optional) this.f31229b.get());
    }

    public static mn a(ln lnVar, e4m.e eVar) {
        return new mn(lnVar, eVar);
    }

    public static bg a(ln lnVar, Optional optional) {
        bg bgVarA = lnVar.a(optional);
        vc.s.k(bgVarA);
        return bgVarA;
    }
}
