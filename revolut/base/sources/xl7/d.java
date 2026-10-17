package xl7;

import ch.qos.logback.classic.Level;
import com.onfido.android.sdk.capture.ui.camera.liveness.LivenessConstants;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.feature.insurance_car.impl.R$plurals;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.AdditionalDriver;
import com.revolut.feature.insurance_car.impl.data.model.Answer;
import com.revolut.feature.insurance_car.impl.data.model.Occupation;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d {
    public static final Clause a(Answer.ClaimsState claimsState) {
        Intrinsics.checkNotNullParameter(claimsState, "<this>");
        int i = c.f306943g[claimsState.ordinal()];
        if (i == 1) {
            return new TextLocalisedClause(R$string.car_insurance_common_claims_no_claims, null, null, 14);
        }
        if (i == 2) {
            return new TextLocalisedQuantityClause(R$plurals.car_insurance_common_claims_x_claims, (Number) 1, (List) null, (Style) null, 28);
        }
        if (i == 3) {
            return new TextLocalisedQuantityClause(R$plurals.car_insurance_common_claims_x_claims, (Number) 2, (List) null, (Style) null, 28);
        }
        if (i == 4) {
            return new TextLocalisedQuantityClause(R$plurals.car_insurance_common_claims_x_or_more, (Number) 3, (List) null, (Style) null, 28);
        }
        if (i == 5) {
            return new TextLocalisedClause(R$string.car_insurance_common_claims_window_only, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Clause b(Answer.LicenceDuration licenceDuration) {
        Intrinsics.checkNotNullParameter(licenceDuration, "<this>");
        int i = c.f306941b[licenceDuration.ordinal()];
        if (i == 1) {
            return k(1);
        }
        if (i == 2) {
            return new TextLocalisedClause(R$string.car_insurance_common_years_from_x_to_y, v.k(2, 4), null, 12);
        }
        if (i == 3) {
            return new TextLocalisedClause(R$string.car_insurance_common_years_x_or_more, u.c(5), null, 12);
        }
        if (i == 4) {
            return new TextLocalisedQuantityClause(R$plurals.car_insurance_common_years_less_than_x, (Number) 1, (List) null, (Style) null, 28);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Clause c(Answer.PenaltyPoints penaltyPoints) {
        Intrinsics.checkNotNullParameter(penaltyPoints, "<this>");
        switch (c.i[penaltyPoints.ordinal()]) {
            case 1:
                return new TextLocalisedClause(R$string.car_insurance_common_points_no_points, null, null, 14);
            case 2:
                return j(1);
            case 3:
                return j(2);
            case 4:
                return j(3);
            case 5:
                return j(4);
            case 6:
                return j(5);
            case 7:
                return j(6);
            case 8:
                return new TextLocalisedQuantityClause(R$plurals.car_insurance_common_points_x_points_or_more, (Number) 7, (List) null, (Style) null, 28);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final Clause d(Answer answer) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(answer, "<this>");
        if (answer instanceof Answer.LicenceType) {
            return g((Answer.LicenceType) answer);
        }
        if (answer instanceof Answer.LicenceDuration) {
            return b((Answer.LicenceDuration) answer);
        }
        if (answer instanceof Answer.EmploymentStatus) {
            return f((Answer.EmploymentStatus) answer);
        }
        if (answer instanceof Answer.CurrentInsuranceState) {
            Answer.CurrentInsuranceState currentInsuranceState = (Answer.CurrentInsuranceState) answer;
            Intrinsics.checkNotNullParameter(currentInsuranceState, "<this>");
            int i3 = c.d[currentInsuranceState.ordinal()];
            if (i3 == 1) {
                i2 = R$string.car_insurance_question_current_insurance_policy_in_my_own_name;
            } else if (i3 == 2) {
                i2 = R$string.car_insurance_question_current_insurance_not_currently_insured;
            } else {
                if (i3 != 3 && i3 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = R$string.car_insurance_question_current_insurance_insured_as_named_driver_or_on_company_car;
            }
            return new TextLocalisedClause(i2, null, null, 14);
        }
        if (answer instanceof Answer.NoClaimsDiscount) {
            Answer.NoClaimsDiscount noClaimsDiscount = (Answer.NoClaimsDiscount) answer;
            Intrinsics.checkNotNullParameter(noClaimsDiscount, "<this>");
            switch (c.e[noClaimsDiscount.ordinal()]) {
                case 1:
                    return new TextLocalisedClause(R$string.car_insurance_common_years_no_years, null, null, 14);
                case 2:
                    return k(1);
                case 3:
                    return k(2);
                case 4:
                    return k(3);
                case 5:
                    return k(4);
                case 6:
                    return k(5);
                case 7:
                    return new TextLocalisedClause(R$string.car_insurance_common_years_x_or_more, u.c(6), null, 12);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        if (answer instanceof Answer.ClaimsState) {
            return a((Answer.ClaimsState) answer);
        }
        if (answer instanceof Answer.ClaimType) {
            return e((Answer.ClaimType) answer);
        }
        if (answer instanceof Answer.PenaltyPoints) {
            return c((Answer.PenaltyPoints) answer);
        }
        if (answer instanceof AdditionalDriver.Relationship) {
            return b.a((AdditionalDriver.Relationship) answer);
        }
        if (answer instanceof Answer.Mileage) {
            return h((Answer.Mileage) answer);
        }
        if (answer instanceof Answer.AdditionalClaimsDiscount) {
            Answer.AdditionalClaimsDiscount additionalClaimsDiscount = (Answer.AdditionalClaimsDiscount) answer;
            Intrinsics.checkNotNullParameter(additionalClaimsDiscount, "<this>");
            switch (c.f[additionalClaimsDiscount.ordinal()]) {
                case 1:
                    return new TextLocalisedClause(R$string.car_insurance_common_years_no_additional_years, null, null, 14);
                case 2:
                    return k(1);
                case 3:
                    return k(2);
                case 4:
                    return k(3);
                case 5:
                    return k(4);
                case 6:
                    return new TextLocalisedClause(R$string.car_insurance_common_years_x_or_more, u.c(5), null, 12);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        if (!(answer instanceof Answer.BinaryAnswer)) {
            if (answer instanceof Occupation) {
                throw new IllegalStateException("toStringResId is not supported for Occupation");
            }
            throw new NoWhenBranchMatchedException();
        }
        Answer.BinaryAnswer binaryAnswer = (Answer.BinaryAnswer) answer;
        Intrinsics.checkNotNullParameter(binaryAnswer, "<this>");
        int i5 = c.k[binaryAnswer.ordinal()];
        if (i5 == 1) {
            i = R$string.car_insurance_common_yes;
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.car_insurance_common_no;
        }
        return new TextLocalisedClause(i, null, null, 14);
    }

    public static final TextLocalisedClause e(Answer.ClaimType claimType) {
        int i;
        Intrinsics.checkNotNullParameter(claimType, "<this>");
        switch (c.f306944h[claimType.ordinal()]) {
            case 1:
                i = R$string.car_insurance_question_claim_type_non_fault;
                break;
            case 2:
                i = R$string.car_insurance_question_claim_type_fault_accident;
                break;
            case 3:
                i = R$string.car_insurance_question_claim_type_theft;
                break;
            case 4:
                i = R$string.car_insurance_question_claim_type_fire;
                break;
            case 5:
                i = R$string.car_insurance_question_claim_type_vandalism;
                break;
            case 6:
                i = R$string.car_insurance_question_claim_type_windscreen;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new TextLocalisedClause(i, null, null, 14);
    }

    public static final TextLocalisedClause f(Answer.EmploymentStatus employmentStatus) {
        int i;
        Intrinsics.checkNotNullParameter(employmentStatus, "<this>");
        int i2 = c.f306942c[employmentStatus.ordinal()];
        if (i2 == 1) {
            i = R$string.car_insurance_common_employment_status_employed;
        } else if (i2 == 2) {
            i = R$string.car_insurance_common_employment_status_retired;
        } else if (i2 == 3) {
            i = R$string.car_insurance_common_employment_status_unemployed;
        } else if (i2 == 4) {
            i = R$string.car_insurance_common_employment_status_student;
        } else {
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.car_insurance_common_employment_status_household_duties;
        }
        return new TextLocalisedClause(i, null, null, 14);
    }

    public static final TextLocalisedClause g(Answer.LicenceType licenceType) {
        int i;
        Intrinsics.checkNotNullParameter(licenceType, "<this>");
        int i2 = c.f306940a[licenceType.ordinal()];
        if (i2 == 1) {
            i = R$string.car_insurance_common_license_type_irish_full;
        } else if (i2 == 2) {
            i = R$string.car_insurance_common_license_type_irish_learner_permit;
        } else if (i2 == 3) {
            i = R$string.car_insurance_common_license_type_eu_full;
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.car_insurance_common_license_type_other;
        }
        return new TextLocalisedClause(i, null, null, 14);
    }

    public static final TextLocalisedClause h(Answer.Mileage mileage) {
        Intrinsics.checkNotNullParameter(mileage, "<this>");
        int i = c.f306945j[mileage.ordinal()];
        if (i == 1) {
            return new TextLocalisedClause(R$string.car_insurance_common_mileage_up_to_x_km_droid, u.c(new NumberClause(Level.TRACE_INT, (NumberClause.Format.Compact) null, (Custom) null, 6)), null, 12);
        }
        if (i == 2) {
            return new TextLocalisedClause(R$string.car_insurance_common_mileage_from_x_to_y_km_droid, v.k(new NumberClause(Level.TRACE_INT, (NumberClause.Format.Compact) null, (Custom) null, 6), new NumberClause(10000, (NumberClause.Format.Compact) null, (Custom) null, 6)), null, 12);
        }
        if (i == 3) {
            return new TextLocalisedClause(R$string.car_insurance_common_mileage_from_x_to_y_km_droid, v.k(new NumberClause(10000, (NumberClause.Format.Compact) null, (Custom) null, 6), new NumberClause(15000, (NumberClause.Format.Compact) null, (Custom) null, 6)), null, 12);
        }
        if (i == 4) {
            return new TextLocalisedClause(R$string.car_insurance_common_mileage_from_x_to_y_km_droid, v.k(new NumberClause(15000, (NumberClause.Format.Compact) null, (Custom) null, 6), new NumberClause(LivenessConstants.LIVE_VIDEO_MAX_DURATION_MS, (NumberClause.Format.Compact) null, (Custom) null, 6)), null, 12);
        }
        if (i == 5) {
            return new TextLocalisedClause(R$string.car_insurance_common_mileage_over_x_km_droid, u.c(new NumberClause(LivenessConstants.LIVE_VIDEO_MAX_DURATION_MS, (NumberClause.Format.Compact) null, (Custom) null, 6)), null, 12);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int i(Answer.ClaimsState claimsState) {
        Intrinsics.checkNotNullParameter(claimsState, "<this>");
        int i = c.f306943g[claimsState.ordinal()];
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public static final TextLocalisedQuantityClause j(int i) {
        return new TextLocalisedQuantityClause(R$plurals.car_insurance_common_points_x_points, Integer.valueOf(i), (List) null, (Style) null, 28);
    }

    public static final TextLocalisedQuantityClause k(int i) {
        return new TextLocalisedQuantityClause(R$plurals.car_insurance_common_years_years, Integer.valueOf(i), (List) null, (Style) null, 28);
    }
}
