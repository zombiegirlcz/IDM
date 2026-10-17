package hua;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f155596a;

    static {
        int[] iArr = new int[c.values().length];
        try {
            iArr[c.DAILY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c.WEEKLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c.MONTHLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f155596a = iArr;
    }
}
