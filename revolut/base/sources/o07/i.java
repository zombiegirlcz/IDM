package o07;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f221169a;

    static {
        int[] iArr = new int[as6.a.values().length];
        try {
            iArr[as6.a.CUSTOMER_NOT_PRESENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[as6.a.CUSTOMER_PRESENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[as6.a.TAP_TO_PAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[as6.a.REVOLUT_PAY_ONLINE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[as6.a.REVOLUT_PAY_IN_PERSON.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[as6.a.OPEN_BANKING.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f221169a = iArr;
    }
}
