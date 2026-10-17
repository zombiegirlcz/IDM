package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final class x0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p0 f34823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f34825c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    private x0(p0 p0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        this.f34823a = p0Var;
        this.f34824b = eVar;
        this.f34825c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public o40 get() {
        return a(this.f34823a, (h0) this.f34824b.get(), (v10) this.f34825c.get(), (nd) this.d.get(), (Function0) this.e.get(), (sg0) this.f.get());
    }

    public static x0 a(p0 p0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        return new x0(p0Var, eVar, eVar2, eVar3, eVar4, eVar5);
    }

    public static o40 a(p0 p0Var, h0 h0Var, v10 v10Var, nd ndVar, Function0 function0, sg0 sg0Var) {
        o40 o40VarA = p0Var.a(h0Var, v10Var, ndVar, function0, sg0Var);
        vc.s.k(o40VarA);
        return o40VarA;
    }
}
