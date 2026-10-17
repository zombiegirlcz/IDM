package x3d;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem;
import kotlin.jvm.internal.Intrinsics;
import ogd.j;
import qv0.i;

/* JADX INFO: loaded from: classes7.dex */
public interface f {
    FavouritesAssetTypeKey a();

    j b(int i);

    Clause c(WatchlistItem watchlistItem);

    Image d(WatchlistItem watchlistItem);

    int e();

    Clause f();

    int g();

    RowDelegate.Model h(WatchlistItem watchlistItem, String str);

    default i i(ogd.e assetPair, String listId, e extras) {
        Intrinsics.checkNotNullParameter(assetPair, "assetPair");
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return j(assetPair, listId, extras);
    }

    RowDelegate.Model j(ogd.e eVar, String str, e eVar2);
}
