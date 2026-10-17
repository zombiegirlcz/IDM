package i9e;

import com.revolut.retail.feature.beneficiary.models.BeneficiaryIdentificationType;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f159668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f159669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f159670c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;
    public static final /* synthetic */ int[] f;

    static {
        int[] iArr = new int[qua.r.values().length];
        try {
            iArr[qua.r.SAVINGS_ACCOUNT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[qua.r.PORTFOLIO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[qua.r.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f159668a = iArr;
        int[] iArr2 = new int[kq2.c.values().length];
        try {
            iArr2[kq2.c.SHARED.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[kq2.c.DEBTOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f159669b = iArr2;
        int[] iArr3 = new int[ibd.h.values().length];
        try {
            iArr3[ibd.h.BIZUM_MANDATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        f159670c = iArr3;
        int[] iArr4 = new int[b9e.a.values().length];
        try {
            iArr4[b9e.a.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr4[b9e.a.PAUSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr4[b9e.a.CANCELLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        d = iArr4;
        int[] iArr5 = new int[BeneficiaryIdentificationType.values().length];
        try {
            iArr5[BeneficiaryIdentificationType.BR_CPF.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr5[BeneficiaryIdentificationType.BR_CNPJ.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        e = iArr5;
        int[] iArr6 = new int[fva.e.values().length];
        try {
            iArr6[fva.e.WEEKLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr6[fva.e.BI_WEEKLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr6[fva.e.MONTHLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr6[fva.e.QUARTERLY.ordinal()] = 4;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr6[fva.e.HALF_YEARLY.ordinal()] = 5;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr6[fva.e.YEARLY.ordinal()] = 6;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr6[fva.e.DAILY.ordinal()] = 7;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr6[fva.e.TWICE_WEEKLY.ordinal()] = 8;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr6[fva.e.TEN_DAYS.ordinal()] = 9;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr6[fva.e.BI_MONTHLY.ordinal()] = 10;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr6[fva.e.TRIMESTER.ordinal()] = 11;
        } catch (NoSuchFieldError unused22) {
        }
        f = iArr6;
    }
}
