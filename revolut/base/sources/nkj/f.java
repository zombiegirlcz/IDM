package nkj;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class f {
    public static Clause a(Clause clause, TextLocalisedClause textLocalisedClause) {
        return (clause == null || textLocalisedClause == null) ? clause == null ? textLocalisedClause : clause : new CompositeClause(v.k(clause, textLocalisedClause), new DotDividerClause((Integer) null), null, null, 12);
    }
}
