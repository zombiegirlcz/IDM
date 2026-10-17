package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class la1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r91 f30559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f30560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f30561c;

    private la1(r91 r91Var, e4m.e eVar, e4m.e eVar2) {
        this.f30559a = r91Var;
        this.f30560b = eVar;
        this.f30561c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public x81 get() {
        return a(this.f30559a, (m81) this.f30560b.get(), (ab1) this.f30561c.get());
    }

    public static la1 a(r91 r91Var, e4m.e eVar, e4m.e eVar2) {
        return new la1(r91Var, eVar, eVar2);
    }

    public static x81 a(r91 r91Var, m81 m81Var, ab1 ab1Var) {
        x81 x81VarA = r91Var.a(m81Var, ab1Var);
        vc.s.k(x81VarA);
        return x81VarA;
    }
}
