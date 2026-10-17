package aul;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f9860a;

    static {
        int[] iArr = new int[b.values().length];
        try {
            iArr[b.SECURITY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b.FIAT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f9860a = iArr;
    }
}
