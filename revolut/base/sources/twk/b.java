package twk;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes12.dex */
public final class b {
    public static final Clause a(e eVar, dj0.d dVar, TextLocalisedClause textLocalisedClause, dj0.d dVar2) {
        Clause clauseA;
        int i = a.f275047a[eVar.ordinal()];
        if (i == 1) {
            clauseA = d.a(3, null, null, dVar2);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            clauseA = d.b(dVar2, dVar);
        }
        if (textLocalisedClause == null) {
            return clauseA;
        }
        Clause[] elements = {textLocalisedClause, clauseA};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new CompositeClause(kotlin.collections.d.L(elements), new TextClause(m70.a.o(t0.f186434a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }
}
