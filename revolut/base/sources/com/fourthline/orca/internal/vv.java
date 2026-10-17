package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class vv implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qv f34464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34465b;

    private vv(qv qvVar, e4m.e eVar) {
        this.f34464a = qvVar;
        this.f34465b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public kc1 get() {
        return a(this.f34464a, (l70) this.f34465b.get());
    }

    public static vv a(qv qvVar, e4m.e eVar) {
        return new vv(qvVar, eVar);
    }

    public static kc1 a(qv qvVar, l70 l70Var) {
        kc1 kc1VarA = qvVar.a(l70Var);
        vc.s.k(kc1VarA);
        return kc1VarA;
    }
}
