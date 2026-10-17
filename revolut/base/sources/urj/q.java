package urj;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f282348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f282349b;

    static {
        int[] iArr = new int[qzi.g.values().length];
        try {
            iArr[qzi.g.ON_TRACK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[qzi.g.NOT_ON_TRACK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[qzi.g.OVERSPENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f282348a = iArr;
        int[] iArr2 = new int[uzi.c.values().length];
        try {
            iArr2[uzi.c.MONTHLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[uzi.c.WEEKLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f282349b = iArr2;
    }
}
