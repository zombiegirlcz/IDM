package ylk;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import dok.g;
import hha.d;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class a {
    public static Clause a(d dVar, boolean z) {
        Clause clauseD = g.d(dVar, null);
        return z ? new TextLocalisedClause(R$string.plan_duo_short_name, u.c(clauseD), null, 12) : clauseD;
    }
}
