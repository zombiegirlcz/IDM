package ns9;

import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.payments.groups.impl.mappers.transactions.GroupTransactionItem;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pfm.r;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.payments.groups.impl.ui_chat.group_transactions.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ GroupTransactionItem.Bill f218768w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.revolut.feature.payments.groups.impl.ui_chat.group_transactions.a aVar, GroupTransactionItem.Bill bill, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
        this.f218768w = bill;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new i(this.v, this.f218768w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((i) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            com.revolut.feature.payments.groups.impl.ui_chat.group_transactions.a aVar2 = this.v;
            ps9.c cVar = aVar2.f79365p;
            PaymentGroup group = aVar2.o.f79362b;
            oq9.i bill = this.f218768w.f79326a;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(group, "group");
            Intrinsics.checkNotNullParameter(bill, "bill");
            r rVarJ = ((mr9.a) cVar.f239431a).j(group.f79285a, bill);
            this.u = 1;
            if (nim.a.a(rVarJ, this) == aVar) {
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
