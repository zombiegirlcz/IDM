package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final class pg1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mg1 f31960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f31962c;
    private final e4m.e d;

    private pg1(mg1 mg1Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        this.f31960a = mg1Var;
        this.f31961b = eVar;
        this.f31962c = eVar2;
        this.d = eVar3;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ib0 get() {
        return a(this.f31960a, (ib0) this.f31961b.get(), (Function0) this.f31962c.get(), (sg0) this.d.get());
    }

    public static pg1 a(mg1 mg1Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        return new pg1(mg1Var, eVar, eVar2, eVar3);
    }

    public static ib0 a(mg1 mg1Var, ib0 ib0Var, Function0 function0, sg0 sg0Var) {
        ib0 ib0VarA = mg1Var.a(ib0Var, function0, sg0Var);
        vc.s.k(ib0VarA);
        return ib0VarA;
    }
}
