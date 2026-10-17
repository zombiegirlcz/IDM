package q50;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.iris.impl.ui.settings.deregister.DeregisterDialogController;
import com.revolut.feature.apm.multibanco.impl.via_verde.ui.list.EnrollmentListScreen;
import com.revolut.feature.card_screen.impl.nameless_card.NamelessCardDialogScreen;
import com.revolut.feature.cash_topup.impl.ui.amount.CashTopUpAmountScreen;
import com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.confirmnewday.LoanConfirmNewRepaymentDayScreen;
import com.revolut.feature.credit.loan.impl.ui.rev10.selectautopay.LoanSelectAutopayScreen;
import com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary.DeFiSendAddBeneficiaryScreen;
import com.revolut.feature.globalsearch.api.R$string;
import com.revolut.feature.onboarding.impl.onboarding.country.screen.CountryResidenceScreen;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.amount.PixQrCodeTransactionAmountScreen;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.transactions.CobrandedCardsPlanHubTransactionsScreen;
import com.revolut.retail.feature.crypto.newlyadded.impl.ui.controller.NewlyAddedCryptoController;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class w implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f242285a;

    public /* synthetic */ w(int i) {
        this.f242285a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f242285a) {
            case 0:
                return new qlm.e(c0.f242207a);
            case 1:
                return new qlm.e(i0.f242232a);
            case 2:
                return new qlm.e(f0.f242224a);
            case 3:
                KProperty[] kPropertyArr = DeFiSendAddBeneficiaryScreen.R;
                return new InputTextDelegate(null);
            case 4:
                int i = DeregisterDialogController.U;
                return new LargeActionButtonDelegate();
            case 5:
                KProperty[] kPropertyArr2 = LoanConfirmNewRepaymentDayScreen.f70398d0;
                return new LargeActionButtonDelegate();
            case 6:
                KProperty[] kPropertyArr3 = LoanConfirmNewRepaymentDayScreen.f70398d0;
                return new FullScreenStateDelegate();
            case 7:
                KProperty[] kPropertyArr4 = LoanConfirmNewRepaymentDayScreen.f70398d0;
                return new CellDetailsDelegate();
            case 8:
                KProperty[] kPropertyArr5 = CobrandedCardsPlanHubTransactionsScreen.S;
                return new RowDelegate(null, null, 7);
            case 9:
                KProperty[] kPropertyArr6 = CobrandedCardsPlanHubTransactionsScreen.S;
                return new InputDisclosureDelegate();
            case 10:
                KProperty[] kPropertyArr7 = CobrandedCardsPlanHubTransactionsScreen.S;
                return new FullScreenStateDelegate();
            case 11:
                int i2 = NamelessCardDialogScreen.V;
                return new RowDelegate(null, null, 7);
            case 12:
                KProperty[] kPropertyArr8 = LoanSelectAutopayScreen.f70582e0;
                return new RowDelegate(null, null, 7);
            case 13:
                KProperty[] kPropertyArr9 = LoanSelectAutopayScreen.f70582e0;
                return new CellDetailsSwitcherDelegate();
            case 14:
                KProperty[] kPropertyArr10 = LoanSelectAutopayScreen.f70582e0;
                return new CellDetailsActionDelegate();
            case 15:
                KProperty[] kPropertyArr11 = LoanSelectAutopayScreen.f70582e0;
                return new FullScreenStateDelegate();
            case 16:
                KProperty[] kPropertyArr12 = EnrollmentListScreen.S;
                return new RowDelegate(null, null, 7);
            case 17:
                KProperty[] kPropertyArr13 = EnrollmentListScreen.S;
                return new FullScreenStateDelegate();
            case 18:
                return new TextLocalisedClause(R$string.referrals_product_search_no_reward_campaign_subtitle, null, null, 14);
            case 19:
                return new PromptContentDelegate();
            case 20:
                KProperty[] kPropertyArr14 = CountryResidenceScreen.W;
                return new InputTextDelegate(null);
            case 21:
                KProperty[] kPropertyArr15 = CountryResidenceScreen.W;
                return new ListCellDelegate();
            case 22:
                KProperty[] kPropertyArr16 = CountryResidenceScreen.W;
                return new TextDelegate();
            case 23:
                KProperty[] kPropertyArr17 = CountryResidenceScreen.W;
                return new InputChecklistDelegate();
            case 24:
                KProperty[] kPropertyArr18 = NewlyAddedCryptoController.S;
                return new RowDelegate(null, null, 7);
            case 25:
                KProperty[] kPropertyArr19 = NewlyAddedCryptoController.S;
                return new FullScreenStateDelegate();
            case 26:
                KProperty[] kPropertyArr20 = CashTopUpAmountScreen.f0;
                return new LargeActionButtonDelegate();
            case 27:
                KProperty[] kPropertyArr21 = PixQrCodeTransactionAmountScreen.W;
                return new LargeActionButtonDelegate();
            case 28:
                KProperty[] kPropertyArr22 = PixQrCodeTransactionAmountScreen.W;
                return new TextDelegate();
            default:
                KProperty[] kPropertyArr23 = PixQrCodeTransactionAmountScreen.W;
                return new InputTextDelegate(null);
        }
    }
}
