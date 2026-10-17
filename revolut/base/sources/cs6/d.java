package cs6;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f108447a;

    static {
        int[] iArr = new int[g.values().length];
        try {
            iArr[g.ALL_SALES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g.ECOMMERCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[g.IN_PERSON.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[g.PAYMENT_LINKS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[g.INVOICES.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[g.RECURRING_INVOICES.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f108447a = iArr;
    }
}
