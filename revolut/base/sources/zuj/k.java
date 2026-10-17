package zuj;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.TravelItineraryScreen;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends LinearSmoothScroller {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LinearLayoutManager f325494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TravelItineraryScreen f325495b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(int i, LinearLayoutManager linearLayoutManager, TravelItineraryScreen travelItineraryScreen, Context context) {
        super(context);
        this.f325494a = linearLayoutManager;
        this.f325495b = travelItineraryScreen;
        setTargetPosition(i);
    }

    @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public final void onTargetFound(View targetView, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
        Intrinsics.checkNotNullParameter(targetView, "targetView");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(action, "action");
        int decoratedTop = this.f325494a.getDecoratedTop(targetView);
        KProperty[] kPropertyArr = TravelItineraryScreen.Y;
        int translationY = decoratedTop - ((int) this.f325495b.d3().f.getTranslationY());
        int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.abs(translationY));
        if (iCalculateTimeForDeceleration > 0) {
            action.update(0, translationY, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
        }
    }
}
