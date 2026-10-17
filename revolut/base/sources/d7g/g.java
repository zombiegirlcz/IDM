package d7g;

import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.travel.flights.api.R$string;
import com.revolut.feature.travel.flights.impl.ui.screen.search_results.sort_by.TravelFlightsSearchSortByScreenContract$InputData;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelFlightsSearchSortByScreenContract$InputData f111965a;

    public g(TravelFlightsSearchSortByScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f111965a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        TextLocalisedClause textLocalisedClause;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.travel_flights_sort_options_title, null, null, 14), null, null, null, false, 30);
        EnumEntries<r7g.g> enumEntriesA = r7g.g.a();
        ArrayList arrayList = new ArrayList(w.t(enumEntriesA, 10));
        for (r7g.g gVar : enumEntriesA) {
            String strName = gVar.name();
            int i = f.f111964a[gVar.ordinal()];
            if (i == 1) {
                textLocalisedClause = new TextLocalisedClause(R$string.travel_flights_sort_options_recommended, null, null, 14);
            } else if (i == 2) {
                textLocalisedClause = new TextLocalisedClause(R$string.travel_flights_sort_options_cheapest, null, null, 14);
            } else if (i == 3) {
                textLocalisedClause = new TextLocalisedClause(R$string.travel_flights_sort_options_fastest, null, null, 14);
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(R$string.travel_flights_sort_options_earliest_departure, null, null, 14);
            }
            arrayList.add(new SingleChoiceDelegate.Model(strName, textLocalisedClause, this.f111965a.f93429a == gVar, null, gVar, YearClass.CLASS_2008));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new cii.b(null, arrayList, aVar);
    }
}
