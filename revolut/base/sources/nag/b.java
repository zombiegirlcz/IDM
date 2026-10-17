package nag;

import com.revolut.feature_travel_hotels_models.property.room.HotelsPropertyRoomOccupancyRatesSelection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HotelsPropertyRoomOccupancyRatesSelection f213902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f213903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f213904c;

    public b(HotelsPropertyRoomOccupancyRatesSelection selection, int i, boolean z) {
        Intrinsics.checkNotNullParameter(selection, "selection");
        this.f213902a = selection;
        this.f213903b = i;
        this.f213904c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f213902a, bVar.f213902a) && this.f213903b == bVar.f213903b && this.f213904c == bVar.f213904c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f213904c) + j6.a.b(this.f213903b, this.f213902a.hashCode() * 31, 31);
    }
}
