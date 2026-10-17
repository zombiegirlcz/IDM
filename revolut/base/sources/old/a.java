package old;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f226372a;

    static {
        int[] iArr = new int[akd.b.values().length];
        try {
            iArr[akd.b.DANGER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[akd.b.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[akd.b.WARNING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[akd.b.ACCENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f226372a = iArr;
    }
}
