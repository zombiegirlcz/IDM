package nvb;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f219581a;

    static {
        int[] iArr = new int[yja.b.values().length];
        try {
            iArr[yja.b.ALREADY_SHOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[yja.b.NEXT_CLICK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[yja.b.NOT_FOUND.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[yja.b.CLOSE_CLICK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f219581a = iArr;
    }
}
