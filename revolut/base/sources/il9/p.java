package il9;

import com.revolut.core.ui_kit.delegates.ExpandableCellDelegate;
import com.revolut.core.ui_kit.delegates.QRCodeDelegate;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.apm.bills.boleto.impl.screen.amount.BoletoAmountScreen;
import com.revolut.feature.apm.bills.bpay.impl.screen.breakdown.BPayTransferBreakdownScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.picker.EsimPickerScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.downgrade_reason.PlanDowngradeReasonScreen;
import ip0.bo;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class p implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162195a;

    public /* synthetic */ p(int i) {
        this.f162195a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f162195a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                KProperty[] kPropertyArr = EsimPickerScreen.R;
                break;
            case 4:
                PlanDowngradeReasonScreen.a aVar = PlanDowngradeReasonScreen.Companion;
                break;
            case 5:
                KProperty[] kPropertyArr2 = BoletoAmountScreen.W;
                break;
            case 6:
                KProperty[] kPropertyArr3 = BoletoAmountScreen.W;
                break;
            case 7:
                KProperty[] kPropertyArr4 = BoletoAmountScreen.W;
                break;
            case 8:
                break;
            case 9:
                KProperty[] kPropertyArr5 = BPayTransferBreakdownScreen.S;
                break;
            case 10:
                KProperty[] kPropertyArr6 = BPayTransferBreakdownScreen.S;
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                ResourceImage resourceImage = ExpandableCellDelegate.f;
                break;
            case 17:
                int i = bo.f163639m;
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                break;
            case 28:
                break;
            default:
                QRCodeDelegate.Companion aVar2 = QRCodeDelegate.INSTANCE;
                break;
        }
        return new ihm.f();
    }
}
