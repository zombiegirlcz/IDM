package upd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f281957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xh5.a f281958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m2j.j f281959c;
    public final nw5.j d;
    public final tv5.b e;

    public b(gte.a featureToggleInteractor, xh5.a cryptoFeatureEnabledInteractor, m2j.j balancesInteractor, nw5.j cryptoStatsInteractor, tv5.b currencyDiscoveryInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(cryptoFeatureEnabledInteractor, "cryptoFeatureEnabledInteractor");
        Intrinsics.checkNotNullParameter(balancesInteractor, "balancesInteractor");
        Intrinsics.checkNotNullParameter(cryptoStatsInteractor, "cryptoStatsInteractor");
        Intrinsics.checkNotNullParameter(currencyDiscoveryInteractor, "currencyDiscoveryInteractor");
        this.f281957a = featureToggleInteractor;
        this.f281958b = cryptoFeatureEnabledInteractor;
        this.f281959c = balancesInteractor;
        this.d = cryptoStatsInteractor;
        this.e = currencyDiscoveryInteractor;
    }
}
