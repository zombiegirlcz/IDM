package mkf;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CenteredContentTileDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardDelegate;
import com.revolut.core.ui_kit.delegates.SplitColumnCellDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.feature.apm.bills.boleto.impl.screen.review.BoletoTransferReviewScreen;
import com.revolut.network.RetailMoveMoneyNetworkConfiguration;
import com.revolut.network.RetailReferralsNetworkConfiguration;
import com.revolut.network.RetailSharedSavingsNetworkConfiguration;
import com.revolut.network.RetailWealthNetworkConfiguration;
import com.revolut.network.auth.RetailRevolutOauthConfiguration;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.business_details.EsimMobilePlanPowerOfAttorneyBusinessDetailsScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.features.PlanCancelFeaturesScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class s implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206269a;

    public /* synthetic */ s(int i) {
        this.f206269a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f206269a) {
            case 0:
                return zhm.f0.f322471a;
            case 1:
                return zhm.f0.f322471a;
            case 2:
                return zhm.f0.f322471a;
            case 3:
                return zhm.f0.f322471a;
            case 4:
                return zhm.f0.f322471a;
            case 5:
                return zhm.f0.f322471a;
            case 6:
                return zhm.f0.f322471a;
            case 7:
                return zhm.f0.f322471a;
            case 8:
                return zhm.f0.f322471a;
            case 9:
                KProperty[] kPropertyArr = EsimMobilePlanPowerOfAttorneyBusinessDetailsScreen.Q;
                return new InputTextDelegate(null);
            case 10:
                KProperty[] kPropertyArr2 = PlanCancelFeaturesScreen.f103507a0;
                return new ListSubheaderDelegate();
            case 11:
                KProperty[] kPropertyArr3 = PlanCancelFeaturesScreen.f103507a0;
                return new SmallCardDelegate(null);
            case 12:
                KProperty[] kPropertyArr4 = PlanCancelFeaturesScreen.f103507a0;
                return new VoucherSmallTileDelegate();
            case 13:
                KProperty[] kPropertyArr5 = PlanCancelFeaturesScreen.f103507a0;
                return new CenteredContentTileDelegate();
            case 14:
                KProperty[] kPropertyArr6 = PlanCancelFeaturesScreen.f103507a0;
                return new RowDelegate(null, null, 7);
            case 15:
                KProperty[] kPropertyArr7 = PlanCancelFeaturesScreen.f103507a0;
                return new SplitColumnCellDelegate();
            case 16:
                return Unit.f186387a;
            case 17:
                KProperty[] kPropertyArr8 = BoletoTransferReviewScreen.Z;
                return new RowDelegate(null, null, 7);
            case 18:
                KProperty[] kPropertyArr9 = BoletoTransferReviewScreen.Z;
                return new CellDetailsDelegate();
            case 19:
                KProperty[] kPropertyArr10 = BoletoTransferReviewScreen.Z;
                return new CellDetailsNoteDelegate();
            case 20:
                KProperty[] kPropertyArr11 = BoletoTransferReviewScreen.Z;
                return new CellDetailsActionDelegate();
            case 21:
                KProperty[] kPropertyArr12 = BoletoTransferReviewScreen.Z;
                return new CounterTextDelegate();
            case 22:
                KProperty[] kPropertyArr13 = BoletoTransferReviewScreen.Z;
                return new ListSubheaderDelegate();
            case 23:
                KProperty[] kPropertyArr14 = BoletoTransferReviewScreen.Z;
                return new LargeActionButtonDelegate();
            case 24:
                KProperty[] kPropertyArr15 = BoletoTransferReviewScreen.Z;
                return new PlainTextWarningDelegate();
            case 25:
                return RetailReferralsNetworkConfiguration.INSTANCE;
            case 26:
                return RetailSharedSavingsNetworkConfiguration.INSTANCE;
            case 27:
                return RetailWealthNetworkConfiguration.INSTANCE;
            case 28:
                return RetailRevolutOauthConfiguration.INSTANCE;
            default:
                return RetailMoveMoneyNetworkConfiguration.INSTANCE;
        }
    }
}
