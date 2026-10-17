package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class ys implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xs f35429a;

    private ys(xs xsVar) {
        this.f35429a = xsVar;
    }

    public static us b(xs xsVar) {
        us usVarA = xsVar.a();
        vc.s.k(usVarA);
        return usVarA;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public us get() {
        return b(this.f35429a);
    }

    public static ys a(xs xsVar) {
        return new ys(xsVar);
    }
}
