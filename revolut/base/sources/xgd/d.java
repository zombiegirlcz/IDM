package xgd;

import com.revolut.feature.shared_separate_favourites.domain.watchlist.Watchlist;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.edit_watchlists.EditWatchlistsController;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.edit_watchlists.EditWatchlistsControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ EditWatchlistsController f305676w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(EditWatchlistsController editWatchlistsController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f305676w = editWatchlistsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f305676w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f305676w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        l lVar = (l) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(lVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        EditWatchlistsController editWatchlistsController = this.f305676w;
        switch (i) {
            case 0:
                l watchlistActionsInfo = (l) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.edit_watchlists.a aVar2 = (com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.edit_watchlists.a) editWatchlistsController.e3();
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(watchlistActionsInfo, "watchlistActionsInfo");
                boolean z = watchlistActionsInfo.f305682b;
                Watchlist watchlist = watchlistActionsInfo.f305681a;
                if (z) {
                    oki.h.v2(aVar2.u, new EditWatchlistsControllerContract$ModalStep.ConfirmWatchlistRemoval(watchlist), bottom_dialog);
                } else {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "EditWatchlistControllerModel", j6.a.s("Delete action clicked for watchlist ", watchlist.f86896b, " (", watchlist.f86895a, ") that can not be deleted"), null, h0Var);
                }
                break;
            default:
                l watchlistActionsInfo2 = (l) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.edit_watchlists.a aVar4 = (com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.edit_watchlists.a) editWatchlistsController.e3();
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(watchlistActionsInfo2, "watchlistActionsInfo");
                oki.h.v2(aVar4.u, new EditWatchlistsControllerContract$ModalStep.RenameWatchlist(watchlistActionsInfo2.f305681a), bottom_dialog);
                break;
        }
        return Unit.f186387a;
    }
}
