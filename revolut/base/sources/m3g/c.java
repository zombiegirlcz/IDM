package m3g;

import com.revolut.core.error.data.model.ServerErrorException;
import com.revolut.core.ui_kit.delegates.CellDetailsAccountDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListingCardLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.card_screen.impl.kompot.cards_carousel.auto_renewal_dialog.AutoRenewalDialogScreen;
import com.revolut.feature.credit.loan.impl.ui.rev10.refinancedcreditlistv2.LoanRefinancedCreditListV2Controller;
import com.revolut.feature.defi.remittances.impl.ui.defi_to_cefi.transfer_assets.DeFiTransferAssetsScreen;
import com.revolut.feature.junior.accounts.impl.R$string;
import com.revolut.feature.pix.impl.flow.authorisation_request.screens.reject.PixAuthorisationRejectReasonScreen;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.additional_information.PixQrCodeAdditionalInformationScreen;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.modal.reward_info.CobrandedCardsPlanHubRewardInfoScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.search_results.TravelExperiencesSearchResultsScreen;
import com.revolut.feature_retail_user_declarations.gender.GenderScreen;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.search_list.SearchListScreen;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.holding.CryptoHoldingScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f202532a;

    public /* synthetic */ c(int i) {
        this.f202532a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f202532a) {
            case 0:
                KProperty[] kPropertyArr = TravelExperiencesSearchResultsScreen.i0;
                return new ListingCardLoadingDelegate();
            case 1:
                KProperty[] kPropertyArr2 = TravelExperiencesSearchResultsScreen.i0;
                return new FullScreenStateDelegate();
            case 2:
                KProperty[] kPropertyArr3 = SearchListScreen.S;
                return new RowDelegate(null, null, 7);
            case 3:
                KProperty[] kPropertyArr4 = SearchListScreen.S;
                return new FullScreenStateDelegate();
            case 4:
                KProperty[] kPropertyArr5 = DeFiTransferAssetsScreen.R;
                return new FullScreenStateDelegate();
            case 5:
                int i = AutoRenewalDialogScreen.V;
                return new RowDelegate(null, null, 7);
            case 6:
                KProperty[] kPropertyArr6 = LoanRefinancedCreditListV2Controller.U;
                return new LargeActionButtonDelegate();
            case 7:
                KProperty[] kPropertyArr7 = LoanRefinancedCreditListV2Controller.U;
                return new CellDetailsDelegate();
            case 8:
                KProperty[] kPropertyArr8 = LoanRefinancedCreditListV2Controller.U;
                return new RowDelegate(null, null, 7);
            case 9:
                KProperty[] kPropertyArr9 = LoanRefinancedCreditListV2Controller.U;
                return new FullScreenStateDelegate();
            case 10:
                KProperty[] kPropertyArr10 = CobrandedCardsPlanHubRewardInfoScreen.R;
                return new RowDelegate(null, null, 7);
            case 11:
                return new PromptMarketingContentDelegate();
            case 12:
                return new TextLocalisedClause(R$string.junior_widgets_automations_title, null, null, 14);
            case 13:
                KProperty[] kPropertyArr11 = PixAuthorisationRejectReasonScreen.Q;
                return new SelectableDelegate(new RowDelegate(null, null, 7));
            case 14:
                KProperty[] kPropertyArr12 = CryptoHoldingScreen.V;
                return new LargeActionButtonDelegate();
            case 15:
                return new PromptMarketingContentDelegate();
            case 16:
                return new PromptMarketingContentDelegate();
            case 17:
                KProperty[] kPropertyArr13 = PixQrCodeAdditionalInformationScreen.R;
                return new CellDetailsAccountDelegate();
            case 18:
                KProperty[] kPropertyArr14 = GenderScreen.U;
                return new RowDelegate(null, null, 7);
            case 19:
                return Unit.f186387a;
            case 20:
                return Unit.f186387a;
            case 21:
                return Unit.f186387a;
            case 22:
                return Unit.f186387a;
            case 23:
                return Unit.f186387a;
            case 24:
                return new PromptContentDelegate();
            case 25:
                return new FullScreenStateDelegate();
            case 26:
                return new PromptMarketingContentDelegate();
            case 27:
                return new PromptMarketingContentLoadingDelegate();
            case 28:
                return new qlm.e(meh.d.f204678a);
            default:
                ServerErrorException.Companion aVar = ServerErrorException.INSTANCE;
                return new kg.o();
        }
    }
}
