package bbk;

import com.revolut.retail.feature.pending_payments.api.models.PendingPaymentInfo$TimerInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.v1;

/* JADX INFO: loaded from: classes11.dex */
public final class w extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f14343w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f14344x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d0 f14345y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i, d0 d0Var, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f14345y = d0Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                w wVar = new w(0, this.f14345y, continuation);
                wVar.f14343w = flowCollector;
                wVar.f14344x = obj3;
                return wVar.invokeSuspend(Unit.f186387a);
            case 1:
                w wVar2 = new w(1, this.f14345y, continuation);
                wVar2.f14343w = flowCollector;
                wVar2.f14344x = obj3;
                return wVar2.invokeSuspend(Unit.f186387a);
            default:
                w wVar3 = new w(2, this.f14345y, continuation);
                wVar3.f14343w = flowCollector;
                wVar3.f14344x = obj3;
                return wVar3.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow v1Var;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f14343w;
                    Flow flowN = this.f14345y.f14320q.N((sak.c) this.f14344x);
                    this.f14343w = null;
                    this.f14344x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, flowN, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f14343w;
                    Flow flowU0 = this.f14345y.f14320q.u0((sak.c) this.f14344x);
                    this.f14343w = null;
                    this.f14344x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, flowU0, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f14343w;
                    PendingPaymentInfo$TimerInfo pendingPaymentInfo$TimerInfo = (PendingPaymentInfo$TimerInfo) this.f14344x;
                    if (pendingPaymentInfo$TimerInfo == null || pendingPaymentInfo$TimerInfo.f102399c != sak.i.FOOTER) {
                        v1Var = vkm.i.f290039a;
                    } else {
                        s42.c cVar = this.f14345y.f14322s;
                        long j2 = pendingPaymentInfo$TimerInfo.f102398b;
                        cVar.getClass();
                        v1Var = new v1(new s42.b(cVar, j2, null));
                    }
                    this.f14343w = null;
                    this.f14344x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, v1Var, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
