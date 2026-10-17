package vkm;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes13.dex */
public final class v1 extends b {
    public final gim.i e;

    /* JADX WARN: Multi-variable type inference failed */
    public v1(Function2 function2) {
        this.e = (gim.i) function2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [gim.i, kotlin.jvm.functions.Function2] */
    @Override // vkm.b
    public final Object collectSafely(FlowCollector flowCollector, Continuation continuation) {
        Object objInvoke = this.e.invoke(flowCollector, continuation);
        return objInvoke == fim.a.COROUTINE_SUSPENDED ? objInvoke : Unit.f186387a;
    }
}
