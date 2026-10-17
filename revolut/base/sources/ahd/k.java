package ahd;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.watchlist_assets.WatchlistAssetsScreen;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.sorting.WatchlistSortingController;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ WatchlistAssetsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(WatchlistAssetsScreen watchlistAssetsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = watchlistAssetsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarE3 = this.v.R2();
        Intrinsics.h(model);
        c0 c0Var = (c0) lVarE3;
        c0Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        ogd.k kVar = ((n) ((j2) c0Var.f4943w.f22677a).getValue()).f4949a;
        if (kVar == null) {
            kVar = new ogd.k(ogd.m.MANUAL, null);
        }
        c0Var.f2(new WatchlistSortingController(new jhd.g(kVar, zhm.v.k(ogd.m.MANUAL, ogd.m.PRICE_CHANGE, ogd.m.ALPHABETICAL))), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new t(c0Var, 0));
        return Unit.f186387a;
    }
}
