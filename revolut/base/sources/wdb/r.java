package wdb;

import com.revolut.data.model.Data;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes6.dex */
public final class r extends gim.i implements Function3 {
    public int u;
    public /* synthetic */ FlowCollector v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Throwable f296531w;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        r rVar = new r(3, (Continuation) obj4);
        rVar.v = (FlowCollector) obj2;
        rVar.f296531w = (Throwable) obj3;
        return rVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        FlowCollector flowCollector = this.v;
        Throwable th10 = this.f296531w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            if (th10 instanceof CancellationException) {
                throw th10;
            }
            Data dataO = zi0.c.O(th10);
            this.v = null;
            this.f296531w = null;
            this.u = 1;
            if (flowCollector.emit(dataO, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
