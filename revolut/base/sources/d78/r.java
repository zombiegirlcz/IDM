package d78;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends gim.i implements Function3 {
    public int u;
    public /* synthetic */ FlowCollector v;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        r rVar = new r(3, (Continuation) obj4);
        rVar.v = (FlowCollector) obj2;
        return rVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FlowCollector flowCollector = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            f0 f0Var = f0.f322471a;
            this.v = null;
            this.u = 1;
            if (flowCollector.emit(f0Var, this) == aVar) {
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
