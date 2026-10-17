package g1d;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f139575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f139576b;

    static {
        int[] iArr = new int[v0d.a.values().length];
        try {
            iArr[v0d.a.INLINE_MODE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[v0d.a.MODAL_MODE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f139575a = iArr;
        int[] iArr2 = new int[v0d.d.values().length];
        try {
            iArr2[v0d.d.START_WITH_CONTACT_CHOOSER.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[v0d.d.START_WITH_ADD_PARENT_PROMPT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f139576b = iArr2;
    }
}
