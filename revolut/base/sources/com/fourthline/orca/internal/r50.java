package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class r50 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l50 f32633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f32634b;

    private r50(l50 l50Var, e4m.e eVar) {
        this.f32633a = l50Var;
        this.f32634b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public vc1 get() {
        return a(this.f32633a, (m81) this.f32634b.get());
    }

    public static r50 a(l50 l50Var, e4m.e eVar) {
        return new r50(l50Var, eVar);
    }

    public static vc1 a(l50 l50Var, m81 m81Var) {
        vc1 vc1VarA = l50Var.a(m81Var);
        vc.s.k(vc1VarA);
        return vc1VarA;
    }
}
