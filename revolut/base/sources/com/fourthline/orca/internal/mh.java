package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class mh implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lh f31189a;

    private mh(lh lhVar) {
        this.f31189a = lhVar;
    }

    public static ml b(lh lhVar) {
        ml mlVarA = lhVar.a();
        vc.s.k(mlVarA);
        return mlVarA;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ml get() {
        return b(this.f31189a);
    }

    public static mh a(lh lhVar) {
        return new mh(lhVar);
    }
}
