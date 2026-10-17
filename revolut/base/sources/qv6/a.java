package qv6;

import aw0.ka;
import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.feature.freelancer.impl.R$plurals;
import com.revolut.feature.freelancer.impl.R$string;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jr6.d;
import jr6.f;
import jr6.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.ranges.IntRange;
import rr6.c;
import rr6.e;
import rr6.i;
import rr6.j;
import rr6.m;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements g {
    public a(pv6.a cashbackDetailsClauseFactory, wv6.a cashbackUpsellClauseFactory) {
        Intrinsics.checkNotNullParameter(cashbackDetailsClauseFactory, "cashbackDetailsClauseFactory");
        Intrinsics.checkNotNullParameter(cashbackUpsellClauseFactory, "cashbackUpsellClauseFactory");
    }

    public final f a(j cashbackInfo, rr6.g boosterInfo, m currentRate, BigDecimal bigDecimal, boolean z, d copyMode) {
        Clause textLocalisedClause;
        int i;
        List listC;
        Object textClause;
        Intrinsics.checkNotNullParameter(cashbackInfo, "cashbackInfo");
        Intrinsics.checkNotNullParameter(boosterInfo, "boosterInfo");
        Intrinsics.checkNotNullParameter(currentRate, "currentRate");
        Intrinsics.checkNotNullParameter(copyMode, "copyMode");
        BigDecimal bigDecimal2 = currentRate.f256723c;
        BigDecimal bigDecimal3 = currentRate.f256721a;
        PercentageClause percentageClause = new PercentageClause(bigDecimal2, (PercentageClause.Format) null, (Style) null, 6);
        TextLocalisedClause textLocalisedClauseA = pv6.a.a(cashbackInfo.f256715b);
        c cVar = boosterInfo.d;
        rr6.a aVar = boosterInfo.f256707b;
        rr6.f fVar = boosterInfo.f256706a;
        e eVar = fVar.f256705b;
        if (cVar == c.MAXED) {
            Intrinsics.checkNotNullParameter(copyMode, "copyMode");
            if (z) {
                int i2 = R$string.freelancer_widget_cashback_description_upgrade;
                if (bigDecimal != null) {
                    textClause = new PercentageClause(bigDecimal, (PercentageClause.Format) null, (Style) null, 6);
                } else {
                    m70.a.c(t0.f186434a);
                    textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                }
                textLocalisedClause = new TextLocalisedClause(i2, u.c(textClause), null, 12);
            } else if (copyMode instanceof jr6.c) {
                textLocalisedClause = new TextLocalisedClause(R$string.freelancer_cashback_widget_details_footer_title_maxed_out, null, null, 14);
            } else {
                if (!(copyMode instanceof d.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(R$string.freelancer_cashback_widget_details_footer_title_maxed_out_short, null, null, 14);
            }
        } else {
            Intrinsics.checkNotNullParameter(boosterInfo, "boosterInfo");
            Intrinsics.checkNotNullParameter(currentRate, "currentRate");
            Intrinsics.checkNotNullParameter(copyMode, "copyMode");
            if (copyMode instanceof jr6.c) {
                int i3 = cVar == c.REGAIN_REQUIRED ? R$string.freelancer_cashback_widget_details_footer_title_regain : R$string.freelancer_cashback_widget_details_footer_title_unlock;
                MoneyClause moneyClause = new MoneyClause(eVar.f256703c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
                TimeClause timeClause = new TimeClause(oi0.d.c0(aVar.d), new TimeClause.Format.DayAndMonth(0), null, null, 12);
                i iVar = eVar.f256701a;
                int i5 = iVar.d;
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(iVar.f256712b);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
                BigDecimal bigDecimalAdd = bigDecimal3.add(bigDecimalValueOf);
                Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
                Object[] elements = {new TextLocalisedClause(i3, v.k(moneyClause, timeClause, new PercentageClause(bigDecimalAdd, (PercentageClause.Format) null, (Style) null, 6)), null, 12), new TextLocalisedQuantityClause(R$plurals.freelancer_cashback_booster_requirement_min_sales_title, Integer.valueOf(i5), u.c(Integer.valueOf(i5)), (Style) null, 24), null};
                Intrinsics.checkNotNullParameter(elements, "elements");
                List listL = kotlin.collections.d.L(elements);
                m70.a.t(t0.f186434a);
                textLocalisedClause = new CompositeClause(listL, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
            } else {
                if (!copyMode.equals(d.a.f177938a)) {
                    throw new NoWhenBranchMatchedException();
                }
                int i6 = cVar == c.REGAIN_REQUIRED ? R$string.freelancer_cashback_widget_details_footer_title_regain_short : R$string.freelancer_cashback_widget_details_footer_title_unlock_short;
                MoneyClause moneyClause2 = new MoneyClause(eVar.f256703c, new MoneyClause.Format.Shorts(false, 63), null, null, 12);
                TimeClause timeClause2 = new TimeClause(oi0.d.c0(aVar.d), new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12);
                BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(eVar.f256701a.f256712b);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
                BigDecimal bigDecimalAdd2 = bigDecimal3.add(bigDecimalValueOf2);
                Intrinsics.checkNotNullExpressionValue(bigDecimalAdd2, "add(...)");
                textLocalisedClause = new TextLocalisedClause(i6, v.k(moneyClause2, timeClause2, new PercentageClause(bigDecimalAdd2, (PercentageClause.Format) null, (Style) null, 6)), null, 12);
            }
        }
        if (cVar == c.REGAIN_REQUIRED) {
            rr6.d dVar = fVar.f256704a;
            i = dVar != null ? dVar.f256699a.f256711a : 0;
        } else {
            i = eVar.f256701a.f256711a;
        }
        int i21 = eVar.f256701a.f256711a;
        double d = eVar.f256702b;
        if (i == 0) {
            listC = u.c(new jr6.e(0));
        } else {
            IntRange intRange = new IntRange(1, i, 1);
            ArrayList arrayList = new ArrayList(w.t(intRange, 10));
            vim.f it8 = intRange.iterator();
            while (it8.f289625c) {
                int iNextInt = it8.nextInt();
                arrayList.add(new jr6.e((int) ((iNextInt < i21 ? 1.0d : iNextInt == i21 ? d : 0.0d) * ((double) 100))));
            }
            listC = arrayList;
        }
        return new f(percentageClause, textLocalisedClauseA, textLocalisedClause, listC);
    }
}
