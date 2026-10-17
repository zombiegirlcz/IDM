package gx8;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f147737a;

    static {
        int[] iArr = new int[hx8.a.values().length];
        try {
            iArr[hx8.a.DEVICE_NOT_SUPPORTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[hx8.a.NETWORK_ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[hx8.a.SERVICE_UNAVAILABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[hx8.a.UNKNOWN_ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f147737a = iArr;
    }
}
