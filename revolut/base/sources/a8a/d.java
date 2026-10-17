package a8a;

import com.revolut.core.ui_kit.models.Clause;
import efm.r;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import qv0.i;
import y7a.w;

/* JADX INFO: loaded from: classes5.dex */
public abstract class d {
    public List a(String filterQuery, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(filterQuery, "filterQuery");
        return items;
    }

    public abstract boolean b(String str, i iVar);

    public Clause c(Set preSelectedModelIds, Set ids) {
        Intrinsics.checkNotNullParameter(preSelectedModelIds, "preSelectedModelIds");
        Intrinsics.checkNotNullParameter(ids, "ids");
        return null;
    }

    public abstract w d(Set set, Object obj2);

    public abstract r e(Object obj2, Set set, List list);
}
