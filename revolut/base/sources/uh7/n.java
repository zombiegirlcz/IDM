package uh7;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f280124a;

    static {
        int[] iArr = new int[nh7.d.values().length];
        try {
            iArr[nh7.d.MOST_TRADED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[nh7.d.POPULAR_STARTER_CFDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[nh7.d.CFDS_PNL_DRIVERS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[nh7.d.RECOMMENDED_BUYS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f280124a = iArr;
    }
}
