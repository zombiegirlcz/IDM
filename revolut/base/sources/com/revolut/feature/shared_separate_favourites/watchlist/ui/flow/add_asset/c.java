package com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset;

import au0.j4;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.WatchlistAddAssetFlow;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.d;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ WatchlistAddAssetFlow u;
    public final /* synthetic */ NavBarWithToolbar v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(WatchlistAddAssetFlow watchlistAddAssetFlow, NavBarWithToolbar navBarWithToolbar, Continuation continuation) {
        super(2, continuation);
        this.u = watchlistAddAssetFlow;
        this.v = navBarWithToolbar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        WatchlistAddAssetFlow.Companion companion = WatchlistAddAssetFlow.INSTANCE;
        NavBarWithToolbar navBarWithToolbar = this.v;
        e0m.e.a(navBarWithToolbar);
        navBarWithToolbar.m0(j4.FADE);
        navBarWithToolbar.i0();
        ((h) this.u.R2()).I2(d.c.f86950a);
        return Unit.f186387a;
    }
}
