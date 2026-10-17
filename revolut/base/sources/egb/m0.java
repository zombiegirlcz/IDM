package egb;

import adk.i1;
import com.google.gson.reflect.TypeToken;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.multiple.GooglePayMultipleOtpVerificationController;
import com.revolut.feature.address.common.impl.flow.field_search.search.FieldSearchScreen;
import com.revolut.feature.atm.impl.ui.redesign.details.AtmDetailsBottomSheetController;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.OpenBankingAuthPaymentScreen;
import com.revolut.feature.insurance.impl.ui.cfac.claim.review_claim.CFACInsuranceReviewClaimScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.amount.PaymentAmountScreen;
import com.revolut.shared.feature.wealth_orders.domain.impl.data.GsonHolder;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.joda.time.DateTime;
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class m0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f125603a;

    public /* synthetic */ m0(int i) {
        this.f125603a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f125603a) {
            case 0:
                v1 v1Var = v1.f247718a;
                return new qlm.h0(v1Var, v1Var, 1);
            case 1:
                KProperty[] kPropertyArr = GooglePayMultipleOtpVerificationController.R;
                return new RowDelegate(null, null, 7);
            case 2:
                KProperty[] kPropertyArr2 = PaymentAmountScreen.f78771b0;
                return new TextDelegate();
            case 3:
                KProperty[] kPropertyArr3 = PaymentAmountScreen.f78771b0;
                return new LargeActionButtonDelegate();
            case 4:
                KProperty[] kPropertyArr4 = PaymentAmountScreen.f78771b0;
                return new CellDetailsDelegate();
            case 5:
                KProperty[] kPropertyArr5 = PaymentAmountScreen.f78771b0;
                return new CellDetailsActionDelegate();
            case 6:
                KProperty[] kPropertyArr6 = PaymentAmountScreen.f78771b0;
                return new CellDetailsNoteDelegate();
            case 7:
                KProperty[] kPropertyArr7 = PaymentAmountScreen.f78771b0;
                return new RowDelegate(null, null, 7);
            case 8:
                KProperty[] kPropertyArr8 = FieldSearchScreen.W;
                return new RowDelegate(null, null, 7);
            case 9:
                KProperty[] kPropertyArr9 = FieldSearchScreen.W;
                return new FullScreenStateDelegate();
            case 10:
                KProperty[] kPropertyArr10 = FieldSearchScreen.W;
                return new SingleChoiceLoadingDelegate();
            case 11:
                Lazy lazy = GsonHolder.f105371a;
                kg.p pVar = new kg.p();
                Type type = new TypeToken<String>() { // from class: com.revolut.shared.feature.wealth_orders.domain.impl.data.GsonHolder$instance_delegate$lambda$0$$inlined$gsonTypeToken$1
                }.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                pVar.c(new he0.k(), type);
                pVar.c(new he0.o(), ZonedDateTime.class);
                pVar.c(new he0.a(), DateTime.class);
                pVar.c(new he0.e(), Instant.class);
                pVar.c(new he0.f(), LocalDate.class);
                pVar.e.add(new he0.d());
                return pVar.b();
            case 12:
                KProperty[] kPropertyArr11 = OpenBankingAuthPaymentScreen.V;
                return new RowDelegate(null, null, 7);
            case 13:
                ne0.n.Companion.getClass();
                return ne0.l.a(1, 10L);
            case 14:
                KProperty[] kPropertyArr12 = AtmDetailsBottomSheetController.Y;
                return new CellDetailsActionDelegate();
            case 15:
                KProperty[] kPropertyArr13 = CFACInsuranceReviewClaimScreen.f75097h0;
                return new CellDetailsDelegate();
            case 16:
                KProperty[] kPropertyArr14 = CFACInsuranceReviewClaimScreen.f75097h0;
                return new InputChecklistDelegate();
            case 17:
                KProperty[] kPropertyArr15 = CFACInsuranceReviewClaimScreen.f75097h0;
                return new ListSubheaderDelegate();
            case 18:
                KProperty[] kPropertyArr16 = CFACInsuranceReviewClaimScreen.f75097h0;
                return new RowDelegate(null, null, 7);
            case 19:
                KProperty[] kPropertyArr17 = CFACInsuranceReviewClaimScreen.f75097h0;
                return new InputTextDelegate(null);
            case 20:
                KProperty[] kPropertyArr18 = CFACInsuranceReviewClaimScreen.f75097h0;
                return new LargeActionButtonDelegate();
            case 21:
                KProperty[] kPropertyArr19 = CFACInsuranceReviewClaimScreen.f75097h0;
                return new PlainTextWarningDelegate();
            case 22:
                v1 v1Var2 = v1.f247718a;
                return new qlm.h0(v1Var2, v1Var2, 1);
            case 23:
                v1 v1Var3 = v1.f247718a;
                return new qlm.h0(v1Var3, v1Var3, 1);
            case 24:
                v1 v1Var4 = v1.f247718a;
                return new qlm.h0(v1Var4, v1Var4, 1);
            case 25:
                v1 v1Var5 = v1.f247718a;
                return new qlm.h0(v1Var5, v1Var5, 1);
            case 26:
                return j1.a("com.revolut.feature.slot_manager.api.model.suggestion.SlotIncentive.Progress.Type", ekd.t.values(), new String[]{null, null}, new Annotation[][]{new Annotation[]{new i1(new String[]{"COUNT", "count"}, 2)}, new Annotation[]{new i1(new String[]{"AMOUNT", "amount"}, 2)}});
            case 27:
                return j1.a("com.revolut.feature.slot_manager.api.model.suggestion.SlotIncentive.Style.Theme", ekd.x.values(), new String[]{null, null, null}, new Annotation[][]{new Annotation[]{new i1(new String[]{"LIGHT", "light"}, 2)}, new Annotation[]{new i1(new String[]{"DARK", "dark"}, 2)}, new Annotation[]{new i1(new String[]{"TRANSPARENT", "transparent"}, 2)}});
            case 28:
                v1 v1Var6 = v1.f247718a;
                return new qlm.h0(v1Var6, v1Var6, 1);
            default:
                v1 v1Var7 = v1.f247718a;
                return new qlm.h0(v1Var7, v1Var7, 1);
        }
    }
}
