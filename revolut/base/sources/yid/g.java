package yid;

import com.revolut.core.ui_kit.delegates.SearchButtonDelegate;
import com.revolut.feature.shops.impl.ui.carousel_details.ShopsCarouselDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ShopsCarouselDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ShopsCarouselDetailsScreen shopsCarouselDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = shopsCarouselDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((SearchButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SearchButtonDelegate.Model model = (SearchButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarE3 = this.v.d();
        String listId = model.f53284a;
        com.revolut.feature.shops.impl.ui.carousel_details.a aVar2 = (com.revolut.feature.shops.impl.ui.carousel_details.a) nVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "SHOPS_COMBINED_SEARCH_BUTTON")) {
            aVar2.C2(l.f314312a);
        }
        return Unit.f186387a;
    }
}
