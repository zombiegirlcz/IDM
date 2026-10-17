package l3e;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import t1e.c0;
import vkm.q;

/* JADX INFO: loaded from: classes7.dex */
public final class m extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f191945w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f191946x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.store.impl.ui.orders.a f191947y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i, com.revolut.feature.store.impl.ui.orders.a aVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f191947y = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                m mVar = new m(0, this.f191947y, continuation);
                mVar.f191945w = flowCollector;
                mVar.f191946x = obj3;
                return mVar.invokeSuspend(Unit.f186387a);
            default:
                m mVar2 = new m(1, this.f191947y, continuation);
                mVar2.f191945w = flowCollector;
                mVar2.f191946x = obj3;
                return mVar2.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f191945w;
                    vkm.d dVarC = this.f191947y.f88709p.c(null, (w4l.k) this.f191946x);
                    this.f191945w = null;
                    this.f191946x = null;
                    this.v = 1;
                    if (q.u(flowCollector, dVarC, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f191945w;
                    vkm.d dVarN = this.f191947y.o.n(new c0(2, new Integer(4)), (w4l.k) this.f191946x);
                    this.f191945w = null;
                    this.f191946x = null;
                    this.v = 1;
                    if (q.u(flowCollector2, dVarN, this) == aVar2) {
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
