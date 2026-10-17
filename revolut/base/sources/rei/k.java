package rei;

import com.revolut.feature_travel_hotels_models.booking.details.CancellationRefund;
import com.revolut.feature_travel_hotels_models.property.room.CancellationPolicy;
import com.revolut.feature_travel_hotels_models.property.room.RoomOccupancy;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f253616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f253617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f253618c;
    public final d d;
    public final j e;
    public final CancellationPolicy f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CancellationRefund f253619g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f253620h;
    public final RoomOccupancy i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final u f253621j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f253622l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l f253623m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f253624n;

    public k(String id10, String roomId, d confirmationIds, d itineraryIds, j status, CancellationPolicy cancellation, CancellationRefund cancellationRefund, t bedConfiguration, RoomOccupancy occupancy, u guestName, String str, String str2, l roomDetails, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        Intrinsics.checkNotNullParameter(confirmationIds, "confirmationIds");
        Intrinsics.checkNotNullParameter(itineraryIds, "itineraryIds");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(cancellation, "cancellation");
        Intrinsics.checkNotNullParameter(bedConfiguration, "bedConfiguration");
        Intrinsics.checkNotNullParameter(occupancy, "occupancy");
        Intrinsics.checkNotNullParameter(guestName, "guestName");
        Intrinsics.checkNotNullParameter(roomDetails, "roomDetails");
        this.f253616a = id10;
        this.f253617b = roomId;
        this.f253618c = confirmationIds;
        this.d = itineraryIds;
        this.e = status;
        this.f = cancellation;
        this.f253619g = cancellationRefund;
        this.f253620h = bedConfiguration;
        this.i = occupancy;
        this.f253621j = guestName;
        this.k = str;
        this.f253622l = str2;
        this.f253623m = roomDetails;
        this.f253624n = arrayList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f253616a, kVar.f253616a) && Intrinsics.f(this.f253617b, kVar.f253617b) && Intrinsics.f(this.f253618c, kVar.f253618c) && Intrinsics.f(this.d, kVar.d) && this.e == kVar.e && Intrinsics.f(this.f, kVar.f) && Intrinsics.f(this.f253619g, kVar.f253619g) && Intrinsics.f(this.f253620h, kVar.f253620h) && Intrinsics.f(this.i, kVar.i) && Intrinsics.f(this.f253621j, kVar.f253621j) && Intrinsics.f(this.k, kVar.k) && Intrinsics.f(this.f253622l, kVar.f253622l) && Intrinsics.f(this.f253623m, kVar.f253623m) && Intrinsics.f(this.f253624n, kVar.f253624n);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.f253618c.hashCode() + p.a.c(this.f253616a.hashCode() * 31, 31, this.f253617b)) * 31)) * 31)) * 31)) * 31;
        CancellationRefund cancellationRefund = this.f253619g;
        int iHashCode2 = (this.f253621j.hashCode() + ((this.i.hashCode() + ((this.f253620h.hashCode() + ((iHashCode + (cancellationRefund == null ? 0 : cancellationRefund.hashCode())) * 31)) * 31)) * 31)) * 31;
        String str = this.k;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f253622l;
        int iHashCode4 = (this.f253623m.hashCode() + ((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        List list = this.f253624n;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }
}
