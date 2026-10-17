package ny5;

import ahe.z0;
import com.revolut.feature.cryptocommodity_invest.models.SortingType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class u {
    public static ArrayList a(SortingType sortingType, List cryptoStats) throws Throwable {
        Intrinsics.checkNotNullParameter(sortingType, "sortingType");
        Intrinsics.checkNotNullParameter(cryptoStats, "cryptoStats");
        if (sortingType instanceof SortingType.CurrentPrice) {
            cryptoStats = ((SortingType.CurrentPrice) sortingType).f71595a == ty5.a.ASCENDING ? d0.P0(cryptoStats, new k()) : d0.P0(cryptoStats, new p());
        } else if (sortingType instanceof SortingType.MarketCap) {
            cryptoStats = ((SortingType.MarketCap) sortingType).f71596a == ty5.a.ASCENDING ? d0.P0(cryptoStats, new l()) : d0.P0(cryptoStats, new q());
        } else if (sortingType instanceof SortingType.MostBought) {
            cryptoStats = ((SortingType.MostBought) sortingType).f71597a == ty5.a.ASCENDING ? d0.P0(cryptoStats, new m()) : d0.P0(cryptoStats, new r());
        } else if (sortingType instanceof SortingType.MostSold) {
            cryptoStats = ((SortingType.MostSold) sortingType).f71598a == ty5.a.ASCENDING ? d0.P0(cryptoStats, new n()) : d0.P0(cryptoStats, new s());
        } else if (sortingType instanceof SortingType.PriceChange) {
            cryptoStats = ((SortingType.PriceChange) sortingType).f71599a == ty5.a.ASCENDING ? d0.P0(cryptoStats, new o()) : d0.P0(cryptoStats, new t());
        } else {
            if (!(sortingType instanceof SortingType.VolumeChange)) {
                throw new NoWhenBranchMatchedException();
            }
            hx7.e.n(new IllegalArgumentException("Sorting type VolumeChange(ordination=" + ((SortingType.VolumeChange) sortingType).f71600a + ") is not supported here"));
        }
        List list = cryptoStats;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((cw5.b) it8.next()).f109534a);
        }
        return arrayList;
    }

    public static List b(ArrayList order, List currencies) {
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        Intrinsics.checkNotNullParameter(order, "order");
        zhm.q qVarK1 = d0.k1(order);
        int iB = q0.b(zhm.w.t(qVarK1, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        Iterator it8 = qVarK1.iterator();
        while (true) {
            kotlin.jvm.internal.d dVar = (kotlin.jvm.internal.d) it8;
            if (!((Iterator) dVar.f186416c).hasNext()) {
                return d0.P0(currencies, new z0(linkedHashMap, 8));
            }
            IndexedValue indexedValue = (IndexedValue) dVar.next();
            linkedHashMap.put(indexedValue.f186392b, Integer.valueOf(indexedValue.f186391a));
        }
    }
}
