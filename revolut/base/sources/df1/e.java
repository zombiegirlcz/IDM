package df1;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.acquiring.lite_pos.api.model.CartItem;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.shopping_cart.LitePosShoppingCartScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ LitePosShoppingCartScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(LitePosShoppingCartScreen litePosShoppingCartScreen, Continuation continuation) {
        super(2, continuation);
        this.v = litePosShoppingCartScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k kVarE3 = this.v.R2();
        Object obj3 = model.u;
        com.revolut.feature.acquiring.lite_pos.impl.ui.screen.shopping_cart.c cVar = (com.revolut.feature.acquiring.lite_pos.impl.ui.screen.shopping_cart.c) kVarE3;
        cVar.getClass();
        CartItem cartItem = obj3 instanceof CartItem ? (CartItem) obj3 : null;
        cd1.b bVar = cartItem != null ? cartItem.f60664b : null;
        int i = bVar == null ? -1 : n.f113759a[bVar.ordinal()];
        if (i == 1) {
            cVar.C2(new j(cartItem));
        } else if (i == 2) {
            cVar.C2(new i(cartItem));
        }
        return Unit.f186387a;
    }
}
