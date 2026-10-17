package bzc;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes7.dex */
public final class q extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f19970w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f19971x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ s f19972y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i, s sVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f19972y = sVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                q qVar = new q(0, this.f19972y, continuation);
                qVar.f19970w = flowCollector;
                qVar.f19971x = obj3;
                return qVar.invokeSuspend(Unit.f186387a);
            default:
                q qVar2 = new q(1, this.f19972y, continuation);
                qVar2.f19970w = flowCollector;
                qVar2.f19971x = obj3;
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
                    FlowCollector flowCollector = this.f19970w;
                    vkm.d dVarB = rd0.e.b(this.f19972y.o.l());
                    this.f19970w = null;
                    this.f19971x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, dVarB, this) == aVar) {
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
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f19970w;
                    vkm.d dVarB2 = rd0.e.b(this.f19972y.f19974p.o());
                    this.f19970w = null;
                    this.f19971x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, dVarB2, this) == aVar2) {
                        return aVar2;
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
