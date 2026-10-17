package up4;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f281839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f281840b;

    static {
        int[] iArr = new int[yja.b.values().length];
        try {
            iArr[yja.b.NOT_FOUND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[yja.b.ALREADY_SHOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[yja.b.NEXT_CLICK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[yja.b.CLOSE_CLICK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f281839a = iArr;
        int[] iArr2 = new int[c.values().length];
        try {
            iArr2[c.PostResult.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[c.Quit.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f281840b = iArr2;
    }
}
