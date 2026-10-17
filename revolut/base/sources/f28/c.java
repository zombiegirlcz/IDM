package f28;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f131451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f131452b;

    static {
        int[] iArr = new int[hel.b.values().length];
        try {
            iArr[hel.b.GB.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f131451a = iArr;
        int[] iArr2 = new int[h28.c.values().length];
        try {
            iArr2[h28.c.TOTAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[h28.c.PERFORMANCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        f131452b = iArr2;
    }
}
