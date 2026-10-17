package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class jo0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ho0 f29986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f29987b;

    private jo0(ho0 ho0Var, e4m.e eVar) {
        this.f29986a = ho0Var;
        this.f29987b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public b50 get() {
        return a(this.f29986a, (gm0) this.f29987b.get());
    }

    public static jo0 a(ho0 ho0Var, e4m.e eVar) {
        return new jo0(ho0Var, eVar);
    }

    public static b50 a(ho0 ho0Var, gm0 gm0Var) {
        b50 b50VarA = ho0Var.a(gm0Var);
        vc.s.k(b50VarA);
        return b50VarA;
    }
}
