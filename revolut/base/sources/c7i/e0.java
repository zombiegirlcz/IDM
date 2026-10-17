package c7i;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class e0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature_move_money.impl.automation.screen.c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.revolut.feature_move_money.impl.automation.screen.c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e0 e0Var = new e0(this.v, continuation);
        e0Var.u = obj2;
        return e0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e0) create((Clause) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Clause clause = (Clause) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature_move_money.impl.automation.screen.c cVar = this.v;
        cVar.H2(cVar.D, new ag1.l(clause, 2));
        return Unit.f186387a;
    }
}
