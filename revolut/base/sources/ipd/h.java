package ipd;

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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class h {
    public static CompositeClause a(dj0.d currentValue, dj0.d compareValue, boolean z) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(currentValue, "currentValue");
        Intrinsics.checkNotNullParameter(compareValue, "compareValue");
        dj0.d dVarH = pyd.c.H(currentValue, compareValue);
        if (dVarH.f(dj0.d.e)) {
            i = R$attr.uikit_colorPerformancePositive;
            i2 = z ? R$drawable.uikit_icn_10_stocks_arrow_up : R$drawable.uikit_icn_10_stocks_arrow_down;
        } else {
            if (dVarH.k()) {
                return null;
            }
            i = R$attr.uikit_colorPerformanceNegative;
            i2 = z ? R$drawable.uikit_icn_10_stocks_arrow_down : R$drawable.uikit_icn_10_stocks_arrow_up;
        }
        List listK = v.k(new ImageClause(i2, new ImageClauseTint.Color(i), (Float) null, (Float) null, 28), new MoneyClause(otd.f.a(dVarH).a(), new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(new Custom.Color.Solid(i), false, false, 254), null, 8));
        m70.a.t(t0.f186434a);
        return new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }
}
