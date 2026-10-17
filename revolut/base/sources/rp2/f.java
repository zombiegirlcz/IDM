package rp2;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f256254a;

    static {
        int[] iArr = new int[mn2.a.values().length];
        try {
            iArr[mn2.a.CASS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[mn2.a.MOBILITY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[mn2.a.OVERSTAP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f256254a = iArr;
    }
}
