package kv5;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f189969w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f189970x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ o f189971y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Continuation continuation, o oVar, int i) {
        super(3, continuation);
        this.u = i;
        this.f189971y = oVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                n nVar = new n(continuation, this.f189971y, 0);
                nVar.f189969w = flowCollector;
                nVar.f189970x = obj3;
                return nVar.invokeSuspend(Unit.f186387a);
            default:
                n nVar2 = new n(continuation, this.f189971y, 1);
                nVar2.f189969w = flowCollector;
                nVar2.f189970x = obj3;
                return nVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow eVar;
        int i = this.u;
        Continuation continuation = null;
        o oVar = this.f189971y;
        int i2 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f189969w;
                    Flow gVar = ((Boolean) this.f189970x).booleanValue() ? new go.g(new Data(f0.f322471a, null, false, 6, null), 2) : vkm.q.Q(oVar.f189974c.a(), new n(continuation, oVar, i2));
                    this.f189969w = null;
                    this.f189970x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, gVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f189969w;
                    Data data = (Data) this.f189970x;
                    if (Intrinsics.f(data.getContent(), Boolean.FALSE)) {
                        m mVar = o.Companion;
                        eVar = new t38.e(oVar.b(new kob.a(oVar, 8)), 24, new q(oVar.f189973b.o(), 1), new j40.d(data, continuation, 19));
                    } else {
                        eVar = new go.g(new Data(f0.f322471a, null, data.getLoading(), 2, null), 2);
                    }
                    this.f189969w = null;
                    this.f189970x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, eVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
