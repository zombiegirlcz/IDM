package f2d;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements x3d.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xv5.c f131525a;

    public g(xv5.c cryptoCommodityBaseCurrencyInteractor) {
        Intrinsics.checkNotNullParameter(cryptoCommodityBaseCurrencyInteractor, "cryptoCommodityBaseCurrencyInteractor");
        this.f131525a = cryptoCommodityBaseCurrencyInteractor;
    }

    @Override // x3d.g
    public final FavouritesAssetTypeKey a() {
        y1d.b.Companion.getClass();
        return y1d.a.f310359c;
    }

    @Override // x3d.g
    public final Flow b(WatchlistItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return new f(rd0.e.b(xv5.c.b(this.f131525a)), item, 0);
    }
}
