package o23;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes21.dex */
public final class g0 extends x7a.d {
    @Override // x7a.d
    public final s7a.c0 c(Set ids, Object obj2) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        return new f0(e0.valueOf((String) zhm.d0.a0(ids)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList] */
    @Override // x7a.d
    public final List d(Data data, Set selectedModelIds, List list, String query, Object obj2) {
        ?? arrayList;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(selectedModelIds, "selectedModelIds");
        Intrinsics.checkNotNullParameter(query, "query");
        Object content = data.getContent();
        List list2 = content instanceof List ? (List) content : null;
        if (list2 != null) {
            arrayList = new ArrayList();
            for (Object obj3 : list2) {
                if (obj3 instanceof e0) {
                    arrayList.add(obj3);
                }
            }
        } else {
            arrayList = zhm.f0.f322471a;
        }
        ArrayList<e0> arrayList2 = new ArrayList();
        for (Object obj4 : (Iterable) arrayList) {
            e0 e0Var = (e0) obj4;
            if (kotlin.text.d0.W(query) || kotlin.text.d0.J(e0Var.name(), query, true)) {
                arrayList2.add(obj4);
            }
        }
        ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
        for (e0 e0Var2 : arrayList2) {
            arrayList3.add(new RowDelegate.Model(e0Var2.name(), null, new TextLocalisedClause(e0Var2.b(), null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, e0Var2, null, 0, 0, 0, 0, 532676602));
        }
        yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
        return arrayList3;
    }

    @Override // x7a.d
    public final Flow e(String query, boolean z, Object obj2) {
        Intrinsics.checkNotNullParameter(query, "query");
        return new go.g(zi0.c.P(e0.a(), false, null, 3), 2);
    }
}
