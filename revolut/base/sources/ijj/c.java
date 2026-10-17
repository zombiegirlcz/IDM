package ijj;

import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_cancellation.EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.EsimMobilePlanCancellationScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ EsimMobilePlanCancellationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(EsimMobilePlanCancellationScreen esimMobilePlanCancellationScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = esimMobilePlanCancellationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            case 2:
                return new c(this.v, continuation, 2);
            default:
                return new c(this.v, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        a.C0616a c0616a = a.C0616a.f101118a;
        EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType.Withdrawal withdrawal = EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType.Withdrawal.f100698a;
        EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType.Cancellation cancellation = EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType.Cancellation.f100697a;
        EsimMobilePlanCancellationScreen esimMobilePlanCancellationScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.b) esimMobilePlanCancellationScreen.e3()).B2();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.b) esimMobilePlanCancellationScreen.e3()).C2(a.b.f101119a);
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.b bVar = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.b) esimMobilePlanCancellationScreen.e3();
                EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType esimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType = bVar.o.f101107b;
                if (Intrinsics.f(esimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType, cancellation)) {
                    bVar.C2(c0616a);
                } else {
                    if (!Intrinsics.f(esimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType, withdrawal)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar.I2();
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.b bVar2 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.b) esimMobilePlanCancellationScreen.e3();
                EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType esimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType2 = bVar2.o.f101107b;
                if (Intrinsics.f(esimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType2, cancellation)) {
                    bVar2.I2();
                } else {
                    if (!Intrinsics.f(esimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType2, withdrawal)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar2.C2(c0616a);
                }
                return Unit.f186387a;
        }
    }
}
