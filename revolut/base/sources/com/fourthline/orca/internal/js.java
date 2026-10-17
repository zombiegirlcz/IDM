package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class js implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ds f30019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f30020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f30021c;
    private final e4m.e d;

    private js(ds dsVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        this.f30019a = dsVar;
        this.f30020b = eVar;
        this.f30021c = eVar2;
        this.d = eVar3;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public xc0 get() {
        return a(this.f30019a, (l9) this.f30020b.get(), (sg0) this.f30021c.get(), (v10) this.d.get());
    }

    public static js a(ds dsVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        return new js(dsVar, eVar, eVar2, eVar3);
    }

    public static xc0 a(ds dsVar, l9 l9Var, sg0 sg0Var, v10 v10Var) {
        xc0 xc0VarA = dsVar.a(l9Var, sg0Var, v10Var);
        vc.s.k(xc0VarA);
        return xc0VarA;
    }
}
