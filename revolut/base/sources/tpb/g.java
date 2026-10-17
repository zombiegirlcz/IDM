package tpb;

import aw0.o9;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import kotlin.jvm.internal.t0;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class g {
    public static CompositeClause a(dj0.d dVar, boolean z) {
        Float fValueOf = Float.valueOf(10.0f);
        int i = z ? R$attr.uikit_colorPerformancePositive : R$attr.uikit_colorPerformanceNegative;
        List listK = v.k(new ImageClause(z ? R$drawable.uikit_icn_16_plus_circle : R$drawable.uikit_icn_16_minus_circle, new ImageClauseTint.Color(i), fValueOf, fValueOf, 16), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(i), false, null, false, null, 254), null, 8));
        m70.a.t(t0.f186434a);
        return new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }
}
