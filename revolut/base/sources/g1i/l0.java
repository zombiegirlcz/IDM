package g1i;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.sca_prompt.api.navigation.ScaPromptDestination;
import com.revolut.feature_exchange.api.models.TakeProfitStopLossParams;
import com.revolut.feature_exchange.api.navigation.ExchangeFeatureConfig;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.ExchangeOrderDraft;
import com.revolut.feature_exchange.impl.ui.exchange.order_summary.OrderSummaryContract$Configuration;
import com.revolut.feature_market_data_api.navigation.FeeBreakdownFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ExplicitActivityDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.FinishFlowCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserFeatureConfig;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import com.revolut.shared.feature.market_data.models.domain.models.LegacyOrderQuoteParams;
import grl.k9;
import java.util.List;
import java.util.concurrent.Callable;
import kl.t1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;

/* JADX INFO: loaded from: classes10.dex */
public final class l0 implements m1i.m, w1i.e, c2i.l, t1i.g, z1i.f, u2i.s, k1i.c, f2i.j, e2i.c, q2i.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k1i.k f139649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f139650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f139651c;
    public final ln.a d;
    public final AccountId e;
    public final iva.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t1 f139652g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jx0.a f139653h;
    public final xh5.a i;

    public l0(a presentationModel, b state, ln.a navigationCommandsDispatcher, AccountId accountId, k1i.k exchangeFeeRouter, iva.a recurringBuysNavigationProvider, t1 currencyRateNaviProvider, jx0.a takeProfitStopLossChartInteractor, xh5.a cryptoFeatureEnabledInteractor) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(exchangeFeeRouter, "exchangeFeeRouter");
        Intrinsics.checkNotNullParameter(recurringBuysNavigationProvider, "recurringBuysNavigationProvider");
        Intrinsics.checkNotNullParameter(currencyRateNaviProvider, "currencyRateNaviProvider");
        Intrinsics.checkNotNullParameter(takeProfitStopLossChartInteractor, "takeProfitStopLossChartInteractor");
        Intrinsics.checkNotNullParameter(cryptoFeatureEnabledInteractor, "cryptoFeatureEnabledInteractor");
        this.f139649a = exchangeFeeRouter;
        this.f139650b = presentationModel;
        this.f139651c = state;
        this.d = navigationCommandsDispatcher;
        this.e = accountId;
        this.f = recurringBuysNavigationProvider;
        this.f139652g = currencyRateNaviProvider;
        this.f139653h = takeProfitStopLossChartInteractor;
        this.i = cryptoFeatureEnabledInteractor;
    }

    public static TakeProfitStopLossParams f(n9l.a aVar, wd6.h hVar, ExchangeOrderDraft exchangeOrderDraft, wd6.e eVar, Float f) {
        return new TakeProfitStopLossParams(aVar.f213662b, aVar.f213661a, hVar == wd6.h.LIMIT ? r0i.c.LIMIT : r0i.c.STOP, (float) aVar.f213663c, eVar, yh5.b.T(exchangeOrderDraft.f96879a), yh5.b.T(exchangeOrderDraft.f96880b), exchangeOrderDraft.f, f);
    }

    @Override // t2i.c, u2i.s
    public final efm.b a(NaviCommand naviCommand) {
        Intrinsics.checkNotNullParameter(naviCommand, "naviCommand");
        return this.d.a(naviCommand);
    }

    @Override // k1i.c
    public final efm.b b() {
        return this.f139649a.b();
    }

    public final efm.b d() {
        return this.d.a(FinishFlowCommand.f98647a);
    }

    public final efm.b e() {
        ExplicitActivityDestination explicitActivityDestination;
        if (((Boolean) ((m0) this.f139651c).H0().get()).booleanValue()) {
            i2i.l.Companion.getClass();
            explicitActivityDestination = i2i.f.f157959b;
        } else {
            m1i.o.Companion.getClass();
            explicitActivityDestination = m1i.f.f201532b;
        }
        return this.d.a(com.revolut.retail.core.navigation.a.d(new ActivityNavigateCommand(explicitActivityDestination, ExchangeFeatureConfig.Refresh.f96849a, null, null, 0, null, null, null, null, false, 1020)));
    }

    @Override // t2i.c
    public final efm.b finish() {
        return this.d.a(new FinishCommand(null, null, null, 7));
    }

    public final efm.b g(NaviCommand naviCommand) {
        Intrinsics.checkNotNullParameter(naviCommand, "naviCommand");
        return this.d.a(com.revolut.retail.core.navigation.a.c(FinishFlowCommand.f98647a, naviCommand));
    }

    public final efm.b h(xfa.b startedFrom) {
        Intrinsics.checkNotNullParameter(startedFrom, "startedFrom");
        hha.u.Companion.getClass();
        return j(new FeatureCommand(new PricingPlanFeatureConfig.DashboardByFeature(hha.u.f, startedFrom, null, false, 1020)));
    }

    public final efm.b i(String legalEntityId) {
        Intrinsics.checkNotNullParameter(legalEntityId, "legalEntityId");
        return this.d.a(gc0.c.f(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new ScaPromptDestination(legalEntityId), false, (Integer) 328, 0, 53)));
    }

    public final efm.b j(FeatureCommand featureCommand) {
        return this.d.a(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), featureCommand));
    }

    public final pfm.a k() {
        ExchangeOrderDraft exchangeOrderDraft = (ExchangeOrderDraft) ((m0) this.f139651c).y0().get();
        int i = 1;
        pfm.a aVar = new pfm.a(te0.w.o0(p0.f264003c, new k0(this, exchangeOrderDraft, null, 1)), new i0(i, new g0(this, exchangeOrderDraft, i)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    public final pfm.a l(LegacyOrderQuoteParams params) {
        Intrinsics.checkNotNullParameter(params, "quoteParams");
        d0 d0Var = (d0) this.f139650b;
        d0Var.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        efm.r map = d0Var.f139607q.p(params).map(new e(8, new g1.c(15)));
        od0.i.Companion.getClass();
        efm.d0 d0VarFirst = map.first(od0.i.f224256b);
        Intrinsics.checkNotNullExpressionValue(d0VarFirst, "first(...)");
        h hVar = new h(23, new g1.b(params, 12));
        d0VarFirst.getClass();
        pfm.a aVar = new pfm.a(new ufm.i(d0VarFirst, hVar, 1), new h(24, new e0(this, 3)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    public final efm.b m(LegacyOrderQuoteParams quoteParams, ChargeBreakdown fee2, xi0.b bVar, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(quoteParams, "quoteParams");
        Intrinsics.checkNotNullParameter(fee2, "fee");
        c4i.a aVar = c4i.a.EXCHANGE;
        m0 m0Var = (m0) this.f139651c;
        boolean z4 = !((Boolean) m0Var.H0().get()).booleanValue();
        k9 value = ((Boolean) m0Var.H0().get()).booleanValue() ? k9.Crypto : k9.ProductUnspecified;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        return this.d.a(new FeatureCommand(new FeeBreakdownFeatureConfig(quoteParams, fee2, aVar, new AnalyticsProduct.Retail(value), z4, bVar, z, z3, 1792)));
    }

    public final pfm.a n() {
        efm.d0 d0VarFirstOrError = ((d0) this.f139650b).F3().firstOrError();
        i0 i0Var = new i0(0, new e0(this, 7));
        d0VarFirstOrError.getClass();
        pfm.a aVar = new pfm.a(d0VarFirstOrError, i0Var, 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    public final efm.b o() {
        boolean zBooleanValue = ((Boolean) ((m0) this.f139651c).H0().get()).booleanValue();
        ln.a aVar = this.d;
        if (zBooleanValue) {
            p2i.g.Companion.getClass();
            return aVar.a(new ActivityNavigateCommand(p2i.c.f232236b, null, null, null, 0, null, null, null, null, false, 1022));
        }
        f2i.m.Companion.getClass();
        return aVar.a(new ActivityNavigateCommand(f2i.d.f131798b, null, null, null, 0, null, null, null, null, false, 1022));
    }

    public final pfm.a p(final List currencies, final xi0.b selectedCurrency, final int i) {
        Intrinsics.checkNotNullParameter(selectedCurrency, "selectedCurrency");
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        pfm.a aVar = new pfm.a(new ufm.c(new Callable() { // from class: g1i.f0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new FeatureCommand(new CurrencyChooserFeatureConfig.CurrencyChooser(selectedCurrency, currencies, Integer.valueOf(i), 4));
            }
        }, 2), new h(21, new e0(this, 1)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    public final efm.b q() {
        t1i.i.Companion.getClass();
        return this.d.a(new ActivityNavigateCommand(t1i.e.f267364b, null, null, null, 0, null, null, null, null, false, 1022));
    }

    public final efm.b r(boolean z, boolean z3) {
        z1i.i.Companion.getClass();
        return this.d.a(new ActivityNavigateCommand(z1i.c.f318816b, new OrderSummaryContract$Configuration(z, z3, 1), null, null, 0, null, null, null, null, false, 1020));
    }

    public final pfm.a s() {
        ExchangeOrderDraft exchangeOrderDraft = (ExchangeOrderDraft) ((m0) this.f139651c).y0().get();
        Continuation continuation = null;
        pfm.a aVar = new pfm.a(te0.w.H0(exchangeOrderDraft.f96881c == wd6.e.SELL ? te0.w.o0(p0.f264003c, new k0(this, exchangeOrderDraft, continuation, 1)) : te0.w.o0(p0.f264003c, new k0(this, exchangeOrderDraft, continuation, 0)), ((d0) this.f139650b).y3()), new h(27, new g0(this, exchangeOrderDraft, 0)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }
}
