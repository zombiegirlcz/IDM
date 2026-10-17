package ui9;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f280342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f280343b;

    static {
        int[] iArr = new int[wi9.b.values().length];
        try {
            iArr[wi9.b.Loan.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[wi9.b.CreditCard.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f280342a = iArr;
        int[] iArr2 = new int[wi9.a.values().length];
        try {
            iArr2[wi9.a.Contextual.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[wi9.a.Generic.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f280343b = iArr2;
    }
}
