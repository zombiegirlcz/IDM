package c7i;

import com.revolut.data.model.Data;
import com.revolut.feature_move_money.impl.automation.contract.AutomationLaunchMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class k0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature_move_money.impl.automation.screen.c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.revolut.feature_move_money.impl.automation.screen.c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new k0(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature_move_money.impl.automation.screen.c cVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            i7i.g gVar = cVar.f97341w;
            AutomationLaunchMode automationLaunchMode = cVar.o.f97328a;
            this.u = 1;
            obj2 = gVar.a(automationLaunchMode, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        cVar.H2(cVar.D, new byi.i((Data) obj2, 28));
        return Unit.f186387a;
    }
}
