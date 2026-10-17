package kkj;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes11.dex */
public final class q extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f185092w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f185093x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.a f185094y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i, com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.a aVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f185094y = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                q qVar = new q(0, this.f185094y, continuation);
                qVar.f185092w = flowCollector;
                qVar.f185093x = obj3;
                return qVar.invokeSuspend(Unit.f186387a);
            default:
                q qVar2 = new q(1, this.f185094y, continuation);
                qVar2.f185092w = flowCollector;
                qVar2.f185093x = obj3;
                return qVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f185092w;
                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.a aVar2 = this.f185094y;
                    vkm.d dVarA = aVar2.f101249q.a(aVar2.o.f101236a);
                    this.f185092w = null;
                    this.f185093x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, dVarA, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f185092w;
                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.a aVar4 = this.f185094y;
                    vkm.d dVarA2 = aVar4.f101248p.a(aVar4.o.f101236a, w4l.i.f294643c);
                    this.f185092w = null;
                    this.f185093x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, dVarA2, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
