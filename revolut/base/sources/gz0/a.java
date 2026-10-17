package gz0;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f147932a;

    static {
        int[] iArr = new int[b.values().length];
        try {
            iArr[b.FitCenter.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b.CenterCrop.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[b.Center.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[b.CenterInside.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[b.Undefined.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f147932a = iArr;
    }
}
