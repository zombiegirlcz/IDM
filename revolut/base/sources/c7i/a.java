package c7i;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f21982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f21983b;

    static {
        int[] iArr = new int[q.values().length];
        try {
            iArr[q.Top.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q.Bottom.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f21982a = iArr;
        int[] iArr2 = new int[f.values().length];
        try {
            iArr2[f.DropsBelow.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[f.Exceeds.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f21983b = iArr2;
    }
}
