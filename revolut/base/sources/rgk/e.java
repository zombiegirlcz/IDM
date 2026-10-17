package rgk;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f254205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f254206b;

    static {
        int[] iArr = new int[a.values().length];
        try {
            iArr[a.CloseAfterResult.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a.CloseBeforeSuccessStatusSheet.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f254205a = iArr;
        int[] iArr2 = new int[b.values().length];
        try {
            iArr2[b.NoNavigation.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[b.PhysicalCardOrder.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f254206b = iArr2;
    }
}
