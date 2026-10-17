package rrd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f256815a;

    static {
        int[] iArr = new int[i.values().length];
        try {
            iArr[i.TOTAL_ASSETS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[i.NOTE_WONT_VERIFY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[i.TOTAL_ASSETS_AI.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[i.VALUES_NOT_VERIFIED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[i.VALUES_NOT_VERIFIED_PROPERTY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f256815a = iArr;
    }
}
