package f2d;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements x3d.g {
    @Override // x3d.g
    public final FavouritesAssetTypeKey a() {
        y1d.b.Companion.getClass();
        return y1d.a.e;
    }

    @Override // x3d.g
    public final Flow b(WatchlistItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return new go.g(new AssetDetailsDestination(item.f86898a.f86863a, null, false, "Watchlist", null, null, 54), 2);
    }
}
