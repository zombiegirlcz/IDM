package x8h;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f303365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.i f303366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e8h.d0 f303367c;
    public final ybl.k d;
    public final ybl.d e;

    public n0(gte.a featureToggleInteractor, ybl.i productGroupAvailabilityInteractor, e8h.d0 repository, ybl.k tradingAccountsInteractor, ybl.d portfolioInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(productGroupAvailabilityInteractor, "productGroupAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        this.f303365a = featureToggleInteractor;
        this.f303366b = productGroupAvailabilityInteractor;
        this.f303367c = repository;
        this.d = tradingAccountsInteractor;
        this.e = portfolioInteractor;
    }

    public final efm.r a(TradingAccountType accountType) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        return rd0.e.c(vkm.q.Q(((ael.h0) this.f303366b).b(cfl.p.STOCK_LENDING), new wf0.f0((Continuation) null, this, accountType, 8)), kotlin.coroutines.g.f186406a);
    }
}
