package j2g;

import com.revolut.feature.travel.experiences.api.models.experience.TravelExperiencePreview;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelExperienceDatesSelection f170873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TravelExperiencePreview f170874c;

    public j(TravelExperiencePreview travelExperiencePreview, TravelExperienceDatesSelection travelExperienceDatesSelection, String experienceId) {
        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
        this.f170872a = experienceId;
        this.f170873b = travelExperienceDatesSelection;
        this.f170874c = travelExperiencePreview;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f170872a, jVar.f170872a) && Intrinsics.f(this.f170873b, jVar.f170873b) && Intrinsics.f(this.f170874c, jVar.f170874c);
    }

    public final int hashCode() {
        int iHashCode = this.f170872a.hashCode() * 31;
        TravelExperienceDatesSelection travelExperienceDatesSelection = this.f170873b;
        int iHashCode2 = (iHashCode + (travelExperienceDatesSelection == null ? 0 : travelExperienceDatesSelection.hashCode())) * 31;
        TravelExperiencePreview travelExperiencePreview = this.f170874c;
        return iHashCode2 + (travelExperiencePreview != null ? travelExperiencePreview.hashCode() : 0);
    }
}
