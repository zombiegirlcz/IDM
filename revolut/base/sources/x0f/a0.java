package x0f;

import com.revolut.domain.models.externalcards.CardholderVerificationStatus;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f301579a;

    static {
        int[] iArr = new int[CardholderVerificationStatus.values().length];
        try {
            iArr[CardholderVerificationStatus.PASSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CardholderVerificationStatus.AUTOMATIC_VERIFICATION_NEEDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CardholderVerificationStatus.VERIFICATION_PROHIBITED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CardholderVerificationStatus.AUTOMATIC_VERIFICATION_UNSUPPORTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[CardholderVerificationStatus.IN_PROGRESS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[CardholderVerificationStatus.FAILED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f301579a = iArr;
    }
}
