package fjj;

import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionCancellationConfirmation;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_cancellation.EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.EsimMobilePlanBillingScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.EsimMobilePlanBillingScreenContract$ModalStep;
import dej.t1;
import dej.z1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EsimMobilePlanBillingScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(EsimMobilePlanBillingScreen esimMobilePlanBillingScreen, Continuation continuation) {
        super(2, continuation);
        this.v = esimMobilePlanBillingScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((InputDisclosureDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        z1 z1Var;
        InputDisclosureDelegate.Model model = (InputDisclosureDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVarD3 = this.v.d();
        Object obj3 = model.e;
        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.a aVar2 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.a) qVarD3;
        aVar2.getClass();
        EsimSubscriptionCancellationConfirmation esimSubscriptionCancellationConfirmation = null;
        EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType esimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType = obj3 instanceof EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType ? (EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType) obj3 : null;
        if (esimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType != null) {
            t1 t1Var = (t1) ((k) ((j2) aVar2.A.f22677a).getValue()).f135658b.getContent();
            if (t1Var != null && (z1Var = t1Var.f113662s) != null) {
                esimSubscriptionCancellationConfirmation = z1Var.e;
            }
            if (esimSubscriptionCancellationConfirmation == null) {
                aVar2.J2(esimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType);
            } else {
                oki.h.v2(aVar2.z, new EsimMobilePlanBillingScreenContract$ModalStep.CancellationConfirmation(esimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType, esimSubscriptionCancellationConfirmation), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            }
        }
        return Unit.f186387a;
    }
}
