package by9;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f19779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f19780b;

    static {
        int[] iArr = new int[dy9.c.values().length];
        try {
            iArr[dy9.c.USER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[dy9.c.BENEFICIARY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[dy9.c.CARD_OWNER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[dy9.c.COMPANY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f19779a = iArr;
        int[] iArr2 = new int[iy9.d.values().length];
        try {
            iArr2[iy9.d.USER.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[iy9.d.BENEFICIARY.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[iy9.d.CARD_OWNER.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[iy9.d.COMPANY.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        f19780b = iArr2;
    }
}
