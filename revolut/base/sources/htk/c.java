package htk;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f155450a;

    static {
        int[] iArr = new int[b.values().length];
        try {
            iArr[b.RISE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b.FALL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[b.LIMITED_INCREASE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f155450a = iArr;
    }
}
