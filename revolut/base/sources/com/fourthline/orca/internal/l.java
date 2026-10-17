package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class l implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f30494a;

    private l(d dVar) {
        this.f30494a = dVar;
    }

    public static te b(d dVar) {
        te teVarG = dVar.g();
        vc.s.k(teVarG);
        return teVarG;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public te get() {
        return b(this.f30494a);
    }

    public static l a(d dVar) {
        return new l(dVar);
    }
}
