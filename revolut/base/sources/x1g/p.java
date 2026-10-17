package x1g;

import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceAvailabilitySelection;
import com.revolut.feature.travel.experiences.models.TravelExperiencesPointsOption;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class p {
    public static final dj0.d a(i iVar) {
        dj0.d dVar;
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        TravelExperienceAvailabilitySelection travelExperienceAvailabilitySelection = iVar.e;
        Intrinsics.i(travelExperienceAvailabilitySelection, "null cannot be cast to non-null type com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceAvailabilitySelection.Availability");
        dj0.d dVar2 = ((TravelExperienceAvailabilitySelection.Availability) travelExperienceAvailabilitySelection).f92904a.f92867c.f92878a;
        TravelExperiencesPointsOption travelExperiencesPointsOption = iVar.i;
        if (travelExperiencesPointsOption == null || (dVar = travelExperiencesPointsOption.f93196b) == null) {
            dj0.d.Companion.getClass();
            dVar = dj0.d.e;
        }
        return pyd.c.H(dVar2, dVar);
    }

    public static final boolean b(i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return ((Boolean) iii.c.f(iVar.f302424l, new x1.n(15), new wyg.s(20), new o(iVar))).booleanValue();
    }
}
