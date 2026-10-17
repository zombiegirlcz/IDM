package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final class vn0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hn0 f34404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f34406c;

    private vn0(hn0 hn0Var, e4m.e eVar, e4m.e eVar2) {
        this.f34404a = hn0Var;
        this.f34405b = eVar;
        this.f34406c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public en0 get() {
        return a(this.f34404a, (Function0) this.f34405b.get(), (gj) this.f34406c.get());
    }

    public static vn0 a(hn0 hn0Var, e4m.e eVar, e4m.e eVar2) {
        return new vn0(hn0Var, eVar, eVar2);
    }

    public static en0 a(hn0 hn0Var, Function0 function0, gj gjVar) {
        en0 en0VarA = hn0Var.a(function0, gjVar);
        vc.s.k(en0VarA);
        return en0VarA;
    }
}
