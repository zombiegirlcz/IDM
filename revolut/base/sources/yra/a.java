package yra;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final td0.b f316167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f316168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p38.a f316169c;

    public a(td0.b currenciesProvider, gte.a featureToggleInteractor, p38.a jointAccountsProductFeatureChecker) {
        Intrinsics.checkNotNullParameter(currenciesProvider, "currenciesProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsProductFeatureChecker, "jointAccountsProductFeatureChecker");
        this.f316167a = currenciesProvider;
        this.f316168b = featureToggleInteractor;
        this.f316169c = jointAccountsProductFeatureChecker;
    }
}
