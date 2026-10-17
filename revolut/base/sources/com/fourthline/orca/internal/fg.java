package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class fg implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final eg f28493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f28494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f28495c;

    private fg(eg egVar, e4m.e eVar, e4m.e eVar2) {
        this.f28493a = egVar;
        this.f28494b = eVar;
        this.f28495c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public t1 get() {
        return a(this.f28493a, (to) this.f28494b.get(), (nc1) this.f28495c.get());
    }

    public static fg a(eg egVar, e4m.e eVar, e4m.e eVar2) {
        return new fg(egVar, eVar, eVar2);
    }

    public static t1 a(eg egVar, to toVar, nc1 nc1Var) {
        t1 t1VarA = egVar.a(toVar, nc1Var);
        vc.s.k(t1VarA);
        return t1VarA;
    }
}
