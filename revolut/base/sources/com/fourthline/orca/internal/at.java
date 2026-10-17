package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class at implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xs f26899a;

    private at(xs xsVar) {
        this.f26899a = xsVar;
    }

    public static ts b(xs xsVar) {
        ts tsVarB = xsVar.b();
        vc.s.k(tsVarB);
        return tsVarB;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ts get() {
        return b(this.f26899a);
    }

    public static at a(xs xsVar) {
        return new at(xsVar);
    }
}
