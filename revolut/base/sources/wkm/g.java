package wkm;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes13.dex */
public abstract class g extends d {
    public final Flow d;

    public g(int i, CoroutineContext coroutineContext, Flow flow, ukm.f fVar) {
        super(coroutineContext, i, fVar);
        this.d = flow;
    }

    @Override // wkm.d
    public final Object b(ProducerScope producerScope, Continuation continuation) {
        Object objJ = j(new w(producerScope), continuation);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }

    @Override // wkm.d, kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        if (this.f298307b == -3) {
            CoroutineContext context = continuation.getContext();
            Boolean bool = Boolean.FALSE;
            pq0.d dVar = new pq0.d(5);
            CoroutineContext coroutineContext = this.f298306a;
            CoroutineContext coroutineContextPlus = !((Boolean) coroutineContext.fold(bool, dVar)).booleanValue() ? context.plus(coroutineContext) : skm.x.a(context, coroutineContext, false);
            if (Intrinsics.f(coroutineContextPlus, context)) {
                Object objJ = j(flowCollector, continuation);
                return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
            }
            eim.a aVar = kotlin.coroutines.d.q1;
            if (Intrinsics.f(coroutineContextPlus.get(aVar), context.get(aVar))) {
                Object objA0 = mif.a.a0(coroutineContextPlus, mif.a.c(flowCollector, continuation.getContext()), zkm.w.b(coroutineContextPlus), new wgb.v(this, (Continuation) null, 12), continuation);
                return objA0 == fim.a.COROUTINE_SUSPENDED ? objA0 : Unit.f186387a;
            }
        }
        Object objCollect = super.collect(flowCollector, continuation);
        return objCollect == fim.a.COROUTINE_SUSPENDED ? objCollect : Unit.f186387a;
    }

    public abstract Object j(FlowCollector flowCollector, Continuation continuation);

    @Override // wkm.d
    public final String toString() {
        return this.d + " -> " + super.toString();
    }
}
