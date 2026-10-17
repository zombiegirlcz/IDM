package com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.watchlists_selector;

import c9f.c;
import chd.g;
import chd.i;
import cli.y;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import hx7.e;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import l3d.r;
import oki.h;
import tki.d;
import yji.l;
import zh9.u0;
import zhm.y0;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements d {
    public final WatchlistsSelectorScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r f86934p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f86935q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f86936r;

    public a(WatchlistsSelectorScreenContract$InputData inputData, r multipleWatchlistsInteractor, i stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(multipleWatchlistsInteractor, "multipleWatchlistsInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f86934p = multipleWatchlistsInteractor;
        this.f86935q = mra.d.b(this, new g(0), stateMapper, null, false, 12);
        this.f86936r = e.a(this, new c(this, 18));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f86936r;
    }

    @Override // yji.l
    public final void T1(long j2) {
        WatchlistsSelectorScreenContract$InputData watchlistsSelectorScreenContract$InputData = this.o;
        FavouritesAssetTypeKey favouritesAssetTypeKey = watchlistsSelectorScreenContract$InputData.f86932b;
        Pair pair = watchlistsSelectorScreenContract$InputData.f86931a;
        r rVar = this.f86934p;
        l.b1(this, nim.a.v(u0.m(rVar.e(favouritesAssetTypeKey, pair), rVar.f(y0.b(watchlistsSelectorScreenContract$InputData.f86932b))), new cge.g(9)), null, new cbh.g(this, null, 17), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f86935q;
    }
}
