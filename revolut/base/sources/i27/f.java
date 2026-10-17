package i27;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig;
import com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.OrderInitPageListScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ OrderInitPageListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(OrderInitPageListScreen orderInitPageListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = orderInitPageListScreen;
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
        g gVarE3 = this.v.d();
        String listId = model.f52373a;
        com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.b bVar = (com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.b) gVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        int iHashCode = listId.hashCode();
        if (iHashCode != -751469465) {
            if (iHashCode != -82788029) {
                if (iHashCode == 1918729248 && listId.equals("ERROR_STATE_ID")) {
                    bVar.n2(new l(bVar, null, 3), new whi.b(6));
                }
            } else if (listId.equals("NO_RESULTS_FOUND_ITEM_ID")) {
                bVar.H2(bVar.f74195r, new i0k.f(21));
            }
        } else if (listId.equals("EMPTY_STATE_ITEM_ID")) {
            bVar.C1(new FreelancerBizFeatureConfig.NewSale(cs6.c.PAYMENT_LINK, null));
        }
        return Unit.f186387a;
    }
}
