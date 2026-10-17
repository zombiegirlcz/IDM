package imc;

import kotlin.jvm.internal.Intrinsics;
import qmc.d;
import x8h.k;
import yji.n;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends n implements dlc.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f162346l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final gte.a f162347m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k f162348n;
    public final toh.d o;

    public b(d portfolioBalanceProvider, gte.a featureToggleInteractor, k displayCurrencyInteractor, toh.d performanceParametersInteractor) {
        Intrinsics.checkNotNullParameter(portfolioBalanceProvider, "portfolioBalanceProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(displayCurrencyInteractor, "displayCurrencyInteractor");
        Intrinsics.checkNotNullParameter(performanceParametersInteractor, "performanceParametersInteractor");
        this.f162346l = portfolioBalanceProvider;
        this.f162347m = featureToggleInteractor;
        this.f162348n = displayCurrencyInteractor;
        this.o = performanceParametersInteractor;
    }
}
