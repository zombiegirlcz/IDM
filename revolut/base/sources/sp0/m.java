package sp0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f264870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f264871b;

    static {
        int[] iArr = new int[k.values().length];
        try {
            iArr[k.VERTICAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k.HORIZONTAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f264870a = iArr;
        int[] iArr2 = new int[l.values().length];
        try {
            iArr2[l.LIGHT_TO_DARK.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[l.DARK_TO_LIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[l.LIGHT_TO_DARK_TO_LIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f264871b = iArr2;
    }
}
