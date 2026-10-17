package ps9;

import com.revolut.feature.payments.groups.impl.mappers.transactions.GroupTransactionItem;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class z extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.payments.groups.impl.ui_chat.settings.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ GroupTransactionItem.Bill f239451w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.revolut.feature.payments.groups.impl.ui_chat.settings.d dVar, GroupTransactionItem.Bill bill, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
        this.f239451w = bill;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new z(this.v, this.f239451w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((z) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        GroupTransactionItem.Bill bill = this.f239451w;
        com.revolut.feature.payments.groups.impl.ui_chat.settings.d dVar = this.v;
        y yVar = new y(dVar, bill, null);
        this.u = 1;
        Object objB = pu7.a.B(dVar.k, "onTransactionRemoveClicked", yVar, this);
        return objB == aVar ? aVar : objB;
    }
}
