package x5f;

import com.revolut.data.model.Data;
import com.revolut.feature.wealth.models.portfolio_metrics.AssetSubclassAllocation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f302970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f302971b;

    public /* synthetic */ l(q qVar, int i) {
        this.f302970a = i;
        this.f302971b = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        a6f.i allocationData = (a6f.i) obj2;
        switch (this.f302970a) {
            case 0:
                Intrinsics.checkNotNullParameter(allocationData, "allocationData");
                List listA = allocationData.a();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : listA) {
                    AssetSubclassAllocation assetSubclassAllocation = (AssetSubclassAllocation) obj3;
                    if ((assetSubclassAllocation instanceof AssetSubclassAllocation.Stocks) || (assetSubclassAllocation instanceof AssetSubclassAllocation.Bonds) || (assetSubclassAllocation instanceof AssetSubclassAllocation.Commodities)) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(((AssetSubclassAllocation) it8.next()).getF95689b());
                }
                if (arrayList2.isEmpty()) {
                    return new go.g(new Data(q.c(allocationData, f0.f322471a), null, false, 6, null), 2);
                }
                q qVar = this.f302971b;
                return nim.a.v(((ael.k) qVar.f302974a).l(d0.i1(arrayList2)), new x0b.c(qVar, allocationData));
            default:
                Intrinsics.checkNotNullParameter(allocationData, "allocationData");
                List listD = allocationData.d();
                return listD.isEmpty() ? new go.g(new Data(f0.f322471a, null, false, 6, null), 2) : rd0.e.b(nim.a.w(ybl.b.c(this.f302971b.f302974a), new m(listD, 0)));
        }
    }
}
