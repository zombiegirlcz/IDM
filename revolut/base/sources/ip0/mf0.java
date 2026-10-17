package ip0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class mf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f165371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f165372b;

    static {
        int[] iArr = new int[aw0.v1.values().length];
        try {
            iArr[aw0.v1.LIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[aw0.v1.DARK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f165371a = iArr;
        int[] iArr2 = new int[kf0.values().length];
        try {
            iArr2[kf0.REGULAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[kf0.SMALL.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f165372b = iArr2;
    }
}
