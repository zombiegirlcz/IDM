package cp7;

import com.revolut.feature.insurance_car.impl.data.model.Answer;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f107908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f107909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f107910c;

    static {
        int[] iArr = new int[Answer.CurrentInsuranceState.values().length];
        try {
            iArr[Answer.CurrentInsuranceState.NO_INSURANCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Answer.CurrentInsuranceState.OWN_POLICY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Answer.CurrentInsuranceState.NAMED_DRIVER_OR_INSURED_COMPANY_CAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Answer.CurrentInsuranceState.NAMED_DRIVER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f107908a = iArr;
        int[] iArr2 = new int[Answer.NoClaimsDiscount.values().length];
        try {
            iArr2[Answer.NoClaimsDiscount.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[Answer.NoClaimsDiscount.ONE_YEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[Answer.NoClaimsDiscount.TWO_YEARS.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[Answer.NoClaimsDiscount.THREE_YEARS.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[Answer.NoClaimsDiscount.FOUR_YEARS.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[Answer.NoClaimsDiscount.FIVE_YEARS.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[Answer.NoClaimsDiscount.SIX_YEARS_AND_MORE.ordinal()] = 7;
        } catch (NoSuchFieldError unused11) {
        }
        f107909b = iArr2;
        int[] iArr3 = new int[Answer.AdditionalClaimsDiscount.values().length];
        try {
            iArr3[Answer.AdditionalClaimsDiscount.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[Answer.AdditionalClaimsDiscount.ONE_YEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[Answer.AdditionalClaimsDiscount.TWO_YEARS.ordinal()] = 3;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[Answer.AdditionalClaimsDiscount.THREE_YEARS.ordinal()] = 4;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr3[Answer.AdditionalClaimsDiscount.FOUR_YEARS.ordinal()] = 5;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr3[Answer.AdditionalClaimsDiscount.FIVE_YEARS_AND_MORE.ordinal()] = 6;
        } catch (NoSuchFieldError unused17) {
        }
        f107910c = iArr3;
    }
}
