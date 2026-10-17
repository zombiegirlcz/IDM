package ahd;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.watchlist_assets.WatchlistAssetsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ WatchlistAssetsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(WatchlistAssetsScreen watchlistAssetsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = watchlistAssetsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        WatchlistItem watchlistItemA;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarE3 = this.v.R2();
        Intrinsics.h(model);
        c0 c0Var = (c0) lVarE3;
        c0Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f53228a, "add-to-watchlist-list-id")) {
            String str = c0Var.o.f86929a;
            if (str != null) {
                c0Var.J2(str);
            }
        } else {
            Object obj3 = model.u;
            ifd.g gVar = obj3 instanceof ifd.g ? (ifd.g) obj3 : null;
            if (gVar != null && (watchlistItemA = gVar.a()) != null) {
                yji.l.b1(c0Var, c0Var.f4941s.a(watchlistItemA), null, new a0(c0Var, null), 3);
            }
        }
        return Unit.f186387a;
    }
}
