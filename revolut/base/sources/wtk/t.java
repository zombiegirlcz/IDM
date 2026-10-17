package wtk;

import aw0.o9;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.wealth.resources.R$string;
import java.math.BigDecimal;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ytk.c f300028a;

    public t(ytk.c percentageClauseMapper) {
        Intrinsics.checkNotNullParameter(percentageClauseMapper, "percentageClauseMapper");
        this.f300028a = percentageClauseMapper;
    }

    public final CompositeClause a(mel.u uVar) {
        int i;
        int i2;
        mel.s sVarB = uVar.b();
        BigDecimal bigDecimalA = uVar.a();
        if (sVarB == null || bigDecimalA == null) {
            return null;
        }
        int i3 = s.f300027a[sVarB.ordinal()];
        if (i3 == 1) {
            i = R$string.instrument_fundamentals_expected_return_subtitle_rank_top;
            i2 = R$attr.uikit_colorPerformancePositive;
        } else if (i3 == 2) {
            i = R$string.instrument_fundamentals_expected_return_subtitle_rank_middle;
            i2 = R$attr.uikit_colorPerformanceStatic;
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.instrument_fundamentals_expected_return_subtitle_rank_bottom;
            i2 = R$attr.uikit_colorPerformanceNegative;
        }
        return yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), zhm.v.k(new TextLocalisedClause(i, zhm.u.c(ytk.c.b(this.f300028a, bigDecimalA, null, null, 6)), new Custom(Integer.valueOf(i2), false, null, false, null, 254), 8), new ImageClause(R$drawable.uikit_icn_16_chevron_right, new ImageClauseTint.Color(i2), (Float) null, (Float) null, 28)));
    }
}
