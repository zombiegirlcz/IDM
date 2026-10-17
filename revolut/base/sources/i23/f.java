package i23;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f157816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f157817b;

    static {
        int[] iArr = new int[kc8.a.values().length];
        try {
            iArr[kc8.a.PHYSICAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[kc8.a.VIRTUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f157816a = iArr;
        int[] iArr2 = new int[wf8.b.values().length];
        try {
            iArr2[wf8.b.ADD_ACCOUNT_ITEM.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[wf8.b.ACCOUNT_ITEM.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f157817b = iArr2;
    }
}
