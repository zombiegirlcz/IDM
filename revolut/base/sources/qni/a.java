package qni;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.feature.credit.card.impl.ui.credit_cards.CreditCardsController;
import com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.confirmation.CryptoWithdrawToAddressConfirmationActivity;
import com.revolut.feature.push_to_card.impl.ui.review.PushToCardTransferReviewScreen;
import com.revolut.otp.input.flow.email.bottom_dialog.OtpEmailNoEmailReceivedBottomSheet;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.student_email_resend_bottom_sheet.StudentEmailResendBottomSheet;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import kotlinx.serialization.json.Json;
import qlm.d1;
import qo6.m;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f247949a;

    public /* synthetic */ a(int i) {
        this.f247949a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f247949a) {
            case 0:
                int i = OtpEmailNoEmailReceivedBottomSheet.V;
                return new LargeActionButtonDelegate();
            case 1:
                int i2 = StudentEmailResendBottomSheet.U;
                return new LargeActionButtonDelegate();
            case 2:
                return new qlm.e(qo6.j.f248062a);
            case 3:
                return new qlm.e(m.f248066a);
            case 4:
                KProperty[] kPropertyArr = CryptoWithdrawToAddressConfirmationActivity.I0;
                return new CellDetailsActionDelegate();
            case 5:
                KProperty[] kPropertyArr2 = CryptoWithdrawToAddressConfirmationActivity.I0;
                return new CellDetailsDelegate();
            case 6:
                KProperty[] kPropertyArr3 = CryptoWithdrawToAddressConfirmationActivity.I0;
                return new RowDelegate(null, null, 7);
            case 7:
                KProperty[] kPropertyArr4 = CryptoWithdrawToAddressConfirmationActivity.I0;
                return new HighlightTileDelegate();
            case 8:
                KProperty[] kPropertyArr5 = CryptoWithdrawToAddressConfirmationActivity.I0;
                return new LargeActionButtonDelegate();
            case 9:
                KProperty[] kPropertyArr6 = CryptoWithdrawToAddressConfirmationActivity.I0;
                return new TwinHorizontalButtonDelegate();
            case 10:
                Lazy lazy = qq2.a.f248459a;
                return ue0.e.b(Json.d, new qpb.i(11));
            case 11:
                int i3 = CreditCardsController.W;
                return new RowDelegate(null, null, 7);
            case 12:
                int i5 = CreditCardsController.W;
                return new FullScreenStateDelegate();
            case 13:
                return new qlm.e(qr2.g.d);
            case 14:
                return new d1("com.revolut.feature.blocked_merchants.impl.data.network.model.BlockDisallowedBottomSheetDto.ContentItemDto.Unknown", qr2.e.INSTANCE, new Annotation[0]);
            case 15:
                return new qlm.e(qre.f.f248722a);
            case 16:
                KProperty[] kPropertyArr7 = PushToCardTransferReviewScreen.f81615h0;
                return new CellDetailsDelegate();
            case 17:
                KProperty[] kPropertyArr8 = PushToCardTransferReviewScreen.f81615h0;
                return new RowDelegate(null, null, 7);
            case 18:
                KProperty[] kPropertyArr9 = PushToCardTransferReviewScreen.f81615h0;
                return new HighlightTileDelegate();
            case 19:
                KProperty[] kPropertyArr10 = PushToCardTransferReviewScreen.f81615h0;
                return new TextDelegate();
            case 20:
                KProperty[] kPropertyArr11 = PushToCardTransferReviewScreen.f81615h0;
                return new CounterTextDelegate();
            case 21:
                KProperty[] kPropertyArr12 = PushToCardTransferReviewScreen.f81615h0;
                return new CellDetailsActionDelegate();
            case 22:
                KProperty[] kPropertyArr13 = PushToCardTransferReviewScreen.f81615h0;
                return new CellDetailsNoteDelegate();
            case 23:
                KProperty[] kPropertyArr14 = PushToCardTransferReviewScreen.f81615h0;
                return new CellDetailsSwitcherDelegate();
            case 24:
                KProperty[] kPropertyArr15 = PushToCardTransferReviewScreen.f81615h0;
                return new RowDelegate(null, null, 7);
            case 25:
                KProperty[] kPropertyArr16 = PushToCardTransferReviewScreen.f81615h0;
                return new HighlightTileDelegate();
            case 26:
                KProperty[] kPropertyArr17 = PushToCardTransferReviewScreen.f81615h0;
                return new CellDetailsDelegate();
            case 27:
                KProperty[] kPropertyArr18 = PushToCardTransferReviewScreen.f81615h0;
                return new CellDetailsActionDelegate();
            case 28:
                KProperty[] kPropertyArr19 = PushToCardTransferReviewScreen.f81615h0;
                return new CellDetailsNoteDelegate();
            default:
                KProperty[] kPropertyArr20 = PushToCardTransferReviewScreen.f81615h0;
                return new LargeActionButtonDelegate();
        }
    }
}
