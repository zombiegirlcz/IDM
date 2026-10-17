package th9;

import com.revolut.feature.address.common.impl.flow.validation_flow.suggestion.SuggestionSheetController;
import com.revolut.feature.credit.application.plugins.impl.ui.sso.SelfieIntroScreen;
import com.revolut.feature.insurance.impl.ui.cfac.my_claims.claim_expenses.CFACClaimExpensesScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.review.PaymentReviewScreen;
import com.revolut.feature.pay_later.impl.ui.selectpayment.PayLaterSelectRepaymentScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.contract_type_picker.EsimMobilePlanNumberTransferContractTypePickerScreen;
import ip0.s7;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import qlm.v1;
import tkd.l;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class k implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f271341a;

    public /* synthetic */ k(int i) {
        this.f271341a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z = false;
        Integer num = null;
        switch (this.f271341a) {
            case 0:
                KProperty[] kPropertyArr = PaymentReviewScreen.S;
                break;
            case 2:
                ArrayList arrayList = new ArrayList(2);
                for (int i = 0; i < 2; i++) {
                    arrayList.add(new s7(a0.d.n("TAX_ALLOWANCE_USAGE_LOADING_ITEM_", i), 0, 0, 0, 0, false, null, 126));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                break;
            case 3:
                int i2 = SuggestionSheetController.Y;
                break;
            case 4:
                KProperty[] kPropertyArr2 = SelfieIntroScreen.Q;
                break;
            case 10:
                KProperty[] kPropertyArr3 = CFACClaimExpensesScreen.c0;
                break;
            case 11:
                KProperty[] kPropertyArr4 = PayLaterSelectRepaymentScreen.f78933e0;
                break;
            case 12:
                KProperty[] kPropertyArr5 = PayLaterSelectRepaymentScreen.f78933e0;
                break;
            case 15:
                v1 v1Var = v1.f247718a;
                break;
            case 18:
                l.Companion bVar = tkd.l.INSTANCE;
                break;
            case 19:
                l.Companion bVar2 = tkd.l.INSTANCE;
                break;
            case 20:
                l.Companion bVar3 = tkd.l.INSTANCE;
                break;
            case 21:
                l.Companion bVar4 = tkd.l.INSTANCE;
                break;
            case 22:
                l.Companion bVar5 = tkd.l.INSTANCE;
                break;
            case 23:
                l.Companion bVar6 = tkd.l.INSTANCE;
                break;
            case 24:
                l.Companion bVar7 = tkd.l.INSTANCE;
                break;
            case 25:
                KProperty[] kPropertyArr6 = EsimMobilePlanNumberTransferContractTypePickerScreen.R;
                break;
        }
        return Unit.f186387a;
    }
}
