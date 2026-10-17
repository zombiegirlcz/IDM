package h23;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f148635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f148636b;

    static {
        int[] iArr = new int[e13.a.values().length];
        try {
            iArr[e13.a.PHYSICAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e13.a.VIRTUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e13.a.DISPOSABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f148635a = iArr;
        int[] iArr2 = new int[m23.b.values().length];
        try {
            iArr2[m23.b.BRAZIL.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[m23.b.INDIA.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f148636b = iArr2;
    }
}
