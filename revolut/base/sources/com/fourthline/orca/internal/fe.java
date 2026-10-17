package com.fourthline.orca.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes23.dex */
public final class fe implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xd f28427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f28428b;

    private fe(xd xdVar, e4m.e eVar) {
        this.f28427a = xdVar;
        this.f28428b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public zw get() {
        return a(this.f28427a, (Context) this.f28428b.get());
    }

    public static fe a(xd xdVar, e4m.e eVar) {
        return new fe(xdVar, eVar);
    }

    public static zw a(xd xdVar, Context context) {
        zw zwVarA = xdVar.a(context);
        vc.s.k(zwVarA);
        return zwVarA;
    }
}
