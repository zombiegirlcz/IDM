package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class sk implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rj f33039a;

    private sk(rj rjVar) {
        this.f33039a = rjVar;
    }

    public static List b(rj rjVar) {
        List listD = rjVar.d();
        vc.s.k(listD);
        return listD;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public List get() {
        return b(this.f33039a);
    }

    public static sk a(rj rjVar) {
        return new sk(rjVar);
    }
}
