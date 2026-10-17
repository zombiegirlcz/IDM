package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class u91 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r91 f33982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f33983b;

    private u91(r91 r91Var, e4m.e eVar) {
        this.f33982a = r91Var;
        this.f33983b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public b50 get() {
        return a(this.f33982a, (l91) this.f33983b.get());
    }

    public static u91 a(r91 r91Var, e4m.e eVar) {
        return new u91(r91Var, eVar);
    }

    public static b50 a(r91 r91Var, l91 l91Var) {
        b50 b50VarA = r91Var.a(l91Var);
        vc.s.k(b50VarA);
        return b50VarA;
    }
}
