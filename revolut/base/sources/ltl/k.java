package ltl;

import nel.z;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f199978a;

    static {
        int[] iArr = new int[z.values().length];
        try {
            iArr[z.BOND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[z.FUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[z.STRUCTURED_NOTE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f199978a = iArr;
    }
}
