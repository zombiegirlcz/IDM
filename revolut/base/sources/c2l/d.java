package c2l;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f20828a;

    static {
        int[] iArr = new int[yja.b.values().length];
        try {
            iArr[yja.b.NEXT_CLICK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[yja.b.CLOSE_CLICK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[yja.b.NOT_FOUND.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[yja.b.ALREADY_SHOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f20828a = iArr;
    }
}
