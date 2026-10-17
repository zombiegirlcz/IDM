package vt4;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.api.models.limit_history.CreditCardLimitHistoryItem;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class c {
    public static RowDelegate.Model a(CreditCardLimitHistoryItem item, int i) {
        int i2;
        int i3;
        CompositeClause compositeClause;
        Intrinsics.checkNotNullParameter(item, "item");
        String strN = a0.d.n("id_limit_history_item_", i);
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_credit_card, null, null, 6), null, null, false, null, false, 62);
        MoneyClause moneyClauseB = sx4.f.b(3, null, null, item.f68813a);
        TimeClause timeClauseB = sx4.g.b(item.f68814b, null);
        dj0.d dVar = item.f68815c;
        if (dVar != null) {
            if (dVar.f(dj0.d.e)) {
                i2 = R$attr.uikit_colorPerformancePositive;
                i3 = R$drawable.uikit_icn_10_stocks_arrow_up;
            } else {
                if (!dVar.k()) {
                    i2 = R$attr.uikit_colorPerformanceNegative;
                    i3 = R$drawable.uikit_icn_10_stocks_arrow_down;
                }
                compositeClause = null;
            }
            compositeClause = new CompositeClause(v.k(new ImageClause(i3, new ImageClauseTint.Color(i2), (Float) null, (Float) null, 28), new MoneyClause(dVar.a(), new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(new Custom.Color.Solid(i2), false, false, 254), null, 8)), sx4.g.e(1), null, null, 12);
        } else {
            compositeClause = null;
        }
        Clause[] elements = {timeClauseB, compositeClause};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new RowDelegate.Model(strN, image40, moneyClauseB, null, 0, v1.c.f(kotlin.collections.d.L(elements), null), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
    }
}
