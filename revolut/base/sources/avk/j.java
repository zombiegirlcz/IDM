package avk;

import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.corporate_events.impl.ui.screen.home.CorporateEventsHomeScreen;
import com.revolut.feature.global_markets.impl.ui.redesign.screen.collection_details.GlobalMarketsCollectionScreen;
import com.revolut.feature.global_markets.impl.ui.redesign.screen.global.GlobalDetailsScreen;
import com.revolut.feature.global_markets.impl.ui.redesign.screen.market.MarketDetailsRedesignScreen;
import com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights.AllInsightsScreen;
import com.revolut.feature.robo.impl.ui.screen.portfolio_details.PortfolioDetailsScreen;
import com.revolut.feature.trading.impl.ui.collections.CollectionScreen;
import com.revolut.feature.wealth.impl.ui.extensions.disclaimers.modal_disclaimer.WealthDisclaimerBottomSheet;
import com.revolut.feature.wealth.impl.ui.screens.popularassets.PopularAssetsController;
import com.revolut.feature.wealth.ui.impl.trade_redesign.screen.TradeScreen;
import com.revolut.feature.wealth_discovery.impl.collection.most_traded.MostTradedAssetsScreen;
import com.revolut.feature.wealth_discovery.impl.collection.popular_first_buy.PopularFirstBuyScreen;
import com.revolut.feature.wealth_discovery.impl.collection.top_movers.TopMoversScreen;
import com.revolut.feature.wealth_discovery.impl.screener.screens.all_collections_redesign.page.ScreenerCollectionsPageScreen;
import com.revolut.feature.wealth_discovery.impl.screener.screens.all_filters.ScreenerEmbeddedFiltersController;
import com.revolut.retail.feature.marketnews.impl.ui.wealthnews.all_news.WealthAllNewsScreen;
import com.revolut.retail.feature.marketnews.impl.ui.wealthnews.assettype.WealthAssetTypeNewsScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.analyst_ratings.AnalystRatingsScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.fundamentals.FundamentalsScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.screens.sentiment.IndexMarketSentimentController;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.screens.technicals.TechnicalInsightsController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.cfd_details.CfdDetailsController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.detailed_stats.DetailedStatsController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.etf_details_overview.EtfDetailsOverviewController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.feed.StockDetailsFeedController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.financials.StockFinancialsController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.insights.InsightsScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.recommended_buy_info.RecommendedBuyInfoScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.stock_details_overview.StockDetailsOverviewController;
import kotlin.jvm.internal.Intrinsics;
import z0h.s1;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10102b;

    public /* synthetic */ j(Object obj2, int i) {
        this.f10101a = i;
        this.f10102b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
    @Override // z0h.s1
    public final vkm.d r() {
        int i = this.f10101a;
        Object obj2 = this.f10102b;
        switch (i) {
            case 0:
                return rd0.e.b(((CfdDetailsController) obj2).c0.d);
            case 1:
                return rd0.e.b(((MostTradedAssetsScreen) obj2).N.d);
            case 2:
                WealthDisclaimerBottomSheet wealthDisclaimerBottomSheet = (WealthDisclaimerBottomSheet) obj2;
                ViewBinding value = wealthDisclaimerBottomSheet.R.getValue(wealthDisclaimerBottomSheet, WealthDisclaimerBottomSheet.X[0]);
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                return rd0.e.b(((jii.e) value).f174514c.F);
            case 3:
                return rd0.e.b(((PopularFirstBuyScreen) obj2).X.d);
            case 4:
                return rd0.e.b(((DetailedStatsController) obj2).P.d);
            case 5:
                return rd0.e.b(((PortfolioDetailsScreen) obj2).f85157a0.d);
            case 6:
                return rd0.e.b(((TopMoversScreen) obj2).N.d);
            case 7:
                return rd0.e.b(((EtfDetailsOverviewController) obj2).j0.d);
            case 8:
                return rd0.e.b(((WealthAllNewsScreen) obj2).S.d);
            case 9:
                return rd0.e.b(((WealthAssetTypeNewsScreen) obj2).U.d);
            case 10:
                CorporateEventsHomeScreen.Companion companion = CorporateEventsHomeScreen.INSTANCE;
                return rd0.e.b(((TextDelegate) ((CorporateEventsHomeScreen) obj2).P.getValue()).d);
            case 11:
                return rd0.e.b(((RecommendedBuyInfoScreen) obj2).K.d);
            case 12:
                return rd0.e.b(((TradeScreen) obj2).j0.d);
            case 13:
                return rd0.e.b(((StockDetailsFeedController) obj2).R.d);
            case 14:
                return rd0.e.b(((IndexMarketSentimentController) obj2).N.d);
            case 15:
                return rd0.e.b(((StockFinancialsController) obj2).U.d);
            case 16:
                return rd0.e.b(((TechnicalInsightsController) obj2).O.d);
            case 17:
                return rd0.e.b(((StockDetailsOverviewController) obj2).c0.d);
            case 18:
                return rd0.e.b(((GlobalMarketsCollectionScreen) obj2).Q.d);
            case 19:
                return rd0.e.b(((GlobalDetailsScreen) obj2).R.d);
            case 20:
                return rd0.e.b(((ScreenerCollectionsPageScreen) obj2).O.d);
            case 21:
                return rd0.e.b(((InsightsScreen) obj2).U.d);
            case 22:
                return rd0.e.b(((MarketDetailsRedesignScreen) obj2).R.d);
            case 23:
                return rd0.e.b(((ScreenerEmbeddedFiltersController) obj2).X.d);
            case 24:
                return rd0.e.b(((PopularAssetsController) obj2).Q.d);
            case 25:
                return rd0.e.b(((AnalystRatingsScreen) obj2).L.d);
            case 26:
                return rd0.e.b(((CollectionScreen) obj2).S.d);
            case 27:
                return rd0.e.b(((AllInsightsScreen) obj2).S.d);
            case 28:
                return rd0.e.b(((uqh.r) obj2).f282172g.d);
            default:
                return rd0.e.b(((FundamentalsScreen) obj2).U.d);
        }
    }
}
