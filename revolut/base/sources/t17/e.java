package t17;

import com.revolut.core.ui_kit.views.ActionsView;
import ip0.z;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.a0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class e {
    /* JADX WARN: Type inference failed for: r12v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    public static z a(String groupId, List allFilters, List selectedFilters) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(allFilters, "allFilters");
        Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
        ArrayList arrayList = new ArrayList();
        List<l> list = allFilters;
        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
        for (l lVar : list) {
            arrayList2.add(new ActionsView.Item(lVar.f267206b, selectedFilters.contains(lVar) ? mx0.d.ACCENT : mx0.d.SEMIBLACK, false, null, null, lVar.f267205a, null, null, null, null, false, null, null, lVar, null, 24476));
        }
        a0.x(arrayList2, arrayList);
        return new z(groupId, arrayList, null, mx0.l.SCROLLABLE, 0, 0, 116);
    }
}
