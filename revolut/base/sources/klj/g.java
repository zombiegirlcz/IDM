package klj;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingScheduleOption;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.portability_date_picker.EsimMobilePlanNumberTransferPortabilityDatePickerScreen;
import ke7.v;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EsimMobilePlanNumberTransferPortabilityDatePickerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(EsimMobilePlanNumberTransferPortabilityDatePickerScreen esimMobilePlanNumberTransferPortabilityDatePickerScreen, Continuation continuation) {
        super(2, continuation);
        this.v = esimMobilePlanNumberTransferPortabilityDatePickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((InputChecklistDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputChecklistDelegate.Model model = (InputChecklistDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarE3 = this.v.d();
        Object obj3 = model.i;
        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.portability_date_picker.a aVar2 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.portability_date_picker.a) lVarE3;
        aVar2.H2(aVar2.f101336p, new v(obj3 instanceof EsimPhoneNumberPortingScheduleOption ? (EsimPhoneNumberPortingScheduleOption) obj3 : null, 19));
        return Unit.f186387a;
    }
}
