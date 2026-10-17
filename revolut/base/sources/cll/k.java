package cll;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f25062a;

    static {
        int[] iArr = new int[z53.a.values().length];
        try {
            iArr[z53.a.NOT_SUPPORTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[z53.a.DISABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[z53.a.ENABLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f25062a = iArr;
    }
}
