package gv5;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f147066a;

    static {
        int[] iArr = new int[h.values().length];
        try {
            iArr[h.UNAVAILABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h.AVAILABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[h.ACTIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f147066a = iArr;
    }
}
