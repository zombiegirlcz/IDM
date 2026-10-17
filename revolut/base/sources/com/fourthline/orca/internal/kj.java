package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class kj implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jj f30287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f30288b;

    private kj(jj jjVar, e4m.e eVar) {
        this.f30287a = jjVar;
        this.f30288b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public b50 get() {
        return a(this.f30287a, (fj) this.f30288b.get());
    }

    public static kj a(jj jjVar, e4m.e eVar) {
        return new kj(jjVar, eVar);
    }

    public static b50 a(jj jjVar, fj fjVar) {
        b50 b50VarA = jjVar.a(fjVar);
        vc.s.k(b50VarA);
        return b50VarA;
    }
}
