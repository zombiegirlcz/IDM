package xgd;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.edit_watchlists.EditWatchlistsController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EditWatchlistsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(EditWatchlistsController editWatchlistsController, Continuation continuation) {
        super(2, continuation);
        this.v = editWatchlistsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k kVarE3 = this.v.d();
        String watchlistRowListId = model.f53228a;
        com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.edit_watchlists.a aVar2 = (com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.edit_watchlists.a) kVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(watchlistRowListId, "watchlistRowListId");
        aVar2.H2(aVar2.f86928t, new xf0.h(watchlistRowListId, 5));
        return Unit.f186387a;
    }
}
