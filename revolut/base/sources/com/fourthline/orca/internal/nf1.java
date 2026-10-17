package com.fourthline.orca.internal;

import java.util.Locale;

/* JADX INFO: loaded from: classes23.dex */
public final class nf1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hf1 f31409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f31411c;

    private nf1(hf1 hf1Var, e4m.e eVar, e4m.e eVar2) {
        this.f31409a = hf1Var;
        this.f31410b = eVar;
        this.f31411c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public zf1 get() {
        return a(this.f31409a, (gf1) this.f31410b.get(), (Locale) this.f31411c.get());
    }

    public static nf1 a(hf1 hf1Var, e4m.e eVar, e4m.e eVar2) {
        return new nf1(hf1Var, eVar, eVar2);
    }

    public static zf1 a(hf1 hf1Var, gf1 gf1Var, Locale locale) {
        zf1 zf1VarA = hf1Var.a(gf1Var, locale);
        vc.s.k(zf1VarA);
        return zf1VarA;
    }
}
