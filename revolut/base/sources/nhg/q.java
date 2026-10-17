package nhg;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.TravelMilesFlightSearchResultsScreen;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class q extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TravelMilesFlightSearchResultsScreen f215482a;

    public q(TravelMilesFlightSearchResultsScreen travelMilesFlightSearchResultsScreen) {
        this.f215482a = travelMilesFlightSearchResultsScreen;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (Math.abs(i2) <= 10 || i2 <= 0) {
            return;
        }
        com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.f fVar = (com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.f) this.f215482a.h3();
        cli.y yVar = fVar.u;
        if (((com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.b) ((j2) yVar.f22677a).getValue()).f94325g == s.EXPANDED) {
            fVar.H2(yVar, new nd8.i(28));
        }
    }
}
