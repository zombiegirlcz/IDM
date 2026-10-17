package bec;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.revolutpay.shared.ui.pay_with_any.PayWithAnyScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PayWithAnyScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(PayWithAnyScreen payWithAnyScreen, Continuation continuation) {
        super(2, continuation);
        this.v = payWithAnyScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        y yVar = new y(this.v, continuation);
        yVar.u = obj2;
        return yVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((y) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVarE3 = this.v.d();
        String listId = model.f53228a;
        Object obj3 = model.u;
        com.revolut.feature.revolutpay.shared.ui.pay_with_any.a aVar2 = (com.revolut.feature.revolutpay.shared.ui.pay_with_any.a) qVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "ADD_MONEY_ITEM_ID")) {
            aVar2.K2();
        } else if (Intrinsics.f(listId, "MOVE_MONEY_ITEM_ID")) {
            aVar2.L2();
        } else if (obj3 instanceof g) {
            aVar2.N2(((g) obj3).f14775a);
        } else if (obj3 instanceof c) {
            aVar2.N2(((c) obj3).f14765a);
        }
        return Unit.f186387a;
    }
}
