package l83;

import h93.n0;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f192773a;

    static {
        int[] iArr = new int[n0.values().length];
        try {
            iArr[n0.TERMINATED_BY_REVOLUT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n0.COMPROMISED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[n0.CANCELLED_CHARGEBACK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[n0.SUCCESSFUL_CHARGEBACK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f192773a = iArr;
    }
}
