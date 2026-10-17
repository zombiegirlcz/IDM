package com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset;

import a07.p;
import ble.c1;
import cli.y;
import com.revolut.feature.shared_separate_favourites.domain.combined_watchlist.CombinedWatchlistContext;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.WatchlistAddAssetFlowContract$LaunchMode;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.WatchlistAddAssetFlowContract$Step;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.d;
import gvc.m;
import hhd.i;
import hhd.j;
import hhd.k;
import hhd.o;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.flow.Flow;
import l3d.h0;
import l3d.r;
import md6.s;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import wkm.l;
import zhm.f0;
import zhm.r0;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends oki.h implements i {

    @NotNull
    public static final o Companion = new o();
    public final WatchlistAddAssetFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h0 f86954p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final r f86955q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z2d.c f86956r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final phd.a f86957s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f86958t;
    public final ali.b u;

    public h(WatchlistAddAssetFlowContract$InputData inputData, e stateMapper, h0 watchlistInteractor, r multipleWatchlistInteractor, z2d.c assetTypesInteractor, phd.a shotMessageFactory) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(watchlistInteractor, "watchlistInteractor");
        Intrinsics.checkNotNullParameter(multipleWatchlistInteractor, "multipleWatchlistInteractor");
        Intrinsics.checkNotNullParameter(assetTypesInteractor, "assetTypesInteractor");
        Intrinsics.checkNotNullParameter(shotMessageFactory, "shotMessageFactory");
        this.o = inputData;
        this.f86954p = watchlistInteractor;
        this.f86955q = multipleWatchlistInteractor;
        this.f86956r = assetTypesInteractor;
        this.f86957s = shotMessageFactory;
        List listC = u.c(WatchlistAddAssetFlowContract$Step.Loading.f86947a);
        Map mapG = r0.g();
        m70.a.c(t0.f186434a);
        this.f86958t = mra.d.b(this, new hhd.h(null, "", mapG, listC, null), stateMapper, null, false, 12);
        this.u = s.b(this, new hfb.d(this, 5));
    }

    @Override // ali.h
    public final ali.b I0() {
        return this.u;
    }

    @Override // yji.l
    public final void I1() {
        Flow pVar;
        Object objC;
        WatchlistAddAssetFlowContract$InputData watchlistAddAssetFlowContract$InputData = this.o;
        l lVarQ = q.Q(this.f86956r.a(watchlistAddAssetFlowContract$InputData.f86939a.f86890b), new hcj.o((Continuation) null, this, 3));
        WatchlistAddAssetFlowContract$LaunchMode watchlistAddAssetFlowContract$LaunchMode = watchlistAddAssetFlowContract$InputData.f86940b;
        CombinedWatchlistContext combinedWatchlistContext = watchlistAddAssetFlowContract$InputData.f86939a;
        if (Intrinsics.f(watchlistAddAssetFlowContract$LaunchMode, WatchlistAddAssetFlowContract$LaunchMode.DefaultWatchlistSelection.f86942a)) {
            pVar = new c1(h0.g(this.f86954p, combinedWatchlistContext.f86890b, combinedWatchlistContext.f86889a, false, false, null, 96), 10);
        } else if (watchlistAddAssetFlowContract$LaunchMode instanceof WatchlistAddAssetFlowContract$LaunchMode.SingleSelection) {
            String str = ((WatchlistAddAssetFlowContract$LaunchMode.SingleSelection) watchlistAddAssetFlowContract$LaunchMode).f86943a;
            if (str == null || (objC = u.c(str)) == null) {
                objC = f0.f322471a;
            }
            pVar = new go.g(objC, 2);
        } else {
            if (!(watchlistAddAssetFlowContract$LaunchMode instanceof WatchlistAddAssetFlowContract$LaunchMode.WatchlistSelection)) {
                throw new NoWhenBranchMatchedException();
            }
            pVar = new p(nim.a.v(this.f86955q.d(combinedWatchlistContext.f86890b, combinedWatchlistContext.f86889a, w4l.h.f294642c), new hg4.a(watchlistAddAssetFlowContract$LaunchMode, 4)), 21);
        }
        yji.l.a1(this, yh5.b.d(lVarQ, pVar), null, null, new g(this, null), 3);
    }

    public final void I2(d event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof d.a) {
            B2();
            return;
        }
        if (event instanceof d.b) {
            n2(new m(this, null, 19), new whi.b(6));
            return;
        }
        boolean z = event instanceof j;
        y yVar = this.f86958t;
        if (z) {
            H2(yVar, new gqh.a(((j) event).f152395a, 25));
            return;
        }
        if (event instanceof d.c) {
            H2(yVar, new he4.r(29));
            return;
        }
        if (event instanceof hhd.l) {
            H2(yVar, new gqh.a(((hhd.l) event).f152397a, 24));
            return;
        }
        if (!(event instanceof k)) {
            throw new NoWhenBranchMatchedException();
        }
        ogd.e eVar = ((k) event).f152396a;
        WatchlistAddAssetFlowContract$InputData watchlistAddAssetFlowContract$InputData = this.o;
        WatchlistAddAssetFlowContract$LaunchMode watchlistAddAssetFlowContract$LaunchMode = watchlistAddAssetFlowContract$InputData.f86940b;
        if (!(watchlistAddAssetFlowContract$LaunchMode instanceof WatchlistAddAssetFlowContract$LaunchMode.SingleSelection)) {
            if (!(watchlistAddAssetFlowContract$LaunchMode instanceof WatchlistAddAssetFlowContract$LaunchMode.WatchlistSelection) && !(watchlistAddAssetFlowContract$LaunchMode instanceof WatchlistAddAssetFlowContract$LaunchMode.DefaultWatchlistSelection)) {
                throw new NoWhenBranchMatchedException();
            }
            H2(yVar, new hg4.a(eVar, 5));
            return;
        }
        H2(yVar, new h8b.b(eVar, this, 21));
        ogd.i.Companion.getClass();
        C2(new gfd.d(u.c(ogd.h.a(eVar).a())));
        if (watchlistAddAssetFlowContract$InputData.f86941c) {
            B2();
        }
    }

    @Override // ali.h, cli.z
    public final cli.g getState() {
        return this.f86958t;
    }
}
