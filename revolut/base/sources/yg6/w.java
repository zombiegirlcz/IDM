package yg6;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends gim.i implements Function3 {
    public int u;
    public /* synthetic */ FlowCollector v;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        w wVar = new w(3, (Continuation) obj4);
        wVar.v = (FlowCollector) obj2;
        return wVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FlowCollector flowCollector = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            Data dataP = zi0.c.P(f0.f322471a, false, null, 3);
            this.v = null;
            this.u = 1;
            if (flowCollector.emit(dataP, this) == aVar) {
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
