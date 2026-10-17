package us4;

import com.revolut.biometric_verification.impl.ui.step.document.new_document_picker.BiometricVerificationNewDocumentPickerScreen;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsListDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListingCardBasicDelegate;
import com.revolut.core.ui_kit.delegates.NewProductSmallDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.VaultsProgressDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ContactsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.PaymentLinkWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.image.transformation.RoundedRectTransformation;
import com.revolut.feature.apm.breb.impl.ui.area.BrebAreaScreen;
import com.revolut.feature.card_add_to_googlepay.impl.verification.otp.multiple.GooglePayMultipleOtpVerificationController;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.choose_instalments.CreditCardChooseFutureInstalmentsScreen;
import com.revolut.feature.freelancer.impl.ui.cashback.screen.upsell.FreelancerCashbackUpsellScreen;
import com.revolut.feature.insurance_pet.impl.ui.add.step.detail.PetBaseDetailsFragment;
import com.revolut.feature.transport.impl.ui.transit_checkout.passenger_details.PassengerDetailsScreen;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.negative_balance.NegativeBalancePromptScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.airport_details.AirportDetailsScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import org.jmrtd.lds.LDSFile;
import qlm.v1;
import usj.f0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f282418a;

    public /* synthetic */ b(int i) {
        this.f282418a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f282418a) {
            case 0:
                KProperty[] kPropertyArr = CreditCardChooseFutureInstalmentsScreen.W;
                return new VaultsProgressDelegate();
            case 1:
                return new qlm.e(usj.m.f282956a);
            case 2:
                return new qlm.e(v1.f247718a);
            case 3:
                return new qlm.e(v1.f247718a);
            case 4:
                return new qlm.e(usj.j.f282952a);
            case 5:
                return new qlm.e(v1.f247718a);
            case 6:
                return new qlm.e(v1.f247718a);
            case 7:
                return new qlm.e(f0.f282946a);
            case 8:
                KProperty[] kPropertyArr2 = BiometricVerificationNewDocumentPickerScreen.U;
                return new InputTextDelegate(null);
            case 9:
                KProperty[] kPropertyArr3 = BiometricVerificationNewDocumentPickerScreen.U;
                return new CellDetailsListDelegate();
            case 10:
                KProperty[] kPropertyArr4 = NegativeBalancePromptScreen.Q;
                return new PromptMarketingContentDelegate();
            case 11:
                KProperty[] kPropertyArr5 = BrebAreaScreen.X;
                return new RowDelegate(null, null, 7);
            case 12:
                KProperty[] kPropertyArr6 = BrebAreaScreen.X;
                return new RowsWidgetDelegate();
            case 13:
                KProperty[] kPropertyArr7 = BrebAreaScreen.X;
                return new ActionWidgetDelegate();
            case 14:
                KProperty[] kPropertyArr8 = BrebAreaScreen.X;
                return new ActionsDelegate();
            case 15:
                KProperty[] kPropertyArr9 = BrebAreaScreen.X;
                return new ContactsWidgetDelegate();
            case 16:
                KProperty[] kPropertyArr10 = BrebAreaScreen.X;
                return new HeaderDelegate();
            case 17:
                KProperty[] kPropertyArr11 = BrebAreaScreen.X;
                return new PaymentLinkWidgetDelegate();
            case 18:
                int i = jli.h.f175850a;
                return Unit.f186387a;
            case 19:
                KProperty[] kPropertyArr12 = FreelancerCashbackUpsellScreen.S;
                return new NewProductSmallDelegate();
            case 20:
                KProperty[] kPropertyArr13 = FreelancerCashbackUpsellScreen.S;
                return new RowDelegate(null, null, 7);
            case 21:
                return new ImageTransformations(null, new RoundedRectTransformation(8.0f), null, gz0.b.CenterCrop, null, null, null, LDSFile.EF_DG2_TAG);
            case 22:
                KProperty[] kPropertyArr14 = GooglePayMultipleOtpVerificationController.R;
                return new RowDelegate(null, null, 7);
            case 23:
                KProperty[] kPropertyArr15 = PassengerDetailsScreen.U;
                return new RowDelegate(null, null, 7);
            case 24:
                KProperty[] kPropertyArr16 = PassengerDetailsScreen.U;
                return new InputTextDelegate(null);
            case 25:
                KProperty[] kPropertyArr17 = PassengerDetailsScreen.U;
                return new CellDetailsNoteDelegate();
            case 26:
                KProperty[] kPropertyArr18 = PassengerDetailsScreen.U;
                return new DatePickerDelegate();
            case 27:
                KProperty[] kPropertyArr19 = AirportDetailsScreen.f99027d0;
                return new ListingCardBasicDelegate();
            case 28:
                KProperty[] kPropertyArr20 = AirportDetailsScreen.f99027d0;
                return new FullScreenStateDelegate();
            default:
                int i2 = PetBaseDetailsFragment.j0;
                return new InputTextDelegate(null);
        }
    }
}
