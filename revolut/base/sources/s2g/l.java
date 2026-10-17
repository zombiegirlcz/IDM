package s2g;

import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceAvailabilitySelection;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceLanguageSelection;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceOptionSelection;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceVisitorsSelection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelExperienceAvailabilitySelection.Availability f259315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelExperienceOptionSelection f259316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f259317c;
    public final TravelExperienceDatesSelection.SingleDateSelection d;
    public final TravelExperienceVisitorsSelection e;
    public final TravelExperienceLanguageSelection f;

    public l(TravelExperienceAvailabilitySelection.Availability availabilitySelection, TravelExperienceOptionSelection optionSelection, List questions, TravelExperienceDatesSelection.SingleDateSelection dateSelection, TravelExperienceVisitorsSelection visitorsSelection, TravelExperienceLanguageSelection languageSelection) {
        Intrinsics.checkNotNullParameter(availabilitySelection, "availabilitySelection");
        Intrinsics.checkNotNullParameter(optionSelection, "optionSelection");
        Intrinsics.checkNotNullParameter(questions, "questions");
        Intrinsics.checkNotNullParameter(dateSelection, "dateSelection");
        Intrinsics.checkNotNullParameter(visitorsSelection, "visitorsSelection");
        Intrinsics.checkNotNullParameter(languageSelection, "languageSelection");
        this.f259315a = availabilitySelection;
        this.f259316b = optionSelection;
        this.f259317c = questions;
        this.d = dateSelection;
        this.e = visitorsSelection;
        this.f = languageSelection;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f259315a.equals(lVar.f259315a) && this.f259316b.equals(lVar.f259316b) && this.f259317c.equals(lVar.f259317c) && this.d.equals(lVar.d) && Intrinsics.f(this.e, lVar.e) && this.f.equals(lVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.e(m72.b.f(this.d.f92909a, p.a.d((this.f259316b.hashCode() + (this.f259315a.f92904a.hashCode() * 31)) * 31, 31, this.f259317c), 31), 31, this.e.f92916a);
    }
}
