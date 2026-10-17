package ft6;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f137953a;

    static {
        int[] iArr = new int[zr6.e.values().length];
        try {
            iArr[zr6.e.CUSTOMER_NOT_PRESENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[zr6.e.CUSTOMER_PRESENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[zr6.e.TAP_TO_PAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[zr6.e.REVOLUT_PAY_ONLINE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[zr6.e.REVOLUT_PAY_ONLINE_COMMERCIAL.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[zr6.e.REVOLUT_PAY_IN_PERSON.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[zr6.e.REVOLUT_PAY_IN_PERSON_COMMERCIAL.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[zr6.e.OPEN_BANKING.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        f137953a = iArr;
    }
}
