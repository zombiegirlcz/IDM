package com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.home_widget_customisation;

import com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.home_widget_customisation.WatchlistCustomisationScreen;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.home_widget_customisation.b;
import e0m.e;
import gim.i;
import ihd.v;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ WatchlistCustomisationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(WatchlistCustomisationScreen watchlistCustomisationScreen, Continuation continuation) {
        super(2, continuation);
        this.v = watchlistCustomisationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.v, continuation);
        aVar.u = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((b.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        b.f fVar = (b.f) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        WatchlistCustomisationScreen.Companion companion = WatchlistCustomisationScreen.INSTANCE;
        WatchlistCustomisationScreen watchlistCustomisationScreen = this.v;
        e.a(watchlistCustomisationScreen.h3().f174565c);
        watchlistCustomisationScreen.h3().f174565c.i0();
        ((v) watchlistCustomisationScreen.T2()).y2(fVar);
        return Unit.f186387a;
    }
}
