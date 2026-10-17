package b4g;

import com.revolut.feature.travel.flights.models.domain.booking.BookingPreviewParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BookingPreviewParams f12353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12354b;

    public n(BookingPreviewParams params, String searchSessionId) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(searchSessionId, "searchSessionId");
        this.f12353a = params;
        this.f12354b = searchSessionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f12353a, nVar.f12353a) && Intrinsics.f(this.f12354b, nVar.f12354b);
    }

    public final int hashCode() {
        return this.f12354b.hashCode() + (this.f12353a.hashCode() * 31);
    }
}
