package xnd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f307402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y91.b f307403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0j.a f307404c;
    public final tsj.g d;

    public h0(gte.a featureToggleInteractor, y91.b accountsProductFeatureChecker, j0j.a tripsInteractor, tsj.g customAssetsInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(accountsProductFeatureChecker, "accountsProductFeatureChecker");
        Intrinsics.checkNotNullParameter(tripsInteractor, "tripsInteractor");
        Intrinsics.checkNotNullParameter(customAssetsInteractor, "customAssetsInteractor");
        this.f307402a = featureToggleInteractor;
        this.f307403b = accountsProductFeatureChecker;
        this.f307404c = tripsInteractor;
        this.d = customAssetsInteractor;
    }
}
