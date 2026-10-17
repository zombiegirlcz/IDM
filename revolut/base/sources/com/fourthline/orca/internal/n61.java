package com.fourthline.orca.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes23.dex */
public final class n61 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l61 f31340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31341b;

    private n61(l61 l61Var, e4m.e eVar) {
        this.f31340a = l61Var;
        this.f31341b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public dw0 get() {
        return a(this.f31340a, (Context) this.f31341b.get());
    }

    public static n61 a(l61 l61Var, e4m.e eVar) {
        return new n61(l61Var, eVar);
    }

    public static dw0 a(l61 l61Var, Context context) {
        dw0 dw0VarA = l61Var.a(context);
        vc.s.k(dw0VarA);
        return dw0VarA;
    }
}
