package y4f;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.birth_place.screen.city.BirthCityScreen;
import com.revolut.feature.credit.loan.impl.ui.forbearance_overdue.ForbearanceOverdueActivity;
import com.revolut.feature.credit.loan.impl.ui.rev10.instalmentdetails.LoanInstalmentDetailsScreen;
import com.revolut.feature.defi.trade.impl.ui.asset_picker.DeFiAssetPickerScreen;
import com.revolut.feature.payments_migration.impl.models.providers.ProviderBlock;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.billing.CobrandedCardsBillingScreen;
import com.revolut.feature.trading.impl.ui.holdings.information.entry.HoldingsInformationEntryController;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.PaymentLinksAmountScreen;
import com.revolut.tracking.v3.RatesSourceContext;
import grl.g0;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import t7g.s;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f310904a;

    public /* synthetic */ c(int i) {
        this.f310904a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 7;
        switch (this.f310904a) {
            case 0:
                KProperty[] kPropertyArr = HoldingsInformationEntryController.W;
                return new CellDetailsActionDelegate();
            case 1:
                KProperty[] kPropertyArr2 = HoldingsInformationEntryController.W;
                return new CellDetailsLoadingDelegate();
            case 2:
                KProperty[] kPropertyArr3 = HoldingsInformationEntryController.W;
                return new ListSubheaderDelegate();
            case 3:
                KProperty[] kPropertyArr4 = HoldingsInformationEntryController.W;
                return new ListSubheaderLoadingDelegate();
            case 4:
                KProperty[] kPropertyArr5 = HoldingsInformationEntryController.W;
                return new FullScreenStateDelegate();
            case 5:
                KProperty[] kPropertyArr6 = BirthCityScreen.f67177b0;
                return new InputTextDelegate(null);
            case 6:
                int i2 = ForbearanceOverdueActivity.u0;
                return new z4l.j(i, v.k(new CellDetailsDelegate(), new ListSubheaderDelegate()), false);
            case 7:
                return new qlm.e(ProviderBlock.INSTANCE.serializer());
            case 8:
                KProperty[] kPropertyArr7 = LoanInstalmentDetailsScreen.W;
                return new PlainTextWarningDelegate();
            case 9:
                KProperty[] kPropertyArr8 = LoanInstalmentDetailsScreen.W;
                return new CellDetailsDelegate();
            case 10:
                KProperty[] kPropertyArr9 = LoanInstalmentDetailsScreen.W;
                return new CellDetailsChevronDelegate();
            case 11:
                KProperty[] kPropertyArr10 = LoanInstalmentDetailsScreen.W;
                return new FullScreenStateDelegate();
            case 12:
                KProperty[] kPropertyArr11 = LoanInstalmentDetailsScreen.W;
                return new ProgressStepVerticalV2Delegate();
            case 13:
                KProperty[] kPropertyArr12 = LoanInstalmentDetailsScreen.W;
                return new SmallActionButtonDelegate();
            case 14:
                DeFiAssetPickerScreen.a aVar = DeFiAssetPickerScreen.Companion;
                return new RowDelegate(null, null, 7);
            case 15:
                DeFiAssetPickerScreen.a aVar2 = DeFiAssetPickerScreen.Companion;
                return new FullScreenStateDelegate();
            case 16:
                KProperty[] kPropertyArr13 = CobrandedCardsBillingScreen.S;
                return new FullScreenStateDelegate();
            case 17:
                KProperty[] kPropertyArr14 = CobrandedCardsBillingScreen.S;
                return new InputDisclosureDelegate();
            case 18:
                KProperty[] kPropertyArr15 = CobrandedCardsBillingScreen.S;
                return new TextDelegate();
            case 19:
                AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
                RatesSourceContext.a aVarNewBuilder = RatesSourceContext.newBuilder();
                aVarNewBuilder.h(g0.COMMODITY);
                w0 w0VarA = aVarNewBuilder.a();
                companion.getClass();
                return new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
            case 20:
                return new qlm.e(y7g.a.f311511a);
            case 21:
                return new qlm.e(v7g.d.f286637a);
            case 22:
                return new qlm.e(w7g.a.f295522a);
            case 23:
                return new qlm.e(s.f268692a);
            case 24:
                KProperty[] kPropertyArr16 = PaymentLinksAmountScreen.f0;
                return new HighlightTileDelegate();
            case 25:
                KProperty[] kPropertyArr17 = PaymentLinksAmountScreen.f0;
                return new TextDelegate();
            case 26:
                KProperty[] kPropertyArr18 = PaymentLinksAmountScreen.f0;
                return new LargeActionButtonDelegate();
            case 27:
                KProperty[] kPropertyArr19 = PaymentLinksAmountScreen.f0;
                return new CellDetailsDelegate();
            case 28:
                KProperty[] kPropertyArr20 = PaymentLinksAmountScreen.f0;
                return new CellDetailsActionDelegate();
            default:
                KProperty[] kPropertyArr21 = PaymentLinksAmountScreen.f0;
                return new CellDetailsNoteDelegate();
        }
    }
}
