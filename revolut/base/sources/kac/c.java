package kac;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f182455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f182456b;

    public c(String flightBookingOrderId, boolean z) {
        Intrinsics.checkNotNullParameter(flightBookingOrderId, "flightBookingOrderId");
        this.f182455a = flightBookingOrderId;
        this.f182456b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f182455a, cVar.f182455a) && this.f182456b == cVar.f182456b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f182456b) + (this.f182455a.hashCode() * 31);
    }
}
