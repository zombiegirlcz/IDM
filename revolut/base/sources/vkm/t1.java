package vkm;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: classes13.dex */
public final class t1 implements SharedFlow, Flow, wkm.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SharedFlow f290123a;

    public t1(MutableSharedFlow mutableSharedFlow, skm.a2 a2Var) {
        this.f290123a = mutableSharedFlow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        return this.f290123a.collect(flowCollector, continuation);
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public final List d() {
        return this.f290123a.d();
    }

    @Override // wkm.q
    public final Flow f(CoroutineContext coroutineContext, int i, ukm.f fVar) {
        return q.D(this, coroutineContext, i, fVar);
    }
}
