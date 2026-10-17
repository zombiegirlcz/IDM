package bq5;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f17727b;

    static {
        int[] iArr = new int[l0.values().length];
        try {
            iArr[l0.MY_WALLET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l0.SOMEONE_ELSE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f17726a = iArr;
        int[] iArr2 = new int[j0.values().length];
        try {
            iArr2[j0.INDIVIDUAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[j0.BUSINESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f17727b = iArr2;
    }
}
