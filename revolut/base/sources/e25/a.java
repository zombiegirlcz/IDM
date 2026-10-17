package e25;

import yfe.d0;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f122029a;

    static {
        int[] iArr = new int[d0.values().length];
        try {
            iArr[d0.CC_LOAN_MORTGAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d0.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d0.LOAN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[d0.CC.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f122029a = iArr;
    }
}
