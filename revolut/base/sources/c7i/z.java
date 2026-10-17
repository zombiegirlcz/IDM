package c7i;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f22036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f22037b;

    static {
        int[] iArr = new int[f.values().length];
        try {
            iArr[f.DropsBelow.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f.Exceeds.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f22036a = iArr;
        int[] iArr2 = new int[q.values().length];
        try {
            iArr2[q.Top.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[q.Bottom.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f22037b = iArr2;
    }
}
