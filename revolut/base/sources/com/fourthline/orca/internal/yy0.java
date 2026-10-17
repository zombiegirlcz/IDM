package com.fourthline.orca.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes23.dex */
public final class yy0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vy0 f35457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f35458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f35459c;

    private yy0(vy0 vy0Var, e4m.e eVar, e4m.e eVar2) {
        this.f35457a = vy0Var;
        this.f35458b = eVar;
        this.f35459c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public mf0 get() {
        return a(this.f35457a, (Context) this.f35458b.get(), (uy0) this.f35459c.get());
    }

    public static yy0 a(vy0 vy0Var, e4m.e eVar, e4m.e eVar2) {
        return new yy0(vy0Var, eVar, eVar2);
    }

    public static mf0 a(vy0 vy0Var, Context context, uy0 uy0Var) {
        mf0 mf0VarC = vy0Var.c(context, uy0Var);
        vc.s.k(mf0VarC);
        return mf0VarC;
    }
}
