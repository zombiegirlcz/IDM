package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class u implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f33901a;

    private u(d dVar) {
        this.f33901a = dVar;
    }

    public static gz0 b(d dVar) {
        gz0 gz0VarM = dVar.m();
        vc.s.k(gz0VarM);
        return gz0VarM;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gz0 get() {
        return b(this.f33901a);
    }

    public static u a(d dVar) {
        return new u(dVar);
    }
}
