package ei1;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f126349a;

    static {
        int[] iArr = new int[n.values().length];
        try {
            iArr[n.MUNICIPALITY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n.CITY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f126349a = iArr;
    }
}
