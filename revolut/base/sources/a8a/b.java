package a8a;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        Clause clause = ((RowDelegate.Model) obj2).f53230c;
        Intrinsics.i(clause, "null cannot be cast to non-null type com.revolut.core.ui_kit.models.TextClause");
        String str = ((TextClause) clause).f57936a;
        Clause clause2 = ((RowDelegate.Model) obj3).f53230c;
        Intrinsics.i(clause2, "null cannot be cast to non-null type com.revolut.core.ui_kit.models.TextClause");
        return cim.b.b(str, ((TextClause) clause2).f57936a);
    }
}
