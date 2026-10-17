package s57;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function3 {
    public int u;
    public /* synthetic */ FlowCollector v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Throwable f260012w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Function1 f260013x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Function1 function1, Continuation continuation) {
        super(3, continuation);
        this.f260013x = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        d dVar = new d(this.f260013x, (Continuation) obj4);
        dVar.v = (FlowCollector) obj2;
        dVar.f260012w = (Throwable) obj3;
        return dVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FlowCollector flowCollector = this.v;
        Throwable th10 = this.f260012w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            Data dataP = zi0.c.P(this.f260013x.invoke(th10), false, null, 3);
            this.v = null;
            this.f260012w = null;
            this.u = 1;
            if (flowCollector.emit(dataP, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
