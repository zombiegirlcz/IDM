package h2d;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem;
import com.revolut.tracking.v3.SwipeToTradeContext;
import grl.hd;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class r implements ifd.g, p5d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WatchlistItem f148792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p5d.b f148793b;

    public r(WatchlistItem watchlistItem, p5d.b swipeableAsset) {
        Intrinsics.checkNotNullParameter(watchlistItem, "watchlistItem");
        Intrinsics.checkNotNullParameter(swipeableAsset, "swipeableAsset");
        this.f148792a = watchlistItem;
        this.f148793b = swipeableAsset;
    }

    @Override // p5d.a
    public final AnalyticsContext R() {
        WatchlistItem watchlistItem = this.f148792a;
        FavouritesAssetTypeKey favouritesAssetTypeKey = watchlistItem.f86898a.d;
        y1d.b.Companion.getClass();
        hd hdVar = Intrinsics.f(favouritesAssetTypeKey, y1d.a.d) ? hd.COMMODITY : Intrinsics.f(favouritesAssetTypeKey, y1d.a.f) ? hd.EQUITY : Intrinsics.f(favouritesAssetTypeKey, y1d.a.f310360g) ? hd.ETF : Intrinsics.f(favouritesAssetTypeKey, y1d.a.f310361h) ? hd.BOND : Intrinsics.f(favouritesAssetTypeKey, y1d.a.i) ? hd.CFD : null;
        if (hdVar == null) {
            return null;
        }
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        SwipeToTradeContext.a aVarNewBuilder = SwipeToTradeContext.newBuilder();
        aVarNewBuilder.h(watchlistItem.f86898a.f86863a);
        aVarNewBuilder.i(hdVar);
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        return new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
    }

    @Override // ifd.g
    public final WatchlistItem a() {
        return this.f148792a;
    }

    @Override // p5d.a
    public final AnimationRequest b() {
        return null;
    }

    @Override // p5d.a
    public final p5d.b c() {
        return this.f148793b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f148792a, rVar.f148792a) && Intrinsics.f(this.f148793b, rVar.f148793b);
    }

    public final int hashCode() {
        return this.f148793b.hashCode() + (this.f148792a.hashCode() * 31);
    }
}
