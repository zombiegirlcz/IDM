package vkm;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes14.dex */
public final class u1 implements StateFlow, Flow, wkm.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StateFlow f290128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Job f290129b;

    public u1(MutableStateFlow mutableStateFlow, Job job2) {
        this.f290128a = mutableStateFlow;
        this.f290129b = job2;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        return this.f290128a.collect(flowCollector, continuation);
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public final List d() {
        return this.f290128a.d();
    }

    @Override // wkm.q
    public final Flow f(CoroutineContext coroutineContext, int i, ukm.f fVar) {
        return (((i < 0 || i >= 2) && i != -2) || fVar != ukm.f.DROP_OLDEST) ? q.D(this, coroutineContext, i, fVar) : this;
    }

    @Override // kotlinx.coroutines.flow.StateFlow
    public final Object getValue() {
        return this.f290128a.getValue();
    }
}
