package vfh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements hdh.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vrl.b f288645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vrl.g f288646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ybl.d f288647c;

    public e(vrl.b fetchOrderLimitsByPortfolioInteractor, vrl.g investOrdersInteractor, ybl.d portfolioInteractor) {
        Intrinsics.checkNotNullParameter(fetchOrderLimitsByPortfolioInteractor, "fetchOrderLimitsByPortfolioInteractor");
        Intrinsics.checkNotNullParameter(investOrdersInteractor, "investOrdersInteractor");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        this.f288645a = fetchOrderLimitsByPortfolioInteractor;
        this.f288646b = investOrdersInteractor;
        this.f288647c = portfolioInteractor;
    }

    @Override // hdh.g
    public final hdh.f a() {
        return new l(this.f288645a, this.f288646b, this.f288647c);
    }
}
