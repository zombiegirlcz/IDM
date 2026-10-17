package g2e;

import com.revolut.feature.store.api.model.StoreMegaFilter;
import com.revolut.feature.store.api.model.StoreMegaFilterSelection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j2 f139974a = vkm.q.c(new a(0));

    public static ArrayList c(String str, String str2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            StoreMegaFilterSelection storeMegaFilterSelectionA = (StoreMegaFilterSelection) it8.next();
            if (Intrinsics.f(storeMegaFilterSelectionA.f88543a.f88537a, str)) {
                List list2 = storeMegaFilterSelectionA.f88544b;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    if (!Intrinsics.f(((StoreMegaFilter.StoreMegaFilterValue) obj2).f88540a, str2)) {
                        arrayList2.add(obj2);
                    }
                }
                storeMegaFilterSelectionA = arrayList2.isEmpty() ? null : StoreMegaFilterSelection.a(storeMegaFilterSelectionA, arrayList2);
            }
            if (storeMegaFilterSelectionA != null) {
                arrayList.add(storeMegaFilterSelectionA);
            }
        }
        return arrayList;
    }

    public final a a() {
        return (a) this.f139974a.getValue();
    }

    public final void b(String filterId, String valueId, boolean z) {
        j2 j2Var;
        Object value;
        List listA0;
        ArrayList arrayListC;
        Intrinsics.checkNotNullParameter(filterId, "filterId");
        Intrinsics.checkNotNullParameter(valueId, "valueId");
        do {
            j2Var = this.f139974a;
            value = j2Var.getValue();
            a aVar = (a) value;
            List list = aVar.f139972b;
            listA0 = aVar.f139971a;
            arrayListC = c(filterId, valueId, list);
            if (z) {
                listA0 = zhm.d0.A0(listA0, valueId);
            }
        } while (!j2Var.h(value, a.a(listA0, arrayListC)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList] */
    public final void d(String filterId, StoreMegaFilter storeMegaFilter, StoreMegaFilter.StoreMegaFilterValue storeMegaFilterValue) {
        j2 j2Var;
        Object value;
        ?? arrayList;
        ArrayList arrayListA0;
        Object next;
        Intrinsics.checkNotNullParameter(filterId, "filterId");
        do {
            j2Var = this.f139974a;
            value = j2Var.getValue();
            a aVar = (a) value;
            List list = aVar.f139971a;
            arrayList = aVar.f139972b;
            boolean zContains = list.contains(filterId);
            arrayListA0 = zContains ? zhm.d0.A0(list, filterId) : zhm.d0.F0(filterId, list);
            if (storeMegaFilter != null) {
                String str = storeMegaFilter.f88537a;
                if (storeMegaFilterValue != null) {
                    String str2 = storeMegaFilterValue.f88540a;
                    if (zContains) {
                        arrayList = c(str, str2, arrayList);
                    } else {
                        Iterable<StoreMegaFilterSelection> iterable = (Iterable) arrayList;
                        Iterator it8 = iterable.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                next = it8.next();
                                if (Intrinsics.f(((StoreMegaFilterSelection) next).f88543a.f88537a, str)) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        StoreMegaFilterSelection storeMegaFilterSelection = (StoreMegaFilterSelection) next;
                        if (storeMegaFilterSelection == null) {
                            arrayList = zhm.d0.F0(new StoreMegaFilterSelection(storeMegaFilter, zhm.u.c(storeMegaFilterValue)), (Collection) arrayList);
                        } else {
                            List listF0 = storeMegaFilterSelection.f88544b;
                            List list2 = listF0;
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                            Iterator it9 = list2.iterator();
                            while (it9.hasNext()) {
                                arrayList2.add(((StoreMegaFilter.StoreMegaFilterValue) it9.next()).f88540a);
                            }
                            if (!arrayList2.contains(str2)) {
                                listF0 = zhm.d0.F0(storeMegaFilterValue, listF0);
                            }
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(iterable, 10));
                            for (StoreMegaFilterSelection storeMegaFilterSelectionA : iterable) {
                                if (Intrinsics.f(storeMegaFilterSelectionA.f88543a.f88537a, str)) {
                                    storeMegaFilterSelectionA = StoreMegaFilterSelection.a(storeMegaFilterSelectionA, listF0);
                                }
                                arrayList3.add(storeMegaFilterSelectionA);
                            }
                            arrayList = new ArrayList();
                            for (Object obj2 : arrayList3) {
                                if (!((StoreMegaFilterSelection) obj2).f88544b.isEmpty()) {
                                    arrayList.add(obj2);
                                }
                            }
                        }
                    }
                }
            }
        } while (!j2Var.h(value, a.a(arrayListA0, arrayList)));
    }
}
