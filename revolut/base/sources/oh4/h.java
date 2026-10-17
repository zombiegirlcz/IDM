package oh4;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f225290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f225291b;

    static {
        int[] iArr = new int[ju3.g.values().length];
        try {
            iArr[ju3.g.BOTTOM_SHEET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ju3.g.STATUS_DIALOG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f225290a = iArr;
        int[] iArr2 = new int[it3.k.values().length];
        try {
            iArr2[it3.k.CC_SECURED.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[it3.k.CC_RETAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[it3.k.CC_SECURED_RETAIL.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[it3.k.INVITATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[it3.k.CC_CLI_USER_INITIATED.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[it3.k.CC_BUILDER.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[it3.k.MC_BNPL_CORE_USER.ordinal()] = 7;
        } catch (NoSuchFieldError unused9) {
        }
        f225291b = iArr2;
    }
}
