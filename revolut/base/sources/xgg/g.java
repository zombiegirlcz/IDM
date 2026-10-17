package xgg;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f305762a;

    static {
        int[] iArr = new int[tvb.d.values().length];
        try {
            iArr[tvb.d.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[tvb.d.COMPLETED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[tvb.d.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[tvb.d.USED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f305762a = iArr;
    }
}
