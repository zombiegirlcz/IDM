package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class nk0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fk0 f31435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f31437c;
    private final e4m.e d;

    private nk0(fk0 fk0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        this.f31435a = fk0Var;
        this.f31436b = eVar;
        this.f31437c = eVar2;
        this.d = eVar3;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ll0 get() {
        return a(this.f31435a, (List) this.f31436b.get(), (ux) this.f31437c.get(), (ce1) this.d.get());
    }

    public static nk0 a(fk0 fk0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        return new nk0(fk0Var, eVar, eVar2, eVar3);
    }

    public static ll0 a(fk0 fk0Var, List list, ux uxVar, ce1 ce1Var) {
        ll0 ll0VarA = fk0Var.a(list, uxVar, ce1Var);
        vc.s.k(ll0VarA);
        return ll0VarA;
    }
}
