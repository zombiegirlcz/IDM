package kd8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gd8.q f182859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jla.h f182860b;

    public x(gd8.q juniorConsentRequestRepository, jla.h productCatalogueInteractor) {
        Intrinsics.checkNotNullParameter(juniorConsentRequestRepository, "juniorConsentRequestRepository");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        this.f182859a = juniorConsentRequestRepository;
        this.f182860b = productCatalogueInteractor;
    }
}
