package g2e;

import com.revolut.feature.store.api.model.StoreMegaFilter;
import com.revolut.feature.store.api.model.StoreMegaFilterSelection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public abstract class d {
    public static final ArrayList a(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        List<StoreMegaFilterSelection> list = aVar.f139972b;
        ArrayList arrayList = new ArrayList();
        for (StoreMegaFilterSelection storeMegaFilterSelection : list) {
            List list2 = storeMegaFilterSelection.f88544b;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList2.add(new Pair(storeMegaFilterSelection.f88543a, (StoreMegaFilter.StoreMegaFilterValue) it8.next()));
            }
            zhm.a0.x(arrayList2, arrayList);
        }
        return arrayList;
    }
}
