package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final class d20 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c20 f27625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f27626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f27627c;

    private d20(c20 c20Var, e4m.e eVar, e4m.e eVar2) {
        this.f27625a = c20Var;
        this.f27626b = eVar;
        this.f27627c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public d11 get() {
        return a(this.f27625a, (Function0) this.f27626b.get(), (r01) this.f27627c.get());
    }

    public static d20 a(c20 c20Var, e4m.e eVar, e4m.e eVar2) {
        return new d20(c20Var, eVar, eVar2);
    }

    public static d11 a(c20 c20Var, Function0 function0, r01 r01Var) {
        d11 d11VarA = c20Var.a(function0, r01Var);
        vc.s.k(d11VarA);
        return d11VarA;
    }
}
