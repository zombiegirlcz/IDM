package anf;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f7759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f7760b;

    static {
        int[] iArr = new int[whf.d.values().length];
        try {
            iArr[whf.d.ROW_ITEM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[whf.d.INPUT_DISCLOSURE_ITEM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f7759a = iArr;
        int[] iArr2 = new int[whf.o.values().length];
        try {
            iArr2[whf.o.SELECTABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[whf.o.SWIPE_ITEM.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[whf.o.SWIPE_ITEM_NO_ACTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f7760b = iArr2;
    }
}
