package k1g;

import com.revolut.feature.travel.experiences.api.models.experience.TravelExperiencePreview;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f180249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelExperienceDatesSelection f180250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TravelExperiencePreview f180251c;

    public h(TravelExperiencePreview travelExperiencePreview, TravelExperienceDatesSelection travelExperienceDatesSelection, String experienceId) {
        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
        this.f180249a = experienceId;
        this.f180250b = travelExperienceDatesSelection;
        this.f180251c = travelExperiencePreview;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f180249a, hVar.f180249a) && Intrinsics.f(this.f180250b, hVar.f180250b) && Intrinsics.f(this.f180251c, hVar.f180251c);
    }

    public final int hashCode() {
        int iHashCode = this.f180249a.hashCode() * 31;
        TravelExperienceDatesSelection travelExperienceDatesSelection = this.f180250b;
        int iHashCode2 = (iHashCode + (travelExperienceDatesSelection == null ? 0 : travelExperienceDatesSelection.hashCode())) * 31;
        TravelExperiencePreview travelExperiencePreview = this.f180251c;
        return iHashCode2 + (travelExperiencePreview != null ? travelExperiencePreview.hashCode() : 0);
    }
}
