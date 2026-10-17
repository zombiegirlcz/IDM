package rod;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.retail.feature.api.trips.models.Trip;
import fmc.z;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class j {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f255979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mzi.b f255980b;

    public j(g commonMapper, mzi.b intervalMapper, z tripsCountriesProvider) {
        Intrinsics.checkNotNullParameter(commonMapper, "commonMapper");
        Intrinsics.checkNotNullParameter(intervalMapper, "intervalMapper");
        Intrinsics.checkNotNullParameter(tripsCountriesProvider, "tripsCountriesProvider");
        this.f255979a = commonMapper;
        this.f255980b = intervalMapper;
    }

    public final RowDelegate.Model.c a(fod.c cVar, xi0.b bVar) {
        Trip trip = cVar.f136925a;
        n9l.a aVar = cVar.f136927c;
        if ((trip.f99264b == null || trip.f99265c == null) && !trip.a()) {
            return new pf(new TextLocalisedClause(R$string.trips_list_item_add_dates, null, null, 14), null, null, false, null, null, 510);
        }
        dj0.d dVarA = g.a(cVar, bVar);
        if (dVarA == null) {
            return null;
        }
        xi0.b bVar2 = dVarA.f115083b;
        dj0.d dVarB = (aVar == null || dVarA.k() || Intrinsics.f(aVar.f213662b, bVar2) || !Intrinsics.f(aVar.f213661a, bVar2)) ? null : otd.f.b(dVarA, u.c(aVar), trip.getCurrency());
        return new RowDelegate.Model.c.b(otd.f.d(dVarA), dVarB != null ? otd.f.d(dVarB) : null, null, false, 124);
    }

    public final dj0.d b(List list, boolean z, xi0.b bVar) {
        dj0.d dVarA;
        dj0.d dVar;
        dj0.d dVar2;
        dj0.d.Companion.getClass();
        dj0.d dVarO = dj0.d.e;
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            if (i == 0) {
                fod.c cVar = (fod.c) obj2;
                if (!z || (dVar2 = cVar.d) == null) {
                    dVarO = g.a(cVar, bVar);
                    if (dVarO == null) {
                        dVarO = new dj0.d(0L, bVar);
                    }
                } else {
                    dVarO = dVar2.a();
                }
            } else {
                fod.c cVar2 = (fod.c) obj2;
                if (!z || (dVar = cVar2.d) == null) {
                    dVarA = g.a(cVar2, bVar);
                    if (dVarA == null) {
                        dVarA = new dj0.d(0L, bVar);
                    }
                } else {
                    dVarA = dVar.a();
                }
                dVarO = pyd.c.O(dVarO, dVarA);
            }
            i = i2;
        }
        return dVarO;
    }
}
