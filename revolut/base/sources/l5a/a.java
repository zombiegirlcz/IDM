package l5a;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f192195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f192196b;

    static {
        int[] iArr = new int[k.values().length];
        try {
            iArr[k.LOADING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k.CONTENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f192195a = iArr;
        int[] iArr2 = new int[y80.d.values().length];
        try {
            iArr2[y80.d.DENIED.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[y80.d.GRANTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[y80.d.DENIED_PERMANENTLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f192196b = iArr2;
    }
}
