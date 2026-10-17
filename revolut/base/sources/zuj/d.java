package zuj;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.TravelItineraryScreen;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TravelItineraryScreen f325490a;

    public d(TravelItineraryScreen travelItineraryScreen) {
        this.f325490a = travelItineraryScreen;
    }

    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, java.util.List] */
    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        View viewFindChildViewUnder;
        String dateId;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        KProperty[] kPropertyArr = TravelItineraryScreen.Y;
        TravelItineraryScreen travelItineraryScreen = this.f325490a;
        ScreenContentRecyclerView travelItineraryScreenRecyclerView = travelItineraryScreen.d3().e;
        Intrinsics.checkNotNullExpressionValue(travelItineraryScreenRecyclerView, "travelItineraryScreenRecyclerView");
        RecyclerView.LayoutManager layoutManager = travelItineraryScreenRecyclerView.getLayoutManager();
        Object obj2 = null;
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null || (viewFindChildViewUnder = travelItineraryScreenRecyclerView.findChildViewUnder(travelItineraryScreenRecyclerView.getWidth() / 2.0f, travelItineraryScreen.d3().f.getTranslationY())) == null) {
            return;
        }
        int position = linearLayoutManager.getPosition(viewFindChildViewUnder);
        Integer numValueOf = Integer.valueOf(position);
        if (position == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            ?? r62 = travelItineraryScreen.O;
            ListIterator listIterator = r62.listIterator(r62.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                Object objPrevious = listIterator.previous();
                if (((Number) ((Pair) objPrevious).f186385a).intValue() <= iIntValue) {
                    obj2 = objPrevious;
                    break;
                }
            }
            Pair pair = (Pair) obj2;
            if (pair == null || (dateId = (String) pair.f186386b) == null || dateId.equals(travelItineraryScreen.P)) {
                return;
            }
            travelItineraryScreen.P = dateId;
            com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.a aVar = (com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.a) travelItineraryScreen.R2();
            aVar.getClass();
            Intrinsics.checkNotNullParameter(dateId, "dateId");
            aVar.H2(aVar.z, new x(dateId, 1));
        }
    }
}
