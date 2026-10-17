package po9;

import au6.k0;
import b8d.f0;
import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import n8i.b1;

/* JADX INFO: loaded from: classes5.dex */
public final class p extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f237926w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f237927x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.payments.air.widget.impl.ui.chat.b f237928y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Continuation continuation, com.revolut.feature.payments.air.widget.impl.ui.chat.b bVar, int i) {
        super(3, continuation);
        this.u = i;
        this.f237928y = bVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                p pVar = new p(continuation, this.f237928y, 0);
                pVar.f237926w = flowCollector;
                pVar.f237927x = obj3;
                return pVar.invokeSuspend(Unit.f186387a);
            default:
                p pVar2 = new p(continuation, this.f237928y, 1);
                pVar2.f237926w = flowCollector;
                pVar2.f237927x = obj3;
                return pVar2.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f237926w;
                    com.revolut.feature.payments.air.widget.impl.ui.chat.b bVar = this.f237928y;
                    no9.a aVar2 = bVar.f79116m;
                    String widgetInstanceId = ((k) bVar.c3().f310975b).f237917a;
                    aVar2.getClass();
                    Intrinsics.checkNotNullParameter(widgetInstanceId, "widgetInstanceId");
                    w4l.h loadingStrategy = w4l.h.f294642c;
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    lo9.e eVar = (lo9.e) aVar2.f217959a;
                    eVar.getClass();
                    Intrinsics.checkNotNullParameter(widgetInstanceId, "widgetInstanceId");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    wkm.l lVarQ = vkm.q.Q(eVar.f197427c.b(widgetInstanceId, loadingStrategy), new p(null, bVar, 1));
                    this.f237926w = null;
                    this.f237927x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, lVarQ, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f237926w;
                    Data data = (Data) this.f237927x;
                    com.revolut.feature.payments.air.widget.impl.ui.chat.b bVar2 = this.f237928y;
                    Flow flow = (Flow) iii.c.f(data, new b1(bVar2, 17), new k0(bVar2, 8), new f0(bVar2, 4));
                    this.f237926w = null;
                    this.f237927x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, flow, this) == aVar3) {
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
