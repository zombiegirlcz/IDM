package z2g;

import cli.j;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.travel.experiences.api.models.pricing_breakdown.TravelExperiencesPricingBreakdown;
import com.revolut.feature.travel.experiences.models.TravelExperiencesPointsOption;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final myf.a f319071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelExperiencesPricingBreakdown f319072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TravelExperiencesPointsOption f319073c;
    public final RevPoints d;
    public final boolean e;

    public d(myf.a experience, TravelExperiencesPricingBreakdown pricingBreakdown, TravelExperiencesPointsOption travelExperiencesPointsOption, RevPoints revPoints, boolean z) {
        Intrinsics.checkNotNullParameter(experience, "experience");
        Intrinsics.checkNotNullParameter(pricingBreakdown, "pricingBreakdown");
        this.f319071a = experience;
        this.f319072b = pricingBreakdown;
        this.f319073c = travelExperiencesPointsOption;
        this.d = revPoints;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f319071a, dVar.f319071a) && Intrinsics.f(this.f319072b, dVar.f319072b) && Intrinsics.f(this.f319073c, dVar.f319073c) && Intrinsics.f(this.d, dVar.d) && this.e == dVar.e;
    }

    public final int hashCode() {
        int iHashCode = (this.f319072b.hashCode() + (this.f319071a.hashCode() * 31)) * 31;
        TravelExperiencesPointsOption travelExperiencesPointsOption = this.f319073c;
        int iHashCode2 = (iHashCode + (travelExperiencesPointsOption == null ? 0 : travelExperiencesPointsOption.hashCode())) * 31;
        RevPoints revPoints = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode2 + (revPoints != null ? revPoints.f83960a.hashCode() : 0)) * 31);
    }
}
