package m9d;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f203727a;

    static {
        int[] iArr = new int[f7d.e.values().length];
        try {
            iArr[f7d.e.MORNING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f7d.e.AFTERNOON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[f7d.e.EVENING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[f7d.e.NIGHT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f203727a = iArr;
    }
}
