package blj;

import blh.y;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.otp.number_transfer_confirmation.EsimMobilePlanOtpNumberTransferConfirmationScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EsimMobilePlanOtpNumberTransferConfirmationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(EsimMobilePlanOtpNumberTransferConfirmationScreen esimMobilePlanOtpNumberTransferConfirmationScreen, Continuation continuation) {
        super(2, continuation);
        this.v = esimMobilePlanOtpNumberTransferConfirmationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.otp.number_transfer_confirmation.e eVar = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.otp.number_transfer_confirmation.e) jVarE3;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f52373a, "ERROR_STATE_ID")) {
            eVar.H2(eVar.f101306t, new y(7));
            eVar.I2();
        }
        return Unit.f186387a;
    }
}
