package sei;

import com.revolut.feature_travel_hotels_models.property.Pricing;
import com.revolut.feature_travel_hotels_models.property.room.RoomOccupancy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f262199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f262200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RoomOccupancy f262201c;
    public final Pricing d;

    public b(String bookingToken, a status, RoomOccupancy occupancy, Pricing pricing) {
        Intrinsics.checkNotNullParameter(bookingToken, "bookingToken");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(occupancy, "occupancy");
        this.f262199a = bookingToken;
        this.f262200b = status;
        this.f262201c = occupancy;
        this.d = pricing;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f262199a, bVar.f262199a) && this.f262200b == bVar.f262200b && Intrinsics.f(this.f262201c, bVar.f262201c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f262201c.hashCode() + ((this.f262200b.hashCode() + (this.f262199a.hashCode() * 31)) * 31)) * 31;
        Pricing pricing = this.d;
        return iHashCode + (pricing == null ? 0 : pricing.hashCode());
    }
}
