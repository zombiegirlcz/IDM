package oye;

import com.revolut.domain.models.externalcards.CardholderVerificationStatus;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f231028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f231029b;

    static {
        int[] iArr = new int[CardholderVerificationStatus.values().length];
        try {
            iArr[CardholderVerificationStatus.IN_PROGRESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CardholderVerificationStatus.PASSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CardholderVerificationStatus.VERIFICATION_PROHIBITED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CardholderVerificationStatus.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[CardholderVerificationStatus.AUTOMATIC_VERIFICATION_UNSUPPORTED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[CardholderVerificationStatus.AUTOMATIC_VERIFICATION_NEEDED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f231028a = iArr;
        int[] iArr2 = new int[vye.c.values().length];
        try {
            iArr2[vye.c.CHECK.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[vye.c.PIX.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        f231029b = iArr2;
    }
}
