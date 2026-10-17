package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.ChallengeMediumDelegate;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.math.BigDecimal;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public abstract class d3 {
    public static final CompositeClause a(ChallengeMediumDelegate.Model model) {
        Float fValueOf = Float.valueOf(16.0f);
        Double d = model.f;
        if (d == null) {
            return null;
        }
        List listK = zhm.v.k(new ImageClause(R$drawable.uikit_icn_24_rev_points, (Integer) null, fValueOf, fValueOf, 18), new NumberClause(new BigDecimal(String.valueOf(d.doubleValue())), null, new Custom(new Custom.Color.Solid(R$attr.uikit_colorForeground), false, false, 254), null, 10));
        m70.a.t(kotlin.jvm.internal.t0.f186434a);
        return new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (aw0.o9) null, (List) null, 126), null, null, 12);
    }
}
