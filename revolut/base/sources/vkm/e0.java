package vkm;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes13.dex */
public final class e0 implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Flow f290015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f290016b;

    public e0(Flow flow, int i) {
        this.f290015a = flow;
        this.f290016b = i;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object objCollect = this.f290015a.collect(new g0(new Ref$IntRef(), this.f290016b, flowCollector), continuation);
        return objCollect == fim.a.COROUTINE_SUSPENDED ? objCollect : Unit.f186387a;
    }
}
