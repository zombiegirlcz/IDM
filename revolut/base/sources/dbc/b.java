package dbc;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.revolutpay.api.config.RevolutPayFeatureConfig$RevolutPayManagementHome;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.deliveries.DeliveriesScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DeliveriesScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(DeliveriesScreen deliveriesScreen, Continuation continuation) {
        super(2, continuation);
        this.v = deliveriesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = (e) this.v.Q.getValue();
        String listId = model.f52373a;
        k kVar = (k) eVar;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "DELIVERIES_ERROR_LIST_ID")) {
            kVar.f112719s.a();
        } else if (Intrinsics.f(listId, "DELIVERIES_EMPTY_LIST_ID")) {
            if (kVar.o.O()) {
                kVar.C1(RevolutPayFeatureConfig$RevolutPayManagementHome.f84280a);
            } else {
                kVar.l2(new h(kVar, null), new yi5.b(26));
            }
        }
        return Unit.f186387a;
    }
}
