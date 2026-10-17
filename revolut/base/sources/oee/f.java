package oee;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f224584a;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.ETA_TODAY_STANDARD_NOT_ACTIVATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.ETA_TODAY_PRIORITY_NOT_ACTIVATED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d.DELIVERED_PRIORITY_NOT_ACTIVATED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f224584a = iArr;
    }
}
