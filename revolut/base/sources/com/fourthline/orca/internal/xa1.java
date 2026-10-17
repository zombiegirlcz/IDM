package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final class xa1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r91 f34930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f34932c;
    private final e4m.e d;

    private xa1(r91 r91Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        this.f34930a = r91Var;
        this.f34931b = eVar;
        this.f34932c = eVar2;
        this.d = eVar3;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public o91 get() {
        return a(this.f34930a, (Function0) this.f34931b.get(), (m81) this.f34932c.get(), (gj) this.d.get());
    }

    public static xa1 a(r91 r91Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        return new xa1(r91Var, eVar, eVar2, eVar3);
    }

    public static o91 a(r91 r91Var, Function0 function0, m81 m81Var, gj gjVar) {
        o91 o91VarA = r91Var.a(function0, m81Var, gjVar);
        vc.s.k(o91VarA);
        return o91VarA;
    }
}
