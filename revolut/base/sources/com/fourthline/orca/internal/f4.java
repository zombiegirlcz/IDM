package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class f4 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e4 f28330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f28331b;

    private f4(e4 e4Var, e4m.e eVar) {
        this.f28330a = e4Var;
        this.f28331b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public f3 get() {
        return a(this.f28330a, (sg0) this.f28331b.get());
    }

    public static f4 a(e4 e4Var, e4m.e eVar) {
        return new f4(e4Var, eVar);
    }

    public static f3 a(e4 e4Var, sg0 sg0Var) {
        f3 f3VarA = e4Var.a(sg0Var);
        vc.s.k(f3VarA);
        return f3VarA;
    }
}
