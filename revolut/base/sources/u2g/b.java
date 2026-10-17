package u2g;

import com.revolut.feature.travel.experiences.api.models.options.TravelExperiencesOptionV2;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import com.revolut.feature.travel.experiences.impl.ui.screen.options_v2.model.TravelExperienceOptionSelectionV2;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements a {
    public final TravelExperienceDatesSelection.SingleDateSelection a(TravelExperienceOptionSelectionV2 selection) {
        Intrinsics.checkNotNullParameter(selection, "selection");
        if (selection instanceof TravelExperienceOptionSelectionV2.Option) {
            TravelExperiencesOptionV2 travelExperiencesOptionV2 = ((TravelExperienceOptionSelectionV2.Option) selection).f93096a;
            LocalDate localDate = travelExperiencesOptionV2.f92870b;
            LocalDate localDate2 = travelExperiencesOptionV2.f92870b;
            return new TravelExperienceDatesSelection.SingleDateSelection(new DateTime(localDate.getYear(), localDate2.getMonth().getValue(), localDate2.getDayOfMonth(), 0, 0));
        }
        if (!(selection instanceof TravelExperienceOptionSelectionV2.OptionWithTimes)) {
            throw new IllegalStateException("Cannot provide date selection from NoSelection type");
        }
        TravelExperiencesOptionV2 travelExperiencesOptionV22 = ((TravelExperienceOptionSelectionV2.OptionWithTimes) selection).f93097a;
        LocalDate localDate3 = travelExperiencesOptionV22.f92870b;
        LocalDate localDate4 = travelExperiencesOptionV22.f92870b;
        return new TravelExperienceDatesSelection.SingleDateSelection(new DateTime(localDate3.getYear(), localDate4.getMonth().getValue(), localDate4.getDayOfMonth(), 0, 0));
    }
}
