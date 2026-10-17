package zl7;

import com.revolut.feature.insurance_car.impl.data.model.Answer;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f323192a;

    static {
        int[] iArr = new int[Answer.LicenceDuration.values().length];
        try {
            iArr[Answer.LicenceDuration.LESS_THAN_ONE_YEAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Answer.LicenceDuration.ONE_YEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Answer.LicenceDuration.FROM_TWO_TO_FOUR_YEARS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Answer.LicenceDuration.FIVE_YEARS_AND_MORE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f323192a = iArr;
    }
}
