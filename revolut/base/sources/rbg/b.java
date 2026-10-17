package rbg;

import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.confirmation.TravelHotelsCancellationConfirmationContract$CancellationConfirmationData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsCancellationConfirmationContract$CancellationConfirmationData f253050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qbg.d f253051b;

    public b(TravelHotelsCancellationConfirmationContract$CancellationConfirmationData confirmationData, qbg.d variant) {
        Intrinsics.checkNotNullParameter(confirmationData, "confirmationData");
        Intrinsics.checkNotNullParameter(variant, "variant");
        this.f253050a = confirmationData;
        this.f253051b = variant;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f253050a, bVar.f253050a) && this.f253051b == bVar.f253051b;
    }

    public final int hashCode() {
        return this.f253051b.hashCode() + (this.f253050a.hashCode() * 31);
    }
}
