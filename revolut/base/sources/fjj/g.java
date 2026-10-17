package fjj;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.EsimMobilePlanBillingScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.EsimMobilePlanBillingScreenContract$ModalStep;
import dej.t1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ EsimMobilePlanBillingScreen f135656w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(EsimMobilePlanBillingScreen esimMobilePlanBillingScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f135656w = esimMobilePlanBillingScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f135656w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            default:
                g gVar2 = new g(this.f135656w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((t1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((dj0.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        EsimMobilePlanBillingScreen esimMobilePlanBillingScreen = this.f135656w;
        switch (i) {
            case 0:
                t1 subscription = (t1) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVarD3 = esimMobilePlanBillingScreen.d3();
                Intrinsics.h(subscription);
                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.a aVar2 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.a) qVarD3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(subscription, "subscription");
                aVar2.C2(new o(subscription.f113650a, subscription.f));
                break;
            default:
                dj0.d price = (dj0.d) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVarD32 = esimMobilePlanBillingScreen.d3();
                Intrinsics.h(price);
                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.a aVar4 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.a) qVarD32;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(price, "price");
                oki.h.v2(aVar4.z, new EsimMobilePlanBillingScreenContract$ModalStep.RevPayPocketSelection(price), ModalDestination.Style.POPUP.f98311a);
                break;
        }
        return Unit.f186387a;
    }
}
