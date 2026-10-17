package pvk;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.wealth.resources.R$string;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ytk.c f240294a;

    public n0(ytk.c percentageClauseMapper) {
        Intrinsics.checkNotNullParameter(percentageClauseMapper, "percentageClauseMapper");
        this.f240294a = percentageClauseMapper;
    }

    public final CompositeClause a(dj0.d dVar, dj0.d dVar2, TextLocalisedClause textLocalisedClause) {
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.instrument_insights_suggestion_description_at_price, zhm.u.c(new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), o9.NON_SENSITIVE)), null, 12);
        double d = ((dVar2.f115082a * 100.0d) / dVar.f115082a) - 100.0d;
        ytk.c cVar = this.f240294a;
        Clause[] elements = {new TextLocalisedClause(R$string.instrument_insights_suggestion_description_pattern, zhm.v.k(textLocalisedClause2, d >= 0.0d ? new TextLocalisedClause(R$string.instrument_insights_suggestion_description_higher_target_price, zhm.u.c(ytk.c.b(cVar, new BigDecimal(String.valueOf(d)), null, null, 6)), null, 12) : new TextLocalisedClause(R$string.instrument_insights_suggestion_description_lower_target_price, zhm.u.c(ytk.c.b(cVar, new BigDecimal(String.valueOf(Math.abs(d))), null, null, 6)), null, 12)), null, 12), textLocalisedClause};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), kotlin.collections.d.L(elements));
    }
}
