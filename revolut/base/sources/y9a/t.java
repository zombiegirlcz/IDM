package y9a;

import com.revolut.feature.pix.api.model.PixAuthorisationFrequency;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f311828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f311829b;

    static {
        int[] iArr = new int[g8a.s.values().length];
        try {
            iArr[g8a.s.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g8a.s.ACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[g8a.s.DEACTIVATED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f311828a = iArr;
        int[] iArr2 = new int[PixAuthorisationFrequency.values().length];
        try {
            iArr2[PixAuthorisationFrequency.WEEKLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[PixAuthorisationFrequency.MONTHLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[PixAuthorisationFrequency.QUARTERLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[PixAuthorisationFrequency.SEMIANNUAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[PixAuthorisationFrequency.ANNUAL.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[PixAuthorisationFrequency.FORTNIGHTLY.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[PixAuthorisationFrequency.DAILY.ordinal()] = 7;
        } catch (NoSuchFieldError unused10) {
        }
        f311829b = iArr2;
    }
}
