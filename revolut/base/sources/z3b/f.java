package z3b;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements d {
    public static List a(TextLocalisedClause textLocalisedClause, dj0.d dVar) {
        return u.c(new CellDetailsActionDelegate.Model("LIMIT_STOP_PRICE_ID", textLocalisedClause, 0, null, yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new ImageClause(R$drawable.uikit_icn_24_pencil, Integer.valueOf(R$attr.uikit_colorAccent), (Float) null, (Float) null, 28), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), null, 8))), false, false, null, null, 0, 0, 32736));
    }
}
