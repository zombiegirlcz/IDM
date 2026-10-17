package je2;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f173192a;

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
        f173192a = iArr;
    }
}
