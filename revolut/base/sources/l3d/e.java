package l3d;

import ahe.z0;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.Watchlist;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191895a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Watchlist f191896b;

    public /* synthetic */ e(Watchlist watchlist) {
        this.f191896b = watchlist;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f191895a) {
            case 0:
                ogd.a manuallySortedItems = (ogd.a) obj2;
                Intrinsics.checkNotNullParameter(manuallySortedItems, "manuallySortedItems");
                List list = this.f191896b.d;
                List list2 = manuallySortedItems.f225103b;
                if (list2.isEmpty()) {
                    return zhm.d0.P0(list, new h());
                }
                zhm.q qVarK1 = zhm.d0.k1(list2);
                int iB = q0.b(zhm.w.t(qVarK1, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                Iterator it8 = qVarK1.iterator();
                while (true) {
                    kotlin.jvm.internal.d dVar = (kotlin.jvm.internal.d) it8;
                    if (!((Iterator) dVar.f186416c).hasNext()) {
                        return zhm.d0.P0(list, new z0(linkedHashMap, 4));
                    }
                    IndexedValue indexedValue = (IndexedValue) dVar.next();
                    linkedHashMap.put((String) indexedValue.f186392b, Integer.valueOf(indexedValue.f186391a));
                }
                break;
            default:
                List itemsWithRates = (List) obj2;
                Intrinsics.checkNotNullParameter(itemsWithRates, "itemsWithRates");
                return Watchlist.a(this.f191896b, itemsWithRates);
        }
    }

    public /* synthetic */ e(kgm.i iVar, Watchlist watchlist) {
        this.f191896b = watchlist;
    }
}
