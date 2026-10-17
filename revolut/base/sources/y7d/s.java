package y7d;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f311487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f311488b;

    static {
        int[] iArr = new int[k7d.a.values().length];
        try {
            iArr[k7d.a.AiV3.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k7d.a.AiV2.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[k7d.a.Legacy.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f311487a = iArr;
        int[] iArr2 = new int[k.values().length];
        try {
            iArr2[k.ENTRY.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[k.THINKING.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[k.CONTENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[k.ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        f311488b = iArr2;
    }
}
