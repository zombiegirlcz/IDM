package ns9;

import com.revolut.feature.payments.groups.impl.mappers.transactions.GroupTransactionItem;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.payments.groups.impl.ui_chat.group_transactions.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ GroupTransactionItem.Bill f218770w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.revolut.feature.payments.groups.impl.ui_chat.group_transactions.a aVar, GroupTransactionItem.Bill bill, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f218770w = bill;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new k(this.v, this.f218770w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        GroupTransactionItem.Bill bill = this.f218770w;
        com.revolut.feature.payments.groups.impl.ui_chat.group_transactions.a aVar2 = this.v;
        j jVar = new j(aVar2, bill, null);
        this.u = 1;
        Object objB = pu7.a.B(aVar2.k, "onTransactionRemoveClicked", jVar, this);
        return objB == aVar ? aVar : objB;
    }
}
