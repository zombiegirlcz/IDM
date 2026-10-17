package whg;

import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.travel.miles.api.R$string;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.sort_by.TravelMilesFlightSearchResultsSortByScreenContract$InputData;
import hfg.i0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelMilesFlightSearchResultsSortByScreenContract$InputData f297654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f297655b;

    public g(TravelMilesFlightSearchResultsSortByScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f297654a = inputData;
        this.f297655b = v.k(new f(i0.PRICE, new TextLocalisedClause(R$string.miles_flight_search_results_sort_by_price, null, null, 14)), new f(i0.EARLIEST_DEPARTURE, new TextLocalisedClause(R$string.miles_flight_search_results_sort_by_earliest_departure, null, null, 14)), new f(i0.LATEST_DEPARTURE, new TextLocalisedClause(R$string.miles_flight_search_results_sort_by_latest_departure, null, null, 14)));
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.miles_flight_search_results_sort_title, null, null, 14), null, null, null, false, 30);
        List<f> list = this.f297655b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (f fVar : list) {
            i0 i0Var = this.f297654a.f94345a;
            i0 i0Var2 = fVar.f297652a;
            arrayList.add(new SingleChoiceDelegate.Model(i0Var2.name(), fVar.f297653b, i0Var == i0Var2, null, fVar, YearClass.CLASS_2008));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new cii.b(null, arrayList, aVar);
    }
}
