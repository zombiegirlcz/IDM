package ueg;

import com.revolut.core.mobile_services.impl.map.GmsLatLngBounds;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class w extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GmsLatLngBounds f279438a;

    public w(GmsLatLngBounds latLngBounds) {
        Intrinsics.checkNotNullParameter(latLngBounds, "latLngBounds");
        this.f279438a = latLngBounds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!w.class.equals(obj2 != null ? obj2.getClass() : null)) {
            return false;
        }
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.TravelHotelsSearchResultsMapScreenContract.MapPosition.Bounds");
        GmsLatLngBounds gmsLatLngBounds = ((w) obj2).f279438a;
        GmsLatLngBounds gmsLatLngBounds2 = this.f279438a;
        return gmsLatLngBounds2.c().equals(gmsLatLngBounds.c()) && gmsLatLngBounds2.b().equals(gmsLatLngBounds.b());
    }

    public final int hashCode() {
        GmsLatLngBounds gmsLatLngBounds = this.f279438a;
        return gmsLatLngBounds.b().hashCode() + (gmsLatLngBounds.c().hashCode() * 31);
    }
}
