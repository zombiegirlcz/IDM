package com.fourthline.orca.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes23.dex */
public final class cm0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zl0 f27516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f27517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f27518c;

    private cm0(zl0 zl0Var, e4m.e eVar, e4m.e eVar2) {
        this.f27516a = zl0Var;
        this.f27517b = eVar;
        this.f27518c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public f30 get() {
        return a(this.f27516a, (Context) this.f27517b.get(), (e30) this.f27518c.get());
    }

    public static cm0 a(zl0 zl0Var, e4m.e eVar, e4m.e eVar2) {
        return new cm0(zl0Var, eVar, eVar2);
    }

    public static f30 a(zl0 zl0Var, Context context, e30 e30Var) {
        f30 f30VarA = zl0Var.a(context, e30Var);
        vc.s.k(f30VarA);
        return f30VarA;
    }
}
