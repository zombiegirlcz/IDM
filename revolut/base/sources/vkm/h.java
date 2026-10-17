package vkm;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes13.dex */
public final class h implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Flow f290030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f290031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function2 f290032c;

    public h(Flow flow, Function1 function1, Function2 function2) {
        this.f290030a = flow;
        this.f290031b = function1;
        this.f290032c = function2;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f186409a = wkm.b.f298304b;
        Object objCollect = this.f290030a.collect(new mk0.j(this, ref$ObjectRef, flowCollector), continuation);
        return objCollect == fim.a.COROUTINE_SUSPENDED ? objCollect : Unit.f186387a;
    }
}
