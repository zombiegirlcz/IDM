package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class rd0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pd0 f32698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f32699b;

    private rd0(pd0 pd0Var, e4m.e eVar) {
        this.f32698a = pd0Var;
        this.f32699b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public od0 get() {
        return a(this.f32698a, (o80) this.f32699b.get());
    }

    public static rd0 a(pd0 pd0Var, e4m.e eVar) {
        return new rd0(pd0Var, eVar);
    }

    public static od0 a(pd0 pd0Var, o80 o80Var) {
        od0 od0VarA = pd0Var.a(o80Var);
        vc.s.k(od0VarA);
        return od0VarA;
    }
}
