package f5g;

import aw0.v1;
import com.revolut.core.ui_kit.delegates.u8;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.travel.flights.api.R$plurals;
import com.revolut.feature.travel.flights.api.R$string;
import ip0.rv;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import l7g.z;
import org.jetbrains.annotations.NotNull;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    @NotNull
    private static final C0773a Companion = new C0773a();

    /* JADX INFO: renamed from: f5g.a$a, reason: collision with other inner class name */
    public static final class C0773a {
        private C0773a() {
        }
    }

    public static ArrayList a(List bookings) {
        Intrinsics.checkNotNullParameter(bookings, "bookings");
        List<z> list = bookings;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (z zVar : list) {
            String strQ = j6.a.q("TRAVEL_FLIGHTS_BOOKING_", zVar.f192632a);
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.travel_flights_itinerary_details_header_title, v.k(zVar.f192633b, zVar.f192634c), null, 12);
            Clause[] elements = {g4g.c.a(zVar.d), g4g.c.b(zVar.e, zVar.f), new TextLocalisedQuantityClause(R$plurals.travel_flights_itinerary_details_header_passenger, Integer.valueOf(zVar.f192635g), (List) null, (Style) null, 28)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            u8 u8Var = new u8(strQ, textLocalisedClause, new CompositeClause(kotlin.collections.d.L(elements), new DotDividerClause((Integer) null), null, null, 12), null, new UrlImage(zVar.f192636h, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), null, null, null, v1.DARK, null, true, false, false, null, 128488);
            yp0.b.l(u8Var, 0, 0, 0, 0, null, false, 63);
            arrayList.add(new b(zVar.f192632a, u8Var));
        }
        return arrayList;
    }

    public static ArrayList b() {
        ArrayList arrayList = new ArrayList(2);
        for (int i = 0; i < 2; i++) {
            rv rvVar = new rv(a0.d.n("TRAVEL_FLIGHTS_BOOKING_LOADING_", i), null, 62);
            yp0.b.l(rvVar, 0, 0, 0, 0, null, false, 63);
            arrayList.add(rvVar);
        }
        return arrayList;
    }
}
