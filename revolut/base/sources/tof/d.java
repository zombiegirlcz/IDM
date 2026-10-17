package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272675a;

    public d(String flightBookingOrderId) {
        Intrinsics.checkNotNullParameter(flightBookingOrderId, "flightBookingOrderId");
        this.f272675a = flightBookingOrderId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f272675a, ((d) obj2).f272675a);
    }

    public final int hashCode() {
        return this.f272675a.hashCode();
    }
}
