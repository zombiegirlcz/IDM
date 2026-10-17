package jl7;

import com.revolut.feature.insurance_car.impl.data.model.AdditionalDriver;
import com.revolut.feature.insurance_car.impl.data.model.Answer;
import com.revolut.feature.insurance_car.impl.data.model.Occupation;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import zhm.r0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f175612a = r0.k(new Pair("IRISH_FULL", Answer.LicenceType.IRISH_FULL), new Pair("IRISH_LEARNER", Answer.LicenceType.IRISH_LEARNER), new Pair("EU_FULL", Answer.LicenceType.EU_FULL), new Pair("OTHER", Answer.LicenceType.OTHER));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f175613b = r0.k(new Pair("LESS_THAN_ONE_YEAR", Answer.LicenceDuration.LESS_THAN_ONE_YEAR), new Pair("ONE_YEAR", Answer.LicenceDuration.ONE_YEAR), new Pair("FROM_TWO_TO_FOUR_YEARS", Answer.LicenceDuration.FROM_TWO_TO_FOUR_YEARS), new Pair("FIVE_YEARS_AND_MORE", Answer.LicenceDuration.FIVE_YEARS_AND_MORE));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f175614c = r0.k(new Pair("EMPLOYED", Answer.EmploymentStatus.EMPLOYED), new Pair("UNEMPLOYED", Answer.EmploymentStatus.UNEMPLOYED), new Pair("RETIRED", Answer.EmploymentStatus.RETIRED), new Pair("STUDENT", Answer.EmploymentStatus.STUDENT), new Pair("HOUSEHOLD_DUTIES", Answer.EmploymentStatus.HOUSEHOLD_DUTIES));
    public static final Object d = r0.k(new Pair("OWN_POLICY", Answer.CurrentInsuranceState.OWN_POLICY), new Pair("NO_INSURANCE", Answer.CurrentInsuranceState.NO_INSURANCE), new Pair("NAMED_DRIVER", Answer.CurrentInsuranceState.NAMED_DRIVER), new Pair("NAMED_DRIVER_OR_INSURED_COMPANY_CAR", Answer.CurrentInsuranceState.NAMED_DRIVER_OR_INSURED_COMPANY_CAR));
    public static final Object e = r0.k(new Pair("NONE", Answer.NoClaimsDiscount.NONE), new Pair("ONE_YEAR", Answer.NoClaimsDiscount.ONE_YEAR), new Pair("TWO_YEARS", Answer.NoClaimsDiscount.TWO_YEARS), new Pair("THREE_YEARS", Answer.NoClaimsDiscount.THREE_YEARS), new Pair("FOUR_YEARS", Answer.NoClaimsDiscount.FOUR_YEARS), new Pair("FIVE_YEARS", Answer.NoClaimsDiscount.FIVE_YEARS), new Pair("SIX_YEARS_AND_MORE", Answer.NoClaimsDiscount.SIX_YEARS_AND_MORE));
    public static final Object f = r0.k(new Pair("NONE", Answer.AdditionalClaimsDiscount.NONE), new Pair("ONE_YEAR", Answer.AdditionalClaimsDiscount.ONE_YEAR), new Pair("TWO_YEARS", Answer.AdditionalClaimsDiscount.TWO_YEARS), new Pair("THREE_YEARS", Answer.AdditionalClaimsDiscount.THREE_YEARS), new Pair("FOUR_YEARS", Answer.AdditionalClaimsDiscount.FOUR_YEARS), new Pair("FIVE_YEARS_AND_MORE", Answer.AdditionalClaimsDiscount.FIVE_YEARS_AND_MORE));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f175615g = r0.k(new Pair("NO_CLAIMS", Answer.ClaimsState.NO_CLAIMS), new Pair("ONE_CLAIM", Answer.ClaimsState.ONE_CLAIM), new Pair("TWO_CLAIMS", Answer.ClaimsState.TWO_CLAIMS), new Pair("THREE_AND_MORE", Answer.ClaimsState.THREE_AND_MORE), new Pair("WINDSCREEN_ONLY", Answer.ClaimsState.WINDSCREEN_ONLY));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f175616h = r0.k(new Pair("NON_FAULT", Answer.ClaimType.NON_FAULT), new Pair("FAULT_ACCIDENT", Answer.ClaimType.FAULT_ACCIDENT), new Pair("THEFT", Answer.ClaimType.THEFT), new Pair("FIRE", Answer.ClaimType.FIRE), new Pair("VANDALISM", Answer.ClaimType.VANDALISM), new Pair("WINDSCREEN", Answer.ClaimType.WINDSCREEN));
    public static final Object i = r0.k(new Pair("NO_POINTS", Answer.PenaltyPoints.NO_POINTS), new Pair("ONE_POINT", Answer.PenaltyPoints.ONE_POINT), new Pair("TWO_POINTS", Answer.PenaltyPoints.TWO_POINTS), new Pair("THREE_POINTS", Answer.PenaltyPoints.THREE_POINTS), new Pair("FOUR_POINTS", Answer.PenaltyPoints.FOUR_POINTS), new Pair("FIVE_POINTS", Answer.PenaltyPoints.FIVE_POINTS), new Pair("SIX_POINTS", Answer.PenaltyPoints.SIX_POINTS), new Pair("SEVEN_AND_MORE", Answer.PenaltyPoints.SEVEN_AND_MORE));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f175617j = r0.k(new Pair("SPOUSE", AdditionalDriver.Relationship.SPOUSE), new Pair("PARENT", AdditionalDriver.Relationship.PARENT), new Pair("FAMILY", AdditionalDriver.Relationship.FAMILY), new Pair("OTHER", AdditionalDriver.Relationship.OTHER));
    public static final Object k = r0.k(new Pair("LESS_THAN_5000", Answer.Mileage.LESS_THAN_5000), new Pair("FROM_5000_TO_10000", Answer.Mileage.FROM_5000_TO_10000), new Pair("FROM_10000_TO_15000", Answer.Mileage.FROM_10000_TO_15000), new Pair("FROM_15000_TO_25000", Answer.Mileage.FROM_15000_TO_25000), new Pair("MORE_THAN_25000", Answer.Mileage.MORE_THAN_25000));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Object f175618l = r0.k(new Pair("YES", Answer.BinaryAnswer.YES), new Pair("NO", Answer.BinaryAnswer.NO));

    public static final boolean a(Answer.PenaltyPoints penaltyPoints) {
        switch (penaltyPoints == null ? -1 : a.f175611a[penaltyPoints.ordinal()]) {
            case -1:
            case 7:
            case 8:
                return false;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.Map] */
    public static final String b(Answer answer) {
        Intrinsics.checkNotNullParameter(answer, "<this>");
        if (answer instanceof Answer.LicenceType) {
            Answer.LicenceType licenceType = (Answer.LicenceType) answer;
            Intrinsics.checkNotNullParameter(licenceType, "<this>");
            return u1.g(licenceType, f175612a);
        }
        if (answer instanceof Answer.LicenceDuration) {
            Answer.LicenceDuration licenceDuration = (Answer.LicenceDuration) answer;
            Intrinsics.checkNotNullParameter(licenceDuration, "<this>");
            return u1.g(licenceDuration, f175613b);
        }
        if (answer instanceof Answer.EmploymentStatus) {
            Answer.EmploymentStatus employmentStatus = (Answer.EmploymentStatus) answer;
            Intrinsics.checkNotNullParameter(employmentStatus, "<this>");
            return u1.g(employmentStatus, f175614c);
        }
        if (answer instanceof Answer.CurrentInsuranceState) {
            Answer.CurrentInsuranceState currentInsuranceState = (Answer.CurrentInsuranceState) answer;
            Intrinsics.checkNotNullParameter(currentInsuranceState, "<this>");
            return u1.g(currentInsuranceState, d);
        }
        if (answer instanceof Answer.NoClaimsDiscount) {
            Answer.NoClaimsDiscount noClaimsDiscount = (Answer.NoClaimsDiscount) answer;
            Intrinsics.checkNotNullParameter(noClaimsDiscount, "<this>");
            return u1.g(noClaimsDiscount, e);
        }
        if (answer instanceof Answer.ClaimsState) {
            Answer.ClaimsState claimsState = (Answer.ClaimsState) answer;
            Intrinsics.checkNotNullParameter(claimsState, "<this>");
            return u1.g(claimsState, f175615g);
        }
        if (answer instanceof Answer.ClaimType) {
            Answer.ClaimType claimType = (Answer.ClaimType) answer;
            Intrinsics.checkNotNullParameter(claimType, "<this>");
            return u1.g(claimType, f175616h);
        }
        if (answer instanceof Answer.PenaltyPoints) {
            Answer.PenaltyPoints penaltyPoints = (Answer.PenaltyPoints) answer;
            Intrinsics.checkNotNullParameter(penaltyPoints, "<this>");
            return u1.g(penaltyPoints, i);
        }
        if (answer instanceof AdditionalDriver.Relationship) {
            AdditionalDriver.Relationship relationship = (AdditionalDriver.Relationship) answer;
            Intrinsics.checkNotNullParameter(relationship, "<this>");
            return u1.g(relationship, f175617j);
        }
        if (answer instanceof Answer.Mileage) {
            Answer.Mileage mileage = (Answer.Mileage) answer;
            Intrinsics.checkNotNullParameter(mileage, "<this>");
            return u1.g(mileage, k);
        }
        if (answer instanceof Answer.AdditionalClaimsDiscount) {
            Answer.AdditionalClaimsDiscount additionalClaimsDiscount = (Answer.AdditionalClaimsDiscount) answer;
            Intrinsics.checkNotNullParameter(additionalClaimsDiscount, "<this>");
            return u1.g(additionalClaimsDiscount, f);
        }
        if (answer instanceof Answer.BinaryAnswer) {
            return u1.g((Enum) answer, f175618l);
        }
        if (answer instanceof Occupation) {
            throw new IllegalStateException("toDomainString is not supported for Occupation");
        }
        throw new NoWhenBranchMatchedException();
    }
}
