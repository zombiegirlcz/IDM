package u6h;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.ActionsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsInputDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.NewsDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.credit.loan.impl.ui.rev10.welcome.LoanWelcomeController;
import com.revolut.feature.credit.overdraft.impl.ui.details.OverdraftDetailsScreen;
import com.revolut.feature.global_markets.impl.ui.screen.index_overview.IndexOverviewScreen;
import com.revolut.feature.pix.impl.flow.automatico.screens.details.PixAutomaticoPaymentDetailsScreen;
import com.revolut.feature.wealth.gia.margin_trading.impl.R$string;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.asset_details.CryptoAssetDetailsScreen;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import mx0.v5;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f277598a;

    public /* synthetic */ h(int i) {
        this.f277598a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f277598a) {
            case 0:
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_trading_margin_details_portfolio_value_title, null, null, 14);
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_trading_margin_details_portfolio_value_subtitle, null, null, 14);
                pa paVar = pa.LIGHT;
                PlainTextDelegate.Model model = new PlainTextDelegate.Model("PORTFOLIO_VALUE_ITEM", (Clause) textLocalisedClause, (Clause) textLocalisedClause2, (v5) null, (UrlImage) null, false, paVar, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65002);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                PlainTextDelegate.Model model2 = new PlainTextDelegate.Model("YOUR_EQUITY_ITEM", (Clause) new TextLocalisedClause(R$string.wealth_trading_margin_details_equity_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.wealth_trading_margin_details_equity_subtitle, null, null, 14), (v5) null, (UrlImage) null, false, paVar, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65002);
                yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                PlainTextDelegate.Model model3 = new PlainTextDelegate.Model("MARGIN_CALL_ITEM", (Clause) new TextLocalisedClause(R$string.wealth_trading_margin_details_margin_call_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.wealth_trading_margin_details_margin_call_subtitle, null, null, 14), (v5) null, (UrlImage) null, false, paVar, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65002);
                yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
                PlainTextDelegate.Model model4 = new PlainTextDelegate.Model("REQ_MINIMUM_ITEM", (Clause) new TextLocalisedClause(R$string.wealth_trading_margin_details_req_minimum_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.wealth_trading_margin_details_req_minimum_subtitle, null, null, 14), (v5) null, (UrlImage) null, false, paVar, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65002);
                yp0.b.l(model4, 0, 0, 0, 0, null, false, 63);
                return v.k(model, model2, model3, model4);
            case 1:
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.wealth_trading_margin_required_minimum_table_market_value, null, null, 14);
                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.wealth_trading_margin_required_minimum_explanation_description_market_value, null, null, 14);
                pa paVar2 = pa.LIGHT;
                PlainTextDelegate.Model model5 = new PlainTextDelegate.Model("MARKET_VALUE", (Clause) textLocalisedClause3, (Clause) textLocalisedClause4, (v5) null, (UrlImage) null, false, paVar2, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65002);
                yp0.b.l(model5, 0, 0, 0, 0, null, false, 63);
                PlainTextDelegate.Model model6 = new PlainTextDelegate.Model("MARGINABLE_STATUS", (Clause) new TextLocalisedClause(R$string.wealth_trading_margin_required_minimum_explanation_title_marginable, null, null, 14), (Clause) new TextLocalisedClause(R$string.wealth_trading_margin_required_minimum_explanation_description_marginable, null, null, 14), (v5) null, (UrlImage) null, false, paVar2, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65002);
                yp0.b.l(model6, 0, 0, 0, 0, null, false, 63);
                PlainTextDelegate.Model model7 = new PlainTextDelegate.Model("MAINTENANCE_REQ", (Clause) new TextLocalisedClause(R$string.wealth_trading_margin_required_minimum_explanation_title_maintenance, null, null, 14), (Clause) new TextLocalisedClause(R$string.wealth_trading_margin_required_minimum_explanation_description_maintenance, null, null, 14), (v5) null, (UrlImage) null, false, paVar2, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65002);
                yp0.b.l(model7, 0, 0, 0, 0, null, false, 63);
                PlainTextDelegate.Model model8 = new PlainTextDelegate.Model("REQ_MINIMUM_ITEM", (Clause) new TextLocalisedClause(R$string.wealth_trading_margin_required_minimum_table_req_minimum, null, null, 14), (Clause) new TextLocalisedClause(R$string.wealth_trading_margin_required_minimum_explanation_description_req_minimum, null, null, 14), (v5) null, (UrlImage) null, false, paVar2, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65002);
                yp0.b.l(model8, 0, 0, 0, 0, null, false, 63);
                return v.k(model5, model6, model7, model8);
            case 2:
                return new qlm.e(u7g.a.f277748a);
            case 3:
                return new ArrayList();
            case 4:
                return new PromptMarketingContentDelegate();
            case 5:
                KProperty[] kPropertyArr = LoanWelcomeController.U;
                return new TextDelegate();
            case 6:
                KProperty[] kPropertyArr2 = LoanWelcomeController.U;
                return new LargeActionButtonDelegate();
            case 7:
                KProperty[] kPropertyArr3 = LoanWelcomeController.U;
                return new FullScreenStateDelegate();
            case 8:
                return new CellDetailsSwitcherDelegate();
            case 9:
                KProperty[] kPropertyArr4 = IndexOverviewScreen.f74610a0;
                return new RowDelegate(null, null, 7);
            case 10:
                int i = CryptoAssetDetailsScreen.f99949w0;
                return new LargeActionButtonDelegate();
            case 11:
                int i2 = CryptoAssetDetailsScreen.f99949w0;
                return new RowDelegate(null, null, 7);
            case 12:
                int i3 = CryptoAssetDetailsScreen.f99949w0;
                return new LargeActionButtonDelegate();
            case 13:
                int i5 = CryptoAssetDetailsScreen.f99949w0;
                return new NewsDelegate();
            case 14:
                int i6 = CryptoAssetDetailsScreen.f99949w0;
                return new FullScreenStateDelegate();
            case 15:
                KProperty[] kPropertyArr5 = OverdraftDetailsScreen.W;
                return new FullScreenStateDelegate();
            case 16:
                KProperty[] kPropertyArr6 = OverdraftDetailsScreen.W;
                return new AccountCellItemDelegate();
            case 17:
                KProperty[] kPropertyArr7 = OverdraftDetailsScreen.W;
                return new RowDelegate(null, null, 7);
            case 18:
                KProperty[] kPropertyArr8 = OverdraftDetailsScreen.W;
                return new CellDetailsDelegate();
            case 19:
                KProperty[] kPropertyArr9 = OverdraftDetailsScreen.W;
                return new ListSubheaderDelegate();
            case 20:
                KProperty[] kPropertyArr10 = OverdraftDetailsScreen.W;
                return new RowDelegate(null, null, 7);
            case 21:
                KProperty[] kPropertyArr11 = PixAutomaticoPaymentDetailsScreen.f80610a0;
                return new CellDetailsInputDelegate(null);
            case 22:
                KProperty[] kPropertyArr12 = PixAutomaticoPaymentDetailsScreen.f80610a0;
                return new CellDetailsActionDelegate();
            case 23:
                KProperty[] kPropertyArr13 = PixAutomaticoPaymentDetailsScreen.f80610a0;
                return new CellDetailsChevronDelegate();
            case 24:
                KProperty[] kPropertyArr14 = PixAutomaticoPaymentDetailsScreen.f80610a0;
                return new CellDetailsNoteDelegate();
            case 25:
                KProperty[] kPropertyArr15 = PixAutomaticoPaymentDetailsScreen.f80610a0;
                return new CellDetailsSwitcherDelegate();
            case 26:
                KProperty[] kPropertyArr16 = PixAutomaticoPaymentDetailsScreen.f80610a0;
                return new LargeActionButtonDelegate();
            case 27:
                KProperty[] kPropertyArr17 = PixAutomaticoPaymentDetailsScreen.f80610a0;
                return new ActionsLoadingDelegate();
            case 28:
                KProperty[] kPropertyArr18 = PixAutomaticoPaymentDetailsScreen.f80610a0;
                return new FullScreenStateDelegate();
            default:
                KProperty[] kPropertyArr19 = PixAutomaticoPaymentDetailsScreen.f80610a0;
                return new RowDelegate(null, null, 7);
        }
    }
}
