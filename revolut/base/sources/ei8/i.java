package ei8;

import com.revolut.data.model.Data;
import com.revolut.feature.junior_core.models.configuration.JuniorPlanConfiguration;
import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.JuniorPersonalDetailsScreenContract$DateOfBirthStatus;
import java.time.LocalDate;
import java.time.Period;
import java.time.chrono.ChronoLocalDate;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f126461a;

    public i(l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f126461a = dateProvider;
    }

    public final JuniorPersonalDetailsScreenContract$DateOfBirthStatus a(LocalDate localDate, Data planConfigData, Data parentDobData) {
        Intrinsics.checkNotNullParameter(planConfigData, "planConfigData");
        Intrinsics.checkNotNullParameter(parentDobData, "parentDobData");
        if (localDate == null) {
            return JuniorPersonalDetailsScreenContract$DateOfBirthStatus.Missing.f77045a;
        }
        LocalDate localDateE = ((l80.f) this.f126461a).e();
        if (localDate.compareTo((ChronoLocalDate) localDateE) > 0) {
            return new JuniorPersonalDetailsScreenContract$DateOfBirthStatus.Invalid(localDate, li8.e.INCORRECT_AGE);
        }
        JuniorPlanConfiguration juniorPlanConfiguration = (JuniorPlanConfiguration) planConfigData.getContent();
        if (juniorPlanConfiguration == null) {
            return new JuniorPersonalDetailsScreenContract$DateOfBirthStatus.Valid(localDate);
        }
        int years = Period.between(localDate, localDateE).getYears();
        if (years > 100) {
            return new JuniorPersonalDetailsScreenContract$DateOfBirthStatus.Invalid(null, li8.e.INCORRECT_AGE);
        }
        if (years < juniorPlanConfiguration.f76899b) {
            return new JuniorPersonalDetailsScreenContract$DateOfBirthStatus.Invalid(localDate, li8.e.TOO_YOUNG);
        }
        int i = juniorPlanConfiguration.d;
        if (years >= i) {
            return new JuniorPersonalDetailsScreenContract$DateOfBirthStatus.OverRegistrationAge(i, localDate);
        }
        int i2 = juniorPlanConfiguration.f76905m;
        LocalDate localDate2 = (LocalDate) parentDobData.getContent();
        return (localDate2 != null && Period.between(localDate2, localDate).getYears() < i2) ? new JuniorPersonalDetailsScreenContract$DateOfBirthStatus.Invalid(localDate, li8.e.INVALID_AGE_DIFFERENCE) : new JuniorPersonalDetailsScreenContract$DateOfBirthStatus.Valid(localDate);
    }
}
