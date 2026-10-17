package vi1;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import s7a.c0;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class t extends x7a.d {
    @Override // x7a.d
    public final c0 c(Set ids, Object obj2) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        return new s((String) d0.a0(ids));
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
                if (obj3 instanceof wi1.c) {
                    arrayList.add(obj3);
                }
            }
        } else {
            arrayList = f0.f322471a;
        }
        ArrayList<wi1.c> arrayList2 = new ArrayList();
        for (Object obj4 : (Iterable) arrayList) {
            wi1.c cVar = (wi1.c) obj4;
            if (kotlin.text.d0.W(query) || kotlin.text.d0.J(cVar.name(), query, true)) {
                arrayList2.add(obj4);
            }
        }
        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
        for (wi1.c cVar2 : arrayList2) {
            arrayList3.add(new RowDelegate.Model(cVar2.name(), null, new TextLocalisedClause(cVar2.b(), null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, cVar2, null, 0, 0, 0, 0, 532676602));
        }
        yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
        return arrayList3;
    }

    @Override // x7a.d
    public final Flow e(String query, boolean z, Object obj2) {
        Intrinsics.checkNotNullParameter(query, "query");
        return new go.g(zi0.c.P(wi1.c.a(), false, null, 3), 2);
    }
}
