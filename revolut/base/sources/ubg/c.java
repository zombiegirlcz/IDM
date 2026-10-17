package ubg;

import com.revolut.feature_travel_hotels_models.booking.details.CancellationRefund;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellationRefund f278892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f278893b;

    public c(CancellationRefund cancellationRefund, d type) {
        Intrinsics.checkNotNullParameter(cancellationRefund, "cancellationRefund");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f278892a = cancellationRefund;
        this.f278893b = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f278892a, cVar.f278892a) && this.f278893b == cVar.f278893b;
    }

    public final int hashCode() {
        return this.f278893b.hashCode() + (this.f278892a.hashCode() * 31);
    }
}
