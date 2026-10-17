package tkj;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingContractType;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.contract_type_picker.EsimMobilePlanNumberTransferContractTypePickerScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EsimMobilePlanNumberTransferContractTypePickerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(EsimMobilePlanNumberTransferContractTypePickerScreen esimMobilePlanNumberTransferContractTypePickerScreen, Continuation continuation) {
        super(2, continuation);
        this.v = esimMobilePlanNumberTransferContractTypePickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVar = (g) this.v.Q.getValue();
        Object obj3 = model.u;
        gVar.getClass();
        EsimPhoneNumberPortingContractType esimPhoneNumberPortingContractType = obj3 instanceof EsimPhoneNumberPortingContractType ? (EsimPhoneNumberPortingContractType) obj3 : null;
        if (esimPhoneNumberPortingContractType != null) {
            gVar.H2(gVar.o, new tjf.e(esimPhoneNumberPortingContractType, 7));
            gVar.C2(new e(esimPhoneNumberPortingContractType));
        }
        return Unit.f186387a;
    }
}
