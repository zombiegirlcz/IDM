package ui9;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f280349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f280350b;

    static {
        int[] iArr = new int[zh9.c.values().length];
        try {
            iArr[zh9.c.Healthy.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[zh9.c.Outstanding.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[zh9.c.Overdue.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f280349a = iArr;
        int[] iArr2 = new int[wi9.b.values().length];
        try {
            iArr2[wi9.b.CreditCard.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[wi9.b.Loan.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f280350b = iArr2;
    }
}
