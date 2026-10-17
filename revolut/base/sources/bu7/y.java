package bu7;

import android.telephony.PhoneNumberFormattingTextWatcher;
import bu7.i0;
import com.google.gson.reflect.TypeToken;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.ErrorDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.feature.card_management.impl.ui.expectations.ExpectationManagementActivity;
import com.revolut.feature.credit.card.impl.ui.settings.screen.CreditCardSettingsScreen;
import com.revolut.feature.credit.card.impl.ui.statement_financing.confirmation.CreditCardStatementFinancingConfirmationScreen;
import com.revolut.feature.insurance_embedded.api.models.RemoteDocument;
import com.revolut.feature.insurance_pet.impl.ui.cancellation.feedback.CancellationFeedbackActivity;
import com.revolut.feature.kyc.impl.screens.documentid_input.KYCDocumentIdInputScreen;
import com.revolut.feature.payments.recipients.settings.impl.data.GsonHolder;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.uservouchers.RevPointsGiftcardsUserVouchersScreen;
import com.revolut.feature.selfserve.sot.impl.ui.status.StatusFragment;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.amount.ManualTransferScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_details.AirportLoungePassDetailsScreen;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlinx.serialization.KSerializer;
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class y implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18750a;

    public /* synthetic */ y(int i) {
        this.f18750a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18750a) {
            case 0:
                return new qlm.e(v.f18742a);
            case 1:
                return new qlm.e(h.f18716a);
            case 2:
                return new qlm.e(v1.f247718a);
            case 3:
                i0.Companion companion = i0.INSTANCE;
                kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
                return new mlm.f("com.revolut.feature.insurance_embedded.api.models.InsuranceInfo", p0Var.b(i0.class), new KClass[]{p0Var.b(l0.class), p0Var.b(o0.class)}, new KSerializer[]{j0.f18721a, m0.f18725a}, new Annotation[0]);
            case 4:
                return new qlm.e(p0.f18731a);
            case 5:
                RemoteDocument.Companion companion2 = RemoteDocument.INSTANCE;
                return j1.b("com.revolut.feature.insurance_embedded.api.models.RemoteDocumentType", y0.values());
            case 6:
                KProperty[] kPropertyArr = ManualTransferScreen.f92464k0;
                return new CenteredAmountDelegate(null);
            case 7:
                KProperty[] kPropertyArr2 = CreditCardSettingsScreen.S;
                return new RowDelegate(null, null, 7);
            case 8:
                KProperty[] kPropertyArr3 = CreditCardSettingsScreen.S;
                return new FullScreenStateDelegate();
            case 9:
                KProperty[] kPropertyArr4 = CreditCardStatementFinancingConfirmationScreen.V;
                return new RowDelegate(null, null, 7);
            case 10:
                KProperty[] kPropertyArr5 = CreditCardStatementFinancingConfirmationScreen.V;
                return new CellDetailsDelegate();
            case 11:
                KProperty[] kPropertyArr6 = CreditCardStatementFinancingConfirmationScreen.V;
                return new FullScreenStateDelegate();
            case 12:
                KProperty[] kPropertyArr7 = CreditCardStatementFinancingConfirmationScreen.V;
                return new LargeActionButtonDelegate();
            case 13:
                KProperty[] kPropertyArr8 = KYCDocumentIdInputScreen.T;
                return new InputTextDelegate(null);
            case 14:
                KProperty[] kPropertyArr9 = RevPointsGiftcardsUserVouchersScreen.U;
                return new FullScreenStateDelegate();
            case 15:
                KProperty[] kPropertyArr10 = RevPointsGiftcardsUserVouchersScreen.U;
                return new RowLoadingDelegate();
            case 16:
                KProperty[] kPropertyArr11 = RevPointsGiftcardsUserVouchersScreen.U;
                return new RowDelegate(null, null, 7);
            case 17:
                KProperty[] kPropertyArr12 = RevPointsGiftcardsUserVouchersScreen.U;
                return new CellDetailsChevronDelegate();
            case 18:
                int i = CancellationFeedbackActivity.f76246w0;
                return new InputChecklistDelegate();
            case 19:
                Lazy lazy = GsonHolder.f79670a;
                kg.p pVar = new kg.p();
                kg.j0 j0Var = kg.j0.LONG_OR_DOUBLE;
                Objects.requireNonNull(j0Var);
                pVar.f183887m = j0Var;
                Type type = new TypeToken<String>() { // from class: com.revolut.feature.payments.recipients.settings.impl.data.GsonHolder$instance_delegate$lambda$0$$inlined$gsonTypeToken$1
                }.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                pVar.c(new he0.k(), type);
                s90.a.a(pVar);
                return pVar.b();
            case 20:
                KProperty[] kPropertyArr13 = AirportLoungePassDetailsScreen.R;
                return new FullScreenStateDelegate();
            case 21:
                return Unit.f186387a;
            case 22:
                return Unit.f186387a;
            case 23:
                return Unit.f186387a;
            case 24:
                int i2 = StatusFragment.f85950h0;
                return new RowDelegate(null, null, 7);
            case 25:
                int i3 = StatusFragment.f85950h0;
                return new ErrorDelegate();
            case 26:
                int i5 = bzl.l.f20069c;
                try {
                    return PhoneNumberFormattingTextWatcher.class.getDeclaredField("mSelfChange");
                } catch (NoSuchFieldException unused) {
                    return null;
                }
            case 27:
                int i6 = bzl.l.f20069c;
                try {
                    return PhoneNumberFormattingTextWatcher.class.getDeclaredField("mStopFormatting");
                } catch (NoSuchFieldException unused2) {
                    return null;
                }
            case 28:
                int i21 = ExpectationManagementActivity.f64848w0;
                return new LargeActionButtonDelegate();
            default:
                int i22 = ExpectationManagementActivity.f64848w0;
                return new z4l.j(7, m72.b.v(null, null, 7), false);
        }
    }
}
