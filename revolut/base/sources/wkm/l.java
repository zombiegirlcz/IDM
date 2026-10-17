package wkm;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import skm.e0;

/* JADX INFO: loaded from: classes13.dex */
public final class l extends g {
    public final gim.i e;

    /* JADX WARN: Multi-variable type inference failed */
    public l(Function3 function3, Flow flow, CoroutineContext coroutineContext, int i, ukm.f fVar) {
        super(i, coroutineContext, flow, fVar);
        this.e = (gim.i) function3;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [gim.i, kotlin.jvm.functions.Function3] */
    @Override // wkm.d
    public final d c(CoroutineContext coroutineContext, int i, ukm.f fVar) {
        return new l(this.e, this.d, coroutineContext, i, fVar);
    }

    @Override // wkm.g
    public final Object j(FlowCollector flowCollector, Continuation continuation) {
        Object objO = e0.o(new i(this, flowCollector, null), continuation);
        return objO == fim.a.COROUTINE_SUSPENDED ? objO : Unit.f186387a;
    }
}
