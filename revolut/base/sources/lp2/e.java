package lp2;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f198921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f198922b;

    static {
        int[] iArr = new int[yja.b.values().length];
        try {
            iArr[yja.b.CLOSE_CLICK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[yja.b.NOT_FOUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[yja.b.ALREADY_SHOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[yja.b.NEXT_CLICK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f198921a = iArr;
        int[] iArr2 = new int[wn2.d.values().length];
        try {
            iArr2[wn2.d.PARTIAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[wn2.d.FULL.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f198922b = iArr2;
    }
}
