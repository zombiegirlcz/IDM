package hic;

import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.rewards.impl.R$string;
import ggc.l;
import ggc.t;

/* JADX INFO: loaded from: classes6.dex */
public final class c {
    public static TextLocalisedClause a(l lVar, boolean z) {
        String str;
        t tVar;
        if (!z || (tVar = lVar.e) == null || (str = tVar.e) == null) {
            str = lVar.d.e;
        }
        return new TextLocalisedClause(R$string.offers_details_terms_and_conditions, null, new Click(28, (Integer) null, (Object) str, "TERMS_AND_CONS_CLAUSE_ID", false), 10);
    }
}
