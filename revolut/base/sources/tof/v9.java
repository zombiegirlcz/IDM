package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class v9 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273120a;

    public v9(String hotelBookingId) {
        Intrinsics.checkNotNullParameter(hotelBookingId, "hotelBookingId");
        this.f273120a = hotelBookingId;
    }

    public final String a() {
        return this.f273120a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v9) && Intrinsics.f(this.f273120a, ((v9) obj2).f273120a);
    }

    public final int hashCode() {
        return this.f273120a.hashCode();
    }
}
