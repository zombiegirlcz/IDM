package gwc;

import com.revolut.feature.security_hub.impl.ui.transactions_limits.TransactionsLimitsScreenContract$LimitFlowType;
import com.revolut.feature.security_hub.impl.ui.transactions_limits.flow.TransactionsLimitsFlow;
import com.revolut.feature.security_hub.impl.ui.transactions_limits.flow.TransactionsLimitsFlowContract$FlowState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TransactionsLimitsFlow v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(TransactionsLimitsFlow transactionsLimitsFlow, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = transactionsLimitsFlow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            default:
                return new b(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TransactionsLimitsFlow transactionsLimitsFlow = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((i) transactionsLimitsFlow.N.getValue()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVar = (i) transactionsLimitsFlow.N.getValue();
                Object obj3 = ((TransactionsLimitsFlowContract$FlowState) ((j2) iVar.f147315r.f22677a).getValue()).f85755c;
                if (obj3 == null) {
                    r6.b.r("limitFlowType should be resolved already");
                    obj3 = Unit.f186387a;
                }
                iVar.C2(new d(obj3 instanceof TransactionsLimitsScreenContract$LimitFlowType.SepaExtended ? "92506bf6-2063-4694-9fde-a5a8b85f1656" : "security-hub.limits-faq"));
                break;
        }
        return Unit.f186387a;
    }
}
