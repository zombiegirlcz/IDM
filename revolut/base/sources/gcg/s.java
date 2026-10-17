package gcg;

import com.revolut.feature_travel_hotels_models.property.search.LocationData;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f142466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f142467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f142468c;
    public final LocationData d;

    public s(List roomsList, LocalDate checkInDate, LocalDate checkOutDate, LocationData locationData) {
        Intrinsics.checkNotNullParameter(roomsList, "roomsList");
        Intrinsics.checkNotNullParameter(checkInDate, "checkInDate");
        Intrinsics.checkNotNullParameter(checkOutDate, "checkOutDate");
        Intrinsics.checkNotNullParameter(locationData, "locationData");
        this.f142466a = roomsList;
        this.f142467b = checkInDate;
        this.f142468c = checkOutDate;
        this.d = locationData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f142466a, sVar.f142466a) && Intrinsics.f(this.f142467b, sVar.f142467b) && Intrinsics.f(this.f142468c, sVar.f142468c) && Intrinsics.f(this.d, sVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + wp5.y.a(wp5.y.a(this.f142466a.hashCode() * 31, 31, this.f142467b), 31, this.f142468c);
    }
}
