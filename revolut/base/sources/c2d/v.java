package c2d;

import com.revolut.data.model.Data;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetDetails;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import le.u1;

/* JADX INFO: loaded from: classes13.dex */
public final class v implements u3d.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a87.c f20747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jpf.a f20748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l77.a f20749c;
    public final ecm.q d;
    public final zhl.k e;

    public v(a87.c globalMarketsFeatureInteractor, jpf.a marketAssetInteractor, l77.a marketAssetPerformanceTransformer, ecm.q indexDetailsInteractor, zhl.k historicalPricesInteractor) {
        Intrinsics.checkNotNullParameter(globalMarketsFeatureInteractor, "globalMarketsFeatureInteractor");
        Intrinsics.checkNotNullParameter(marketAssetInteractor, "marketAssetInteractor");
        Intrinsics.checkNotNullParameter(marketAssetPerformanceTransformer, "marketAssetPerformanceTransformer");
        Intrinsics.checkNotNullParameter(indexDetailsInteractor, "indexDetailsInteractor");
        Intrinsics.checkNotNullParameter(historicalPricesInteractor, "historicalPricesInteractor");
        this.f20747a = globalMarketsFeatureInteractor;
        this.f20748b = marketAssetInteractor;
        this.f20749c = marketAssetPerformanceTransformer;
        this.d = indexDetailsInteractor;
        this.e = historicalPricesInteractor;
    }

    @Override // u3d.b
    public final FavouritesAssetTypeKey a() {
        y1d.b.Companion.getClass();
        return y1d.a.f310362j;
    }

    @Override // u3d.b
    public final efm.r b(List favouritesAssetIdPairs, boolean z) {
        Intrinsics.checkNotNullParameter(favouritesAssetIdPairs, "favouritesAssetIdPairs");
        if (favouritesAssetIdPairs.isEmpty()) {
            return te0.w.h(new Data(zhm.f0.f322471a, null, false, 6, null));
        }
        List list = favouritesAssetIdPairs;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add((String) ((Pair) it8.next()).f186385a);
        }
        efm.r rVarC = rd0.e.c(nim.a.v(boh.f.e(nim.a.v(this.f20748b.w(), new a83.c0(11, arrayList)), new bzg.t(this, 5)), new n(3)), kotlin.coroutines.g.f186406a);
        if (z) {
            return rVarC;
        }
        efm.r rVarTakeUntil = rVarC.takeUntil(new c03.u(23, new n(4)));
        Intrinsics.h(rVarTakeUntil);
        return rVarTakeUntil;
    }

    @Override // u3d.b
    public final FavouritesAssetDetails c(String from, u3d.a assetInfo) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(assetInfo, "assetInfo");
        String strC = assetInfo.c();
        String strB = assetInfo.b();
        if (strB == null) {
            strB = "";
        }
        String str = strB;
        FavouritesAssetTypeKey favouritesAssetTypeKeyA = a();
        boolean z = false;
        if (kotlin.text.a0.H(from, "I:", false) && from.equals(assetInfo.a())) {
            String strD = assetInfo.d();
            xi0.b.Companion.getClass();
            if (Intrinsics.f(strD, xi0.b.f306271c.f306286a)) {
                z = true;
            }
        }
        return new FavouritesAssetDetails(from, strC, str, favouritesAssetTypeKeyA, z);
    }

    @Override // u3d.b
    public final List d() {
        return zhm.f0.f322471a;
    }

    @Override // u3d.b
    public final efm.r e(ArrayList favouritesAssetIdPairs) {
        Intrinsics.checkNotNullParameter(favouritesAssetIdPairs, "favouritesAssetIdPairs");
        ArrayList arrayList = new ArrayList(zhm.w.t(favouritesAssetIdPairs, 10));
        Iterator it8 = favouritesAssetIdPairs.iterator();
        while (it8.hasNext()) {
            arrayList.add(f((Pair) it8.next(), ngd.a.ONE_DAY, ngd.b.LINE));
        }
        return rd0.e.c(zh9.u0.k(arrayList), kotlin.coroutines.g.f186406a);
    }

    @Override // u3d.b
    public final Flow f(Pair favouritesAssetIdPair, ngd.a range, ngd.b type) {
        Intrinsics.checkNotNullParameter(favouritesAssetIdPair, "favouritesAssetIdPair");
        Intrinsics.checkNotNullParameter(range, "range");
        Intrinsics.checkNotNullParameter(type, "type");
        int i = u.f20743a[type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            throw new NotImplementedError("Candlestick chart isn't supported yet");
        }
        String str = (String) favouritesAssetIdPair.f186385a;
        return nim.a.v(this.e.e(new go.g(u1.u(range, b2d.a.a()), 2), new go.g(eel.i.PRICE, 2), str, vgl.b.NONE), new a(favouritesAssetIdPair, type, 3));
    }

    @Override // u3d.b
    public final WatchlistItem g(WatchlistItem item, List rates) {
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
            lgd.d dVar = (lgd.d) next;
            if (Intrinsics.f(dVar.b(), item.getF86898a().getF86863a()) && (Intrinsics.f(dVar.d(), item.getF86899b()) || item.getF86898a().getE())) {
                break;
            }
        }
        lgd.d dVar2 = (lgd.d) next;
        return dVar2 == null ? item : WatchlistItem.a(item, dVar2.c(), dVar2.a(), dVar2.e());
    }

    @Override // u3d.b
    public final efm.r h() {
        return te0.w.h(lgd.b.SECURITY);
    }

    @Override // u3d.b
    public final efm.r i(List assetIds) {
        Intrinsics.checkNotNullParameter(assetIds, "assetIds");
        return rd0.e.c(nim.a.v(boh.f.e(this.f20748b.w(), new byc.a(assetIds, this, 14)), new n(5)), kotlin.coroutines.g.f186406a);
    }

    @Override // u3d.b
    public final Flow isAvailable() {
        return this.f20747a.a();
    }
}
