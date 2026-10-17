package e18;

import androidx.compose.runtime.retain.ForgetfulRetainedValuesStore;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.os.compose.LocalSavedStateRegistryOwnerKt;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CodeEditorDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.hub.DebtsV2HubController;
import com.revolut.feature.credit.loan.impl.ui.rev10.payment_settings.hub.LoanPaymentSettingsHubController;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_type.CobrandedCardsTypeSelectionScreen;
import com.revolut.feature.subscriptions.impl.history.SubscriptionHistoryActivity;
import com.revolut.feature_exchange.impl.ui.takeprofit_stoploss.amount_picker.TPSLAmountController;
import com.revolut.feature_retail_user_declarations.email_verification.otp_bottomsheet.EmailVerificationOtpBottomSheet;
import com.revolut.retail.feature.balance.picker.impl.new_picker.currency.CurrencyChooserScreen;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.BankTransferAmountScreen;
import ip0.pb0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121917a;

    public /* synthetic */ i(int i) {
        this.f121917a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f121917a) {
            case 0:
                return h.Companion.serializer();
            case 1:
                return ForgetfulRetainedValuesStore.INSTANCE;
            case 2:
                KProperty[] kPropertyArr = CurrencyChooserScreen.T;
                return new AccountCellItemDelegate();
            case 3:
                KProperty[] kPropertyArr2 = CurrencyChooserScreen.T;
                return new FullScreenStateDelegate();
            case 4:
                return new PromptMarketingContentDelegate();
            case 5:
                TPSLAmountController.Companion aVar = TPSLAmountController.INSTANCE;
                return new RowDelegate(null, null, 7);
            case 6:
                TPSLAmountController.Companion aVar2 = TPSLAmountController.INSTANCE;
                return new InputTextDelegate(null);
            case 7:
                TPSLAmountController.Companion aVar3 = TPSLAmountController.INSTANCE;
                return new LargeActionButtonDelegate();
            case 8:
                return LocalViewModelStoreOwner.LocalViewModelStoreOwner$lambda$0();
            case 9:
                KProperty[] kPropertyArr3 = BankTransferAmountScreen.f102060r0;
                return new FixedTabsDelegate();
            case 10:
                KProperty[] kPropertyArr4 = BankTransferAmountScreen.f102060r0;
                return new LargeActionButtonDelegate();
            case 11:
                KProperty[] kPropertyArr5 = BankTransferAmountScreen.f102060r0;
                return new CellDetailsDelegate();
            case 12:
                KProperty[] kPropertyArr6 = BankTransferAmountScreen.f102060r0;
                return new CellDetailsActionDelegate();
            case 13:
                KProperty[] kPropertyArr7 = BankTransferAmountScreen.f102060r0;
                return new CellDetailsNoteDelegate();
            case 14:
                KProperty[] kPropertyArr8 = BankTransferAmountScreen.f102060r0;
                return new RowDelegate(null, null, 7);
            case 15:
                KProperty[] kPropertyArr9 = BankTransferAmountScreen.f102060r0;
                return new TextDelegate();
            case 16:
                KProperty[] kPropertyArr10 = BankTransferAmountScreen.f102060r0;
                return new HighlightTileDelegate();
            case 17:
                return Unit.f186387a;
            case 18:
                return LocalSavedStateRegistryOwnerKt.LocalSavedStateRegistryOwner$lambda$3$lambda$2();
            case 19:
                KProperty[] kPropertyArr11 = LoanPaymentSettingsHubController.U;
                return new RowDelegate(null, null, 7);
            case 20:
                KProperty[] kPropertyArr12 = LoanPaymentSettingsHubController.U;
                return new ListSubheaderDelegate();
            case 21:
                KProperty[] kPropertyArr13 = LoanPaymentSettingsHubController.U;
                return new FullScreenStateDelegate();
            case 22:
                KProperty[] kPropertyArr14 = CobrandedCardsTypeSelectionScreen.R;
                return new RowDelegate(null, null, 7);
            case 23:
                DebtsV2HubController.a aVar4 = DebtsV2HubController.Companion;
                return new RowDelegate(null, null, 7);
            case 24:
                int i = SubscriptionHistoryActivity.f89194x0;
                return new RowDelegate(null, null, 7);
            case 25:
                ArrayList arrayList = new ArrayList(3);
                for (int i2 = 0; i2 < 3; i2++) {
                    arrayList.add(new pb0(a0.d.n("BROKER_SELECTION_LOADING_PREFIX_LIST_ID_", i2)));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                return arrayList;
            case 26:
                return new PromptMarketingContentDelegate();
            case 27:
                return j1.b("com.revolut.feature.junior.pending_graduation.api.model.MigrateAssetsPermission.State", eb8.j.values());
            case 28:
                return j1.b("com.revolut.feature.junior.pending_graduation.api.model.MigrateAssetsPermission.PermissionUpdateState", eb8.i.values());
            default:
                int i3 = EmailVerificationOtpBottomSheet.V;
                return new CodeEditorDelegate();
        }
    }
}
