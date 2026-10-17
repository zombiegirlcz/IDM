package m8c;

import com.revolut.feature.revolutpay.impl.ui.deferred_payment.DeferredPaymentScreen;
import ip0.x10;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DeferredPaymentScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(DeferredPaymentScreen deferredPaymentScreen, Continuation continuation) {
        super(2, continuation);
        this.v = deferredPaymentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((x10) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        x10 x10Var = (x10) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVar = (q) this.v.f84472a0.getValue();
        String listId = x10Var.f167082b.f58316a;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "DEBIT_NOTE_ADD_MONEY_BUTTON_LIST_ID")) {
            qVar.n2(new lo.c(qVar, (Continuation) null, 24), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
