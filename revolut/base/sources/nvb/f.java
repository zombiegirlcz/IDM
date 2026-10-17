package nvb;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f219577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f219578b;

    static {
        int[] iArr = new int[v1e.b.values().length];
        try {
            iArr[v1e.b.SOLD_OUT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[v1e.b.NOT_AVAILABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[v1e.b.ACTIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[v1e.b.INACTIVE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[v1e.b.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f219577a = iArr;
        int[] iArr2 = new int[c.values().length];
        try {
            iArr2[c.SOLD_OUT.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[c.COMING_SOON.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        f219578b = iArr2;
    }
}
