package com.fourthline.orca.internal;

import androidx.content.NavHostController;

/* JADX INFO: loaded from: classes23.dex */
public final class u80 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t80 f33975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f33976b;

    private u80(t80 t80Var, e4m.e eVar) {
        this.f33975a = t80Var;
        this.f33976b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z80 get() {
        return a(this.f33975a, (NavHostController) this.f33976b.get());
    }

    public static u80 a(t80 t80Var, e4m.e eVar) {
        return new u80(t80Var, eVar);
    }

    public static z80 a(t80 t80Var, NavHostController navHostController) {
        z80 z80VarA = t80Var.a(navHostController);
        vc.s.k(z80VarA);
        return z80VarA;
    }
}
