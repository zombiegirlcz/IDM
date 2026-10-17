package yid;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.shops.impl.ui.carousel_details.ShopsCarouselDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ShopsCarouselDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ShopsCarouselDetailsScreen shopsCarouselDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = shopsCarouselDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarE3 = this.v.d();
        String listId = model.f52373a;
        com.revolut.feature.shops.impl.ui.carousel_details.a aVar2 = (com.revolut.feature.shops.impl.ui.carousel_details.a) nVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "SHOPS_CARROUSEL_DETAILS_LIST_ID_STATE_ERROR")) {
            aVar2.J2();
        }
        return Unit.f186387a;
    }
}
