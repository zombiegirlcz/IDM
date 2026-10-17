package d27;

import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.OrderInitPageCreateScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ OrderInitPageCreateScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(OrderInitPageCreateScreen orderInitPageCreateScreen, Continuation continuation) {
        super(2, continuation);
        this.v = orderInitPageCreateScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((BannerDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        BannerDelegate.Model model = (BannerDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        z zVarD = this.v.d();
        String listId = model.f51700a;
        com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a aVar2 = (com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a) zVarD;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "ITEM_ID_CARD_BANNER")) {
            aVar2.n2(new l0(aVar2, null, 0), new whi.b(6));
            aVar2.H2(aVar2.E, new d0(3));
        }
        return Unit.f186387a;
    }
}
