package g4c;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.revolut_shop.ui.screen.order_history.OrderHistoryScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ OrderHistoryScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(OrderHistoryScreen orderHistoryScreen, Continuation continuation) {
        super(2, continuation);
        this.v = orderHistoryScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        String str = model.f52373a;
        boolean zF = Intrinsics.f(str, "EMPTY_ORDER_LIST_ID");
        OrderHistoryScreen orderHistoryScreen = this.v;
        if (zF) {
            ((u) orderHistoryScreen.d()).B2();
        } else if (Intrinsics.f(str, "ERROR_STATE_ID")) {
            u uVar = (u) orderHistoryScreen.d();
            uVar.f140493r.b(Unit.f186387a);
            uVar.n2(new p(uVar, null, 2), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
