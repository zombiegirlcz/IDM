package wbf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.k f296147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.d f296148b;

    public g(ybl.d portfolioInteractor, ybl.k tradingAccountsInteractor) {
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        this.f296147a = tradingAccountsInteractor;
        this.f296148b = portfolioInteractor;
    }
}
