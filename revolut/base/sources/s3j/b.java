package s3j;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f259697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f259698b;

    static {
        int[] iArr = new int[u2j.d.values().length];
        try {
            iArr[u2j.d.PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[u2j.d.BUSINESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f259697a = iArr;
        int[] iArr2 = new int[s4j.b.values().length];
        try {
            iArr2[s4j.b.Business.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[s4j.b.Personal.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f259698b = iArr2;
    }
}
