package dwi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jla.h f120468a;

    public x(jla.h productCatalogueInteractor) {
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        this.f120468a = productCatalogueInteractor;
    }

    public final pfm.z a() {
        ufm.c cVar = new ufm.c(new t(this, 0), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return ue0.e.F(cVar, Boolean.FALSE);
    }

    public final boolean b() {
        return this.f120468a.d("LOUNGE_PASS", null) == bla.c.ENABLED;
    }
}
