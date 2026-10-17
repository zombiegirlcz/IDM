package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class ip implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hp f29662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f29663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f29664c;
    private final e4m.e d;

    private ip(hp hpVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        this.f29662a = hpVar;
        this.f29663b = eVar;
        this.f29664c = eVar2;
        this.d = eVar3;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public y2 get() {
        return a(this.f29662a, (ce1) this.f29663b.get(), (v10) this.f29664c.get(), (sg0) this.d.get());
    }

    public static ip a(hp hpVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        return new ip(hpVar, eVar, eVar2, eVar3);
    }

    public static y2 a(hp hpVar, ce1 ce1Var, v10 v10Var, sg0 sg0Var) {
        y2 y2VarA = hpVar.a(ce1Var, v10Var, sg0Var);
        vc.s.k(y2VarA);
        return y2VarA;
    }
}
