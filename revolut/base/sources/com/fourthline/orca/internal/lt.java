package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class lt implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ct f30742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f30743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f30744c;

    private lt(ct ctVar, e4m.e eVar, e4m.e eVar2) {
        this.f30742a = ctVar;
        this.f30743b = eVar;
        this.f30744c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gz get() {
        return a(this.f30742a, (v10) this.f30743b.get(), (ez) this.f30744c.get());
    }

    public static lt a(ct ctVar, e4m.e eVar, e4m.e eVar2) {
        return new lt(ctVar, eVar, eVar2);
    }

    public static gz a(ct ctVar, v10 v10Var, ez ezVar) {
        gz gzVarA = ctVar.a(v10Var, ezVar);
        vc.s.k(gzVarA);
        return gzVarA;
    }
}
