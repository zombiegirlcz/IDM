package w3c;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.revolut_shop.ui.screen.checkout.CheckoutScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CheckoutScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CheckoutScreen checkoutScreen, Continuation continuation) {
        super(2, continuation);
        this.v = checkoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        String str = model.f52373a;
        boolean zF = Intrinsics.f(str, "ERROR_STATE_ID");
        CheckoutScreen checkoutScreen = this.v;
        if (zF) {
            ((com.revolut.feature.revolut_shop.ui.screen.checkout.a) checkoutScreen.d()).f84233y.b(Unit.f186387a);
        } else if (Intrinsics.f(str, "EMPTY_CART_LIST_ID")) {
            ((com.revolut.feature.revolut_shop.ui.screen.checkout.a) checkoutScreen.d()).C2(g.f294275a);
        }
        return Unit.f186387a;
    }
}
