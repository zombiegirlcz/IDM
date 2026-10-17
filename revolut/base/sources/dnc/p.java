package dnc;

import com.revolut.feature.wealth.models.portfolio_metrics.AssetSubclassAllocation;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;

/* JADX INFO: loaded from: classes6.dex */
public final class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f116269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f116270b;

    public /* synthetic */ p(r rVar, int i) {
        this.f116269a = i;
        this.f116270b = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        Object next2;
        Object next3;
        switch (this.f116269a) {
            case 0:
                List instruments = (List) obj2;
                Intrinsics.checkNotNullParameter(instruments, "instruments");
                List list = (List) this.f116270b.f116272p.e.getValue();
                int iB = q0.b(zhm.w.t(list, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Object obj3 : list) {
                    AssetSubclassAllocation assetSubclassAllocation = (AssetSubclassAllocation) obj3;
                    Iterator it8 = instruments.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            next = it8.next();
                            if (Intrinsics.f(((nel.n) next).f214596b, assetSubclassAllocation.getF95689b())) {
                            }
                        } else {
                            next = null;
                        }
                        break;
                    }
                    linkedHashMap.put(obj3, (nel.n) next);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    nel.n nVar = (nel.n) entry.getValue();
                    if (nVar != null) {
                        linkedHashMap2.put(entry.getKey(), nVar);
                    }
                }
                return linkedHashMap2;
            case 1:
                List instruments2 = (List) obj2;
                Intrinsics.checkNotNullParameter(instruments2, "instruments");
                List list2 = (List) this.f116270b.f116272p.f.getValue();
                int iB2 = q0.b(zhm.w.t(list2, 10));
                if (iB2 < 16) {
                    iB2 = 16;
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(iB2);
                for (Object obj4 : list2) {
                    AssetSubclassAllocation assetSubclassAllocation2 = (AssetSubclassAllocation) obj4;
                    Iterator it9 = instruments2.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            next2 = it9.next();
                            if (Intrinsics.f(((nel.n) next2).f214596b, assetSubclassAllocation2.getF95689b())) {
                            }
                        } else {
                            next2 = null;
                        }
                        break;
                    }
                    linkedHashMap3.put(obj4, (nel.n) next2);
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                    nel.n nVar2 = (nel.n) entry2.getValue();
                    if (nVar2 != null) {
                        linkedHashMap4.put(entry2.getKey(), nVar2);
                    }
                }
                return linkedHashMap4;
            default:
                List instruments3 = (List) obj2;
                Intrinsics.checkNotNullParameter(instruments3, "instruments");
                List list3 = (List) this.f116270b.f116272p.f85154g.getValue();
                int iB3 = q0.b(zhm.w.t(list3, 10));
                if (iB3 < 16) {
                    iB3 = 16;
                }
                LinkedHashMap linkedHashMap5 = new LinkedHashMap(iB3);
                for (Object obj5 : list3) {
                    AssetSubclassAllocation assetSubclassAllocation3 = (AssetSubclassAllocation) obj5;
                    Iterator it10 = instruments3.iterator();
                    while (true) {
                        if (it10.hasNext()) {
                            next3 = it10.next();
                            if (Intrinsics.f(((nel.n) next3).f214596b, assetSubclassAllocation3.getF95689b())) {
                            }
                        } else {
                            next3 = null;
                        }
                        break;
                    }
                    linkedHashMap5.put(obj5, (nel.n) next3);
                }
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                for (Map.Entry entry3 : linkedHashMap5.entrySet()) {
                    nel.n nVar3 = (nel.n) entry3.getValue();
                    if (nVar3 != null) {
                        linkedHashMap6.put(entry3.getKey(), nVar3);
                    }
                }
                return linkedHashMap6;
        }
    }
}
