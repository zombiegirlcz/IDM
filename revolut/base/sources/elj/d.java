package elj;

import com.revolut.retail.feature.esim.api.model.EsimDescriptorValue;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.pac.number_transfer_confirmation.EsimMobilePlanPacNumberTransferConfirmationScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ EsimMobilePlanPacNumberTransferConfirmationScreen f127495w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(EsimMobilePlanPacNumberTransferConfirmationScreen esimMobilePlanPacNumberTransferConfirmationScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f127495w = esimMobilePlanPacNumberTransferConfirmationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f127495w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f127495w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ty0.a aVar = (ty0.a) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(aVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        EsimDescriptorValue esimDescriptorValue;
        int i = this.u;
        EsimMobilePlanPacNumberTransferConfirmationScreen esimMobilePlanPacNumberTransferConfirmationScreen = this.f127495w;
        switch (i) {
            case 0:
                ty0.a aVar = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j jVarE3 = esimMobilePlanPacNumberTransferConfirmationScreen.e3();
                String text = aVar.f275445a;
                Object obj3 = aVar.d;
                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.pac.number_transfer_confirmation.b bVar = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.pac.number_transfer_confirmation.b) jVarE3;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(text, "text");
                esimDescriptorValue = obj3 instanceof EsimDescriptorValue ? (EsimDescriptorValue) obj3 : null;
                if (esimDescriptorValue != null) {
                    bVar.I2(text, esimDescriptorValue);
                }
                break;
            default:
                ty0.a aVar3 = (ty0.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j jVarE32 = esimMobilePlanPacNumberTransferConfirmationScreen.e3();
                String text2 = aVar3.f275445a;
                Object obj4 = aVar3.d;
                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.pac.number_transfer_confirmation.b bVar2 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.pac.number_transfer_confirmation.b) jVarE32;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(text2, "text");
                esimDescriptorValue = obj4 instanceof EsimDescriptorValue ? (EsimDescriptorValue) obj4 : null;
                if (esimDescriptorValue != null) {
                    bVar2.I2(text2, esimDescriptorValue);
                }
                break;
        }
        return Unit.f186387a;
    }
}
