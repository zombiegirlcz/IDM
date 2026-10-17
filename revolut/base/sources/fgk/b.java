package fgk;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import dok.g;
import hha.d;
import java.util.List;
import jha.c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.joda.time.DateTime;
import yik.h;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public interface b {
    static Clause a(b bVar, d pricingPlan) {
        ((h) bVar).getClass();
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        return g.d(pricingPlan, null);
    }

    static Clause b(b bVar, d plan) {
        ((h) bVar).getClass();
        Intrinsics.checkNotNullParameter(plan, "plan");
        c cVar = plan.o;
        if (cVar == null) {
            m70.a.c(t0.f186434a);
            return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        jha.d dVar = cVar.d;
        if (dVar == jha.d.AUSTRALIA && cVar.f174188a.compareTo(cVar.f174189b) != 0) {
            return new TextLocalisedClause(R$string.dashboard_feature_cashback_percentage_small_and_big_au_subtitle, v.k(dok.a.b(cVar), dok.a.a(cVar)), null, 12);
        }
        if (dVar != jha.d.JAPAN) {
            return new TextLocalisedClause(R$string.dashboard_feature_instant_cashback_subtitle, v.k(dok.a.b(cVar), dok.a.a(cVar)), null, 12);
        }
        PercentageClause percentageClauseB = dok.a.b(cVar);
        jha.b bVar2 = cVar.f174190c;
        if (bVar2 == null) {
            m70.a.c(t0.f186434a);
            return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        MoneyClause moneyClause = new MoneyClause(bVar2.f174187b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4);
        jha.a aVar = cVar.e;
        if (aVar != null) {
            DateTime dateTime = aVar.f174183a;
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            if (dateTime.isAfter(DateTime.now())) {
                long millis = dateTime.getMillis();
                TimeClause.Format.INSTANCE.getClass();
                TimeClause timeClause = new TimeClause(millis, TimeClause.Format.f57959a, null, null, 12);
                Intrinsics.checkNotNullParameter(aVar, "<this>");
                return new TextLocalisedClause(R$string.dashboard_feature_info_metal_cashback_expansion_dashboard_boosted_title_JP, v.k(new PercentageClause(aVar.f174184b, (PercentageClause.Format) null, (Style) null, 6), timeClause, percentageClauseB, moneyClause), null, 12);
            }
        }
        return new TextLocalisedClause(R$string.dashboard_feature_info_metal_cashback_expansion_dashboard_title_JP, v.k(percentageClauseB, moneyClause), null, 12);
    }
}
