package hbg;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.TravelHotelsBookingDetailsScreen;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TravelHotelsBookingDetailsScreen f150694a;

    public c(TravelHotelsBookingDetailsScreen travelHotelsBookingDetailsScreen) {
        this.f150694a = travelHotelsBookingDetailsScreen;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b bVar = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b) this.f150694a.R2();
        cli.y yVar = bVar.P;
        boolean z = iComputeVerticalScrollOffset == 0;
        if (((l) ((j2) yVar.f22677a).getValue()).f150707h != z) {
            bVar.H2(yVar, new g7b.q(z, 9));
        }
    }
}
