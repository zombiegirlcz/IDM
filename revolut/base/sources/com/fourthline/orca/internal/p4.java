package com.fourthline.orca.internal;

import com.fourthline.orca.internal.e40;

/* JADX INFO: loaded from: classes23.dex */
public final class p4 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e4 f31821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f31823c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    private p4(e4 e4Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        this.f31821a = e4Var;
        this.f31822b = eVar;
        this.f31823c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e40 get() {
        return a(this.f31821a, (j30) this.f31822b.get(), (d4) this.f31823c.get(), (e40.e) this.d.get(), (m5) this.e.get(), (r5) this.f.get());
    }

    public static p4 a(e4 e4Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        return new p4(e4Var, eVar, eVar2, eVar3, eVar4, eVar5);
    }

    public static e40 a(e4 e4Var, j30 j30Var, d4 d4Var, e40.e eVar, m5 m5Var, r5 r5Var) {
        e40 e40VarA = e4Var.a(j30Var, d4Var, eVar, m5Var, r5Var);
        vc.s.k(e40VarA);
        return e40VarA;
    }
}
