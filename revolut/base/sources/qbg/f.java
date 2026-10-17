package qbg;

import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.confirmation.TravelHotelsCancellationConfirmationContract$CancellationConfirmationData;
import com.revolut.feature_travel_hotels_models.property.room.CancellationPolicy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellationPolicy f244271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fgi.a f244272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TravelHotelsCancellationConfirmationContract$CancellationConfirmationData f244273c;

    public f(CancellationPolicy cancellationPolicy, fgi.a aVar, TravelHotelsCancellationConfirmationContract$CancellationConfirmationData travelHotelsCancellationConfirmationContract$CancellationConfirmationData) {
        Intrinsics.checkNotNullParameter(cancellationPolicy, "cancellationPolicy");
        this.f244271a = cancellationPolicy;
        this.f244272b = aVar;
        this.f244273c = travelHotelsCancellationConfirmationContract$CancellationConfirmationData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f244271a, fVar.f244271a) && this.f244272b == fVar.f244272b && Intrinsics.f(this.f244273c, fVar.f244273c);
    }

    public final int hashCode() {
        int iHashCode = this.f244271a.hashCode() * 31;
        fgi.a aVar = this.f244272b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        TravelHotelsCancellationConfirmationContract$CancellationConfirmationData travelHotelsCancellationConfirmationContract$CancellationConfirmationData = this.f244273c;
        return iHashCode2 + (travelHotelsCancellationConfirmationContract$CancellationConfirmationData != null ? travelHotelsCancellationConfirmationContract$CancellationConfirmationData.hashCode() : 0);
    }
}
