package x7h;

import android.os.Parcelable;
import com.revolut.feature.wealth.models.portfolio_metrics.AssetSubclassAllocation;
import com.revolut.feature.wealth.models.portfolio_metrics.RegionSubclassAllocation;
import com.revolut.feature.wealth.models.portfolio_metrics.SectorSubclassAllocation;
import com.revolut.feature.wealth.models.portfolio_metrics.TopHoldingSubclassAllocation;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import x7h.a;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public abstract class c {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList] */
    public static final vdh.b a(a aVar) {
        ?? arrayList;
        ?? arrayList2;
        ?? arrayList3;
        Object next;
        Parcelable stocks;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        List allocations = aVar.getAllocations();
        ArrayList arrayList4 = new ArrayList(w.t(allocations, 10));
        Iterator it8 = allocations.iterator();
        while (true) {
            if (!it8.hasNext()) {
                List sectorAllocations = aVar.getSectorAllocations();
                if (sectorAllocations != null) {
                    List<a.c> list = sectorAllocations;
                    arrayList = new ArrayList(w.t(list, 10));
                    for (a.c cVar : list) {
                        arrayList.add(new SectorSubclassAllocation(cVar.getAllocation(), cVar.getSector()));
                    }
                } else {
                    arrayList = f0.f322471a;
                }
                List regionAllocations = aVar.getRegionAllocations();
                if (regionAllocations != null) {
                    List<a.b> list2 = regionAllocations;
                    arrayList2 = new ArrayList(w.t(list2, 10));
                    for (a.b bVar : list2) {
                        Iterator it9 = qdh.a.a().iterator();
                        while (true) {
                            if (!it9.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it9.next();
                            if (Intrinsics.f(((qdh.a) next).b(), bVar.getRegion())) {
                                break;
                            }
                        }
                        qdh.a aVar2 = (qdh.a) next;
                        if (aVar2 == null) {
                            aVar2 = qdh.a.UNSPECIFIED;
                        }
                        arrayList2.add(new RegionSubclassAllocation(bVar.getAllocation(), aVar2));
                    }
                } else {
                    arrayList2 = f0.f322471a;
                }
                List topHoldingAllocations = aVar.getTopHoldingAllocations();
                if (topHoldingAllocations != null) {
                    List<a.d> list3 = topHoldingAllocations;
                    arrayList3 = new ArrayList(w.t(list3, 10));
                    for (a.d dVar : list3) {
                        arrayList3.add(new TopHoldingSubclassAllocation(dVar.getRef(), dVar.getAllocation()));
                    }
                } else {
                    arrayList3 = f0.f322471a;
                }
                jo3.a totalNetTopUp = aVar.getTotalNetTopUp();
                return new vdh.b(arrayList4, arrayList, arrayList2, arrayList3, totalNetTopUp != null ? mo3.a.o(totalNetTopUp) : null);
            }
            a.C1684a c1684a = (a.C1684a) it8.next();
            int i = b.f303211a[c1684a.getAssetClass().ordinal()];
            if (i == 1) {
                stocks = new AssetSubclassAllocation.Stocks(c1684a.getRef(), c1684a.getAllocation(), null);
            } else if (i == 2) {
                stocks = new AssetSubclassAllocation.Bonds(c1684a.getRef(), c1684a.getAllocation(), null);
            } else if (i == 3) {
                BigDecimal allocation = c1684a.getAllocation();
                xi0.a aVar3 = xi0.b.Companion;
                String ref2 = c1684a.getRef();
                aVar3.getClass();
                stocks = new AssetSubclassAllocation.Cash(allocation, xi0.a.a(ref2), null);
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                stocks = new AssetSubclassAllocation.Commodities(c1684a.getRef(), c1684a.getAllocation(), null);
            }
            arrayList4.add(stocks);
        }
    }
}
