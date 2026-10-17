package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final class x4 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e4 f34840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f34842c;

    private x4(e4 e4Var, e4m.e eVar, e4m.e eVar2) {
        this.f34840a = e4Var;
        this.f34841b = eVar;
        this.f34842c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public p6 get() {
        return a(this.f34840a, (d3) this.f34841b.get(), (Function0) this.f34842c.get());
    }

    public static x4 a(e4 e4Var, e4m.e eVar, e4m.e eVar2) {
        return new x4(e4Var, eVar, eVar2);
    }

    public static p6 a(e4 e4Var, d3 d3Var, Function0 function0) {
        p6 p6VarA = e4Var.a(d3Var, function0);
        vc.s.k(p6VarA);
        return p6VarA;
    }
}
