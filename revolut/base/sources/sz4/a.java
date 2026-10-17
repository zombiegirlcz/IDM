package sz4;

import it3.f;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f266754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f266755b;

    static {
        int[] iArr = new int[f.values().length];
        try {
            iArr[f.STARTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f.EXPIRED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[f.ANSWERS_RECEIVED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[f.VALIDATION_PASSED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[f.READY_TO_SIGN_AGREEMENT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[f.NOT_AVAILABLE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[f.FORBEARANCE_ACTIVATED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[f.AGREEMENT_SIGNED.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[f.LOAN_CREATED.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[f.PASSED_TO_SUPPORT.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        f266754a = iArr;
        int[] iArr2 = new int[gs3.a.values().length];
        try {
            iArr2[gs3.a.LOAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[gs3.a.PAY_LATER.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[gs3.a.CREDIT_CARD.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        f266755b = iArr2;
    }
}
