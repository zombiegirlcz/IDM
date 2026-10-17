package df1;

import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.shopping_cart.LitePosShoppingCartScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ LitePosShoppingCartScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(LitePosShoppingCartScreen litePosShoppingCartScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = litePosShoppingCartScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            default:
                return new d(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        LitePosShoppingCartScreen litePosShoppingCartScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                litePosShoppingCartScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.acquiring.lite_pos.impl.ui.screen.shopping_cart.c cVar = (com.revolut.feature.acquiring.lite_pos.impl.ui.screen.shopping_cart.c) litePosShoppingCartScreen.R2();
                cVar.getClass();
                cVar.l2(new com.revolut.feature.acquiring.lite_pos.impl.ui.screen.shopping_cart.b(cVar, null), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
