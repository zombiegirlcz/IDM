package m3g;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.feature.travel.experiences.impl.ui.screen.search_results.TravelExperiencesSearchResultsScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TravelExperiencesSearchResultsScreen f202536a;

    public i(TravelExperiencesSearchResultsScreen travelExperiencesSearchResultsScreen) {
        this.f202536a = travelExperiencesSearchResultsScreen;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (i2 != 0) {
            ((com.revolut.feature.travel.experiences.impl.ui.screen.search_results.b) this.f202536a.T2()).x2(new m30.c(14));
        }
    }
}
