package l3d;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetDetails;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.shared_separate_favourites.domain.chart.ChartRate;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem;
import d9.e1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import n4d.r0;
import skm.p0;
import vkm.v1;

/* JADX INFO: loaded from: classes7.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f191909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f191910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m3d.i f191911c;
    public final ifd.h d;
    public final f01.a e;

    public h0(r0 watchlistItemsRepository, j0 watchlistTasksInteractor, m3d.i enricher, ifd.h watchlistMapper, f01.a uiKitResources) {
        Intrinsics.checkNotNullParameter(watchlistItemsRepository, "watchlistItemsRepository");
        Intrinsics.checkNotNullParameter(watchlistTasksInteractor, "watchlistTasksInteractor");
        Intrinsics.checkNotNullParameter(enricher, "enricher");
        Intrinsics.checkNotNullParameter(watchlistMapper, "watchlistMapper");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f191909a = watchlistItemsRepository;
        this.f191910b = watchlistTasksInteractor;
        this.f191911c = enricher;
        this.d = watchlistMapper;
        this.e = uiKitResources;
    }

    public static final Pair a(h0 h0Var, WatchlistItem watchlistItem) {
        return new Pair(watchlistItem.f86898a.f86863a, watchlistItem.f86899b);
    }

    public static final WatchlistItem b(h0 h0Var, z3d.e eVar, ogd.g gVar) {
        Object next;
        Object next2;
        Object next3;
        Object next4;
        Object next5;
        String str = eVar.f319254b;
        String str2 = eVar.f319253a;
        List list = gVar.f225114a;
        List list2 = gVar.f225115b;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((FavouritesAssetDetails) next).f86863a, str2)) {
                break;
            }
        }
        FavouritesAssetDetails favouritesAssetDetails = (FavouritesAssetDetails) next;
        if (favouritesAssetDetails == null) {
            return null;
        }
        List list3 = list2;
        Iterator it9 = list3.iterator();
        while (true) {
            if (!it9.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it9.next();
            lgd.d dVar = (lgd.d) next2;
            if (Intrinsics.f(dVar.f195089a, str2) && Intrinsics.f(dVar.f195091c, str)) {
                break;
            }
        }
        lgd.d dVar2 = (lgd.d) next2;
        if (dVar2 == null) {
            Iterator it10 = list3.iterator();
            while (true) {
                if (!it10.hasNext()) {
                    next4 = null;
                    break;
                }
                next4 = it10.next();
                lgd.d dVar3 = (lgd.d) next4;
                if (Intrinsics.f(dVar3.f195089a, str2) && Intrinsics.f(dVar3.f195091c, favouritesAssetDetails.f86864b)) {
                    break;
                }
            }
            dVar2 = (lgd.d) next4;
            if (dVar2 == null) {
                if (favouritesAssetDetails.e) {
                    Iterator it11 = list3.iterator();
                    while (true) {
                        if (!it11.hasNext()) {
                            next5 = null;
                            break;
                        }
                        next5 = it11.next();
                        if (Intrinsics.f(((lgd.d) next5).f195089a, str2)) {
                            break;
                        }
                    }
                    dVar2 = (lgd.d) next5;
                } else {
                    dVar2 = null;
                }
            }
        }
        Iterator it12 = gVar.f225116c.iterator();
        while (true) {
            if (!it12.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it12.next();
            ChartRate chartRate = (ChartRate) next3;
            if (Intrinsics.f(chartRate.f86881a.f186385a, str2) && Intrinsics.f(chartRate.f86881a.f186386b, str)) {
                break;
            }
        }
        return new WatchlistItem(favouritesAssetDetails, eVar.f319254b, dVar2 != null ? dVar2.d : null, dVar2 != null ? dVar2.e : null, eVar.f319255c, (ChartRate) next3, dVar2 != null ? dVar2.f : null);
    }

    public static String d(z3d.e eVar) {
        FavouritesAssetTypeKey key = eVar.d;
        String from = eVar.f319253a;
        String to6 = eVar.f319254b;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        xi0.b.Companion.getClass();
        cp5.d.d(new Pair(xi0.a.a(from), xi0.a.a(to6)));
        return com.google.android.gms.internal.mlkit_vision_face.a.p(key.f86866a, "-", from, "-", to6);
    }

    public static v1 g(h0 h0Var, Set assetsToDisplay, String assetsOrderingKey, boolean z, boolean z3, Integer num, int i) {
        Integer num2 = (i & 32) != 0 ? null : num;
        h0Var.getClass();
        Intrinsics.checkNotNullParameter(assetsToDisplay, "assetsToDisplay");
        Intrinsics.checkNotNullParameter(assetsOrderingKey, "assetsOrderingKey");
        return new v1(new d0(h0Var, assetsToDisplay, assetsOrderingKey, z, false, z3, num2, null, null));
    }

    public final ogd.k c(String assetsOrderingKey) {
        Intrinsics.checkNotNullParameter(assetsOrderingKey, "assetsOrderingKey");
        Intrinsics.checkNotNullParameter(assetsOrderingKey, "assetsOrderingKey");
        String strE = r0.e(assetsOrderingKey);
        if (strE != null) {
            String str = (String) this.f191909a.f212399g.a(new tk0.d(strE));
            ogd.k kVarC0 = str != null ? e1.c0(str) : null;
            if (kVarC0 != null) {
                return kVarC0;
            }
        }
        return new ogd.k(ogd.m.MANUAL, null);
    }

    public final ahd.c e(FavouritesAssetTypeKey assetTypeKey, String assetCode) {
        Intrinsics.checkNotNullParameter(assetTypeKey, "assetTypeKey");
        Intrinsics.checkNotNullParameter(assetCode, "assetCode");
        Intrinsics.checkNotNullParameter(assetTypeKey, "assetTypeKey");
        Intrinsics.checkNotNullParameter(assetCode, "assetCode");
        return new ahd.c(this.f191909a.g(zhm.u.c(assetTypeKey), false), assetCode, 5);
    }

    public final wkm.l f(LinkedHashMap assetTypeKeyToItems) {
        Intrinsics.checkNotNullParameter(assetTypeKeyToItems, "assetTypeKeyToItems");
        Intrinsics.checkNotNullParameter(assetTypeKeyToItems, "assetTypeKeyToItems");
        List listD1 = zhm.d0.d1(assetTypeKeyToItems.keySet());
        m3d.i iVar = this.f191911c;
        return vkm.q.Q(iVar.a(listD1), new k25.o(null, iVar, assetTypeKeyToItems, 14));
    }

    public final Object h(FavouritesAssetTypeKey favouritesAssetTypeKey, Pair pair, gim.i iVar) throws Throwable {
        mll.c0 c0Var = new mll.c0(this.f191909a, favouritesAssetTypeKey, pair, null, 23);
        p0 p0Var = p0.f264001a;
        Object objJ = skm.e0.J(elm.f.f127540b, c0Var, iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }

    public final Object i(String str, ogd.k kVar, gim.i iVar) {
        Object objE;
        String str2;
        String str3;
        String strE = r0.e(str);
        if (strE != null) {
            mk0.a aVar = this.f191909a.f212399g;
            tk0.d dVar = new tk0.d(strE);
            Intrinsics.checkNotNullParameter(kVar, "<this>");
            switch (p4d.b.f232913a[kVar.f225123a.ordinal()]) {
                case 1:
                    str2 = "Manual";
                    break;
                case 2:
                    str2 = "PriceChange";
                    break;
                case 3:
                    str2 = "Alphabetical";
                    break;
                case 4:
                    str2 = "Volume";
                    break;
                case 5:
                    str2 = "24H_change";
                    break;
                case 6:
                    str2 = "Price";
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            ogd.l lVar = kVar.f225124b;
            if (lVar != null) {
                int i = p4d.b.f232914b[lVar.ordinal()];
                if (i == 1) {
                    str3 = "ascending";
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str3 = "descending";
                }
            } else {
                str3 = null;
            }
            String[] elements = {str2, str3};
            Intrinsics.checkNotNullParameter(elements, "elements");
            objE = aVar.e(dVar, zhm.d0.k0(kotlin.collections.d.L(elements), "-", null, null, 0, null, 62), iVar);
            if (objE != fim.a.COROUTINE_SUSPENDED) {
                objE = Unit.f186387a;
            }
        } else {
            objE = Unit.f186387a;
        }
        return objE == fim.a.COROUTINE_SUSPENDED ? objE : Unit.f186387a;
    }
}
