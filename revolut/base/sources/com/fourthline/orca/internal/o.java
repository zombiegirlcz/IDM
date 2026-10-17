package com.fourthline.orca.internal;

import java.util.Locale;

/* JADX INFO: loaded from: classes23.dex */
public final class o implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f31519a;

    private o(d dVar) {
        this.f31519a = dVar;
    }

    public static Locale b(d dVar) {
        Locale localeJ = dVar.j();
        vc.s.k(localeJ);
        return localeJ;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Locale get() {
        return b(this.f31519a);
    }

    public static o a(d dVar) {
        return new o(dVar);
    }
}
