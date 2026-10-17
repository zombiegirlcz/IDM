package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class uh1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final oh1 f34096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34097b;

    private uh1(oh1 oh1Var, e4m.e eVar) {
        this.f34096a = oh1Var;
        this.f34097b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public xg1 get() {
        return a(this.f34096a, (gf1) this.f34097b.get());
    }

    public static uh1 a(oh1 oh1Var, e4m.e eVar) {
        return new uh1(oh1Var, eVar);
    }

    public static xg1 a(oh1 oh1Var, gf1 gf1Var) {
        return oh1Var.a(gf1Var);
    }
}
