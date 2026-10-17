package cgi;

import com.revolut.feature_travel_hotels_models.booking.amendment.TravelHotelsBookingAmendmentCost;
import com.revolut.feature_travel_hotels_models.property.room.RoomOccupancy;
import com.revolut.feature_travel_hotels_models.property.room.TravelHotelsRatePricing;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomOccupancy f23998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f23999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TravelHotelsBookingAmendmentCost f24000c;

    public l(RoomOccupancy occupancy, ArrayList bedOptions, TravelHotelsBookingAmendmentCost amendmentCost) {
        Intrinsics.checkNotNullParameter(occupancy, "occupancy");
        Intrinsics.checkNotNullParameter(bedOptions, "bedOptions");
        Intrinsics.checkNotNullParameter(amendmentCost, "amendmentCost");
        this.f23998a = occupancy;
        this.f23999b = bedOptions;
        this.f24000c = amendmentCost;
    }

    @Override // cgi.q
    /* JADX INFO: renamed from: a */
    public final RoomOccupancy getF98112a() {
        return this.f23998a;
    }

    @Override // cgi.q
    public final List b() {
        return this.f23999b;
    }

    @Override // cgi.q
    public final TravelHotelsRatePricing c() {
        return this.f24000c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f23998a.equals(lVar.f23998a) && this.f23999b.equals(lVar.f23999b) && this.f24000c.equals(lVar.f24000c);
    }

    public final int hashCode() {
        return this.f24000c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f23999b, this.f23998a.hashCode() * 31, 31);
    }
}
