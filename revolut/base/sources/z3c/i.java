package z3c;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.revolut_shop.api.R$string;
import com.youTransactor.uCube.rpc.Constants;
import d3c.m0;
import d3c.x;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class i {
    public static CompositeClause a(x productVariation, m0 m0Var, boolean z) {
        int i;
        Intrinsics.checkNotNullParameter(productVariation, "productVariation");
        TextClause textClause = new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        aim.e eVarB = u.b();
        dj0.d dVar = productVariation.f;
        MoneyClause.Format.Defaults defaults = new MoneyClause.Format.Defaults(null, null, false, false, 15);
        dj0.d dVar2 = productVariation.f111074g;
        eVarB.add(new MoneyClause(dVar, defaults, dVar2 != null ? new Custom(null, true, null, false, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION) : null, null, 8));
        if (dVar2 != null) {
            eVarB.add(new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorPerformancePositive), false, null, false, null, 254), null, 8));
        }
        if (m0Var != null) {
            int i2 = h.f319244a[m0Var.ordinal()];
            if (i2 == 1 || i2 == 2) {
                i = R$string.revolut_shop_common_price_plus_gst;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.revolut_shop_common_price_plus_vat;
            }
            eVarB.add(new TextLocalisedClause(i, null, null, 14));
        }
        if (z && productVariation.f111075h.k()) {
            eVarB.add(yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextClause("·", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.revolut_shop_common_price_free_delivery, null, null, 14))));
        }
        return new CompositeClause(u.a(eVarB), textClause, null, null, 12);
    }

    public static Clause b(long j2, String type) {
        Clause clauseW;
        Intrinsics.checkNotNullParameter(type, "type");
        TextClause textClause = new TextClause(type, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        if (j2 > 1) {
            m70.a.t(t0.f186434a);
            clauseW = yoj.b.w(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(p.a.m(j2, "x"), (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        } else {
            clauseW = null;
        }
        return yoj.b.w(textClause, clauseW);
    }
}
