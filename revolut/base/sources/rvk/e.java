package rvk;

import aw0.o9;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import pvk.a0;
import pvk.b0;
import pvk.c0;
import pvk.d0;
import pvk.e0;
import pvk.y;
import pvk.z;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public final class e {
    public static CompositeClause a(e0 section) throws Throwable {
        int i;
        Float fValueOf = Float.valueOf(12.0f);
        Intrinsics.checkNotNullParameter(section, "section");
        if (section instanceof c0) {
            i = R$string.instrument_sentiment_title;
        } else if (section instanceof d0) {
            i = R$string.instrument_technicals_title;
        } else if (section instanceof y) {
            i = R$string.instrument_analyst_forecasts_title;
        } else if (section instanceof z) {
            i = R$string.instrument_insights_expected_annual_return_label;
        } else {
            a0 a0Var = a0.f240263a;
            if (!section.equals(a0Var) && !(section instanceof b0)) {
                throw new NoWhenBranchMatchedException();
            }
            hx7.e.n(new IllegalStateException("Unsupported section type ".concat(section.equals(a0Var) ? "History" : section.equals(b0.f240266a) ? "PotentialRisks" : "Unknown")));
            i = 0;
        }
        List listK = v.k(new TextLocalisedClause(i, null, null, 14), new ImageClause(R$drawable.uikit_icn_16_chevron_right, Integer.valueOf(R$attr.uikit_colorGreyTone50), fValueOf, fValueOf, 16));
        m70.a.t(t0.f186434a);
        return yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), listK);
    }
}
