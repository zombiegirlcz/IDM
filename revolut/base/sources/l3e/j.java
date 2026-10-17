package l3e;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.store.impl.ui.orders.StoreOrdersScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ StoreOrdersScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(StoreOrdersScreen storeOrdersScreen, Continuation continuation) {
        super(2, continuation);
        this.v = storeOrdersScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        String str = model.f52613a;
        boolean zF = Intrinsics.f(str, "STORE_ORDERS_SEE_ALL_ID");
        StoreOrdersScreen storeOrdersScreen = this.v;
        if (zF) {
            ((com.revolut.feature.store.impl.ui.orders.a) storeOrdersScreen.R2()).C2(d.f191941a);
        } else if (Intrinsics.f(str, "STORE_ORDERS_GIFT_CARDS_SEE_ALL_ID")) {
            ((com.revolut.feature.store.impl.ui.orders.a) storeOrdersScreen.R2()).C2(c.f191940a);
        }
        return Unit.f186387a;
    }
}
