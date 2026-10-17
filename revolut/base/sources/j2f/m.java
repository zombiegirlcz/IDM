package j2f;

import b8d.a0;
import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.q0;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f170855w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f170856x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ o f170857y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Continuation continuation, o oVar, int i) {
        super(3, continuation);
        this.u = i;
        this.f170857y = oVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                m mVar = new m(continuation, this.f170857y, 0);
                mVar.f170855w = flowCollector;
                mVar.f170856x = obj3;
                return mVar.invokeSuspend(Unit.f186387a);
            default:
                m mVar2 = new m(continuation, this.f170857y, 1);
                mVar2.f170855w = flowCollector;
                mVar2.f170856x = obj3;
                return mVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Flow gVar;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f170855w;
                    o oVar = this.f170857y;
                    q0 q0VarN = rd0.e.n(oVar.f170859p.h(oVar.o.f91157a, w4l.h.f294642c), h0.f322473a);
                    this.f170855w = null;
                    this.f170856x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, q0VarN, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f170855w;
                    Data data = (Data) this.f170856x;
                    u2f.d dVar = (u2f.d) data.getContent();
                    if (dVar != null) {
                        gVar = rd0.e.n(this.f170857y.f170860q.c(dVar.f276626p, w4l.i.f294643c), h0.f322473a);
                    } else {
                        gVar = new go.g(new Data(null, data.getError(), data.getLoading(), 1, null), 2);
                    }
                    this.f170855w = null;
                    this.f170856x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector2);
                    Object objCollect = gVar.collect(new a0(flowCollector2, data, 5), this);
                    if (objCollect != aVar2) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect != aVar2) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect == aVar2) {
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
