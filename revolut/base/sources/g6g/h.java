package g6g;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.TabsDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.q;
import com.revolut.core.ui_kit.views.t;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.travel.flights.api.R$string;
import com.revolut.feature.travel.flights.models.domain.common.Bound;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements n {

    @NotNull
    private static final g Companion = new g();

    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = domainState.f140942a;
        int i = domainState.f140943b;
        Bound bound = (Bound) list.get(i);
        List list2 = domainState.f140942a;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        int i2 = 0;
        for (Object obj2 : list2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            arrayList.add(new q(a0.d.n("FLIGHTS_ITINERARY_PREVIEW_BOUND_", i2), new t(new TextLocalisedClause(i2 == 0 ? R$string.travel_flights_itinerary_details_card_outbound : R$string.travel_flights_itinerary_details_card_return, null, null, 14)), 50));
            i2 = i3;
        }
        ArrayList arrayListE0 = d0.E0(q4g.n.a(domainState.f140944c), u.c(new TabsDelegate.Model("FLIGHTS_ITINERARY_PREVIEW_TABS", arrayList, a0.d.n("FLIGHTS_ITINERARY_PREVIEW_BOUND_", i), null, null, null, R$attr.uikit_dp0, R$attr.uikit_dp8, null, 7800)));
        ArrayList arrayListA = f6g.a.a(bound, i);
        yp0.b.k(arrayListA, 0, 0, 0, 0, 31);
        return new e(d0.E0(arrayListA, arrayListE0));
    }
}
