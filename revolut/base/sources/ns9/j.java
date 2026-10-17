package ns9;

import com.revolut.feature.payments.groups.impl.mappers.transactions.GroupTransactionItem;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.payments.groups.impl.ui_chat.group_transactions.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ GroupTransactionItem.Bill f218769w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.revolut.feature.payments.groups.impl.ui_chat.group_transactions.a aVar, GroupTransactionItem.Bill bill, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
        this.f218769w = bill;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new j(this.v, this.f218769w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((j) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            GroupTransactionItem.Bill bill = this.f218769w;
            com.revolut.feature.payments.groups.impl.ui_chat.group_transactions.a aVar2 = this.v;
            i iVar = new i(aVar2, bill, null);
            this.u = 1;
            if (aVar2.p2(this, iVar) == aVar) {
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
