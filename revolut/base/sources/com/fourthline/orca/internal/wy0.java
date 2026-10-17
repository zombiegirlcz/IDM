package com.fourthline.orca.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes23.dex */
public final class wy0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vy0 f34814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f34816c;

    private wy0(vy0 vy0Var, e4m.e eVar, e4m.e eVar2) {
        this.f34814a = vy0Var;
        this.f34815b = eVar;
        this.f34816c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public v10 get() {
        return a(this.f34814a, (Context) this.f34815b.get(), (uy0) this.f34816c.get());
    }

    public static wy0 a(vy0 vy0Var, e4m.e eVar, e4m.e eVar2) {
        return new wy0(vy0Var, eVar, eVar2);
    }

    public static v10 a(vy0 vy0Var, Context context, uy0 uy0Var) {
        v10 v10VarA = vy0Var.a(context, uy0Var);
        vc.s.k(v10VarA);
        return v10VarA;
    }
}
