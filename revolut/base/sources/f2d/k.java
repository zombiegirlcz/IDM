package f2d;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements x3d.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xv5.c f131527a;

    public k(xv5.c cryptoCommodityBaseCurrencyInteractor) {
        Intrinsics.checkNotNullParameter(cryptoCommodityBaseCurrencyInteractor, "cryptoCommodityBaseCurrencyInteractor");
        this.f131527a = cryptoCommodityBaseCurrencyInteractor;
    }

    @Override // x3d.g
    public final FavouritesAssetTypeKey a() {
        y1d.b.Companion.getClass();
        return y1d.a.k;
    }

    @Override // x3d.g
    public final Flow b(WatchlistItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return new f(rd0.e.b(xv5.c.b(this.f131527a)), item, 1);
    }
}
