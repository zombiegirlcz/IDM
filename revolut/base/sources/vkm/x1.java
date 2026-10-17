package vkm;

/* JADX INFO: loaded from: classes14.dex */
public abstract /* synthetic */ class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f290145a;

    static {
        int[] iArr = new int[ukm.f.values().length];
        try {
            iArr[ukm.f.SUSPEND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ukm.f.DROP_LATEST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ukm.f.DROP_OLDEST.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f290145a = iArr;
    }
}
