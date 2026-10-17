package b4g;

import com.revolut.feature.travel.flights.models.domain.booking.BookingConfirmParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BookingConfirmParams f12348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12349b;

    public m(BookingConfirmParams params, String searchSessionId) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(searchSessionId, "searchSessionId");
        this.f12348a = params;
        this.f12349b = searchSessionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f12348a, mVar.f12348a) && Intrinsics.f(this.f12349b, mVar.f12349b);
    }

    public final int hashCode() {
        return this.f12349b.hashCode() + (this.f12348a.hashCode() * 31);
    }
}
