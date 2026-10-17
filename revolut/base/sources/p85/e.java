package p85;

import q35.g0;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f233864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f233865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f233866c;

    static {
        int[] iArr = new int[g0.values().length];
        try {
            iArr[g0.AMOUNT_REDUCTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g0.TERM_REDUCTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[g0.EARLY_REPAYMENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f233864a = iArr;
        int[] iArr2 = new int[o85.e.values().length];
        try {
            iArr2[o85.e.ReduceTerm.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[o85.e.ReduceRepayments.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f233865b = iArr2;
        int[] iArr3 = new int[b95.a.values().length];
        try {
            iArr3[b95.a.MORTGAGE_LOAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[b95.a.PERSONAL_LOAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[b95.a.REFINANCING_LOAN.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        f233866c = iArr3;
    }
}
