package uz7;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f284600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f284601b;

    static {
        int[] iArr = new int[zw7.n.values().length];
        try {
            iArr[zw7.n.IPID.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[zw7.n.POLICY_WORDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[zw7.n.TERMS_CONDITIONS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[zw7.n.STATEMENT_OF_INSURANCE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[zw7.n.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f284600a = iArr;
        int[] iArr2 = new int[zw7.o.values().length];
        try {
            iArr2[zw7.o.RELATIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[zw7.o.ABSOLUTE.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[zw7.o.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        f284601b = iArr2;
    }
}
