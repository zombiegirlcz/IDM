package wtc;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.v1;

/* JADX INFO: loaded from: classes7.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cuc.u f299858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jla.h f299859b;

    public b1(cuc.u repository, jla.h productCatalogueInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        this.f299858a = repository;
        this.f299859b = productCatalogueInteractor;
    }

    public final v1 a(qtc.k feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        return new v1(new wih.c(this, feature, (Continuation) null, 12));
    }
}
