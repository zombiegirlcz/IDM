package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class gs implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ds f28984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f28985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f28986c;

    private gs(ds dsVar, e4m.e eVar, e4m.e eVar2) {
        this.f28984a = dsVar;
        this.f28985b = eVar;
        this.f28986c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ns get() {
        return a(this.f28984a, (xc0) this.f28985b.get(), (v10) this.f28986c.get());
    }

    public static gs a(ds dsVar, e4m.e eVar, e4m.e eVar2) {
        return new gs(dsVar, eVar, eVar2);
    }

    public static ns a(ds dsVar, xc0 xc0Var, v10 v10Var) {
        ns nsVarA = dsVar.a(xc0Var, v10Var);
        vc.s.k(nsVarA);
        return nsVarA;
    }
}
