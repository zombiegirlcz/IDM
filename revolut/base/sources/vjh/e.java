package vjh;

import bih.m;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import com.revolut.feature.wealth.ui.impl.R$string;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mjh.g;
import mjh.h;
import mjh.i;
import wjh.b0;
import wjh.v;
import wjh.w;
import wjh.x;
import zhm.d0;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements bih.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ojh.a f289747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final njh.d f289748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kjh.a f289749c;
    public final h d;
    public final rjh.a e;
    public final gte.a f;

    public e(ojh.a securitiesWidgetMapper, njh.d roboWidgetMapper, kjh.a commodityWidgetMapper, h marginWidgetMapper, rjh.a taxAdvantageAccountWidgetMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(securitiesWidgetMapper, "securitiesWidgetMapper");
        Intrinsics.checkNotNullParameter(roboWidgetMapper, "roboWidgetMapper");
        Intrinsics.checkNotNullParameter(commodityWidgetMapper, "commodityWidgetMapper");
        Intrinsics.checkNotNullParameter(marginWidgetMapper, "marginWidgetMapper");
        Intrinsics.checkNotNullParameter(taxAdvantageAccountWidgetMapper, "taxAdvantageAccountWidgetMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f289747a = securitiesWidgetMapper;
        this.f289748b = roboWidgetMapper;
        this.f289749c = commodityWidgetMapper;
        this.d = marginWidgetMapper;
        this.e = taxAdvantageAccountWidgetMapper;
        this.f = featureToggleInteractor;
    }

    public final List a(m mVar, TradingLegalEntityInformation tradingLegalEntityInformation) {
        if (mVar instanceof x) {
            x xVar = (x) mVar;
            wel.e portfolio = xVar.f298124a.f111099a;
            WealthAccount account = xVar.f298127g;
            ojh.c cVar = (ojh.c) this.f289747a;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(portfolio, "portfolio");
            Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
            Intrinsics.checkNotNullParameter(account, "account");
            String strC = jjh.b.c(account);
            boolean zD9 = account.d9();
            List listC = u.c(new RowDelegate.Model(j6.a.q("PRODUCT_WIDGET_PENDING_", strC), new RowDelegate.Model.MainImage.Image40(cVar.a(account), null, null, false, null, false, 62), cVar.b(tradingLegalEntityInformation, account), null, 0, new TextLocalisedClause(zD9 ? R$string.wealth_trading_application_state_in_progress : R$string.wealth_invest_home_portfolio_stocks_header_description_pending, null, null, 14), null, null, 0, new RowDelegate.Model.c.a(new TagViewData(null, new TextLocalisedClause(R$string.wealth_invest_home_portfolio_stocks_header_tag_pending, null, new Custom(Integer.valueOf(R$attr.uikit_colorOrange), false, null, false, null, 254), 10), R$attr.uikit_colorOrange_10, null, R$attr.uikit_colorTransparent, null, 1000), null, false, 6), false, null, false, null, null, null, null, null, null, zD9 ? account : portfolio, null, 0, 0, 0, 0, 532675544));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            return listC;
        }
        if (mVar instanceof wjh.u) {
            r6.b.D("Commodities doesn't have pending widget state.");
            return f0.f322471a;
        }
        if (mVar instanceof w) {
            w wVar = (w) mVar;
            WealthAccount.Robo account2 = wVar.d;
            List portfolios = d0.d1(wVar.f298121a.f115722a.keySet());
            njh.e eVar = (njh.e) this.f289748b;
            eVar.getClass();
            gte.a aVar = eVar.d;
            Intrinsics.checkNotNullParameter(account2, "account");
            Intrinsics.checkNotNullParameter(portfolios, "portfolios");
            WealthUiApi$Toggles.RoboStrategies roboStrategies = WealthUiApi$Toggles.RoboStrategies.f95863c;
            if (((jte.d) aVar).c(roboStrategies)) {
                return f0.f322471a;
            }
            List listC2 = u.c(new RowDelegate.Model(j6.a.q("PRODUCT_WIDGET_PENDING_", jjh.b.c(account2)), new RowDelegate.Model.MainImage.Image40(eVar.a(), null, null, false, null, false, 60), new TextLocalisedClause(((jte.d) aVar).c(roboStrategies) ? R$string.wealth_invest_home_portfolio_strategies_header_title : R$string.wealth_invest_home_portfolio_robo_header_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.wealth_invest_home_portfolio_robo_header_description_pending, null, null, 14), null, null, 0, new RowDelegate.Model.c.a(new TagViewData(null, new TextLocalisedClause(R$string.wealth_invest_home_portfolio_stocks_header_tag_pending, null, new Custom(Integer.valueOf(R$attr.uikit_colorOrange), false, null, false, null, 254), 10), new Color.Solid(R$attr.uikit_colorOrange_10), R$attr.uikit_colorTransparent, null, 1000), null, false, 6), false, null, false, null, null, null, null, null, null, new wjh.d(portfolios, wjh.e.PENDING), null, 0, 0, 0, 0, 532675544));
            yp0.b.k(listC2, 0, 0, 0, 0, 31);
            return listC2;
        }
        if (mVar instanceof v) {
            g gVar = (g) ((i) this.d).f206048a;
            gVar.getClass();
            TextLocalisedClause title = new TextLocalisedClause(R$string.wealth_invest_home_portfolio_cfds_header_title, null, null, 14);
            Image image = (Image) gVar.f206047a.getValue();
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(image, "image");
            List listC3 = u.c(new RowDelegate.Model("PRODUCT_WIDGET_PENDING_MARGIN", new RowDelegate.Model.MainImage.Image40(image, null, null, false, null, false, 62), new TextLocalisedClause(R$string.wealth_invest_home_portfolio_cfds_header_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.wealth_invest_home_portfolio_cfds_header_description_pending, null, null, 14), null, null, 0, new RowDelegate.Model.c.a(new TagViewData(null, new TextLocalisedClause(R$string.wealth_invest_home_portfolio_cfds_header_tag_pending, null, new Custom(Integer.valueOf(R$attr.uikit_colorOrange), false, null, false, null, 254), 10), R$attr.uikit_colorOrange_10, null, R$attr.uikit_colorTransparent, null, 1000), null, false, 6), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 532675544));
            yp0.b.k(listC3, 0, 0, 0, 0, 31);
            return listC3;
        }
        if (!(mVar instanceof b0)) {
            return f0.f322471a;
        }
        WealthAccount.TaxAdvantageWealthAccount account3 = ((b0) mVar).f;
        rjh.b bVar = (rjh.b) this.e;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(account3, "account");
        Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
        List listC4 = u.c(new RowDelegate.Model(j6.a.q("PRODUCT_WIDGET_PENDING_", jjh.b.c(account3)), new RowDelegate.Model.MainImage.Image40(bVar.a(account3), null, null, false, null, false, 62), bVar.b(account3, tradingLegalEntityInformation), null, 0, new TextLocalisedClause(R$string.wealth_invest_home_portfolio_isa_header_description_pending, null, null, 14), null, null, 0, new RowDelegate.Model.c.a(new TagViewData(null, new TextLocalisedClause(R$string.wealth_invest_home_portfolio_isa_header_tag_pending, null, new Custom(Integer.valueOf(R$attr.uikit_colorOrange), false, null, false, null, 254), 10), R$attr.uikit_colorOrange_10, null, R$attr.uikit_colorTransparent, null, 1000), null, false, 6), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848));
        yp0.b.k(listC4, 0, 0, 0, 0, 31);
        return listC4;
    }
}
