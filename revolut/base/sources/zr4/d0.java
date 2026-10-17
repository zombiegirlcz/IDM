package zr4;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f324555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f324556b;

    static {
        int[] iArr = new int[ql4.t.values().length];
        try {
            iArr[ql4.t.SETTLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ql4.t.CANCELLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ql4.t.ACTIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ql4.t.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f324555a = iArr;
        int[] iArr2 = new int[ql4.m.values().length];
        try {
            iArr2[ql4.m.FORBEARANCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ql4.m.CUSTOMER_REQUEST.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[ql4.m.MAX_TDPD_EXCEEDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[ql4.m.FACILITY_TERMINATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[ql4.m.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        f324556b = iArr2;
    }
}
