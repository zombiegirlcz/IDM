package fd7;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.shared_separate_favourites.domain.combined_watchlist.CombinedWatchlistContext;
import gim.c;
import java.util.LinkedHashSet;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import v1d.b;
import zhm.a1;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterable f133923a;

    public a() {
        y1d.a aVar = y1d.b.Companion;
        aVar.getClass();
        FavouritesAssetTypeKey favouritesAssetTypeKey = y1d.a.f;
        aVar.getClass();
        FavouritesAssetTypeKey favouritesAssetTypeKey2 = y1d.a.f310360g;
        aVar.getClass();
        FavouritesAssetTypeKey favouritesAssetTypeKey3 = y1d.a.f310361h;
        aVar.getClass();
        FavouritesAssetTypeKey favouritesAssetTypeKey4 = y1d.a.i;
        aVar.getClass();
        FavouritesAssetTypeKey[] elements = {favouritesAssetTypeKey, favouritesAssetTypeKey2, favouritesAssetTypeKey3, favouritesAssetTypeKey4, y1d.a.f310362j};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f133923a = d.y0(elements);
    }

    @Override // v1d.b
    public final Object b(String str, c cVar) {
        return Boolean.TRUE;
    }

    @Override // v1d.b
    public final CombinedWatchlistContext c() {
        y1d.b.Companion.getClass();
        LinkedHashSet linkedHashSetL = a1.l(y1d.a.f310363l, this.f133923a);
        return new CombinedWatchlistContext("COMBINED_WATCHLIST_ORDERING_HOME", linkedHashSetL, linkedHashSetL);
    }
}
