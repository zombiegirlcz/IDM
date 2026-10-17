package d3g;

import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingContactDetails;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceSelectedLanguage;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends com.revolut.feature.travel.experiences.impl.ui.screen.questions.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f111125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelExperiencesBookingContactDetails f111126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TravelExperienceSelectedLanguage f111127c;

    public l(ArrayList additionalAnswersList, TravelExperiencesBookingContactDetails contactDetails, TravelExperienceSelectedLanguage travelExperienceSelectedLanguage) {
        Intrinsics.checkNotNullParameter(additionalAnswersList, "additionalAnswersList");
        Intrinsics.checkNotNullParameter(contactDetails, "contactDetails");
        this.f111125a = additionalAnswersList;
        this.f111126b = contactDetails;
        this.f111127c = travelExperienceSelectedLanguage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f111125a.equals(lVar.f111125a) && Intrinsics.f(this.f111126b, lVar.f111126b) && Intrinsics.f(this.f111127c, lVar.f111127c);
    }

    public final int hashCode() {
        int iHashCode = (this.f111126b.hashCode() + (this.f111125a.hashCode() * 31)) * 31;
        TravelExperienceSelectedLanguage travelExperienceSelectedLanguage = this.f111127c;
        return iHashCode + (travelExperienceSelectedLanguage == null ? 0 : travelExperienceSelectedLanguage.hashCode());
    }
}
