package d78;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class t implements pfe.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zf8.k f111876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jla.h f111877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f111878c;

    public t(zf8.k juniorAccountInfoProvider, p kidSpaceMapper, jla.h productCatalogueInteractor, gte.a featureToggleInteractor, d88.h youthDiscoverDataSource) {
        Intrinsics.checkNotNullParameter(juniorAccountInfoProvider, "juniorAccountInfoProvider");
        Intrinsics.checkNotNullParameter(kidSpaceMapper, "kidSpaceMapper");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(youthDiscoverDataSource, "youthDiscoverDataSource");
        this.f111876a = juniorAccountInfoProvider;
        this.f111877b = productCatalogueInteractor;
        this.f111878c = featureToggleInteractor;
    }

    @Override // pfe.h
    public final Flow a() {
        return rd0.e.e(vkm.q.Q(new ae8.c(bla.b.b(this.f111877b, "YOUTH"), 3), new cvi.i((Continuation) null, this, 11)), h0.f322473a, new r(3, null));
    }
}
