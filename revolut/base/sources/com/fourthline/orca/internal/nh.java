package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class nh implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lh f31414a;

    private nh(lh lhVar) {
        this.f31414a = lhVar;
    }

    public static r70 b(lh lhVar) {
        r70 r70VarB = lhVar.b();
        vc.s.k(r70VarB);
        return r70VarB;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public r70 get() {
        return b(this.f31414a);
    }

    public static nh a(lh lhVar) {
        return new nh(lhVar);
    }
}
