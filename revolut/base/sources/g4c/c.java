package g4c;

import com.revolut.core.ui_kit.delegates.VaultsProgressDelegate;
import com.revolut.feature.revolut_shop.ui.screen.order_history.OrderHistoryScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ OrderHistoryScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(OrderHistoryScreen orderHistoryScreen, Continuation continuation) {
        super(2, continuation);
        this.v = orderHistoryScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((VaultsProgressDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        VaultsProgressDelegate.Model model = (VaultsProgressDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.o;
        if (obj3 instanceof j) {
            l lVarE3 = this.v.d();
            String orderId = ((j) obj3).f140478a;
            u uVar = (u) lVarE3;
            uVar.getClass();
            Intrinsics.checkNotNullParameter(orderId, "orderId");
            uVar.C2(new k(orderId));
        }
        return Unit.f186387a;
    }
}
