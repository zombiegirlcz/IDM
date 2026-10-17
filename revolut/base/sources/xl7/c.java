package xl7;

import com.revolut.feature.insurance_car.impl.data.model.Answer;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f306940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f306941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f306942c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;
    public static final /* synthetic */ int[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int[] f306943g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int[] f306944h;
    public static final /* synthetic */ int[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int[] f306945j;
    public static final /* synthetic */ int[] k;

    static {
        int[] iArr = new int[Answer.LicenceType.values().length];
        try {
            iArr[Answer.LicenceType.IRISH_FULL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Answer.LicenceType.IRISH_LEARNER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Answer.LicenceType.EU_FULL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Answer.LicenceType.OTHER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f306940a = iArr;
        int[] iArr2 = new int[Answer.LicenceDuration.values().length];
        try {
            iArr2[Answer.LicenceDuration.ONE_YEAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[Answer.LicenceDuration.FROM_TWO_TO_FOUR_YEARS.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[Answer.LicenceDuration.FIVE_YEARS_AND_MORE.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[Answer.LicenceDuration.LESS_THAN_ONE_YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        f306941b = iArr2;
        int[] iArr3 = new int[Answer.EmploymentStatus.values().length];
        try {
            iArr3[Answer.EmploymentStatus.EMPLOYED.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[Answer.EmploymentStatus.RETIRED.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[Answer.EmploymentStatus.UNEMPLOYED.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[Answer.EmploymentStatus.STUDENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[Answer.EmploymentStatus.HOUSEHOLD_DUTIES.ordinal()] = 5;
        } catch (NoSuchFieldError unused13) {
        }
        f306942c = iArr3;
        int[] iArr4 = new int[Answer.CurrentInsuranceState.values().length];
        try {
            iArr4[Answer.CurrentInsuranceState.OWN_POLICY.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr4[Answer.CurrentInsuranceState.NO_INSURANCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr4[Answer.CurrentInsuranceState.NAMED_DRIVER.ordinal()] = 3;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr4[Answer.CurrentInsuranceState.NAMED_DRIVER_OR_INSURED_COMPANY_CAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused17) {
        }
        d = iArr4;
        int[] iArr5 = new int[Answer.NoClaimsDiscount.values().length];
        try {
            iArr5[Answer.NoClaimsDiscount.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr5[Answer.NoClaimsDiscount.ONE_YEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr5[Answer.NoClaimsDiscount.TWO_YEARS.ordinal()] = 3;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr5[Answer.NoClaimsDiscount.THREE_YEARS.ordinal()] = 4;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr5[Answer.NoClaimsDiscount.FOUR_YEARS.ordinal()] = 5;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr5[Answer.NoClaimsDiscount.FIVE_YEARS.ordinal()] = 6;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr5[Answer.NoClaimsDiscount.SIX_YEARS_AND_MORE.ordinal()] = 7;
        } catch (NoSuchFieldError unused24) {
        }
        e = iArr5;
        int[] iArr6 = new int[Answer.AdditionalClaimsDiscount.values().length];
        try {
            iArr6[Answer.AdditionalClaimsDiscount.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr6[Answer.AdditionalClaimsDiscount.ONE_YEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr6[Answer.AdditionalClaimsDiscount.TWO_YEARS.ordinal()] = 3;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr6[Answer.AdditionalClaimsDiscount.THREE_YEARS.ordinal()] = 4;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr6[Answer.AdditionalClaimsDiscount.FOUR_YEARS.ordinal()] = 5;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr6[Answer.AdditionalClaimsDiscount.FIVE_YEARS_AND_MORE.ordinal()] = 6;
        } catch (NoSuchFieldError unused30) {
        }
        f = iArr6;
        int[] iArr7 = new int[Answer.ClaimsState.values().length];
        try {
            iArr7[Answer.ClaimsState.NO_CLAIMS.ordinal()] = 1;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr7[Answer.ClaimsState.ONE_CLAIM.ordinal()] = 2;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr7[Answer.ClaimsState.TWO_CLAIMS.ordinal()] = 3;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr7[Answer.ClaimsState.THREE_AND_MORE.ordinal()] = 4;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr7[Answer.ClaimsState.WINDSCREEN_ONLY.ordinal()] = 5;
        } catch (NoSuchFieldError unused35) {
        }
        f306943g = iArr7;
        int[] iArr8 = new int[Answer.ClaimType.values().length];
        try {
            iArr8[Answer.ClaimType.NON_FAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr8[Answer.ClaimType.FAULT_ACCIDENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr8[Answer.ClaimType.THEFT.ordinal()] = 3;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr8[Answer.ClaimType.FIRE.ordinal()] = 4;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr8[Answer.ClaimType.VANDALISM.ordinal()] = 5;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr8[Answer.ClaimType.WINDSCREEN.ordinal()] = 6;
        } catch (NoSuchFieldError unused41) {
        }
        f306944h = iArr8;
        int[] iArr9 = new int[Answer.PenaltyPoints.values().length];
        try {
            iArr9[Answer.PenaltyPoints.NO_POINTS.ordinal()] = 1;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr9[Answer.PenaltyPoints.ONE_POINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr9[Answer.PenaltyPoints.TWO_POINTS.ordinal()] = 3;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr9[Answer.PenaltyPoints.THREE_POINTS.ordinal()] = 4;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr9[Answer.PenaltyPoints.FOUR_POINTS.ordinal()] = 5;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            iArr9[Answer.PenaltyPoints.FIVE_POINTS.ordinal()] = 6;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            iArr9[Answer.PenaltyPoints.SIX_POINTS.ordinal()] = 7;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            iArr9[Answer.PenaltyPoints.SEVEN_AND_MORE.ordinal()] = 8;
        } catch (NoSuchFieldError unused49) {
        }
        i = iArr9;
        int[] iArr10 = new int[Answer.Mileage.values().length];
        try {
            iArr10[Answer.Mileage.LESS_THAN_5000.ordinal()] = 1;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            iArr10[Answer.Mileage.FROM_5000_TO_10000.ordinal()] = 2;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            iArr10[Answer.Mileage.FROM_10000_TO_15000.ordinal()] = 3;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            iArr10[Answer.Mileage.FROM_15000_TO_25000.ordinal()] = 4;
        } catch (NoSuchFieldError unused53) {
        }
        try {
            iArr10[Answer.Mileage.MORE_THAN_25000.ordinal()] = 5;
        } catch (NoSuchFieldError unused54) {
        }
        f306945j = iArr10;
        int[] iArr11 = new int[Answer.BinaryAnswer.values().length];
        try {
            iArr11[Answer.BinaryAnswer.YES.ordinal()] = 1;
        } catch (NoSuchFieldError unused55) {
        }
        try {
            iArr11[Answer.BinaryAnswer.NO.ordinal()] = 2;
        } catch (NoSuchFieldError unused56) {
        }
        k = iArr11;
    }
}
