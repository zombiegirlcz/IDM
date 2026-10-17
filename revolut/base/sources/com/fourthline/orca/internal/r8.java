package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class r8 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m8 f32643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f32644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f32645c;
    private final e4m.e d;

    private r8(m8 m8Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        this.f32643a = m8Var;
        this.f32644b = eVar;
        this.f32645c = eVar2;
        this.d = eVar3;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gj get() {
        return a(this.f32643a, (gh) this.f32644b.get(), (yz0) this.f32645c.get(), (yj0) this.d.get());
    }

    public static r8 a(m8 m8Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        return new r8(m8Var, eVar, eVar2, eVar3);
    }

    public static gj a(m8 m8Var, gh ghVar, yz0 yz0Var, yj0 yj0Var) {
        gj gjVarA = m8Var.a(ghVar, yz0Var, yj0Var);
        vc.s.k(gjVarA);
        return gjVarA;
    }
}
