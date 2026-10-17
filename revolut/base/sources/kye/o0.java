package kye;

import com.revolut.domain.models.externalcards.CardholderVerificationStatus;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f190804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f190805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f190806c;

    static {
        int[] iArr = new int[CardholderVerificationStatus.values().length];
        try {
            iArr[CardholderVerificationStatus.PASSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CardholderVerificationStatus.IN_PROGRESS.ordinal()] = 2;
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
            iArr[CardholderVerificationStatus.FAILED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[CardholderVerificationStatus.AUTOMATIC_VERIFICATION_NEEDED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f190804a = iArr;
        int[] iArr2 = new int[vye.c.values().length];
        try {
            iArr2[vye.c.UPI_APP.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[vye.c.NET_BANKING.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        f190805b = iArr2;
        int[] iArr3 = new int[eb3.a.values().length];
        try {
            iArr3[eb3.a.FEE.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[eb3.a.LIMITS.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        f190806c = iArr3;
    }
}
