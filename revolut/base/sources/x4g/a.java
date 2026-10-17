package x4g;

import aim.e;
import aw0.o9;
import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.travel.flights.api.R$string;
import com.revolut.feature.travel.flights.models.domain.extra_products.TravelFlightsExtraProduct;
import com.revolut.feature.travel.flights.models.domain.extra_products.TravelFlightsExtraProductCarrierPriceBreakdown;
import com.revolut.feature.travel.flights.models.domain.extra_products.TravelFlightsExtraProductOption;
import dj0.d;
import ip0.ck0;
import ip0.yj0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import pyd.c;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    @NotNull
    private static final C1681a Companion = new C1681a();

    /* JADX INFO: renamed from: x4g.a$a, reason: collision with other inner class name */
    public static final class C1681a {
        private C1681a() {
        }
    }

    public static TextDelegate.Model a(TravelFlightsExtraProduct travelFlightsExtraProduct, int i) {
        d dVar;
        List listC;
        TravelFlightsExtraProductOption travelFlightsExtraProductOption = (TravelFlightsExtraProductOption) d0.d0(uj3.b.H(travelFlightsExtraProduct));
        if (travelFlightsExtraProductOption == null || (dVar = travelFlightsExtraProductOption.d) == null || (listC = c(travelFlightsExtraProductOption.e)) == null) {
            return null;
        }
        List<b> list = listC;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (b bVar : list) {
            List listK = v.k(new MoneyClause(bVar.f302877b, new MoneyClause.Format.Defaults(null, new ScaleMode.SimpleLen(0, 3), false, false, 13), null, o9.NON_SENSITIVE, 4), new TextClause(bVar.f302876a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            m70.a.t(t0.f186434a);
            arrayList.add(new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12));
        }
        d.Companion.getClass();
        d dVarO = d.e;
        int i2 = 0;
        for (Object obj2 : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            dVarO = i2 == 0 ? ((b) obj2).f302877b : c.O(dVarO, ((b) obj2).f302877b);
            i2 = i3;
        }
        return b(i, new TextLocalisedClause(R$string.travel_flights_baggage_selection_carrier_fee, u.c(new MoneyClause(c.H(dVar, dVarO), new MoneyClause.Format.Defaults(null, new ScaleMode.SimpleLen(0, 3), false, false, 13), null, o9.NON_SENSITIVE, 4)), null, 12), arrayList);
    }

    public static TextDelegate.Model b(int i, TextLocalisedClause textLocalisedClause, ArrayList arrayList) {
        String strN = a0.d.n("CARRIER_PRICE_INFO_ID_", i);
        e eVarB = u.b();
        eVarB.addAll(arrayList);
        eVarB.add(textLocalisedClause);
        return new TextDelegate.Model(strN, new CompositeClause(u.a(eVarB), new TextClause(" + ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), false, new ck0(yj0.START), null, null, 0, 0, 0, 0, 2032);
    }

    public static List c(List list) {
        d dVar;
        if (list == null) {
            return null;
        }
        List<TravelFlightsExtraProductCarrierPriceBreakdown> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (TravelFlightsExtraProductCarrierPriceBreakdown travelFlightsExtraProductCarrierPriceBreakdown : list2) {
            String str = travelFlightsExtraProductCarrierPriceBreakdown.f93507b;
            if (str == null || (dVar = travelFlightsExtraProductCarrierPriceBreakdown.f93508c) == null) {
                return null;
            }
            arrayList.add(new b(dVar, str));
        }
        return (List) ue0.e.M(arrayList);
    }
}
