package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class eq implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hp f28224a;

    private eq(hp hpVar) {
        this.f28224a = hpVar;
    }

    public static List b(hp hpVar) {
        List listC = hpVar.c();
        vc.s.k(listC);
        return listC;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public List get() {
        return b(this.f28224a);
    }

    public static eq a(hp hpVar) {
        return new eq(hpVar);
    }
}
