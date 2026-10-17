package qb3;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cash_topup.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class u {
    public final bw0.m a(dj0.d amount, fb3.d limits, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(limits, "limits");
        dj0.d dVar2 = limits.f133437a;
        dj0.d dVar3 = limits.f133437a;
        dj0.d dVar4 = limits.f133438b;
        if (dVar2.i(dVar4)) {
            return new bw0.m(new TextLocalisedClause(R$string.topup_cash_amount_error_limits_exceeded, null, null, 14), bw0.l.ERROR, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), true, eb3.a.LIMITS);
        }
        return amount.i(dVar != null ? pyd.c.O(dVar4, dVar) : dVar4) ? new bw0.m(new TextLocalisedClause(R$string.topup_cash_amount_error_min_amount, zhm.u.c(new MoneyClause(dVar4, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), bw0.l.ERROR, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), true, eb3.a.LIMITS) : amount.f(dVar3) ? new bw0.m(new TextLocalisedClause(R$string.topup_cash_amount_error_max_amount, zhm.u.c(new MoneyClause(dVar3, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), bw0.l.ERROR, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), true, eb3.a.LIMITS) : dVar != null ? new bw0.m(new TextLocalisedClause(R$string.topup_cash_amount_amount_after_fee, v.k(new MoneyClause(pyd.c.H(amount, dVar), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), bw0.l.INFO, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), true, eb3.a.FEE) : new bw0.m(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), bw0.l.INFO, null, false, null, 28);
    }
}
