package a7g;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.feature.travel.flights.impl.ui.screen.search_results.TravelFlightsSearchScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class p extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TravelFlightsSearchScreen f1891a;

    public p(TravelFlightsSearchScreen travelFlightsSearchScreen) {
        this.f1891a = travelFlightsSearchScreen;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        TravelFlightsSearchScreen travelFlightsSearchScreen = this.f1891a;
        if (travelFlightsSearchScreen.O || Math.abs(i2) <= 10) {
            return;
        }
        v vVarE3 = travelFlightsSearchScreen.d();
        w direction = i2 > 0 ? w.DOWN : w.UP;
        com.revolut.feature.travel.flights.impl.ui.screen.search_results.b bVar = (com.revolut.feature.travel.flights.impl.ui.screen.search_results.b) vVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(direction, "direction");
        bVar.H2(bVar.f93427w, new a7b.r(direction, 1));
    }
}
