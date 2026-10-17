package m8c;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.revolutpay.impl.ui.deferred_payment.DeferredPaymentScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m2f.b0;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DeferredPaymentScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(DeferredPaymentScreen deferredPaymentScreen, Continuation continuation) {
        super(2, continuation);
        this.v = deferredPaymentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        j jVar;
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVar = (q) this.v.f84472a0.getValue();
        String listId = model.f52613a;
        j60.a aVar2 = qVar.f203485r;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Continuation continuation = null;
        if (Intrinsics.f(listId, "BLOCK_PAYMENT_CANCEL_LIST_ID")) {
            j60.a.v(aVar2, false, null, 3);
        } else if (Intrinsics.f(listId, "BLOCK_PAYMENT_CONFIRM_LIST_ID") && (jVar = (j) ((k) qVar.t2()).f203473a.getContent()) != null) {
            String str = jVar.f203471a.f252080a;
            j60.a.v(aVar2, false, null, 3);
            qVar.n2(new b0(qVar, str, continuation, 9), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
