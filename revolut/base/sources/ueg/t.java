package ueg;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.TravelHotelsSearchResultsMapScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class t extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TravelHotelsSearchResultsMapScreen f279419a;

    public t(TravelHotelsSearchResultsMapScreen travelHotelsSearchResultsMapScreen) {
        this.f279419a = travelHotelsSearchResultsMapScreen;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (Math.abs(i2) > 10) {
            TravelHotelsSearchResultsMapScreen travelHotelsSearchResultsMapScreen = this.f279419a;
            if (i2 <= 0) {
                ((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b) travelHotelsSearchResultsMapScreen.R2()).M2(g0.UP);
            } else {
                ((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b) travelHotelsSearchResultsMapScreen.R2()).M2(g0.DOWN);
                if (travelHotelsSearchResultsMapScreen.g0) {
                    return;
                }
                travelHotelsSearchResultsMapScreen.f3();
            }
        }
    }
}
