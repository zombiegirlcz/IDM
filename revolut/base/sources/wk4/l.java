package wk4;

import mb5.u;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f298246a;

    static {
        int[] iArr = new int[u.values().length];
        try {
            iArr[u.ACH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[u.DIRECT_DEBIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[u.SCHEDULED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f298246a = iArr;
    }
}
