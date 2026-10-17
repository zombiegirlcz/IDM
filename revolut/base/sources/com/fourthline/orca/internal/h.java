package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class h implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f29082a;

    private h(d dVar) {
        this.f29082a = dVar;
    }

    public static List b(d dVar) {
        List listE = dVar.e();
        vc.s.k(listE);
        return listE;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public List get() {
        return b(this.f29082a);
    }

    public static h a(d dVar) {
        return new h(dVar);
    }
}
