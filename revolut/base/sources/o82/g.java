package o82;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f222908a;

    static {
        int[] iArr = new int[yja.b.values().length];
        try {
            iArr[yja.b.NEXT_CLICK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[yja.b.ALREADY_SHOWN.ordinal()] = 2;
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
        f222908a = iArr;
    }
}
