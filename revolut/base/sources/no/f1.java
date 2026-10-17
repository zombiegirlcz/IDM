package no;

/* JADX INFO: loaded from: classes17.dex */
public abstract /* synthetic */ class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f217766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f217767b;

    static {
        int[] iArr = new int[xg0.c.values().length];
        try {
            iArr[xg0.c.Available.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[xg0.c.Unavailable.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f217766a = iArr;
        int[] iArr2 = new int[xg0.d.values().length];
        try {
            iArr2[xg0.d.Success.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[xg0.d.Failed.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f217767b = iArr2;
    }
}
