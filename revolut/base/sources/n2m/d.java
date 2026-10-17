package n2m;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f211598a;

    static {
        int[] iArr = new int[c.values().length];
        try {
            iArr[c.PREPARED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c.SCANNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c.FINISHED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[c.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f211598a = iArr;
    }
}
