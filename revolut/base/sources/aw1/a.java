package aw1;

import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.EmojiDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.apm.breb.impl.ui.keys.BrebKeysScreen;
import com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.emoji_picker.CardPersonalisationEmojiPickerController;
import com.revolut.feature.card_screen.impl.card_selection.screen.CardSelectionScreen;
import com.revolut.feature.credit.core.ui.bottom_sheet.action.ActionsBottomSheetController;
import com.revolut.feature.credit.loan.impl.ui.rev10.interestratebreakdown.LoanInterestRateBreakdownController;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentdetails.LoanRepaymentDetailsController;
import com.revolut.feature.insurance_pet.impl.ui.hub.issues.address_not_supported.AddressNotSupportedActivity;
import com.revolut.feature.payments.profile.impl.ui_kompot.scanner.ProfileScannerScreenContract$ProcessingState;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.usedexpiredcards.RevPointsGiftcardsUsedExpiredCardsScreen;
import com.revolut.feature.selfserve.sot.impl.ui.note.AddNoteFragment;
import com.revolut.feature.selfserve.sow.impl.ui.frequency.SowFrequencyFragment;
import com.revolut.feature.trading.impl.ui.holdings.information.section.info.HoldingsInformationSectionInfoController;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.AirportLoungePassCheckoutScreen;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10649a;

    public /* synthetic */ a(int i) {
        this.f10649a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 7;
        switch (this.f10649a) {
            case 0:
                KProperty[] kPropertyArr = BrebKeysScreen.S;
                return new RowDelegate(null, null, 7);
            case 1:
                KProperty[] kPropertyArr2 = BrebKeysScreen.S;
                return new FullScreenStateDelegate();
            case 2:
                Lazy lazy = awg.a.f10769a;
                return ged.a.a().b();
            case 3:
                return new ax9.e(ProfileScannerScreenContract$ProcessingState.Detecting.f79650b);
            case 4:
                KProperty[] kPropertyArr3 = RevPointsGiftcardsUsedExpiredCardsScreen.T;
                return new FullScreenStateDelegate();
            case 5:
                KProperty[] kPropertyArr4 = RevPointsGiftcardsUsedExpiredCardsScreen.T;
                return new RowLoadingDelegate();
            case 6:
                KProperty[] kPropertyArr5 = RevPointsGiftcardsUsedExpiredCardsScreen.T;
                return new RowDelegate(null, null, 7);
            case 7:
                KProperty[] kPropertyArr6 = AirportLoungePassCheckoutScreen.W;
                return new FullScreenStateDelegate();
            case 8:
                KProperty[] kPropertyArr7 = AirportLoungePassCheckoutScreen.W;
                return new AttributeSelectorSmallDelegate();
            case 9:
                KProperty[] kPropertyArr8 = AirportLoungePassCheckoutScreen.W;
                return new RowDelegate(null, null, 7);
            case 10:
                KProperty[] kPropertyArr9 = AirportLoungePassCheckoutScreen.W;
                return new CellDetailsDelegate();
            case 11:
                KProperty[] kPropertyArr10 = AirportLoungePassCheckoutScreen.W;
                return new TextDelegate();
            case 12:
                KProperty[] kPropertyArr11 = AirportLoungePassCheckoutScreen.W;
                return new HighlightTileDelegate();
            case 13:
                int i2 = ActionsBottomSheetController.X;
                return new CellDetailsDelegate();
            case 14:
                int i3 = ActionsBottomSheetController.X;
                return new PlainTextDelegate();
            case 15:
                int i5 = AddressNotSupportedActivity.f76318w0;
                return new RowDelegate(null, null, 7);
            case 16:
                int i6 = AddressNotSupportedActivity.f76318w0;
                return new z4l.j(i, v.k(new CellDetailsNoteDelegate(), new CellDetailsLoadingDelegate()), false);
            case 17:
                int i21 = AddNoteFragment.g0;
                return new InputTextDelegate(null);
            case 18:
                int i22 = SowFrequencyFragment.g0;
                return new InputChecklistDelegate();
            case 19:
                return v.k(d1b.c.MOVING_AVERAGE_SIMPLE_9, d1b.c.MOVING_AVERAGE_SIMPLE_20, d1b.c.MOVING_AVERAGE_SIMPLE_50, d1b.c.MOVING_AVERAGE_SIMPLE_100, d1b.c.MOVING_AVERAGE_SIMPLE_200, d1b.c.MACD, d1b.c.RELATIVE_STRENGTH_INDEX_14, d1b.c.BOLLINGER_BANDS_20, d1b.c.WEEK_52_HIGH_LOW);
            case 20:
                int i32 = CardPersonalisationEmojiPickerController.V;
                return new EmojiDelegate();
            case 21:
                KProperty[] kPropertyArr12 = HoldingsInformationSectionInfoController.Q;
                return new ListCellDelegate();
            case 22:
                return new qlm.e(b6h.a.f12742a);
            case 23:
                KProperty[] kPropertyArr13 = CardSelectionScreen.R;
                return new RowDelegate(null, null, 7);
            case 24:
                KProperty[] kPropertyArr14 = LoanInterestRateBreakdownController.S;
                return new LargeActionButtonDelegate();
            case 25:
                KProperty[] kPropertyArr15 = LoanInterestRateBreakdownController.S;
                return new CellDetailsDelegate();
            case 26:
                KProperty[] kPropertyArr16 = LoanRepaymentDetailsController.U;
                return new PlainTextWarningDelegate();
            case 27:
                KProperty[] kPropertyArr17 = LoanRepaymentDetailsController.U;
                return new CellDetailsChevronDelegate();
            case 28:
                KProperty[] kPropertyArr18 = LoanRepaymentDetailsController.U;
                return new RowDelegate(null, null, 7);
            default:
                KProperty[] kPropertyArr19 = LoanRepaymentDetailsController.U;
                return new FullScreenStateDelegate();
        }
    }
}
