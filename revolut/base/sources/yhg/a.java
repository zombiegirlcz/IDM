package yhg;

import cli.j;
import com.revolut.feature.travel.miles.api.model.TravelMilesSearchFlightDetails$SegmentsBreakdown;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelMilesSearchFlightDetails$SegmentsBreakdown f314165a;

    public a(TravelMilesSearchFlightDetails$SegmentsBreakdown segmentsBreakdown) {
        Intrinsics.checkNotNullParameter(segmentsBreakdown, "segmentsBreakdown");
        this.f314165a = segmentsBreakdown;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f314165a, ((a) obj2).f314165a);
    }

    public final int hashCode() {
        return this.f314165a.hashCode();
    }
}
