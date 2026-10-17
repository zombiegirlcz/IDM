package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class ck implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rj f27487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f27488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f27489c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e4m.e f27490g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final e4m.e f27491h;

    private ck(rj rjVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6, e4m.e eVar7) {
        this.f27487a = rjVar;
        this.f27488b = eVar;
        this.f27489c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
        this.f27490g = eVar6;
        this.f27491h = eVar7;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public uk get() {
        return a(this.f27487a, (gj) this.f27488b.get(), (yj0) this.f27489c.get(), (ef) this.d.get(), (sg0) this.e.get(), (cd0) this.f.get(), (zc0) this.f27490g.get(), ((Boolean) this.f27491h.get()).booleanValue());
    }

    public static ck a(rj rjVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6, e4m.e eVar7) {
        return new ck(rjVar, eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7);
    }

    public static uk a(rj rjVar, gj gjVar, yj0 yj0Var, ef efVar, sg0 sg0Var, cd0 cd0Var, zc0 zc0Var, boolean z) {
        uk ukVarA = rjVar.a(gjVar, yj0Var, efVar, sg0Var, cd0Var, zc0Var, z);
        vc.s.k(ukVarA);
        return ukVarA;
    }
}
