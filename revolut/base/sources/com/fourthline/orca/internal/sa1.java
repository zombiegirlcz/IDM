package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class sa1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r91 f32960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f32961b;

    private sa1(r91 r91Var, e4m.e eVar) {
        this.f32960a = r91Var;
        this.f32961b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public l91 get() {
        return a(this.f32960a, (o80) this.f32961b.get());
    }

    public static sa1 a(r91 r91Var, e4m.e eVar) {
        return new sa1(r91Var, eVar);
    }

    public static l91 a(r91 r91Var, o80 o80Var) {
        l91 l91VarA = r91Var.a(o80Var);
        vc.s.k(l91VarA);
        return l91VarA;
    }
}
