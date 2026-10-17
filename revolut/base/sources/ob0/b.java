package ob0;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class b extends x7a.d {
    @Override // x7a.d
    public final List d(Data data, Set selectedModelIds, List list, String query, Object obj2) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(selectedModelIds, "selectedModelIds");
        Intrinsics.checkNotNullParameter(query, "query");
        return (List) iii.c.f(data, new o95.b(23), new o4a.a(29), new lk7.p(this, 11, query, selectedModelIds));
    }

    public abstract ArrayList i(String str, List list);

    public abstract Image j(Object obj2);

    public abstract String k(Object obj2);

    public List l(String query, List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(query, "query");
        return list;
    }

    public abstract Clause m(Object obj2);

    public abstract Clause n(Object obj2);

    public RowDelegate.Model o(Object obj2, String str) {
        String strK = k(obj2);
        Image imageJ = j(obj2);
        boolean zF = Intrinsics.f(str, strK);
        return new RowDelegate.Model(strK, imageJ != null ? new RowDelegate.Model.MainImage.Image40(imageJ, d8l.d.b(zF), null, false, null, false, 60) : null, n(obj2), null, 0, m(obj2), null, null, 0, null, false, null, imageJ == null && zF, !zF ? RowDelegate.Model.b.c.f53268a : RowDelegate.Model.b.C0423b.f53267a, null, null, null, null, null, null, null, 0, 0, 0, 0, 536846296);
    }
}
