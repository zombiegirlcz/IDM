package egk;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import dok.g;
import hha.w0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import wik.t;

/* JADX INFO: loaded from: classes11.dex */
public interface e {
    static Clause a(e eVar, hha.d plan) {
        ((t) eVar).getClass();
        Intrinsics.checkNotNullParameter(plan, "plan");
        return g.d(plan, null);
    }

    static Clause b(e eVar, w0 planTier) {
        ((t) eVar).getClass();
        Intrinsics.checkNotNullParameter(planTier, "planTier");
        TextLocalisedClause textLocalisedClauseE = g.e(planTier, null);
        return textLocalisedClauseE == null ? new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : textLocalisedClauseE;
    }
}
