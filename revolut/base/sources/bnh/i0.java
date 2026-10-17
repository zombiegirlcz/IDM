package bnh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tzg.m f17188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f17189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f17190c;

    public i0(tzg.m wealthAccountsInteractor, n roboPortfolioItemsProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(roboPortfolioItemsProvider, "roboPortfolioItemsProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f17188a = wealthAccountsInteractor;
        this.f17189b = roboPortfolioItemsProvider;
        this.f17190c = featureToggleInteractor;
    }
}
