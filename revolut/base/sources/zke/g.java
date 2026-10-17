package zke;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import te0.w;
import tzg.m;
import ybl.k;
import ybl.l;
import yhm.j;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zhh.a f322945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zhh.a f322946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zhh.a f322947c;
    public final zhh.a d;
    public final gte.a e;
    public final wbf.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f322948g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k f322949h;
    public final m i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Lazy f322950j;
    public final Object k;

    public g(zhh.a stocksAccountActionsProvider, zhh.a taxAdvantagedAccountActionsProvider, zhh.a roboAccountActionsProvider, zhh.a marginTradingAccountActionsProvider, gte.a featureToggleInteractor, wbf.a checkTradingAddOnAvailabilityInteractor, l tradingConfigInteractor, CoroutineScope scope, k tradingAccountsInteractor, m wealthAccountsInteractor) {
        Intrinsics.checkNotNullParameter(stocksAccountActionsProvider, "stocksAccountActionsProvider");
        Intrinsics.checkNotNullParameter(taxAdvantagedAccountActionsProvider, "taxAdvantagedAccountActionsProvider");
        Intrinsics.checkNotNullParameter(roboAccountActionsProvider, "roboAccountActionsProvider");
        Intrinsics.checkNotNullParameter(marginTradingAccountActionsProvider, "marginTradingAccountActionsProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(checkTradingAddOnAvailabilityInteractor, "checkTradingAddOnAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        this.f322945a = stocksAccountActionsProvider;
        this.f322946b = taxAdvantagedAccountActionsProvider;
        this.f322947c = roboAccountActionsProvider;
        this.d = marginTradingAccountActionsProvider;
        this.e = featureToggleInteractor;
        this.f = checkTradingAddOnAvailabilityInteractor;
        this.f322948g = tradingConfigInteractor;
        this.f322949h = tradingAccountsInteractor;
        this.i = wealthAccountsInteractor;
        this.f322950j = j.b(new zk7.a(this, scope, 1));
        this.k = w.y0(new zj9.a(3));
    }
}
