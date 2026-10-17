package jvj;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.f5;
import com.revolut.core.ui_kit.delegates.g5;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.TimeRangeClause;
import com.revolut.core.ui_kit.models.n0;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.edit_dates.TravelItineraryEditDatesScreenContract$InputData;
import java.time.LocalDate;
import java.time.ZoneOffset;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements n {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelItineraryEditDatesScreenContract$InputData f178896a;

    public h(TravelItineraryEditDatesScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f178896a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        vim.e eVar = domainState.f178888a;
        Comparable comparable = eVar.f289622b;
        boolean z = domainState.f178890c;
        Comparable comparable2 = eVar.f289621a;
        TravelItineraryEditDatesScreenContract$InputData travelItineraryEditDatesScreenContract$InputData = this.f178896a;
        boolean z3 = Intrinsics.f(comparable2, travelItineraryEditDatesScreenContract$InputData.f101647b) && Intrinsics.f(comparable, travelItineraryEditDatesScreenContract$InputData.f101648c);
        g5 g5Var = new g5("DATE_PICKER_ITEM_ID", domainState.f178889b, (LocalDate) comparable2, false, new f5((LocalDate) comparable), z ? ((LocalDate) comparable).minusDays(29L) : null, z ? ((LocalDate) comparable2).plusDays(29L) : null, null, null, null, 0, 0, 1048344);
        yp0.b.l(g5Var, 0, 0, 0, 0, null, false, 63);
        return new e(Intrinsics.f(comparable2, comparable) ? new TimeClause(oc.c.N((LocalDate) comparable2), new TimeClause.Format.DateMedium(n0.HIDE_CURRENT_YEAR), null, null, 12) : new TimeRangeClause(oc.c.N((LocalDate) comparable2), oc.c.N((LocalDate) comparable), ZoneOffset.UTC, null, 8), u.c(g5Var), (z || z3) ? false : true);
    }
}
