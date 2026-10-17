package l3d;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetDetails;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.Watchlist;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c {
    public static Watchlist a(z3d.d plainWatchlist, Map detailsMap) {
        Intrinsics.checkNotNullParameter(plainWatchlist, "plainWatchlist");
        Intrinsics.checkNotNullParameter(detailsMap, "detailsMap");
        ArrayList<z3d.e> arrayList = plainWatchlist.f319252c;
        ArrayList arrayList2 = new ArrayList();
        for (z3d.e eVar : arrayList) {
            FavouritesAssetDetails favouritesAssetDetails = (FavouritesAssetDetails) detailsMap.get(eVar);
            WatchlistItem watchlistItem = favouritesAssetDetails != null ? new WatchlistItem(favouritesAssetDetails, eVar.f319254b, null, null, eVar.f319255c, null, null) : null;
            if (watchlistItem != null) {
                arrayList2.add(watchlistItem);
            }
        }
        return new Watchlist(arrayList2, plainWatchlist.d, plainWatchlist.f319250a, plainWatchlist.f319251b);
    }
}
