package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class fs implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ds f28625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f28626b;

    private fs(ds dsVar, e4m.e eVar) {
        this.f28625a = dsVar;
        this.f28626b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public n9 get() {
        return a(this.f28625a, (bs) this.f28626b.get());
    }

    public static fs a(ds dsVar, e4m.e eVar) {
        return new fs(dsVar, eVar);
    }

    public static n9 a(ds dsVar, bs bsVar) {
        n9 n9VarB = dsVar.b(bsVar);
        vc.s.k(n9VarB);
        return n9VarB;
    }
}
