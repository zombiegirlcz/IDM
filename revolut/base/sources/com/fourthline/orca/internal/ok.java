package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class ok implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rj f31678a;

    private ok(rj rjVar) {
        this.f31678a = rjVar;
    }

    public static qq0 b(rj rjVar) {
        qq0 qq0VarC = rjVar.c();
        vc.s.k(qq0VarC);
        return qq0VarC;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public qq0 get() {
        return b(this.f31678a);
    }

    public static ok a(rj rjVar) {
        return new ok(rjVar);
    }
}
