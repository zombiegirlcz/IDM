package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class uk0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fk0 f34116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f34118c;
    private final e4m.e d;
    private final e4m.e e;

    private uk0(fk0 fk0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        this.f34116a = fk0Var;
        this.f34117b = eVar;
        this.f34118c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gl0 get() {
        return a(this.f34116a, (List) this.f34117b.get(), (gj) this.f34118c.get(), (yj0) this.d.get(), (ce1) this.e.get());
    }

    public static uk0 a(fk0 fk0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        return new uk0(fk0Var, eVar, eVar2, eVar3, eVar4);
    }

    public static gl0 a(fk0 fk0Var, List list, gj gjVar, yj0 yj0Var, ce1 ce1Var) {
        gl0 gl0VarA = fk0Var.a(list, gjVar, yj0Var, ce1Var);
        vc.s.k(gl0VarA);
        return gl0VarA;
    }
}
