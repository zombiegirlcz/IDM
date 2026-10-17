package h9g;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f150247a;

    static {
        int[] iArr = new int[vei.a.values().length];
        try {
            iArr[vei.a.STANDARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[vei.a.PLUS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[vei.a.PREMIUM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[vei.a.METAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[vei.a.ULTRA.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f150247a = iArr;
    }
}
