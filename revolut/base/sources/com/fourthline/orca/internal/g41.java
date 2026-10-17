package com.fourthline.orca.internal;

import com.fourthline.orca.Orca;

/* JADX INFO: loaded from: classes23.dex */
public final class g41 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a41 f28748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f28749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f28750c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    private g41(a41 a41Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        this.f28748a = a41Var;
        this.f28749b = eVar;
        this.f28750c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public bf1 get() {
        return a(this.f28748a, (mb.d) this.f28749b.get(), (ib0) this.f28750c.get(), this.d, (Orca.a) this.e.get(), (sg0) this.f.get());
    }

    public static g41 a(a41 a41Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        return new g41(a41Var, eVar, eVar2, eVar3, eVar4, eVar5);
    }

    public static bf1 a(a41 a41Var, mb.d dVar, ib0 ib0Var, phm.a aVar, Orca.a aVar2, sg0 sg0Var) {
        bf1 bf1VarA = a41Var.a(dVar, ib0Var, aVar, aVar2, sg0Var);
        vc.s.k(bf1VarA);
        return bf1VarA;
    }
}
