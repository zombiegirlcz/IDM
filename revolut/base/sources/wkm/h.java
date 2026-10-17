package wkm;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes13.dex */
public final class h extends g {
    public h(int i, int i2, CoroutineContext coroutineContext, Flow flow, ukm.f fVar) {
        super((i2 & 4) != 0 ? -3 : i, (i2 & 2) != 0 ? kotlin.coroutines.g.f186406a : coroutineContext, flow, (i2 & 8) != 0 ? ukm.f.SUSPEND : fVar);
    }

    @Override // wkm.d
    public final d c(CoroutineContext coroutineContext, int i, ukm.f fVar) {
        return new h(i, coroutineContext, this.d, fVar);
    }

    @Override // wkm.d
    public final Flow e() {
        return this.d;
    }

    @Override // wkm.g
    public final Object j(FlowCollector flowCollector, Continuation continuation) {
        Object objCollect = this.d.collect(flowCollector, continuation);
        return objCollect == fim.a.COROUTINE_SUSPENDED ? objCollect : Unit.f186387a;
    }
}
