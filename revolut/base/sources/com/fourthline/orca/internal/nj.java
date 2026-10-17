package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class nj implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jj f31426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f31428c;

    private nj(jj jjVar, e4m.e eVar, e4m.e eVar2) {
        this.f31426a = jjVar;
        this.f31427b = eVar;
        this.f31428c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public aq0 get() {
        return a(this.f31426a, (bq0) this.f31427b.get(), (l70) this.f31428c.get());
    }

    public static nj a(jj jjVar, e4m.e eVar, e4m.e eVar2) {
        return new nj(jjVar, eVar, eVar2);
    }

    public static aq0 a(jj jjVar, bq0 bq0Var, l70 l70Var) {
        aq0 aq0VarA = jjVar.a(bq0Var, l70Var);
        vc.s.k(aq0VarA);
        return aq0VarA;
    }
}
