package l6b;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f192378a;

    static {
        int[] iArr = new int[r5b.i.values().length];
        try {
            iArr[r5b.i.KEEP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r5b.i.SUBSCRIBE_WITH_BENEFITS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[r5b.i.SUBSCRIBE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[r5b.i.DOWNGRADE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f192378a = iArr;
    }
}
