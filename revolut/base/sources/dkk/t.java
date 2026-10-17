package dkk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jla.h f115620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final si7.a f115621b;

    public t(jla.h productCatalogueInteractor, si7.a insuranceInteractor) {
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(insuranceInteractor, "insuranceInteractor");
        this.f115620a = productCatalogueInteractor;
        this.f115621b = insuranceInteractor;
    }
}
