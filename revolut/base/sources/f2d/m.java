package f2d;

import ahd.y;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements x3d.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jpf.a f131529a;

    public m(jpf.a marketAssetsInteractor) {
        Intrinsics.checkNotNullParameter(marketAssetsInteractor, "marketAssetsInteractor");
        this.f131529a = marketAssetsInteractor;
    }

    @Override // x3d.g
    public final FavouritesAssetTypeKey a() {
        y1d.b.Companion.getClass();
        return y1d.a.f310362j;
    }

    @Override // x3d.g
    public final Flow b(WatchlistItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return new y(mo3.a.g(this.f131529a.w(), null, new ewh.y(23), 1), this, item, 26);
    }
}
