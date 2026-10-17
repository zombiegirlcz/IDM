package u2m;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f276713a;

    static {
        int[] iArr = new int[b.values().length];
        try {
            iArr[b.Ok.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b.OkGrey.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[b.Error.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[b.Grey.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f276713a = iArr;
    }
}
