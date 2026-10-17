package sb2;

import com.revolut.feature.apm.core.models.payments_authorisations.AuthorisationFrequency;
import com.revolut.feature.apm.core.models.payments_authorisations.ExecutionType;
import java.time.DayOfWeek;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f261473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f261474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f261475c;

    static {
        int[] iArr = new int[ExecutionType.values().length];
        try {
            iArr[ExecutionType.ON_DEMAND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ExecutionType.ONE_TIME.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ExecutionType.RECURRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ExecutionType.OTP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f261473a = iArr;
        int[] iArr2 = new int[AuthorisationFrequency.values().length];
        try {
            iArr2[AuthorisationFrequency.QUARTERLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[AuthorisationFrequency.SEMIANNUALLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[AuthorisationFrequency.DAILY.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[AuthorisationFrequency.INTRADAY.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[AuthorisationFrequency.WEEKLY.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[AuthorisationFrequency.FORTNIGHTLY.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[AuthorisationFrequency.MONTHLY.ordinal()] = 7;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[AuthorisationFrequency.ANNUALLY.ordinal()] = 8;
        } catch (NoSuchFieldError unused12) {
        }
        f261474b = iArr2;
        int[] iArr3 = new int[DayOfWeek.values().length];
        try {
            iArr3[DayOfWeek.MONDAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[DayOfWeek.TUESDAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[DayOfWeek.WEDNESDAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr3[DayOfWeek.THURSDAY.ordinal()] = 4;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr3[DayOfWeek.FRIDAY.ordinal()] = 5;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr3[DayOfWeek.SATURDAY.ordinal()] = 6;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr3[DayOfWeek.SUNDAY.ordinal()] = 7;
        } catch (NoSuchFieldError unused19) {
        }
        f261475c = iArr3;
    }
}
