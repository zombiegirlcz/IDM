package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class w91 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r91 f34556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34557b;

    private w91(r91 r91Var, e4m.e eVar) {
        this.f34556a = r91Var;
        this.f34557b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public wo get() {
        return a(this.f34556a, (gj) this.f34557b.get());
    }

    public static w91 a(r91 r91Var, e4m.e eVar) {
        return new w91(r91Var, eVar);
    }

    public static wo a(r91 r91Var, gj gjVar) {
        wo woVarB = r91Var.b(gjVar);
        vc.s.k(woVarB);
        return woVarB;
    }
}
