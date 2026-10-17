package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class oj implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jj f31673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31674b;

    private oj(jj jjVar, e4m.e eVar) {
        this.f31673a = jjVar;
        this.f31674b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a50 get() {
        return a(this.f31673a, (fj) this.f31674b.get());
    }

    public static oj a(jj jjVar, e4m.e eVar) {
        return new oj(jjVar, eVar);
    }

    public static a50 a(jj jjVar, fj fjVar) {
        a50 a50VarC = jjVar.c(fjVar);
        vc.s.k(a50VarC);
        return a50VarC;
    }
}
