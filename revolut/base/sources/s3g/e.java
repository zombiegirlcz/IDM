package s3g;

import aii.r;
import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingContactDetails;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelExperiencesBookingContactDetails f259668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f259669b;

    public e(TravelExperiencesBookingContactDetails contactDetails, ArrayList updatedAnswers) {
        Intrinsics.checkNotNullParameter(contactDetails, "contactDetails");
        Intrinsics.checkNotNullParameter(updatedAnswers, "updatedAnswers");
        this.f259668a = contactDetails;
        this.f259669b = updatedAnswers;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f259668a, eVar.f259668a) && this.f259669b.equals(eVar.f259669b);
    }

    public final int hashCode() {
        return this.f259669b.hashCode() + (this.f259668a.hashCode() * 31);
    }
}
