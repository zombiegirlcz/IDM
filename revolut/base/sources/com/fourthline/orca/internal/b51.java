package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class b51 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v41 f26987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f26988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f26989c;

    private b51(v41 v41Var, e4m.e eVar, e4m.e eVar2) {
        this.f26987a = v41Var;
        this.f26988b = eVar;
        this.f26989c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ah get() {
        return a(this.f26987a, (to) this.f26988b.get(), (List) this.f26989c.get());
    }

    public static b51 a(v41 v41Var, e4m.e eVar, e4m.e eVar2) {
        return new b51(v41Var, eVar, eVar2);
    }

    public static ah a(v41 v41Var, to toVar, List list) {
        ah ahVarA = v41Var.a(toVar, list);
        vc.s.k(ahVarA);
        return ahVarA;
    }
}
