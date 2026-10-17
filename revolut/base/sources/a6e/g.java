package a6e;

import com.revolut.data.model.Data;
import kotlin.Function;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class g implements FlowCollector, kotlin.jvm.internal.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProducerScope f1624a;

    public g(ProducerScope producerScope) {
        this.f1624a = producerScope;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj2, Continuation continuation) {
        Object objSend = this.f1624a.send((Data) obj2, continuation);
        return objSend == fim.a.COROUTINE_SUSPENDED ? objSend : Unit.f186387a;
    }

    public final boolean equals(Object obj2) {
        if ((obj2 instanceof FlowCollector) && (obj2 instanceof kotlin.jvm.internal.n)) {
            return Intrinsics.f(getFunctionDelegate(), ((kotlin.jvm.internal.n) obj2).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.n
    public final Function getFunctionDelegate() {
        return new kotlin.jvm.internal.q(2, 0, ProducerScope.class, this.f1624a, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
