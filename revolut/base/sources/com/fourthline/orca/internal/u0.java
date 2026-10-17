package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class u0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p0 f33902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f33903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f33904c;

    private u0(p0 p0Var, e4m.e eVar, e4m.e eVar2) {
        this.f33902a = p0Var;
        this.f33903b = eVar;
        this.f33904c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public nd get() {
        return a(this.f33902a, (List) this.f33903b.get(), (ux) this.f33904c.get());
    }

    public static u0 a(p0 p0Var, e4m.e eVar, e4m.e eVar2) {
        return new u0(p0Var, eVar, eVar2);
    }

    public static nd a(p0 p0Var, List list, ux uxVar) {
        nd ndVarA = p0Var.a(list, uxVar);
        vc.s.k(ndVarA);
        return ndVarA;
    }
}
