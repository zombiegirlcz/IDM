package ahd;

import com.revolut.data.model.Data;
import com.revolut.feature.shared_separate_favourites.domain.combined_watchlist.CombinedWatchlistContext;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.watchlist_assets.WatchlistAssetsScreenContract$InputData;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.WatchlistAddAssetFlow;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.WatchlistAddAssetFlowContract$InputData;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.WatchlistAddAssetFlowContract$LaunchMode;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import l3d.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class c0 extends oki.h implements l {
    public final WatchlistAssetsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l3d.r f4938p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f4939q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h0 f4940r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final m3d.j f4941s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o5d.a f4942t;
    public final ifd.h u;
    public volatile boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final cli.y f4943w;

    public c0(WatchlistAssetsScreenContract$InputData inputData, l3d.r multipleWatchlistInteractor, d multipleWatchlistItemsProvider, h0 watchlistInteractor, m3d.j watchlistNavigationDestinationProvider, o5d.a swipeAssetTradeActionsExtension, ifd.h watchlistMapper, s stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(multipleWatchlistInteractor, "multipleWatchlistInteractor");
        Intrinsics.checkNotNullParameter(multipleWatchlistItemsProvider, "multipleWatchlistItemsProvider");
        Intrinsics.checkNotNullParameter(watchlistInteractor, "watchlistInteractor");
        Intrinsics.checkNotNullParameter(watchlistNavigationDestinationProvider, "watchlistNavigationDestinationProvider");
        Intrinsics.checkNotNullParameter(swipeAssetTradeActionsExtension, "swipeAssetTradeActionsExtension");
        Intrinsics.checkNotNullParameter(watchlistMapper, "watchlistMapper");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f4938p = multipleWatchlistInteractor;
        this.f4939q = multipleWatchlistItemsProvider;
        this.f4940r = watchlistInteractor;
        this.f4941s = watchlistNavigationDestinationProvider;
        this.f4942t = swipeAssetTradeActionsExtension;
        this.u = watchlistMapper;
        this.f4943w = mra.d.b(this, new n(null, new Data(null, null, true, 3, null), null, null), stateMapper, null, false, 12);
    }

    public final Flow I2() {
        WatchlistAssetsScreenContract$InputData watchlistAssetsScreenContract$InputData = this.o;
        String watchlistId = watchlistAssetsScreenContract$InputData.f86929a;
        if (watchlistId == null) {
            return new go.g(new Data(null, null, true, 3, null), 2);
        }
        CombinedWatchlistContext combinedWatchlistContext = watchlistAssetsScreenContract$InputData.f86930b;
        Set assetTypeKeys = combinedWatchlistContext.f86890b;
        String orderingKey = combinedWatchlistContext.f86889a;
        d dVar = this.f4939q;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(watchlistId, "watchlistId");
        Intrinsics.checkNotNullParameter(assetTypeKeys, "assetTypeKeys");
        Intrinsics.checkNotNullParameter(orderingKey, "orderingKey");
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return new c(dVar.f4944a.d(assetTypeKeys, orderingKey, loadingStrategy), watchlistId, 0);
    }

    public final void J2(String str) {
        yji.l.j2(this, new WatchlistAddAssetFlow(new WatchlistAddAssetFlowContract$InputData(this.o.f86930b, new WatchlistAddAssetFlowContract$LaunchMode.WatchlistSelection(str), 4)), null, null, 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, boh.f.e(nim.a.v(I2(), new agh.h(11)), new t(this, 2)), null, new v(this, null, 1), 3);
        int i = 3;
        yji.l.b1(this, mo3.a.g(boh.f.e(I2(), new t(this, i)), null, new ah1.p(i), 1), null, new v(this, null, 2), 3);
        yji.l.b1(this, this.f4942t.Z2(new a07.p(nim.a.v(this.f4943w.B(new agh.h(10)), new t(this, 1)), 6)), null, new v(this, null, 0), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f4943w;
    }
}
