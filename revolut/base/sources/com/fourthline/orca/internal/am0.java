package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class am0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zl0 f26842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f26843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f26844c;
    private final e4m.e d;
    private final e4m.e e;

    private am0(zl0 zl0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        this.f26842a = zl0Var;
        this.f26843b = eVar;
        this.f26844c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public h2 get() {
        return a(this.f26842a, (mb.d) this.f26843b.get(), (f30) this.f26844c.get(), (o71) this.d.get(), (e30) this.e.get());
    }

    public static am0 a(zl0 zl0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        return new am0(zl0Var, eVar, eVar2, eVar3, eVar4);
    }

    public static h2 a(zl0 zl0Var, mb.d dVar, f30 f30Var, o71 o71Var, e30 e30Var) {
        h2 h2VarA = zl0Var.a(dVar, f30Var, o71Var, e30Var);
        vc.s.k(h2VarA);
        return h2VarA;
    }
}
