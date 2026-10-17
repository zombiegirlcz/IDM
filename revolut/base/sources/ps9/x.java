package ps9;

import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.payments.groups.impl.mappers.transactions.GroupTransactionItem;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class x extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.payments.groups.impl.ui_chat.settings.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ GroupTransactionItem.Bill f239449w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.revolut.feature.payments.groups.impl.ui_chat.settings.d dVar, GroupTransactionItem.Bill bill, Continuation continuation) {
        super(1, continuation);
        this.v = dVar;
        this.f239449w = bill;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new x(this.v, this.f239449w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((x) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            com.revolut.feature.payments.groups.impl.ui_chat.settings.d dVar = this.v;
            c cVar = dVar.f79386q;
            PaymentGroup group = ((p) ((j2) dVar.C.f22677a).getValue()).f239437a;
            oq9.i bill = this.f239449w.f79326a;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(group, "group");
            Intrinsics.checkNotNullParameter(bill, "bill");
            pfm.r rVarJ = ((mr9.a) cVar.f239431a).j(group.f79285a, bill);
            this.u = 1;
            if (nim.a.a(rVarJ, this) == aVar) {
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
