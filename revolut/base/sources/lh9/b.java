package lh9;

import com.meshconnect.link.entity.TransferFinishedPayload;
import com.revolut.feature.apm.wero.impl.ui.pay.list.WeroRequestLinkListScreen;
import com.revolut.feature.credit.autopay.ui.screen.amount.select_type.SelectAmountTypeScreen;
import com.revolut.feature.insurance.impl.ui.cfac.details.CFACInsuranceDetailsScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.form.review.FormReviewScreen;
import com.revolut.feature.pay_later.impl.ui.repaymentdetails.PayLaterRepaymentDetailsScreen;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f195179a;

    public /* synthetic */ b(int i) {
        this.f195179a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f195179a) {
            case 0:
                KProperty[] kPropertyArr = FormReviewScreen.U;
                break;
            case 1:
                KProperty[] kPropertyArr2 = FormReviewScreen.U;
                break;
            case 2:
                KProperty[] kPropertyArr3 = FormReviewScreen.U;
                break;
            case 5:
                KProperty[] kPropertyArr4 = WeroRequestLinkListScreen.R;
                break;
            case 6:
                kg.p pVar = new kg.p();
                pVar.c(new lk.b(), TransferFinishedPayload.class);
                break;
            case 7:
                KProperty[] kPropertyArr5 = SelectAmountTypeScreen.f68614b0;
                break;
            case 8:
                KProperty[] kPropertyArr6 = CFACInsuranceDetailsScreen.c0;
                break;
            case 9:
                KProperty[] kPropertyArr7 = CFACInsuranceDetailsScreen.c0;
                break;
            case 11:
                KProperty[] kPropertyArr8 = PayLaterRepaymentDetailsScreen.f78910k0;
                break;
            case 12:
                KProperty[] kPropertyArr9 = PayLaterRepaymentDetailsScreen.f78910k0;
                break;
            case 13:
                KProperty[] kPropertyArr10 = PayLaterRepaymentDetailsScreen.f78910k0;
                break;
            case 14:
                KProperty[] kPropertyArr11 = PayLaterRepaymentDetailsScreen.f78910k0;
                break;
            case 15:
                KProperty[] kPropertyArr12 = PayLaterRepaymentDetailsScreen.f78910k0;
                break;
            case 16:
                KProperty[] kPropertyArr13 = PayLaterRepaymentDetailsScreen.f78910k0;
                break;
            case 17:
                KProperty[] kPropertyArr14 = PayLaterRepaymentDetailsScreen.f78910k0;
                break;
            case 18:
                KProperty[] kPropertyArr15 = PayLaterRepaymentDetailsScreen.f78910k0;
                break;
            case 19:
                Lazy lazy = lke.a.f196363a;
                kg.p pVarA = ged.a.a();
                he0.m mVarB = he0.m.b(oke.a.class, "type");
                mVarB.c(oke.c.class, "CONTENT");
                mVarB.c(oke.e.class, "URI");
                pVarA.e.add(mVarB);
                break;
        }
        return f0.f322471a;
    }
}
