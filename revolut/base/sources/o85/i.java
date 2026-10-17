package o85;

import q35.g0;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f222940a;

    static {
        int[] iArr = new int[g0.values().length];
        try {
            iArr[g0.EARLY_REPAYMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g0.AMOUNT_REDUCTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[g0.TERM_REDUCTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f222940a = iArr;
    }
}
