package ps9;

import com.revolut.feature.payments.groups.impl.mappers.transactions.GroupTransactionItem;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class y extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.payments.groups.impl.ui_chat.settings.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ GroupTransactionItem.Bill f239450w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.revolut.feature.payments.groups.impl.ui_chat.settings.d dVar, GroupTransactionItem.Bill bill, Continuation continuation) {
        super(1, continuation);
        this.v = dVar;
        this.f239450w = bill;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new y(this.v, this.f239450w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((y) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            GroupTransactionItem.Bill bill = this.f239450w;
            com.revolut.feature.payments.groups.impl.ui_chat.settings.d dVar = this.v;
            x xVar = new x(dVar, bill, null);
            this.u = 1;
            if (dVar.p2(this, xVar) == aVar) {
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
