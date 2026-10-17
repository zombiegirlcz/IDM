package evi;

import aii.r;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftTimeSlot;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AsftTimeSlot f129962a;

    public e(AsftTimeSlot selectedTimeSlot) {
        Intrinsics.checkNotNullParameter(selectedTimeSlot, "selectedTimeSlot");
        this.f129962a = selectedTimeSlot;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f129962a, ((e) obj2).f129962a);
    }

    public final int hashCode() {
        return this.f129962a.hashCode();
    }
}
