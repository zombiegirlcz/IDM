package ajd;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.shops.impl.ui.combined_search.ShopsCombinedSearchScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ShopsCombinedSearchScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ShopsCombinedSearchScreen shopsCombinedSearchScreen, Continuation continuation) {
        super(2, continuation);
        this.v = shopsCombinedSearchScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (a0.H(model.f53228a, "SHOPS_SEARCH_LAYOUT_RECENT_SEARCH_ITEM_", false)) {
            l lVarT2 = this.v.T2();
            Object obj3 = model.u;
            Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.shops.impl.model.ShopsBrandRecentSearch");
            mid.j recentSearch = (mid.j) obj3;
            s sVar = (s) lVarT2;
            sVar.getClass();
            Intrinsics.checkNotNullParameter(recentSearch, "recentSearch");
            sVar.n2(new ad4.c(sVar, recentSearch, null, 17), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
