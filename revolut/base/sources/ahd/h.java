package ahd;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.watchlist_assets.WatchlistAssetsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ WatchlistAssetsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(WatchlistAssetsScreen watchlistAssetsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = watchlistAssetsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarE3 = this.v.R2();
        Intrinsics.h(model);
        c0 c0Var = (c0) lVarE3;
        c0Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str2 = model.f52373a;
        if (Intrinsics.f(str2, "ERROR_STATE_ID")) {
            c0Var.l2(new z(c0Var, null), new yi5.b(26));
        } else if (Intrinsics.f(str2, "empty-state-list-id") && (str = c0Var.o.f86929a) != null) {
            c0Var.J2(str);
        }
        return Unit.f186387a;
    }
}
