package dfj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b2 implements bej.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nfj.v0 f113915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ffk.t f113916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s3 f113917c;

    public b2(nfj.v0 repository, ffk.t pricingPlanInteractor, s3 esimSubscriptionsInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(esimSubscriptionsInteractor, "esimSubscriptionsInteractor");
        this.f113915a = repository;
        this.f113916b = pricingPlanInteractor;
        this.f113917c = esimSubscriptionsInteractor;
    }
}
