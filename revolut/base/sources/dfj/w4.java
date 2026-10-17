package dfj;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class w4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f114145a;

    static {
        int[] iArr = new int[dej.b2.values().length];
        try {
            iArr[dej.b2.CANCELLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[dej.b2.SCHEDULED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f114145a = iArr;
    }
}
