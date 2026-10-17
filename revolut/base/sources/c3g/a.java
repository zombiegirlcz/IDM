package c3g;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.travel.experiences.api.R$string;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceAgeBand;
import com.revolut.feature.travel.experiences.api.models.pricing_breakdown.TravelExperiencesAgebandsBreakdown;
import com.revolut.feature.travel.experiences.api.models.pricing_breakdown.TravelExperiencesPricingBreakdown;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jli.g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    @NotNull
    public static final C0136a Companion = new C0136a();

    /* JADX INFO: renamed from: c3g.a$a, reason: collision with other inner class name */
    public static final class C0136a {
        private C0136a() {
        }
    }

    public static TravelExperienceAgeBand a(myf.a aVar, myf.b bVar) {
        Object next;
        Iterator it8 = aVar.e.f92853c.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((TravelExperienceAgeBand) next).f92783a == bVar) {
                break;
            }
        }
        return (TravelExperienceAgeBand) next;
    }

    public static ArrayList b(TravelExperiencesPricingBreakdown pricingBreakdown, myf.a experience) {
        Intrinsics.checkNotNullParameter(pricingBreakdown, "pricingBreakdown");
        Intrinsics.checkNotNullParameter(experience, "experience");
        ArrayList<TravelExperiencesAgebandsBreakdown> arrayList = pricingBreakdown.f92879b;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (TravelExperiencesAgebandsBreakdown travelExperiencesAgebandsBreakdown : arrayList) {
            myf.b bVar = travelExperiencesAgebandsBreakdown.f92875a;
            TravelExperienceAgeBand travelExperienceAgeBandA = a(experience, bVar);
            TextClause textClause = travelExperienceAgeBandA != null ? new TextClause(travelExperienceAgeBandA.f92784b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextClause(g.c(bVar.name()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            TravelExperienceAgeBand travelExperienceAgeBandA2 = a(experience, bVar);
            arrayList2.add(new RowDelegate.Model("PRICE_BREAKDOWN_AGEBAND_ITEM_ID", null, textClause, null, 0, travelExperienceAgeBandA2 != null ? new TextLocalisedClause(R$string.experiences_age_bands_cell_subtitle, v.k(Integer.valueOf(travelExperienceAgeBandA2.f92785c), Integer.valueOf(travelExperienceAgeBandA2.d)), null, 12) : null, null, null, 0, new RowDelegate.Model.c.b(new CompositeClause(v.k(new NumberClause(travelExperiencesAgebandsBreakdown.f92876b, (NumberClause.Format.Compact) null, (Custom) null, 6), new TextClause(" × ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new MoneyClause(travelExperiencesAgebandsBreakdown.f92877c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4)), null, null, null, 14), null, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869850));
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        RowDelegate.Model model = new RowDelegate.Model("PRICE_BREAKDOWN_TOTAL_ITEM_ID", null, new TextLocalisedClause(R$string.experiences_common_total, null, null, 14), null, 0, null, null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(pricingBreakdown.f92878a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4), null, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869882);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return d0.F0(model, arrayList2);
    }
}
