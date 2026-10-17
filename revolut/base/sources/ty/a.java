package ty;

import androidx.compose.foundation.text.selection.PlatformSelectionBehaviors_androidKt;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import com.revolut.camerakit.revolut.ui.flow.steps.camera.bottom_sheets.ListBottomSheetController;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ErrorDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.direct.debit.account_selection.DirectDebitAccountSelectionScreen;
import com.revolut.feature.credit.loan.impl.ui.rev10.documents.list.LoanDocumentsController;
import com.revolut.feature.defi.exchange.impl.ui.cefi_to_defi.asset_picker.CeFiToDeFiAssetPickerScreen;
import com.revolut.feature.insurance_pet.impl.ui.edit.review.PetEditReviewChangesActivity;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.account_linking.CobrandedCardsAccountLinkingScreen;
import com.revolut.feature.revolut_x_balances.impl.breakdown.RevXOrdersBreakdownScreen;
import com.revolut.feature.selfserve.sot.impl.ui.document.other.SotOtherDocumentFragment;
import com.revolut.feature.selfserve.sow.impl.ui.description.SowDescriptionFragment;
import com.revolut.feature.wealth.assetdetails.ui.impl.R$string;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.country_chooser.PaymentsCountryChooserScreen;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import zhm.r0;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f275437a;

    public /* synthetic */ a(int i) {
        this.f275437a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f275437a) {
            case 0:
                int i = ListBottomSheetController.V;
                return new RowDelegate(null, null, 7);
            case 1:
                int i2 = ListBottomSheetController.V;
                return new LargeActionButtonDelegate();
            case 2:
                KProperty[] kPropertyArr = DirectDebitAccountSelectionScreen.g0;
                return new ListSubheaderDelegate();
            case 3:
                KProperty[] kPropertyArr2 = DirectDebitAccountSelectionScreen.g0;
                return new RowDelegate(null, null, 7);
            case 4:
                KProperty[] kPropertyArr3 = DirectDebitAccountSelectionScreen.g0;
                return new TextDelegate();
            case 5:
                KProperty[] kPropertyArr4 = DirectDebitAccountSelectionScreen.g0;
                return new LargeActionButtonDelegate();
            case 6:
                int i3 = PetEditReviewChangesActivity.B0;
                return new CellDetailsDelegate();
            case 7:
                int i5 = PetEditReviewChangesActivity.B0;
                return new TextDelegate();
            case 8:
                int i6 = PetEditReviewChangesActivity.B0;
                return new LargeActionButtonDelegate();
            case 9:
                int i21 = SotOtherDocumentFragment.g0;
                return new InputTextDelegate(null);
            case 10:
                return pz8.g.Companion.serializer();
            case 11:
                return new qlm.e(tz8.a.f275891a);
            case 12:
                int i22 = SowDescriptionFragment.g0;
                return new InputTextDelegate(null);
            case 13:
                return PlatformSelectionBehaviors_androidKt.LocalTextClassifierCoroutineContext$lambda$0();
            case 14:
                SelectionRegistrarKt.LocalSelectionRegistrar$lambda$0();
                return null;
            case 15:
                return TextSelectionColorsKt.DefaultTextSelectionColors;
            case 16:
                KProperty[] kPropertyArr5 = CeFiToDeFiAssetPickerScreen.R;
                return new RowDelegate(null, null, 7);
            case 17:
                KProperty[] kPropertyArr6 = CeFiToDeFiAssetPickerScreen.R;
                return new FullScreenStateDelegate();
            case 18:
                return new LargeActionButtonDelegate.Model("scheduled_payment_widget_see_all", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(R.string.common_action_see_all, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), false, null, null, null, null, 1000);
            case 19:
                KProperty[] kPropertyArr7 = PaymentsCountryChooserScreen.S;
                return new RowDelegate(null, null, 7);
            case 20:
                KProperty[] kPropertyArr8 = PaymentsCountryChooserScreen.S;
                return new ErrorDelegate();
            case 21:
                KProperty[] kPropertyArr9 = RevXOrdersBreakdownScreen.W;
                return new CellDetailsActionDelegate();
            case 22:
                KProperty[] kPropertyArr10 = RevXOrdersBreakdownScreen.W;
                return new CellDetailsDelegate();
            case 23:
                KProperty[] kPropertyArr11 = RevXOrdersBreakdownScreen.W;
                return new LargeActionButtonDelegate();
            case 24:
                return r0.k(new Pair(yel.a.AAA, "AAA"), new Pair(yel.a.AA_PLUS, "AA+"), new Pair(yel.a.AA, "AA"), new Pair(yel.a.AA_MINUS, "AA-"), new Pair(yel.a.A_PLUS, "A+"), new Pair(yel.a.A, "A"), new Pair(yel.a.A_MINUS, "A-"), new Pair(yel.a.BBB_PLUS, "BBB+"), new Pair(yel.a.BBB, "BBB"), new Pair(yel.a.BBB_MINUS, "BBB-"), new Pair(yel.a.BB_PLUS, "BB+"), new Pair(yel.a.BB, "BB"), new Pair(yel.a.BB_MINUS, "BB-"), new Pair(yel.a.B_PLUS, "B+"), new Pair(yel.a.B, "B"), new Pair(yel.a.B_MINUS, "B-"), new Pair(yel.a.CCC_PLUS, "CCC+"), new Pair(yel.a.CCC, "CCC"), new Pair(yel.a.CCC_MINUS, "CCC-"), new Pair(yel.a.CC, "CC"), new Pair(yel.a.C, "C"), new Pair(yel.a.RD, "RD"), new Pair(yel.a.D, "D"));
            case 25:
                return r0.k(new Pair(yel.a.AAA, Integer.valueOf(R$string.trading_bonds_ratings_credit_quality_screen_rating_fitch_highest_title)), new Pair(yel.a.AA_PLUS, Integer.valueOf(R$string.trading_bonds_ratings_credit_quality_screen_rating_fitch_very_high_title)), new Pair(yel.a.AA, Integer.valueOf(R$string.trading_bonds_ratings_credit_quality_screen_rating_fitch_very_high_title)), new Pair(yel.a.AA_MINUS, Integer.valueOf(R$string.trading_bonds_ratings_credit_quality_screen_rating_fitch_very_high_title)), new Pair(yel.a.A_PLUS, Integer.valueOf(R$string.trading_bonds_ratings_credit_quality_screen_rating_fitch_high_title)), new Pair(yel.a.A, Integer.valueOf(R$string.trading_bonds_ratings_credit_quality_screen_rating_fitch_high_title)), new Pair(yel.a.A_MINUS, Integer.valueOf(R$string.trading_bonds_ratings_credit_quality_screen_rating_fitch_high_title)), new Pair(yel.a.BBB_PLUS, Integer.valueOf(R$string.trading_bonds_ratings_credit_quality_screen_rating_fitch_good_title)), new Pair(yel.a.BBB, Integer.valueOf(R$string.trading_bonds_ratings_credit_quality_screen_rating_fitch_good_title)), new Pair(yel.a.BBB_MINUS, Integer.valueOf(R$string.trading_bonds_ratings_credit_quality_screen_rating_fitch_good_title)), new Pair(yel.a.BB_PLUS, Integer.valueOf(R$string.trading_bonds_ratings_credit_quality_screen_rating_fitch_speculative_title)), new Pair(yel.a.BB, Integer.valueOf(R$string.trading_bonds_ratings_credit_quality_screen_rating_fitch_speculative_title)), new Pair(yel.a.BB_MINUS, Integer.valueOf(R$string.trading_bonds_ratings_credit_quality_screen_rating_fitch_speculative_title)), new Pair(yel.a.B_PLUS, Integer.valueOf(R$string.trading_bonds_ratings_credit_quality_screen_rating_fitch_highly_speculative_title)), new Pair(yel.a.B, Integer.valueOf(R$string.trading_bonds_ratings_credit_quality_screen_rating_fitch_highly_speculative_title)), new Pair(yel.a.B_MINUS, Integer.valueOf(R$string.trading_bonds_ratings_credit_quality_screen_rating_fitch_highly_speculative_title)), new Pair(yel.a.CCC_PLUS, Integer.valueOf(R$string.trading_bonds_ratings_credit_quality_screen_rating_fitch_substantional_risk_title)), new Pair(yel.a.CCC, Integer.valueOf(R$string.trading_bonds_ratings_credit_quality_screen_rating_fitch_substantional_risk_title)), new Pair(yel.a.CCC_MINUS, Integer.valueOf(R$string.trading_bonds_ratings_credit_quality_screen_rating_fitch_substantional_risk_title)), new Pair(yel.a.CC, Integer.valueOf(R$string.trading_bonds_ratings_credit_quality_screen_rating_fitch_very_high_risk_title)), new Pair(yel.a.C, Integer.valueOf(R$string.trading_bonds_ratings_credit_quality_screen_rating_fitch_near_default_title)), new Pair(yel.a.RD, Integer.valueOf(R$string.trading_bonds_ratings_credit_quality_screen_rating_fitch_restricted_default_title)), new Pair(yel.a.D, Integer.valueOf(R$string.trading_bonds_ratings_credit_quality_screen_rating_fitch_default_title)));
            case 26:
                KProperty[] kPropertyArr12 = LoanDocumentsController.R;
                return new RowDelegate(null, null, 7);
            case 27:
                KProperty[] kPropertyArr13 = LoanDocumentsController.R;
                return new FullScreenStateDelegate();
            case 28:
                KProperty[] kPropertyArr14 = CobrandedCardsAccountLinkingScreen.R;
                return new InputTextDelegate(null);
            default:
                KProperty[] kPropertyArr15 = CobrandedCardsAccountLinkingScreen.R;
                return new FullScreenStateDelegate();
        }
    }
}
