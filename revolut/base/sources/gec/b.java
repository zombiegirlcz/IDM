package gec;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f143277a;

    static {
        int[] iArr = new int[p6c.b.values().length];
        try {
            iArr[p6c.b.Retail.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[p6c.b.RetailOnly.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[p6c.b.Business.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[p6c.b.BusinessOnly.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f143277a = iArr;
    }
}
