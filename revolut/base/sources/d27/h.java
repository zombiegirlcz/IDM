package d27;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.OrderInitPageCreateScreen;
import com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.OrderInitPageCreateScreenContract$Step;
import com.revolut.feature.shared.branding.api.destination.BrandingParams;
import com.revolut.feature.shared.branding.api.destination.BrandingSharedDestination;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ OrderInitPageCreateScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(OrderInitPageCreateScreen orderInitPageCreateScreen, Continuation continuation) {
        super(2, continuation);
        this.v = orderInitPageCreateScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ActionsView.Item item = (ActionsView.Item) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        z zVarD = this.v.d();
        String listId = item.f58316a;
        com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a aVar2 = (com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a) zVarD;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "LIST_ID_ACTION_BRANDING")) {
            aVar2.C1(new BrandingSharedDestination(new BrandingSharedDestination.InputData(BrandingParams.RetailBrandingParams.f86062a)));
        } else if (Intrinsics.f(listId, "LIST_ID_ACTION_PRODUCTS")) {
            oki.h.v2(aVar2.F, OrderInitPageCreateScreenContract$Step.Catalogue.f74171a, ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
        }
        return Unit.f186387a;
    }
}
