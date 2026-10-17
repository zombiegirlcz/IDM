package ip0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class ld {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f165188a;

    static {
        int[] iArr = new int[ev0.d.values().length];
        try {
            iArr[ev0.d.SYSTEM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ev0.d.LIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ev0.d.DARK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f165188a = iArr;
    }
}
