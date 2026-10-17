package b8g;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.apm.upi.impl.flow.screen.amount.UpiTransferAmountScreen;
import com.revolut.feature.apm.wero.impl.ui.home.settings.WeroSettingsScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.PayBillsAndTaxesScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui_catalogue.screen.search.BillsSearchScreen;
import com.revolut.feature.pix.impl.flow.pix_area.screens.send.PixSendScreen;
import com.revolut.feature.pix.impl.flow.qr_request.screen.add_description.PixQrRequestAddDescriptionScreen;
import com.revolut.feature.shared_separate_favourites.common.screen.asset_type_chooser.SharedFavouritesAssetTypeChooserScreen;
import com.revolut.feature_retail_user_declarations.bank_terms.AcceptBankTermsScreen;
import com.revolut.retail.feature.pending_payments.impl.ui.confirmation.PendingPaymentConfirmationScreen;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import qlm.j1;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13259a;

    public /* synthetic */ a(int i) {
        this.f13259a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f13259a) {
            case 0:
                return j1.b("com.revolut.feature.travel.flights.models.dto.support.ChatContactReasonDto", c.values());
            case 1:
                return c.Companion.serializer();
            case 2:
                AcceptBankTermsScreen.a aVar = AcceptBankTermsScreen.Companion;
                return new RowDelegate(null, null, 7);
            case 3:
                AcceptBankTermsScreen.a aVar2 = AcceptBankTermsScreen.Companion;
                return new FullScreenStateDelegate();
            case 4:
                AcceptBankTermsScreen.a aVar3 = AcceptBankTermsScreen.Companion;
                return new ListSubheaderDelegate();
            case 5:
                AcceptBankTermsScreen.a aVar4 = AcceptBankTermsScreen.Companion;
                return new ListCellDelegate();
            case 6:
                AcceptBankTermsScreen.a aVar5 = AcceptBankTermsScreen.Companion;
                return new TextDelegate();
            case 7:
                PixSendScreen.a aVar6 = PixSendScreen.Companion;
                return new RowDelegate(null, null, 7);
            case 8:
                PixSendScreen.a aVar7 = PixSendScreen.Companion;
                return new FullScreenStateDelegate();
            case 9:
                PixSendScreen.a aVar8 = PixSendScreen.Companion;
                return new CellDetailsDelegate();
            case 10:
                KProperty[] kPropertyArr = PendingPaymentConfirmationScreen.W;
                return new FullScreenStateDelegate();
            case 11:
                KProperty[] kPropertyArr2 = PendingPaymentConfirmationScreen.W;
                return new RowDelegate(null, null, 7);
            case 12:
                KProperty[] kPropertyArr3 = PendingPaymentConfirmationScreen.W;
                return new CellDetailsDelegate();
            case 13:
                KProperty[] kPropertyArr4 = PendingPaymentConfirmationScreen.W;
                return new CellDetailsActionDelegate();
            case 14:
                KProperty[] kPropertyArr5 = PixQrRequestAddDescriptionScreen.S;
                return new InputTextDelegate(null);
            case 15:
                KProperty[] kPropertyArr6 = PixQrRequestAddDescriptionScreen.S;
                return new LargeActionButtonDelegate();
            case 16:
                return new go.g(f0.f322471a, 2);
            case 17:
                KProperty[] kPropertyArr7 = UpiTransferAmountScreen.X;
                return new LargeActionButtonDelegate();
            case 18:
                KProperty[] kPropertyArr8 = UpiTransferAmountScreen.X;
                return new TextDelegate();
            case 19:
                KProperty[] kPropertyArr9 = UpiTransferAmountScreen.X;
                return new InputTextDelegate(null);
            case 20:
                KProperty[] kPropertyArr10 = UpiTransferAmountScreen.X;
                return new RowLoadingDelegate();
            case 21:
                KProperty[] kPropertyArr11 = PayBillsAndTaxesScreen.T;
                return new RowDelegate(null, null, 7);
            case 22:
                KProperty[] kPropertyArr12 = PayBillsAndTaxesScreen.T;
                return new ListSubheaderDelegate();
            case 23:
                KProperty[] kPropertyArr13 = PayBillsAndTaxesScreen.T;
                return new LargeActionButtonDelegate();
            case 24:
                KProperty[] kPropertyArr14 = SharedFavouritesAssetTypeChooserScreen.R;
                return new RowDelegate(null, null, 7);
            case 25:
                BillsSearchScreen.a aVar9 = BillsSearchScreen.Companion;
                return new ListSubheaderDelegate();
            case 26:
                BillsSearchScreen.a aVar10 = BillsSearchScreen.Companion;
                return new LargeActionButtonDelegate();
            case 27:
                BillsSearchScreen.a aVar11 = BillsSearchScreen.Companion;
                return new RowDelegate(null, null, 7);
            case 28:
                BillsSearchScreen.a aVar12 = BillsSearchScreen.Companion;
                return new FullScreenStateDelegate();
            default:
                KProperty[] kPropertyArr15 = WeroSettingsScreen.S;
                return new RowDelegate(null, null, 7);
        }
    }
}
