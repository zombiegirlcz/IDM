package ahd;

import com.revolut.data.model.Data;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.Watchlist;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f4961b;

    public /* synthetic */ t(c0 c0Var, int i) {
        this.f4960a = i;
        this.f4961b = c0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f4960a) {
            case 0:
                gfd.e output = (gfd.e) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                c0 c0Var = this.f4961b;
                c0Var.n2(new b0(c0Var, output, null), new whi.b(6));
                return Unit.f186387a;
            case 1:
                List<WatchlistItem> watchlistItems = (List) obj2;
                Intrinsics.checkNotNullParameter(watchlistItems, "watchlistItems");
                ArrayList arrayList = new ArrayList();
                for (WatchlistItem watchlistItem : watchlistItems) {
                    String str = watchlistItem.f86898a.f86863a;
                    String strD = ((n3d.d) this.f4961b.u).d(watchlistItem);
                    p5d.b bVar = strD != null ? new p5d.b(str, strD, null) : null;
                    if (bVar != null) {
                        arrayList.add(bVar);
                    }
                }
                return arrayList;
            case 2:
                List items = (List) obj2;
                Intrinsics.checkNotNullParameter(items, "items");
                if (!items.isEmpty()) {
                    c0 c0Var2 = this.f4961b;
                    ogd.k kVar = ((n) ((j2) c0Var2.f4943w.f22677a).getValue()).f4949a;
                    if ((kVar != null ? kVar.f225123a : null) != ogd.m.PRICE_CHANGE) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj3 : items) {
                            FavouritesAssetTypeKey favouritesAssetTypeKey = ((WatchlistItem) obj3).f86898a.d;
                            Object arrayList2 = linkedHashMap.get(favouritesAssetTypeKey);
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                                linkedHashMap.put(favouritesAssetTypeKey, arrayList2);
                            }
                            ((List) arrayList2).add(obj3);
                        }
                        return new y(c0Var2.f4940r.f(linkedHashMap), c0Var2, items, 0);
                    }
                }
                return new go.g(new Data(items, null, false, 6, null), 2);
            default:
                Watchlist it8 = (Watchlist) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                c0 c0Var3 = this.f4961b;
                l3d.r rVar = c0Var3.f4938p;
                String orderingKey = c0Var3.o.f86930b.f86889a;
                String watchlistId = it8.f86895a;
                rVar.getClass();
                Intrinsics.checkNotNullParameter(orderingKey, "orderingKey");
                Intrinsics.checkNotNullParameter(watchlistId, "watchlistId");
                return ((n4d.m) rVar.f191928a).d(orderingKey, watchlistId);
        }
    }
}
