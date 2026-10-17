package com.fourthline.orca.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes23.dex */
public final class jc0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zb0 f29852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f29853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f29854c;

    private jc0(zb0 zb0Var, e4m.e eVar, e4m.e eVar2) {
        this.f29852a = zb0Var;
        this.f29853b = eVar;
        this.f29854c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public se0 get() {
        return a(this.f29852a, (gj) this.f29853b.get(), (Context) this.f29854c.get());
    }

    public static jc0 a(zb0 zb0Var, e4m.e eVar, e4m.e eVar2) {
        return new jc0(zb0Var, eVar, eVar2);
    }

    public static se0 a(zb0 zb0Var, gj gjVar, Context context) {
        se0 se0VarA = zb0Var.a(gjVar, context);
        vc.s.k(se0VarA);
        return se0VarA;
    }
}
