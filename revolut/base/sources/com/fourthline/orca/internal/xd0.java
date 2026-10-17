package com.fourthline.orca.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes23.dex */
public final class xd0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pd0 f34952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f34954c;

    private xd0(pd0 pd0Var, e4m.e eVar, e4m.e eVar2) {
        this.f34952a = pd0Var;
        this.f34953b = eVar;
        this.f34954c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public se0 get() {
        return a(this.f34952a, (gj) this.f34953b.get(), (Context) this.f34954c.get());
    }

    public static xd0 a(pd0 pd0Var, e4m.e eVar, e4m.e eVar2) {
        return new xd0(pd0Var, eVar, eVar2);
    }

    public static se0 a(pd0 pd0Var, gj gjVar, Context context) {
        se0 se0VarA = pd0Var.a(gjVar, context);
        vc.s.k(se0VarA);
        return se0VarA;
    }
}
