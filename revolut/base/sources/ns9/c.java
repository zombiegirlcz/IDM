package ns9;

import com.revolut.feature.payments.groups.impl.mappers.transactions.GroupTransactionItem;
import com.revolut.feature.payments.groups.impl.ui_chat.group_transactions.GroupTransactionsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ GroupTransactionsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(GroupTransactionsScreen groupTransactionsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = groupTransactionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((GroupTransactionItem.Bill) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        GroupTransactionItem.Bill parcel = (GroupTransactionItem.Bill) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVar = (f) this.v.R.getValue();
        Intrinsics.h(parcel);
        com.revolut.feature.payments.groups.impl.ui_chat.group_transactions.a aVar2 = (com.revolut.feature.payments.groups.impl.ui_chat.group_transactions.a) fVar;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        aVar2.l2(new k(aVar2, parcel, null), new yi5.b(26));
        return Unit.f186387a;
    }
}
