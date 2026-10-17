package e65;

import q35.i0;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f122902a;

    static {
        int[] iArr = new int[i0.values().length];
        try {
            iArr[i0.LoanAlreadyCancelled.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[i0.DisbursalInProgress.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[i0.LoanNotInCooldownPeriod.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[i0.LoanInactive.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[i0.NotSupported.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[i0.ToggledOff.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f122902a = iArr;
    }
}
