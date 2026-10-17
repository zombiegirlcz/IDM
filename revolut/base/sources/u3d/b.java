package u3d;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetDetails;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem;
import efm.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import lgd.d;

/* JADX INFO: loaded from: classes13.dex */
public interface b {
    FavouritesAssetTypeKey a();

    r b(List list, boolean z);

    default FavouritesAssetDetails c(String from, a assetInfo) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(assetInfo, "assetInfo");
        String strC = assetInfo.c();
        String strB = assetInfo.b();
        if (strB == null) {
            strB = "";
        }
        return new FavouritesAssetDetails(from, strC, strB, a(), false);
    }

    List d();

    r e(ArrayList arrayList);

    Flow f(Pair pair, ngd.a aVar, ngd.b bVar);

    default WatchlistItem g(WatchlistItem item, List rates) {
        Object next;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(rates, "rates");
        Iterator it8 = rates.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            d dVar = (d) next;
            if (Intrinsics.f(dVar.b(), item.getF86898a().getF86863a()) && Intrinsics.f(dVar.d(), item.getF86899b())) {
                break;
            }
        }
        d dVar2 = (d) next;
        return dVar2 == null ? item : WatchlistItem.a(item, dVar2.c(), dVar2.a(), dVar2.e());
    }

    default lgd.a g0() {
        return lgd.a.MIXED;
    }

    r h();

    r i(List list);

    Flow isAvailable();
}
