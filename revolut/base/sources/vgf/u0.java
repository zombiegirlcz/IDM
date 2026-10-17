package vgf;

import com.revolut.feature.unified_transactions.models.UnifiedTransaction;
import com.revolut.feature.wealth.api.domain.model.transactions.InvestTransaction;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class u0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f289136w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a aVar, Object obj2, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
        this.f289136w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new u0(this.v, this.f289136w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((u0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a aVar2 = this.v;
            boolean zA = aVar2.I.a();
            Object obj3 = this.f289136w;
            if (!zA) {
                e1 e1Var = aVar2.f91941y;
                InvestTransaction transaction = ((UnifiedTransaction.Invest) obj3).f94571a;
                e1Var.getClass();
                Intrinsics.checkNotNullParameter(transaction, "transaction");
                return aVar2.C1(e1Var.f.q(transaction));
            }
            this.u = 1;
            if (com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a.I2(aVar2, (UnifiedTransaction) obj3, this) == aVar) {
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
