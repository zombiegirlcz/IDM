package ny5;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f220670a;

    static {
        int[] iArr = new int[gw5.a.values().length];
        try {
            iArr[gw5.a.CARDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[gw5.a.ROWS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[gw5.a.REWARDS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[gw5.a.SELECTABLE_ROWS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f220670a = iArr;
    }
}
