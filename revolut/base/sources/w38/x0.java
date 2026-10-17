package w38;

import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x0 implements FlowCollector, kotlin.jvm.internal.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f294240a;

    public x0(FlowCollector flowCollector) {
        this.f294240a = flowCollector;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj2, Continuation continuation) {
        Object objEmit = this.f294240a.emit((List) obj2, continuation);
        return objEmit == fim.a.COROUTINE_SUSPENDED ? objEmit : Unit.f186387a;
    }

    public final boolean equals(Object obj2) {
        if ((obj2 instanceof FlowCollector) && (obj2 instanceof kotlin.jvm.internal.n)) {
            return Intrinsics.f(getFunctionDelegate(), ((kotlin.jvm.internal.n) obj2).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.n
    public final Function getFunctionDelegate() {
        return new kotlin.jvm.internal.q(2, 0, FlowCollector.class, this.f294240a, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
