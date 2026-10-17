package q5g;

import com.revolut.feature.travel.flights.models.domain.booking.BookingConfirmation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class v implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BookingConfirmation f242394a;

    public v(BookingConfirmation confirmation) {
        Intrinsics.checkNotNullParameter(confirmation, "confirmation");
        this.f242394a = confirmation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && Intrinsics.f(this.f242394a, ((v) obj2).f242394a);
    }

    public final int hashCode() {
        return this.f242394a.hashCode();
    }
}
