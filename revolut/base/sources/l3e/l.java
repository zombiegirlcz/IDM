package l3e;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.store.impl.ui.orders.StoreOrdersScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ StoreOrdersScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(StoreOrdersScreen storeOrdersScreen, Continuation continuation) {
        super(2, continuation);
        this.v = storeOrdersScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(this.v, continuation);
        lVar.u = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        f fVarD3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.store.impl.ui.orders.a aVar2 = (com.revolut.feature.store.impl.ui.orders.a) fVarD3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52373a;
        int iHashCode = str.hashCode();
        if (iHashCode != -1967131359) {
            if (iHashCode != -636570103) {
                if (iHashCode == -441586834 && str.equals("STORE_ORDERS_ERROR_ID")) {
                    aVar2.f88712s.a();
                }
            } else if (str.equals("STORE_ORDERS_EMPTY_ID")) {
                aVar2.C2(b.f191939a);
            }
        } else if (str.equals("STORE_ORDERS_GIFT_CARDS_ERROR_ID")) {
            aVar2.f88713t.a();
        }
        return Unit.f186387a;
    }
}
