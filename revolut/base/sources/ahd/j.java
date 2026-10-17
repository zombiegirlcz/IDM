package ahd;

import com.revolut.core.ui_kit.delegates.vh;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.watchlist_assets.WatchlistAssetsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ WatchlistAssetsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(WatchlistAssetsScreen watchlistAssetsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = watchlistAssetsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((vh) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        vh action = (vh) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarE3 = this.v.R2();
        Intrinsics.h(action);
        c0 c0Var = (c0) lVarE3;
        c0Var.getClass();
        Intrinsics.checkNotNullParameter(action, "action");
        Object obj3 = action.f54883a.f;
        if ((obj3 instanceof m) && (str = c0Var.o.f86929a) != null) {
            c0Var.n2(new a1a.b(c0Var, str, obj3, null, 21), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
