package com.fourthline.orca.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes23.dex */
public final class na implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ja f31357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31358b;

    private na(ja jaVar, e4m.e eVar) {
        this.f31357a = jaVar;
        this.f31358b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public eh0 get() {
        return a(this.f31357a, (Context) this.f31358b.get());
    }

    public static na a(ja jaVar, e4m.e eVar) {
        return new na(jaVar, eVar);
    }

    public static eh0 a(ja jaVar, Context context) {
        eh0 eh0VarA = jaVar.a(context);
        vc.s.k(eh0VarA);
        return eh0VarA;
    }
}
