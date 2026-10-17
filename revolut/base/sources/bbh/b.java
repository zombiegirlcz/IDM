package bbh;

import com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$Disclaimers;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends i implements Function3 {
    public int u;
    public /* synthetic */ FlowCollector v;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        b bVar = new b(3, (Continuation) obj4);
        bVar.v = (FlowCollector) obj2;
        return bVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FlowCollector flowCollector = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            InvestTransactionsListContract$Disclaimers.INSTANCE.getClass();
            InvestTransactionsListContract$Disclaimers investTransactionsListContract$DisclaimersB = InvestTransactionsListContract$Disclaimers.Companion.b();
            this.v = null;
            this.u = 1;
            if (flowCollector.emit(investTransactionsListContract$DisclaimersB, this) == aVar) {
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
