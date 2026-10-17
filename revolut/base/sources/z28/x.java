package z28;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.feature.commodities.onboarding.api.CommoditiesOnboardingApi$Toggles$InvestCommoditiesToEtc;
import com.revolut.feature.commodities.onboarding.impl.comms.CommoditiesToEtcProductArticleKey;
import com.revolut.feature.invest_feed.api.models.InvestWidgetContext;
import com.revolut.feature.product_article.api.models.ProductArticleCommandInterceptor;
import com.revolut.feature.product_article.api.models.ProductArticleDestinationInterceptor;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDestination;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.wealth.ui.api.navigation.trade.WealthTradeRedesignDestination;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.kompot.common.StackDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.youTransactor.uCube.rpc.Constants;
import ish.a0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class x implements csh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p2b.i f319031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k39.b f319032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oih.i f319033c;
    public final oih.k d;
    public final oih.j e;
    public final a0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final sj3.a f319034g;

    public x(p2b.i cfdRiskWarningInteractor, k39.b navigationCommandsDispatcher, oih.i wealthRoboAccountCommandProvider, oih.k wealthTaxAdvantageAccountCommandProvider, oih.j wealthStocksAccountCommandProvider, a0 widgetsUiInteractor, sj3.a commoditiesOnboardingStartCommandProvider) {
        Intrinsics.checkNotNullParameter(cfdRiskWarningInteractor, "cfdRiskWarningInteractor");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(wealthRoboAccountCommandProvider, "wealthRoboAccountCommandProvider");
        Intrinsics.checkNotNullParameter(wealthTaxAdvantageAccountCommandProvider, "wealthTaxAdvantageAccountCommandProvider");
        Intrinsics.checkNotNullParameter(wealthStocksAccountCommandProvider, "wealthStocksAccountCommandProvider");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(commoditiesOnboardingStartCommandProvider, "commoditiesOnboardingStartCommandProvider");
        this.f319031a = cfdRiskWarningInteractor;
        this.f319032b = navigationCommandsDispatcher;
        this.f319033c = wealthRoboAccountCommandProvider;
        this.d = wealthTaxAdvantageAccountCommandProvider;
        this.e = wealthStocksAccountCommandProvider;
        this.f = widgetsUiInteractor;
        this.f319034g = commoditiesOnboardingStartCommandProvider;
    }

    @Override // csh.f
    public final Class j() {
        return InvestWidgetContext.class;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        StackDestination wealthTradeRedesignDestination;
        InvestWidgetContext widgetContext2 = (InvestWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof com.revolut.core.ui_kit.delegates.widgets.e;
        pfm.m mVar = pfm.m.f235744a;
        k39.b bVar = this.f319032b;
        if (!z) {
            if (event instanceof q0) {
                pfm.h hVar = new pfm.h(new yc7.k(this, 5, event, widgetContext2), 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                return hVar;
            }
            if (event instanceof com.revolut.core.ui_kit.delegates.widgets.i) {
                return ((com.revolut.core.ui_kit.delegates.widgets.i) event).f55375c instanceof GridWidgetDelegate.Model ? bVar.a(u0.f(new WealthTradeRedesignDestination(null))) : mVar;
            }
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        Object obj2 = ((com.revolut.core.ui_kit.delegates.widgets.e) event).f55333c.f53167l;
        l lVar = obj2 instanceof l ? (l) obj2 : null;
        if (Intrinsics.f(lVar, i.f319015a)) {
            return bVar.a(u0.f(new WealthTradeRedesignDestination(sih.c.STOCKS)));
        }
        if (lVar instanceof d) {
            return bVar.a(u0.f(new WealthTradeRedesignDestination(sih.c.ETF)));
        }
        if (Intrinsics.f(lVar, a.f319007a)) {
            return bVar.a(u0.f(new WealthTradeRedesignDestination(sih.c.BONDS)));
        }
        if (Intrinsics.f(lVar, c.f319009a)) {
            if (((jte.d) ((wj3.a) this.f319034g).d).c(CommoditiesOnboardingApi$Toggles$InvestCommoditiesToEtc.f65947c)) {
                FeatureCommand featureCommandF = u0.f(new WealthTradeRedesignDestination(sih.c.COMMODITIES));
                wealthTradeRedesignDestination = new ProductArticleDestination(new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(CommoditiesToEtcProductArticleKey.f65949a)), SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a, new ProductArticleCommandInterceptor(featureCommandF, null, featureCommandF, featureCommandF, 2), (ProductArticleDestinationInterceptor) null, (AnalyticsProduct) null, (AnalyticsContext) null, (TransitionAnimation) null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
            } else {
                wealthTradeRedesignDestination = new WealthTradeRedesignDestination(sih.c.COMMODITIES);
            }
            return bVar.a(u0.f(wealthTradeRedesignDestination));
        }
        if (Intrinsics.f(lVar, b.f319008a)) {
            pfm.a aVar = new pfm.a(te0.w.o0(p0.f264003c, new s(this, null)), new z1i.n(new t(1, 0, ln.a.class, bVar, "dispatchNavigationAsync", "dispatchNavigationAsync(Lcom/revolut/retail/core/navigation/NaviCommand;)Lio/reactivex/Completable;"), 14), 4);
            Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
            return aVar;
        }
        if (Intrinsics.f(lVar, h.f319014a)) {
            return new pfm.a(((llh.f) this.f319033c).a(oih.c.f225687a), new z1i.n(new u(1, 0, ln.a.class, bVar, "dispatchNavigationAsync", "dispatchNavigationAsync(Lcom/revolut/retail/core/navigation/NaviCommand;)Lio/reactivex/Completable;"), 15), 4);
        }
        if (Intrinsics.f(lVar, f.f319012a)) {
            return bVar.a(u0.f(new WealthTradeRedesignDestination(sih.c.MUTUAL_FUNDS)));
        }
        if (Intrinsics.f(lVar, g.f319013a)) {
            return bVar.a(u0.f(new WealthTradeRedesignDestination(sih.c.PRIVATE_MARKETS)));
        }
        if (Intrinsics.f(lVar, j.f319016a)) {
            return bVar.a(u0.f(new WealthTradeRedesignDestination(sih.c.STRUCTURED_NOTES)));
        }
        if (lVar instanceof k) {
            pfm.a aVar2 = new pfm.a(((llh.l) this.d).b(((k) lVar).f319017a, u0.f(new WealthTradeRedesignDestination(sih.c.STOCKS))), new z1i.n(new w(1, 0, ln.a.class, bVar, "dispatchNavigationAsync", "dispatchNavigationAsync(Lcom/revolut/retail/core/navigation/NaviCommand;)Lio/reactivex/Completable;"), 17), 4);
            Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
            return aVar2;
        }
        if (lVar instanceof e) {
            return new pfm.a(oih.j.a(this.e, null, ((e) lVar).f319011a, 1), new z1i.n(new v(1, 0, ln.a.class, bVar, "dispatchNavigationAsync", "dispatchNavigationAsync(Lcom/revolut/retail/core/navigation/NaviCommand;)Lio/reactivex/Completable;"), 16), 4);
        }
        if (lVar != null) {
            throw new NoWhenBranchMatchedException();
        }
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }
}
