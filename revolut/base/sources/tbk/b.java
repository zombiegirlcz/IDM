package tbk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jla.h f269551a;

    public b(jla.h productCatalogueInteractor) {
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        this.f269551a = productCatalogueInteractor;
    }

    public final boolean a() {
        return ((jla.h) this.f269551a).d("PRICING_PLAN_GIFTING", null) == bla.c.ENABLED;
    }
}
