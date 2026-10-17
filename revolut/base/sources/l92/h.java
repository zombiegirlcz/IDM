package l92;

import com.revolut.core.backend_flow.photo.ui.screen.card_photo.CardPhotoScreen;
import com.revolut.core.ui_kit.delegates.BackgroundSelectionButtonDelegate;
import com.revolut.core.ui_kit.delegates.BackgroundSelectionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.MultiTargetFanChartDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalDelegate;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.apm.multibanco.impl.via_verde.ui.home.ViaVerdeHomeScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.loan_selection.select_loan.SelectLoanController;
import com.revolut.feature.credit.application.plugins.impl.ui.photo_upload.summary.PhotosUploadSummaryController;
import com.revolut.feature.crypto.features.impl.ui.features.CryptoFeaturesController;
import com.revolut.feature.direct_deposit.impl.ui_kompot.screen.type_selection.DirectDepositTypeSelectionSheet;
import com.revolut.feature.subscriptions.impl.list.CardSubscriptionListScreen;
import com.revolut.retail.feature.cryptocommoditydetails.impl.ui.price_targets.details.screens.details.PriceTargetsDetailsScreen;
import com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.review.PeerToPeerReviewScreen;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class h implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193030a;

    public /* synthetic */ h(int i) {
        this.f193030a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f193030a) {
            case 0:
                KProperty[] kPropertyArr = ViaVerdeHomeScreen.U;
                return new RowDelegate(null, null, 7);
            case 1:
                KProperty[] kPropertyArr2 = ViaVerdeHomeScreen.U;
                return new LargeActionButtonDelegate();
            case 2:
                int i = DirectDepositTypeSelectionSheet.U;
                return new SingleChoiceDelegate();
            case 3:
                KProperty[] kPropertyArr3 = PeerToPeerReviewScreen.f102358h0;
                return new CellDetailsDelegate();
            case 4:
                KProperty[] kPropertyArr4 = PeerToPeerReviewScreen.f102358h0;
                return new CellDetailsActionDelegate();
            case 5:
                KProperty[] kPropertyArr5 = PeerToPeerReviewScreen.f102358h0;
                return new CellDetailsNoteDelegate();
            case 6:
                KProperty[] kPropertyArr6 = PeerToPeerReviewScreen.f102358h0;
                return new CellDetailsSwitcherDelegate();
            case 7:
                KProperty[] kPropertyArr7 = PeerToPeerReviewScreen.f102358h0;
                return new RowDelegate(null, null, 7);
            case 8:
                KProperty[] kPropertyArr8 = PeerToPeerReviewScreen.f102358h0;
                return new HighlightTileDelegate();
            case 9:
                KProperty[] kPropertyArr9 = PeerToPeerReviewScreen.f102358h0;
                return new CellDetailsDelegate();
            case 10:
                KProperty[] kPropertyArr10 = PeerToPeerReviewScreen.f102358h0;
                return new CellDetailsActionDelegate();
            case 11:
                KProperty[] kPropertyArr11 = PeerToPeerReviewScreen.f102358h0;
                return new CellDetailsNoteDelegate();
            case 12:
                KProperty[] kPropertyArr12 = PeerToPeerReviewScreen.f102358h0;
                return new LargeActionButtonDelegate();
            case 13:
                KProperty[] kPropertyArr13 = PeerToPeerReviewScreen.f102358h0;
                return new RowDelegate(null, null, 7);
            case 14:
                KProperty[] kPropertyArr14 = PeerToPeerReviewScreen.f102358h0;
                return new HighlightTileDelegate();
            case 15:
                KProperty[] kPropertyArr15 = PeerToPeerReviewScreen.f102358h0;
                return new TextDelegate();
            case 16:
                KProperty[] kPropertyArr16 = PeerToPeerReviewScreen.f102358h0;
                return new SuggestionsBarDelegate();
            case 17:
                KProperty[] kPropertyArr17 = PeerToPeerReviewScreen.f102358h0;
                return new CounterTextDelegate();
            case 18:
                KProperty[] kPropertyArr18 = CardSubscriptionListScreen.R;
                return new RowDelegate(null, null, 7);
            case 19:
                CardPhotoScreen.Companion aVar = CardPhotoScreen.INSTANCE;
                return new nam.b((Function1) null, (Function1) null, (fbm.d) null, (Function1) null, new lbh.a(3), (Function1) null, (Function1) null, new lbh.a(2), (Function1) null, 751);
            case 20:
                return new PromptContentDelegate();
            case 21:
                KProperty[] kPropertyArr19 = SelectLoanController.T;
                return new RowDelegate(null, null, 7);
            case 22:
                KProperty[] kPropertyArr20 = SelectLoanController.T;
                return new FullScreenStateDelegate();
            case 23:
                return new qlm.e(ld7.g.f194044a);
            case 24:
                KProperty[] kPropertyArr21 = PriceTargetsDetailsScreen.f100155b0;
                return new MultiTargetFanChartDelegate();
            case 25:
                KProperty[] kPropertyArr22 = PriceTargetsDetailsScreen.f100155b0;
                return new ProgressStepVerticalDelegate();
            case 26:
                KProperty[] kPropertyArr23 = PriceTargetsDetailsScreen.f100155b0;
                return new ListSubheaderDelegate();
            case 27:
                KProperty[] kPropertyArr24 = PhotosUploadSummaryController.T;
                return new BackgroundSelectionDelegate();
            case 28:
                KProperty[] kPropertyArr25 = PhotosUploadSummaryController.T;
                return new BackgroundSelectionButtonDelegate();
            default:
                KProperty[] kPropertyArr26 = CryptoFeaturesController.R;
                return new RowDelegate(null, null, 7);
        }
    }
}
