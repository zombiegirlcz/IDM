package klj;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingScheduleOption;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.portability_date_picker.EsimMobilePlanNumberTransferPortabilityDatePickerScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.portability_date_picker.EsimMobilePlanNumberTransferPortabilityDatePickerScreenContract$ModalStep;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EsimMobilePlanNumberTransferPortabilityDatePickerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(EsimMobilePlanNumberTransferPortabilityDatePickerScreen esimMobilePlanNumberTransferPortabilityDatePickerScreen, Continuation continuation) {
        super(2, continuation);
        this.v = esimMobilePlanNumberTransferPortabilityDatePickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarE3 = this.v.d();
        Object obj3 = model.P;
        EsimPhoneNumberPortingScheduleOption esimPhoneNumberPortingScheduleOption = obj3 instanceof EsimPhoneNumberPortingScheduleOption ? (EsimPhoneNumberPortingScheduleOption) obj3 : null;
        oki.h.v2(((com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.portability_date_picker.a) lVarE3).f101337q, new EsimMobilePlanNumberTransferPortabilityDatePickerScreenContract$ModalStep.PortabilitySpecificDatePicker(esimPhoneNumberPortingScheduleOption != null ? esimPhoneNumberPortingScheduleOption.d : null, esimPhoneNumberPortingScheduleOption != null ? esimPhoneNumberPortingScheduleOption.e : null, esimPhoneNumberPortingScheduleOption != null ? esimPhoneNumberPortingScheduleOption.f : null), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return Unit.f186387a;
    }
}
