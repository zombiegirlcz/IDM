package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final class lk0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fk0 f30664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f30665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f30666c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e4m.e f30667g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final e4m.e f30668h;

    private lk0(fk0 fk0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6, e4m.e eVar7) {
        this.f30664a = fk0Var;
        this.f30665b = eVar;
        this.f30666c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
        this.f30667g = eVar6;
        this.f30668h = eVar7;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public o40 get() {
        return a(this.f30664a, (gl0) this.f30665b.get(), (il0) this.f30666c.get(), (v10) this.d.get(), (ll0) this.e.get(), (i80) this.f.get(), (Function0) this.f30667g.get(), (sg0) this.f30668h.get());
    }

    public static lk0 a(fk0 fk0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6, e4m.e eVar7) {
        return new lk0(fk0Var, eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7);
    }

    public static o40 a(fk0 fk0Var, gl0 gl0Var, il0 il0Var, v10 v10Var, ll0 ll0Var, i80 i80Var, Function0 function0, sg0 sg0Var) {
        o40 o40VarA = fk0Var.a(gl0Var, il0Var, v10Var, ll0Var, i80Var, function0, sg0Var);
        vc.s.k(o40VarA);
        return o40VarA;
    }
}
