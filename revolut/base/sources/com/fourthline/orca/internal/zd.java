package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class zd implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xd f35564a;

    private zd(xd xdVar) {
        this.f35564a = xdVar;
    }

    public static ef b(xd xdVar) {
        ef efVarA = xdVar.a();
        vc.s.k(efVarA);
        return efVarA;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ef get() {
        return b(this.f35564a);
    }

    public static zd a(xd xdVar) {
        return new zd(xdVar);
    }
}
