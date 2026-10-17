package df1;

import com.revolut.core.ui_kit.delegates.vh;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.shopping_cart.LitePosShoppingCartScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ LitePosShoppingCartScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(LitePosShoppingCartScreen litePosShoppingCartScreen, Continuation continuation) {
        super(2, continuation);
        this.v = litePosShoppingCartScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((vh) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        vh vhVar = (vh) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k kVarE3 = this.v.R2();
        Object obj3 = vhVar.f54883a.f;
        com.revolut.feature.acquiring.lite_pos.impl.ui.screen.shopping_cart.c cVar = (com.revolut.feature.acquiring.lite_pos.impl.ui.screen.shopping_cart.c) kVarE3;
        cVar.getClass();
        cVar.n2(new d3i.g(obj3, cVar, null, 20), new whi.b(6));
        return Unit.f186387a;
    }
}
