package bec;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.revolutpay.shared.ui.pay_with_any.PayWithAnyScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class w extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PayWithAnyScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(PayWithAnyScreen payWithAnyScreen, Continuation continuation) {
        super(2, continuation);
        this.v = payWithAnyScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        w wVar = new w(this.v, continuation);
        wVar.u = obj2;
        return wVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((w) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVarE3 = this.v.d();
        String listId = model.f52373a;
        com.revolut.feature.revolutpay.shared.ui.pay_with_any.a aVar2 = (com.revolut.feature.revolutpay.shared.ui.pay_with_any.a) qVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "PAY_WITH_ANY_ERROR_LIST_ID")) {
            aVar2.u.k(Unit.f186387a);
        } else if (Intrinsics.f(listId, "EMPTY_CARDS_LIST_ID")) {
            aVar2.J2();
        }
        return Unit.f186387a;
    }
}
