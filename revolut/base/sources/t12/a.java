package t12;

import com.revolut.feature.apm.core.models.payments_authorisations.AuthorisationFrequency;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f267076a;

    static {
        int[] iArr = new int[AuthorisationFrequency.values().length];
        try {
            iArr[AuthorisationFrequency.DAILY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AuthorisationFrequency.INTRADAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AuthorisationFrequency.WEEKLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AuthorisationFrequency.FORTNIGHTLY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[AuthorisationFrequency.MONTHLY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[AuthorisationFrequency.QUARTERLY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[AuthorisationFrequency.SEMIANNUALLY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[AuthorisationFrequency.ANNUALLY.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        f267076a = iArr;
    }
}
