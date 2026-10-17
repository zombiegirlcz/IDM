package ud3;

import com.revolut.feature.cashback.api.models.CashbackBySources;
import com.revolut.feature.cashback.impl.ui.yourcashback.YourCashbackFlowContract$Step;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ e0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(e0 e0Var, Continuation continuation) {
        super(1, continuation);
        this.v = e0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b0(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        e0 e0Var = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            efm.r rVarG = m70.a.g(e0Var.f279094p.e(), null, new u4i.u(28), 1);
            this.u = 1;
            obj2 = nim.a.c(rVarG, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        CashbackBySources cashbackBySources = (CashbackBySources) obj2;
        Intrinsics.h(cashbackBySources);
        e0Var.v2(new j(new YourCashbackFlowContract$Step.Transactions(cashbackBySources)));
        return Unit.f186387a;
    }
}
