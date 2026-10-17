package xci;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f304137a;

    static {
        int[] iArr = new int[yci.a.values().length];
        try {
            iArr[yci.a.DAILY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[yci.a.WEEKLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[yci.a.MONTHLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[yci.a.YEARLY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f304137a = iArr;
    }
}
