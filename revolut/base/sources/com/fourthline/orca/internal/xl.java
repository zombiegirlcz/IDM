package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class xl implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ol f35020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f35021b;

    private xl(ol olVar, e4m.e eVar) {
        this.f35020a = olVar;
        this.f35021b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public List get() {
        return a(this.f35020a, (ml) this.f35021b.get());
    }

    public static xl a(ol olVar, e4m.e eVar) {
        return new xl(olVar, eVar);
    }

    public static List a(ol olVar, ml mlVar) {
        List listC = olVar.c(mlVar);
        vc.s.k(listC);
        return listC;
    }
}
