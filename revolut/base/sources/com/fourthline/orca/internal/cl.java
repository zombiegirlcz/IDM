package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class cl implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bl f27498a;

    private cl(bl blVar) {
        this.f27498a = blVar;
    }

    public static lq b(bl blVar) {
        lq lqVarA = blVar.a();
        vc.s.k(lqVarA);
        return lqVarA;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public lq get() {
        return b(this.f27498a);
    }

    public static cl a(bl blVar) {
        return new cl(blVar);
    }
}
