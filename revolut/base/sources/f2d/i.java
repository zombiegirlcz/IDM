package f2d;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem;
import com.revolut.retail.feature.ratedetails.api.navigation.RateDetailsKompotFeatureConfig;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements x3d.g {
    @Override // x3d.g
    public final FavouritesAssetTypeKey a() {
        y1d.b.Companion.getClass();
        return y1d.a.f310358b;
    }

    @Override // x3d.g
    public final Flow b(WatchlistItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        xi0.a aVar = xi0.b.Companion;
        String str = item.f86898a.f86864b;
        aVar.getClass();
        return new go.g(new RateDetailsKompotFeatureConfig.RateDetailsDestination(xi0.a.a(str), xi0.a.a(item.f86899b), true, true, null, 240), 2);
    }
}
