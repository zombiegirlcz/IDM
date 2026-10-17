package ou6;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig;
import com.revolut.feature.freelancer.impl.ui.acquiring_order.list.FreelancerAcquiringOrderListScreen;
import com.revolut.feature.revolut_shop.api.RevolutShopDestination$InputData;
import com.revolut.feature.revolut_shop.api.domain.model.IppProductType;
import com.revolut.retail.feature.freelancer.revolut_shop.api.FreelancerRevolutShopDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FreelancerAcquiringOrderListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(FreelancerAcquiringOrderListScreen freelancerAcquiringOrderListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = freelancerAcquiringOrderListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarE3 = this.v.R2();
        String listId = model.f53228a;
        Object obj3 = model.u;
        com.revolut.feature.freelancer.impl.ui.acquiring_order.list.a aVar2 = (com.revolut.feature.freelancer.impl.ui.acquiring_order.list.a) lVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (obj3 instanceof nr6.b) {
            aVar2.C2(new j(((nr6.b) obj3).f218537a));
        } else if (Intrinsics.f(listId, "PRODUCT_CREATE_CARD_READER_SALE_LIST_ID")) {
            aVar2.C1(new FreelancerBizFeatureConfig.NewSale(cs6.c.CARD_READER, null));
        } else if (Intrinsics.f(listId, "PRODUCT_CREATE_TERMINAL_SALE_LIST_ID")) {
            aVar2.C1(new FreelancerRevolutShopDestination(new RevolutShopDestination$InputData.Product(IppProductType.AndroidTerminal.f84195a)));
        }
        return Unit.f186387a;
    }
}
