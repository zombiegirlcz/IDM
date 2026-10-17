package joc;

import aw0.bb;
import aw0.cb;
import aw0.o9;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.TotalValueChartPoint;
import com.revolut.retail.wealth.resources.R$string;
import foc.h;
import goc.b;
import hoc.c;
import hoc.d;
import hoc.e;
import hoc.g;
import hw0.x;
import hw0.z;
import ip0.vj0;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements h {
    public a(b selectedPointTimeClauseProvider) {
        Intrinsics.checkNotNullParameter(selectedPointTimeClauseProvider, "selectedPointTimeClauseProvider");
    }

    @Override // foc.h
    public final e b() {
        return e.f154273a;
    }

    @Override // foc.h
    public final x c(d dVar) {
        c chart = (c) dVar;
        Intrinsics.checkNotNullParameter(chart, "chart");
        return null;
    }

    @Override // foc.h
    public final Clause f(d dVar, hoc.h hVar) {
        c chart = (c) dVar;
        g gVar = (g) hVar;
        Intrinsics.checkNotNullParameter(chart, "chart");
        if (gVar == null) {
            gVar = (g) d0.m0(chart.a());
        }
        return new MoneyClause(gVar.f154275a.f95006b, new MoneyClause.Format.Headers(null, null, null, false, false, 31), null, null, 12);
    }

    @Override // foc.h
    public final vj0 g(d dVar, eoc.e chartSettingsState, hoc.h hVar) {
        c chart = (c) dVar;
        g gVar = (g) hVar;
        Intrinsics.checkNotNullParameter(chart, "chart");
        Intrinsics.checkNotNullParameter(chartSettingsState, "chartSettingsState");
        if (!chartSettingsState.f127899a) {
            return null;
        }
        if (gVar == null) {
            gVar = (g) d0.m0(chart.a());
        }
        MoneyClause moneyClause = new MoneyClause(gVar.f154275a.f95007c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_cash_income, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246);
        CompositeClause compositeClause = new CompositeClause(v.k(new TextLocalisedClause(R$string.wealth_robo_portfolio_projection_your_contribution, null, null, 14), new DotDividerClause((Integer) null), moneyClause), null, null, null, 14);
        int i = R$attr.uikit_colorGreyTone20;
        return new vj0("total-value-chart-tag", new TagViewData(resourceImage, compositeClause, new Color.Solid(i), i, null, 1000), false, new eoc.c(true), 0, 0, 0, 0, 492);
    }

    @Override // foc.h
    public final cb j(d dVar) {
        c chart = (c) dVar;
        Intrinsics.checkNotNullParameter(chart, "chart");
        if (hx7.a.n(chart)) {
            cb.Companion.getClass();
            return bb.d();
        }
        cb.Companion.getClass();
        return bb.b();
    }

    @Override // foc.h
    public final Clause l(d dVar, pdh.c selectedTimeSpan, hoc.h hVar) {
        c chart = (c) dVar;
        del.b bVar = chart.f154271b;
        g gVar = (g) hVar;
        Intrinsics.checkNotNullParameter(chart, "chart");
        Intrinsics.checkNotNullParameter(selectedTimeSpan, "selectedTimeSpan");
        if (gVar != null) {
            return b.a(selectedTimeSpan, gVar.b());
        }
        MoneyClause moneyClause = new MoneyClause(mif.a.Q(bVar.f113710c), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        TextClause textClause = new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        BigDecimal bigDecimal = bVar.d;
        if (bigDecimal == null) {
            bigDecimal = BigDecimal.ZERO;
        }
        BigDecimal bigDecimal2 = bigDecimal;
        Intrinsics.h(bigDecimal2);
        return new CompositeClause(v.k(moneyClause, textClause, xqi.a.c(bigDecimal2, false, false, false, false, false, CertificateBody.profileType), new DotDividerClause((Integer) null), new TextLocalisedClause(R$string.wealth_robo_investment_unrealised_return, null, null, 14)), null, null, null, 14);
    }

    @Override // foc.h
    public final List p(d dVar) {
        c chart = (c) dVar;
        Intrinsics.checkNotNullParameter(chart, "chart");
        return v.k(pdh.c.ONE_DAY, pdh.c.ONE_WEEK, pdh.c.ONE_MONTH, pdh.c.SIX_MONTHS, pdh.c.ONE_YEAR, pdh.c.ALL);
    }

    @Override // foc.h
    public final z q(d dVar) {
        c chart = (c) dVar;
        Intrinsics.checkNotNullParameter(chart, "chart");
        Iterator it8 = chart.a().iterator();
        if (!it8.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it8.next();
        if (it8.hasNext()) {
            g gVar = (g) next;
            BigDecimal bigDecimal = (BigDecimal) cim.c.k(gVar.getValue(), gVar.a());
            do {
                Object next2 = it8.next();
                g gVar2 = (g) next2;
                BigDecimal bigDecimal2 = (BigDecimal) cim.c.k(gVar2.getValue(), gVar2.a());
                if (bigDecimal.compareTo(bigDecimal2) > 0) {
                    next = next2;
                    bigDecimal = bigDecimal2;
                }
            } while (it8.hasNext());
        }
        g gVar3 = (g) next;
        TotalValueChartPoint totalValueChartPoint = gVar3.f154275a;
        dj0.d dVar2 = (dj0.d) cim.c.l(totalValueChartPoint.f95006b, totalValueChartPoint.f95007c);
        BigDecimal bigDecimal3 = (BigDecimal) cim.c.l(gVar3.getValue(), gVar3.a());
        Iterator it9 = chart.a().iterator();
        if (!it9.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next3 = it9.next();
        if (it9.hasNext()) {
            g gVar4 = (g) next3;
            BigDecimal bigDecimal4 = (BigDecimal) cim.c.k(gVar4.getValue(), gVar4.a());
            do {
                Object next4 = it9.next();
                g gVar5 = (g) next4;
                BigDecimal bigDecimal5 = (BigDecimal) cim.c.k(gVar5.getValue(), gVar5.a());
                if (bigDecimal4.compareTo(bigDecimal5) < 0) {
                    next3 = next4;
                    bigDecimal4 = bigDecimal5;
                }
            } while (it9.hasNext());
        }
        g gVar6 = (g) next3;
        TotalValueChartPoint totalValueChartPoint2 = gVar6.f154275a;
        dj0.d dVar3 = (dj0.d) cim.c.k(totalValueChartPoint2.f95006b, totalValueChartPoint2.f95007c);
        BigDecimal bigDecimal6 = (BigDecimal) cim.c.k(gVar6.getValue(), gVar6.a());
        return new z(ms0.v.WhiteTransparentBackground, false, true, v.k(new hw0.a(bigDecimal3.floatValue(), new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), new hw0.a(bigDecimal6.floatValue(), new MoneyClause(dVar3, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12))));
    }
}
