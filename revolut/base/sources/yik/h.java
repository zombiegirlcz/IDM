package yik;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import hha.w0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements fgk.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f314341a;

    public h(f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f314341a = uiKitResources;
    }

    public final Clause c(String pricingPlanTier, Custom custom) {
        w0 pricingPlanTier2;
        Intrinsics.checkNotNullParameter(pricingPlanTier, "pricingPlanTier");
        w0[] w0VarArrValues = w0.values();
        int length = w0VarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                pricingPlanTier2 = null;
                break;
            }
            pricingPlanTier2 = w0VarArrValues[i];
            if (a0.z(pricingPlanTier2.name(), pricingPlanTier, true)) {
                break;
            }
            i++;
        }
        if (pricingPlanTier2 == null) {
            pricingPlanTier2 = w0.UNKNOWN;
        }
        Intrinsics.checkNotNullParameter(pricingPlanTier2, "pricingPlanTier");
        TextLocalisedClause textLocalisedClauseE = dok.g.e(pricingPlanTier2, custom);
        if (textLocalisedClauseE != null) {
            return textLocalisedClauseE;
        }
        String lowerCase = pricingPlanTier.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return new TextClause(jli.g.b(lowerCase), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public final Clause d(ArrayList pricingPlans) {
        Intrinsics.checkNotNullParameter(pricingPlans, "pricingPlans");
        if (pricingPlans.size() == 2) {
            return new TextLocalisedClause(R$string.plans_two_plans, v.k(dok.g.d((hha.d) pricingPlans.get(0), null), dok.g.d((hha.d) pricingPlans.get(1), null)), null, 12);
        }
        ArrayList arrayList = new ArrayList(w.t(pricingPlans, 10));
        Iterator it8 = pricingPlans.iterator();
        while (it8.hasNext()) {
            arrayList.add(dok.g.d((hha.d) it8.next(), null));
        }
        return yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), arrayList);
    }
}
