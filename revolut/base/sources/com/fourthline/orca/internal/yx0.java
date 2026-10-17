package com.fourthline.orca.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes23.dex */
public final class yx0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wx0 f35451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f35452b;

    private yx0(wx0 wx0Var, e4m.e eVar) {
        this.f35451a = wx0Var;
        this.f35452b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public px get() {
        return a(this.f35451a, (Context) this.f35452b.get());
    }

    public static yx0 a(wx0 wx0Var, e4m.e eVar) {
        return new yx0(wx0Var, eVar);
    }

    public static px a(wx0 wx0Var, Context context) {
        px pxVarB = wx0Var.b(context);
        vc.s.k(pxVarB);
        return pxVarB;
    }
}
