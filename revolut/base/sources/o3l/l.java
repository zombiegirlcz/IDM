package o3l;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f221858a;

    static {
        int[] iArr = new int[e3l.a.values().length];
        try {
            iArr[e3l.a.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e3l.a.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e3l.a.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f221858a = iArr;
    }
}
