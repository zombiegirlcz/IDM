package twb;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f274973a;

    static {
        int[] iArr = new int[tvb.d.values().length];
        try {
            iArr[tvb.d.COMPLETED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[tvb.d.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f274973a = iArr;
    }
}
