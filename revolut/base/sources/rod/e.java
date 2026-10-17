package rod;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.retail.feature.api.trips.models.Trip;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lnd.o0;
import lnd.x;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f255974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f255975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f255976c;
    public final mzi.b d;
    public final l80.e e;

    public e(o0 categoriesSectionMapper, g commonMapper, x analyticsFilterMapper, mzi.b intervalMapper, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(categoriesSectionMapper, "categoriesSectionMapper");
        Intrinsics.checkNotNullParameter(commonMapper, "commonMapper");
        Intrinsics.checkNotNullParameter(analyticsFilterMapper, "analyticsFilterMapper");
        Intrinsics.checkNotNullParameter(intervalMapper, "intervalMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f255974a = categoriesSectionMapper;
        this.f255975b = commonMapper;
        this.f255976c = analyticsFilterMapper;
        this.d = intervalMapper;
        this.e = dateProvider;
    }

    public final List a(fod.c cVar, xi0.b bVar) {
        LocalDate localDate;
        LocalDate localDateE;
        dj0.d dVarA = g.a(cVar, bVar);
        n9l.a aVar = cVar.f136927c;
        Trip trip = cVar.f136925a;
        if (dVarA == null) {
            return f0.f322471a;
        }
        ZonedDateTime zonedDateTime = trip.f99264b;
        ZonedDateTime zonedDateTime2 = trip.f99265c;
        if (zonedDateTime != null && (localDate = zonedDateTime.toLocalDate()) != null) {
            if (zonedDateTime2 == null || (localDateE = zonedDateTime2.toLocalDate()) == null) {
                localDateE = ((l80.f) this.e).e();
            }
            long jG = ebm.a.g(localDate, localDateE) + 1;
            Long lValueOf = Long.valueOf(jG);
            if (jG <= 0) {
                lValueOf = null;
            }
            if (lValueOf != null) {
                dj0.d dVarK = pyd.c.k(dVarA, lValueOf.longValue());
                dj0.d dVarB = otd.f.b(dVarA, v.l(aVar), trip.getCurrency());
                dj0.d dVarB2 = otd.f.b(dVarK, v.l(aVar), trip.getCurrency());
                List listC = u.c(g.c(v.k(new a(new TextLocalisedClause(R$string.trips_list_header_spent, null, null, 14), otd.f.d(dVarA), dVarB != null ? otd.f.d(dVarB) : null), new a(new TextLocalisedClause(R$string.trips_list_header_average_placeholder, u.c(new TextLocalisedClause(R$string.trips_list_header_day, null, null, 14)), null, 12), otd.f.d(dVarK), dVarB2 != null ? otd.f.d(dVarB2) : null)), h.TRIP_DETAILS));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                return listC;
            }
        }
        return f0.f322471a;
    }
}
