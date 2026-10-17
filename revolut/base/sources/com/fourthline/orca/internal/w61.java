package com.fourthline.orca.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes23.dex */
public final class w61 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u61 f34537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34538b;

    private w61(u61 u61Var, e4m.e eVar) {
        this.f34537a = u61Var;
        this.f34538b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e71 get() {
        return a(this.f34537a, (Context) this.f34538b.get());
    }

    public static w61 a(u61 u61Var, e4m.e eVar) {
        return new w61(u61Var, eVar);
    }

    public static e71 a(u61 u61Var, Context context) {
        e71 e71VarA = u61Var.a(context);
        vc.s.k(e71VarA);
        return e71VarA;
    }
}
