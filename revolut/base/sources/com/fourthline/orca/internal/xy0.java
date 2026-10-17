package com.fourthline.orca.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes23.dex */
public final class xy0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vy0 f35109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f35110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f35111c;

    private xy0(vy0 vy0Var, e4m.e eVar, e4m.e eVar2) {
        this.f35109a = vy0Var;
        this.f35110b = eVar;
        this.f35111c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public l70 get() {
        return a(this.f35109a, (Context) this.f35110b.get(), (uy0) this.f35111c.get());
    }

    public static xy0 a(vy0 vy0Var, e4m.e eVar, e4m.e eVar2) {
        return new xy0(vy0Var, eVar, eVar2);
    }

    public static l70 a(vy0 vy0Var, Context context, uy0 uy0Var) {
        l70 l70VarB = vy0Var.b(context, uy0Var);
        vc.s.k(l70VarB);
        return l70VarB;
    }
}
