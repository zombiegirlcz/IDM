package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class v80 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t80 f34270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f34272c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    private v80(t80 t80Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        this.f34270a = t80Var;
        this.f34271b = eVar;
        this.f34272c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public q70 get() {
        return a(this.f34270a, (r70) this.f34271b.get(), (fh0) this.f34272c.get(), (z80) this.d.get(), (r71) this.e.get(), (k80) this.f.get());
    }

    public static v80 a(t80 t80Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        return new v80(t80Var, eVar, eVar2, eVar3, eVar4, eVar5);
    }

    public static q70 a(t80 t80Var, r70 r70Var, fh0 fh0Var, z80 z80Var, r71 r71Var, k80 k80Var) {
        q70 q70VarA = t80Var.a(r70Var, fh0Var, z80Var, r71Var, k80Var);
        vc.s.k(q70VarA);
        return q70VarA;
    }
}
