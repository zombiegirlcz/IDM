package aye;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f11149a;

    static {
        int[] iArr = new int[yte.m.values().length];
        try {
            iArr[yte.m.MCY_UPI_APP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[yte.m.UPI_APP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[yte.m.MCY_NET_BANKING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[yte.m.NET_BANKING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f11149a = iArr;
    }
}
