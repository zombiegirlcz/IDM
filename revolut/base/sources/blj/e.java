package blj;

import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.otp.number_transfer_confirmation.EsimMobilePlanOtpNumberTransferConfirmationScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.otp.number_transfer_confirmation.EsimMobilePlanOtpNumberTransferConfirmationScreenContract$PortabilityStrategySwitchParcel;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.otp.number_transfer_confirmation.EsimMobilePlanOtpNumberTransferConfirmationScreenContract$ResendOtpParcel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EsimMobilePlanOtpNumberTransferConfirmationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(EsimMobilePlanOtpNumberTransferConfirmationScreen esimMobilePlanOtpNumberTransferConfirmationScreen, Continuation continuation) {
        super(2, continuation);
        this.v = esimMobilePlanOtpNumberTransferConfirmationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((SmallActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SmallActionButtonDelegate.Model model = (SmallActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarE3 = this.v.d();
        Object obj3 = model.f53342j;
        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.otp.number_transfer_confirmation.e eVar = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.otp.number_transfer_confirmation.e) jVarE3;
        if (obj3 instanceof EsimMobilePlanOtpNumberTransferConfirmationScreenContract$ResendOtpParcel) {
            eVar.I2();
        } else {
            eVar.getClass();
            if (obj3 instanceof EsimMobilePlanOtpNumberTransferConfirmationScreenContract$PortabilityStrategySwitchParcel) {
                eVar.C2(new i(((EsimMobilePlanOtpNumberTransferConfirmationScreenContract$PortabilityStrategySwitchParcel) obj3).f101294a, eVar.o.e));
            }
        }
        return Unit.f186387a;
    }
}
