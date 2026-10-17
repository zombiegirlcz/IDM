package e06;

import aw0.o9;
import bw0.l;
import bw0.m;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.customer_present.tips.impl.R$string;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements n {
    @Override // cli.n
    public final o c(j jVar) {
        m mVar;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        xi0.b bVar = domainState.f121426b;
        dj0.d dVar = domainState.f121425a;
        TextClause textClause = new TextClause(bVar.f306286a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        nx0.e eVar = nx0.e.NONE;
        bw0.h hVar = new bw0.h(domainState.f121427c, cp5.d.J(domainState.f121426b), true, null, Boolean.TRUE, false, false, false, false, null, 8148);
        dj0.d dVar2 = domainState.d;
        dj0.d dVar3 = dj0.d.e;
        if (dVar2.f(dVar3)) {
            int i = R$string.customer_present_tipping_tip_percent;
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(dVar2.f115082a * ((long) 100));
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            BigDecimal scale = bigDecimalValueOf.setScale(2);
            Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
            BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(dVar.f115082a);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
            BigDecimal bigDecimalDivide = scale.divide(bigDecimalValueOf2, RoundingMode.HALF_EVEN);
            Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
            mVar = new m(new TextLocalisedClause(i, u.c(new NumberClause(bigDecimalDivide, new NumberClause.Format.FixedDigitsAfterDot(2, 14, null, null, null), null, null, 12)), null, 12), l.INFO, null, false, null, 28);
        } else {
            mVar = null;
        }
        AmountEditDelegate.Model model = new AmountEditDelegate.Model("TIP_AMOUNT_LIST_ID", textClause, hVar, eVar, null, mVar, null, false, domainState.f121426b, null, 1680);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        List listC = u.c(model);
        MoneyClause moneyClause = new MoneyClause(pyd.c.O(dVar, dVar2), new MoneyClause.Format.Defaults(null, null, false, false, 7), null, null, 12);
        dj0.d dVar4 = dVar2.f(dVar3) ? dVar2 : null;
        return new f(listC, moneyClause, dVar4 != null ? new TextLocalisedClause(R$string.customer_present_tipping_total_amount_breakdown_subtitle, v.k(new MoneyClause(domainState.f121425a, new MoneyClause.Format.Defaults(null, null, false, false, 7), null, null, 12), new MoneyClause(dVar4, new MoneyClause.Format.Defaults(null, null, false, false, 7), null, null, 12)), null, 12) : null, dVar2.f(dVar3));
    }
}
