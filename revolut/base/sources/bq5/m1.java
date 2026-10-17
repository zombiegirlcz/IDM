package bq5;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f17735b;

    static {
        int[] iArr = new int[j0.values().length];
        try {
            iArr[j0.INDIVIDUAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j0.BUSINESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f17734a = iArr;
        int[] iArr2 = new int[wk5.c.values().length];
        try {
            iArr2[wk5.c.NAME.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[wk5.c.SURNAME.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[wk5.c.REGISTRATION_NUMBER.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[wk5.c.ADDRESS.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[wk5.c.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        f17735b = iArr2;
    }
}
