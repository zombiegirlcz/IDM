package com.fourthline.orca.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes23.dex */
public final class sn0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hn0 f33066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f33067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f33068c;
    private final e4m.e d;
    private final e4m.e e;

    private sn0(hn0 hn0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        this.f33066a = hn0Var;
        this.f33067b = eVar;
        this.f33068c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public fo0 get() {
        return a(this.f33066a, (Context) this.f33067b.get(), (mp0) this.f33068c.get(), (l70) this.d.get(), (v10) this.e.get());
    }

    public static sn0 a(hn0 hn0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        return new sn0(hn0Var, eVar, eVar2, eVar3, eVar4);
    }

    public static fo0 a(hn0 hn0Var, Context context, mp0 mp0Var, l70 l70Var, v10 v10Var) {
        fo0 fo0VarA = hn0Var.a(context, mp0Var, l70Var, v10Var);
        vc.s.k(fo0VarA);
        return fo0VarA;
    }
}
