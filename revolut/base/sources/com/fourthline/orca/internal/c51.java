package com.fourthline.orca.internal;

import com.google.common.base.Optional;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final class c51 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v41 f27373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f27374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f27375c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    private c51(v41 v41Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        this.f27373a = v41Var;
        this.f27374b = eVar;
        this.f27375c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public nc1 get() {
        return a(this.f27373a, (Function0) this.f27374b.get(), (bg) this.f27375c.get(), (Optional) this.d.get(), (to) this.e.get(), (ib0) this.f.get());
    }

    public static c51 a(v41 v41Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        return new c51(v41Var, eVar, eVar2, eVar3, eVar4, eVar5);
    }

    public static nc1 a(v41 v41Var, Function0 function0, bg bgVar, Optional optional, to toVar, ib0 ib0Var) {
        nc1 nc1VarA = v41Var.a(function0, bgVar, optional, toVar, ib0Var);
        vc.s.k(nc1VarA);
        return nc1VarA;
    }
}
