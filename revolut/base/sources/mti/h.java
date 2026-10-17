package mti;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jla.h f208854a;

    public h(jla.h productCatalogueInteractor) {
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        this.f208854a = productCatalogueInteractor;
    }

    public final boolean a() {
        return this.f208854a.d("AIRPORT_FAST_TRACK", null) == bla.c.ENABLED;
    }
}
