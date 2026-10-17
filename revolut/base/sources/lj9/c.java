package lj9;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pay_later.api.R$string;
import sx4.g;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class c {
    public static a a(int i, int i2, boolean z) {
        Clause textLocalisedClause = new TextLocalisedClause(i, null, new Custom(Integer.valueOf(i2), false, null, false, null, 254), 10);
        if (z) {
            textLocalisedClause = g.g(textLocalisedClause, new ImageClauseTint.Color(i2));
        }
        return new a(v1.c.f(v.k(new TextLocalisedClause(R$string.pay_later_product_name, null, null, 14), textLocalisedClause), null), z);
    }
}
