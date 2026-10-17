package mc6;

import aii.r;
import com.revolut.feature.donations.impl.ui.kompot.screen.recurring.DonationSchedule;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DonationSchedule f204280a;

    public g(DonationSchedule donationSchedule) {
        Intrinsics.checkNotNullParameter(donationSchedule, "donationSchedule");
        this.f204280a = donationSchedule;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f204280a, ((g) obj2).f204280a);
    }

    public final int hashCode() {
        return this.f204280a.hashCode();
    }
}
