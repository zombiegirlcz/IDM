package sb2;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.feature.apm.core.api.R$plurals;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.models.payments_authorisations.AuthorisationFrequency;
import com.revolut.feature.apm.core.models.payments_authorisations.ExecutionType;
import com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import l80.f;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f90.b f261476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f261477b;

    public b(t12.b commonFrequencyMapper, f90.b pluralFormatter, e dateProvider) {
        Intrinsics.checkNotNullParameter(commonFrequencyMapper, "commonFrequencyMapper");
        Intrinsics.checkNotNullParameter(pluralFormatter, "pluralFormatter");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f261476a = pluralFormatter;
        this.f261477b = dateProvider;
    }

    public final Clause a(ExecutionType executionType, AuthorisationFrequency authorisationFrequency, Integer num, Integer num2, PaymentMethodDetails paymentMethodDetails) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        int i = executionType == null ? -1 : a.f261473a[executionType.ordinal()];
        TextLocalisedClause textLocalisedClause3 = null;
        if (i != -1) {
            if (i == 1) {
                return paymentMethodDetails instanceof PaymentMethodDetails.Upi ? new TextLocalisedClause(R$string.mandate_details_frequency_anytime, null, null, 14) : new TextLocalisedClause(R$string.apm_frequency_ad_hoc, null, null, 14);
            }
            if (i == 2) {
                return new TextLocalisedClause(R$string.apm_frequency_oneOff, null, null, 14);
            }
            if (i != 3) {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (authorisationFrequency != null) {
                if (num == null) {
                    TextLocalisedClause textLocalisedClauseA = t12.b.a(authorisationFrequency);
                    TextLocalisedClause textLocalisedClauseB = b(authorisationFrequency, num2);
                    if (num2 != null) {
                        int i2 = a.f261474b[authorisationFrequency.ordinal()];
                        if (i2 == 1) {
                            textLocalisedClause = new TextLocalisedClause(R$string.mandate_details_frequency_quarterly_of_each_quarter, null, null, 14);
                        } else if (i2 == 2) {
                            textLocalisedClause = new TextLocalisedClause(R$string.mandate_details_frequency_semi_annualy_of_each_period, null, null, 14);
                        }
                        textLocalisedClause3 = textLocalisedClause;
                    }
                    Clause[] elements = {textLocalisedClauseA, textLocalisedClauseB, textLocalisedClause3};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    return new CompositeClause(d.L(elements), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                }
                TextLocalisedQuantityClause textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.mandate_details_frequency_placeholder_up_to_payments_plural, num, (List) null, (Style) null, 28);
                switch (a.f261474b[authorisationFrequency.ordinal()]) {
                    case 1:
                        textLocalisedClause2 = new TextLocalisedClause(R$string.mandate_details_frequency_per_quarter, null, null, 14);
                        break;
                    case 2:
                        textLocalisedClause2 = new TextLocalisedClause(R$string.mandate_details_frequency_per_six_month, null, null, 14);
                        break;
                    case 3:
                    case 4:
                        textLocalisedClause2 = new TextLocalisedClause(R$string.mandate_details_frequency_per_day, null, null, 14);
                        break;
                    case 5:
                        textLocalisedClause2 = new TextLocalisedClause(R$string.mandate_details_frequency_per_week, null, null, 14);
                        break;
                    case 6:
                        textLocalisedClause2 = new TextLocalisedClause(R$string.mandate_details_frequency_per_two_weeks, null, null, 14);
                        break;
                    case 7:
                        textLocalisedClause2 = new TextLocalisedClause(R$string.mandate_details_frequency_per_month, null, null, 14);
                        break;
                    case 8:
                        textLocalisedClause2 = new TextLocalisedClause(R$string.mandate_details_frequency_per_year, null, null, 14);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                Clause[] elements2 = {textLocalisedQuantityClause, textLocalisedClause2, b(authorisationFrequency, num2)};
                Intrinsics.checkNotNullParameter(elements2, "elements");
                return new CompositeClause(d.L(elements2), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
            }
        }
        return null;
    }

    public final TextLocalisedClause b(AuthorisationFrequency authorisationFrequency, Integer num) {
        int i;
        Integer numValueOf;
        if (num != null) {
            int i2 = a.f261474b[authorisationFrequency.ordinal()];
            f90.b bVar = this.f261476a;
            switch (i2) {
                case 1:
                case 2:
                    return new TextLocalisedClause(R$string.mandate_details_frequency_placeholder_in_ordinal_month, u.c(new TextClause(bVar.a("{0,ordinal}", num), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                case 3:
                case 4:
                    LocalDateTime localDateTimeWithHour = ((f) this.f261477b).f().withHour(num.intValue());
                    Intrinsics.checkNotNullExpressionValue(localDateTimeWithHour, "withHour(...)");
                    return new TextLocalisedClause(R$string.mandate_details_frequency_placeholder_at_time, u.c(new TimeClause(oi0.d.R(localDateTimeWithHour), TimeClause.Format.Hour.f57970b, null, null, 12)), null, 12);
                case 5:
                    DayOfWeek dayOfWeekOf = DayOfWeek.of(num.intValue());
                    Intrinsics.h(dayOfWeekOf);
                    switch (a.f261475c[dayOfWeekOf.ordinal()]) {
                        case 1:
                            i = R$string.mandate_details_frequency_placeholder_on_monday;
                            break;
                        case 2:
                            i = R$string.mandate_details_frequency_placeholder_on_tuesday;
                            break;
                        case 3:
                            i = R$string.mandate_details_frequency_placeholder_on_wednesday;
                            break;
                        case 4:
                            i = R$string.mandate_details_frequency_placeholder_on_thursday;
                            break;
                        case 5:
                            i = R$string.mandate_details_frequency_placeholder_on_friday;
                            break;
                        case 6:
                            i = R$string.mandate_details_frequency_placeholder_on_saturday;
                            break;
                        case 7:
                            i = R$string.mandate_details_frequency_placeholder_on_sunday;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    return new TextLocalisedClause(i, null, null, 14);
                case 6:
                case 7:
                    return new TextLocalisedClause(R$string.mandate_details_frequency_placeholder_on_ordinal_day, u.c(new TextClause(bVar.a("{0,ordinal}", num), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                case 8:
                    switch (num.intValue()) {
                        case 1:
                            numValueOf = Integer.valueOf(R$string.mandate_details_frequency_placeholder_in_january);
                            break;
                        case 2:
                            numValueOf = Integer.valueOf(R$string.mandate_details_frequency_placeholder_in_february);
                            break;
                        case 3:
                            numValueOf = Integer.valueOf(R$string.mandate_details_frequency_placeholder_in_march);
                            break;
                        case 4:
                            numValueOf = Integer.valueOf(R$string.mandate_details_frequency_placeholder_in_april);
                            break;
                        case 5:
                            numValueOf = Integer.valueOf(R$string.mandate_details_frequency_placeholder_in_may);
                            break;
                        case 6:
                            numValueOf = Integer.valueOf(R$string.mandate_details_frequency_placeholder_in_june);
                            break;
                        case 7:
                            numValueOf = Integer.valueOf(R$string.mandate_details_frequency_placeholder_in_july);
                            break;
                        case 8:
                            numValueOf = Integer.valueOf(R$string.mandate_details_frequency_placeholder_in_august);
                            break;
                        case 9:
                            numValueOf = Integer.valueOf(R$string.mandate_details_frequency_placeholder_in_september);
                            break;
                        case 10:
                            numValueOf = Integer.valueOf(R$string.mandate_details_frequency_placeholder_in_october);
                            break;
                        case 11:
                            numValueOf = Integer.valueOf(R$string.mandate_details_frequency_placeholder_in_november);
                            break;
                        case 12:
                            numValueOf = Integer.valueOf(R$string.mandate_details_frequency_placeholder_in_december);
                            break;
                        default:
                            numValueOf = null;
                            break;
                    }
                    if (numValueOf != null) {
                        return new TextLocalisedClause(numValueOf.intValue(), null, null, 14);
                    }
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }
}
