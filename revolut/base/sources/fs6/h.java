package fs6;

import com.revolut.feature.freelancer.common.models.vat_reminders.FreelancerVatReminder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerVatReminder f137612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f137613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f137614c;
    public final boolean d;

    public h(FreelancerVatReminder currentVatReminder, g updatedVatReminder) {
        Intrinsics.checkNotNullParameter(currentVatReminder, "currentVatReminder");
        Intrinsics.checkNotNullParameter(updatedVatReminder, "updatedVatReminder");
        this.f137612a = currentVatReminder;
        this.f137613b = updatedVatReminder;
        this.f137614c = currentVatReminder.f73498b != updatedVatReminder.f137609a;
        this.d = (currentVatReminder.f73499c == updatedVatReminder.f137610b && currentVatReminder.d == updatedVatReminder.f137611c) ? false : true;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f137612a, hVar.f137612a) && Intrinsics.f(this.f137613b, hVar.f137613b);
    }

    public final int hashCode() {
        return this.f137613b.hashCode() + (this.f137612a.hashCode() * 31);
    }
}
