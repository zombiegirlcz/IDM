package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class is implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ds f29697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f29698b;

    private is(ds dsVar, e4m.e eVar) {
        this.f29697a = dsVar;
        this.f29698b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public qc0 get() {
        return a(this.f29697a, (sg0) this.f29698b.get());
    }

    public static is a(ds dsVar, e4m.e eVar) {
        return new is(dsVar, eVar);
    }

    public static qc0 a(ds dsVar, sg0 sg0Var) {
        qc0 qc0VarA = dsVar.a(sg0Var);
        vc.s.k(qc0VarA);
        return qc0VarA;
    }
}
