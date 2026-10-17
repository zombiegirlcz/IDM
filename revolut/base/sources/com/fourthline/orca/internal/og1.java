package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class og1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mg1 f31664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f31666c;

    private og1(mg1 mg1Var, e4m.e eVar, e4m.e eVar2) {
        this.f31664a = mg1Var;
        this.f31665b = eVar;
        this.f31666c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public kb0 get() {
        return a(this.f31664a, (mb.d) this.f31665b.get(), (sg0) this.f31666c.get());
    }

    public static og1 a(mg1 mg1Var, e4m.e eVar, e4m.e eVar2) {
        return new og1(mg1Var, eVar, eVar2);
    }

    public static kb0 a(mg1 mg1Var, mb.d dVar, sg0 sg0Var) {
        kb0 kb0VarA = mg1Var.a(dVar, sg0Var);
        vc.s.k(kb0VarA);
        return kb0VarA;
    }
}
