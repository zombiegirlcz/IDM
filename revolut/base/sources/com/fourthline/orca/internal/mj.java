package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class mj implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jj f31198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31199b;

    private mj(jj jjVar, e4m.e eVar) {
        this.f31198a = jjVar;
        this.f31199b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public rm get() {
        return a(this.f31198a, (v10) this.f31199b.get());
    }

    public static mj a(jj jjVar, e4m.e eVar) {
        return new mj(jjVar, eVar);
    }

    public static rm a(jj jjVar, v10 v10Var) {
        rm rmVarA = jjVar.a(v10Var);
        vc.s.k(rmVarA);
        return rmVarA;
    }
}
