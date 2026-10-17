package ssd;

import ael.t;
import jla.h;
import kotlin.jvm.internal.Intrinsics;
import wsg.n;
import ybl.k;
import ybl.l;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f265369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f265370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f265371c;
    public final n d;
    public final hj8.a e;
    public final l f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f265372g;

    public b(h productCatalogueInteractor, k tradingAccountsInteractor, t portfolioBalanceInteractor, n walletInteractor, hj8.a juniorProfileInteractor, l tradingConfigInteractor, g juniorInvestNetWorthMapper) {
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(portfolioBalanceInteractor, "portfolioBalanceInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(juniorInvestNetWorthMapper, "juniorInvestNetWorthMapper");
        this.f265369a = productCatalogueInteractor;
        this.f265370b = tradingAccountsInteractor;
        this.f265371c = portfolioBalanceInteractor;
        this.d = walletInteractor;
        this.e = juniorProfileInteractor;
        this.f = tradingConfigInteractor;
        this.f265372g = juniorInvestNetWorthMapper;
    }
}
