package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class ge implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xd f28856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f28857b;

    private ge(xd xdVar, e4m.e eVar) {
        this.f28856a = xdVar;
        this.f28857b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean get() {
        return Boolean.valueOf(a(this.f28856a, (r70) this.f28857b.get()));
    }

    public static ge a(xd xdVar, e4m.e eVar) {
        return new ge(xdVar, eVar);
    }

    public static boolean a(xd xdVar, r70 r70Var) {
        return xdVar.d(r70Var);
    }
}
