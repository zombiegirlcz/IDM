package x6g;

import aw0.o9;
import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.flights.models.domain.payment.TravelFlightsCarrierPriceBreakdown;
import dj0.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    @NotNull
    private static final C1683a Companion = new C1683a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Custom f303093a = new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254);

    /* JADX INFO: renamed from: x6g.a$a, reason: collision with other inner class name */
    public static final class C1683a {
        private C1683a() {
        }
    }

    public static CellDetailsDelegate.Model a(String str, TextLocalisedClause textLocalisedClause, d dVar, boolean z, boolean z3) {
        ResourceImage resourceImage;
        if (z3) {
            resourceImage = new ResourceImage(z ? R$drawable.uikit_icn_16_chevron_up : R$drawable.uikit_icn_16_chevron_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246);
        } else {
            resourceImage = null;
        }
        return new CellDetailsDelegate.Model(str, new t0((Clause) textLocalisedClause, (Image) resourceImage, 0, false, 28), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4), null, null, null, null, 0, null, false, z3, null, null, 26616);
    }

    public static TextLocalisedClause b(a aVar, int i) {
        f0 f0Var = f0.f322471a;
        aVar.getClass();
        return new TextLocalisedClause(i, f0Var, f303093a, 8);
    }

    public static CellDetailsDelegate.Model c(String str, int i, d dVar, boolean z) {
        return d(str, new TextLocalisedClause(i, null, f303093a, 10), dVar, z);
    }

    public static CellDetailsDelegate.Model d(String str, Clause clause, d dVar, boolean z) {
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model(str, new t0(clause, (Image) null, 0, false, 30), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4), null, null, null, null, 0, null, false, false, null, null, 30712);
        if (z) {
            model.f51848y = R$attr.uikit_dp40;
        }
        return model;
    }

    public static ArrayList e(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        List<TravelFlightsCarrierPriceBreakdown> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                String str = ((TravelFlightsCarrierPriceBreakdown) it8.next()).f93551b;
                if (str == null || d0.W(str)) {
                    return null;
                }
            }
        }
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (TravelFlightsCarrierPriceBreakdown travelFlightsCarrierPriceBreakdown : list2) {
            String str2 = travelFlightsCarrierPriceBreakdown.f93551b;
            if (str2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            arrayList.add(new b(travelFlightsCarrierPriceBreakdown.f93552c, str2));
        }
        return arrayList;
    }
}
