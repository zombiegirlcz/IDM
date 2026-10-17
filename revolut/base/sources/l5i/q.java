package l5i;

import com.revolut.feature.categorisation.api.model.CategorisationFilter;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import efm.r;
import java.util.Collection;
import kl.b0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import l9k.v;
import le3.s;
import zh9.u0;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f192296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f192297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f192298c;
    public Object d;
    public Object e;
    public Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f192299g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f192300h;
    public Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f192301j;

    public q(n5i.f currencyExchangeBreakdownMapper, ks0.n roboTopupCurrencyExchangeBreakdownMapper, n5i.d commodityExchangeBreakdownMapper, n5i.n tradingExchangeBreakdownMapper, n5i.p tradingFundOrderBreakdownMapper, n5i.q vaultTransferExchangeBreakdownMapper, n5i.a billAccountsExchangeBreakdownMapper, n5i.i donationExchangeBreakdownMapper, n5i.l savingsTransferBreakdownMapper, lal.a creditCardBreakdownMapper) {
        Intrinsics.checkNotNullParameter(currencyExchangeBreakdownMapper, "currencyExchangeBreakdownMapper");
        Intrinsics.checkNotNullParameter(roboTopupCurrencyExchangeBreakdownMapper, "roboTopupCurrencyExchangeBreakdownMapper");
        Intrinsics.checkNotNullParameter(commodityExchangeBreakdownMapper, "commodityExchangeBreakdownMapper");
        Intrinsics.checkNotNullParameter(tradingExchangeBreakdownMapper, "tradingExchangeBreakdownMapper");
        Intrinsics.checkNotNullParameter(tradingFundOrderBreakdownMapper, "tradingFundOrderBreakdownMapper");
        Intrinsics.checkNotNullParameter(vaultTransferExchangeBreakdownMapper, "vaultTransferExchangeBreakdownMapper");
        Intrinsics.checkNotNullParameter(billAccountsExchangeBreakdownMapper, "billAccountsExchangeBreakdownMapper");
        Intrinsics.checkNotNullParameter(donationExchangeBreakdownMapper, "donationExchangeBreakdownMapper");
        Intrinsics.checkNotNullParameter(savingsTransferBreakdownMapper, "savingsTransferBreakdownMapper");
        Intrinsics.checkNotNullParameter(creditCardBreakdownMapper, "creditCardBreakdownMapper");
        this.f192296a = currencyExchangeBreakdownMapper;
        this.f192297b = roboTopupCurrencyExchangeBreakdownMapper;
        this.f192298c = commodityExchangeBreakdownMapper;
        this.d = tradingExchangeBreakdownMapper;
        this.e = tradingFundOrderBreakdownMapper;
        this.f = vaultTransferExchangeBreakdownMapper;
        this.f192299g = billAccountsExchangeBreakdownMapper;
        this.f192300h = donationExchangeBreakdownMapper;
        this.i = savingsTransferBreakdownMapper;
        this.f192301j = creditCardBreakdownMapper;
    }

    public akg.n a(ge3.c params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return nim.a.v(b(params), new le3.j(this, 1));
    }

    public Flow b(ge3.c params) {
        Intrinsics.checkNotNullParameter(params, "params");
        CategorisationFilter categorisationFilter = params.f143218a;
        AnalyticsAccountsSelection analyticsAccountsSelection = params.f143219b;
        Collection collection = params.f143220c;
        return boh.f.e(u0.m(((le3.k) this.f).a(d0.d1(analyticsAccountsSelection.getF99208a())), vkm.q.q(((le3.a) this.f192296a).b(analyticsAccountsSelection))), new ja3.d(this, categorisationFilter, params.d, vkm.q.q(nim.a.v(u0.m(((le3.i) this.f192298c).a(), collection != null ? rd0.e.b(((e61.a) this.d).a(collection)) : new go.g(zi0.c.P(f0.f322471a, false, null, 3), 2)), new le3.b(15))), 15));
    }

    public akg.n c(ge3.b params) {
        Intrinsics.checkNotNullParameter(params, "params");
        le3.k kVar = (le3.k) this.f;
        AnalyticsAccountsSelection analyticsAccountsSelection = params.f143217b;
        Flow flowE = boh.f.e(kVar.a(d0.d1(analyticsAccountsSelection.getF99208a())), new v(this, params, 11));
        r map = ((njf.j) ((nhf.a) this.f192299g)).f().map(new lak.i(new le3.b(13), 21));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return nim.a.v(nim.a.u(new ie6.q(2, 23, null), u0.m(u0.i(rd0.e.b(map), ((le3.i) this.f192298c).a(), ((le3.a) this.f192296a).b(analyticsAccountsSelection)), flowE)), new le3.b(14));
    }

    public h d(c4i.a transactionType) {
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        switch (p.f192295a[transactionType.ordinal()]) {
            case 1:
                return (n5i.f) this.f192296a;
            case 2:
                return (ks0.n) this.f192297b;
            case 3:
                return (n5i.d) this.f192298c;
            case 4:
                return (n5i.n) this.d;
            case 5:
                return (n5i.p) this.e;
            case 6:
                return (n5i.q) this.f;
            case 7:
                return (n5i.a) this.f192299g;
            case 8:
                return (n5i.i) this.f192300h;
            case 9:
                return (n5i.l) this.i;
            case 10:
                return (lal.a) this.f192301j;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public q(le3.a analyticsCurrencyInteractor, s categorisedTransactionsProvider, le3.i analyticsRatesInteractor, e61.a ratesInteractor, b0 categoryGroupingProvider, le3.k transactionsUpdatesScopeProvider, nhf.a unitedWalletInteractor, le3.p categorisationTransactionFilterInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor, j9l.a moneyCalculator) {
        Intrinsics.checkNotNullParameter(analyticsCurrencyInteractor, "analyticsCurrencyInteractor");
        Intrinsics.checkNotNullParameter(categorisedTransactionsProvider, "categorisedTransactionsProvider");
        Intrinsics.checkNotNullParameter(analyticsRatesInteractor, "analyticsRatesInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(categoryGroupingProvider, "categoryGroupingProvider");
        Intrinsics.checkNotNullParameter(transactionsUpdatesScopeProvider, "transactionsUpdatesScopeProvider");
        Intrinsics.checkNotNullParameter(unitedWalletInteractor, "unitedWalletInteractor");
        Intrinsics.checkNotNullParameter(categorisationTransactionFilterInteractor, "categorisationTransactionFilterInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(moneyCalculator, "moneyCalculator");
        this.f192296a = analyticsCurrencyInteractor;
        this.f192297b = categorisedTransactionsProvider;
        this.f192298c = analyticsRatesInteractor;
        this.d = ratesInteractor;
        this.e = categoryGroupingProvider;
        this.f = transactionsUpdatesScopeProvider;
        this.f192299g = unitedWalletInteractor;
        this.f192300h = categorisationTransactionFilterInteractor;
        this.i = transactionsInteractor;
        this.f192301j = moneyCalculator;
    }
}
