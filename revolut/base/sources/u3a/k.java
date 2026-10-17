package u3a;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f276855a;

    static {
        int[] iArr = new int[jq9.a.values().length];
        try {
            iArr[jq9.a.ALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[jq9.a.NONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[jq9.a.ONLY_OWNED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f276855a = iArr;
    }
}
