package u29;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import x19.a;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(2, continuation);
        lVar.v = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FlowCollector flowCollector = (FlowCollector) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            Data data = new Data(a.C1673a.f302352a, null, false, 6, null);
            this.v = null;
            this.u = 1;
            if (flowCollector.emit(data, this) == aVar) {
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
