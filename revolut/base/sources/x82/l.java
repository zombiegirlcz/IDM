package x82;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f303269a;

    static {
        int[] iArr = new int[a.values().length];
        try {
            iArr[a.ACTIVE_INSTRUCTIONS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a.ACTIVE_ATM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[a.ACTIVE_CANCEL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[a.HELP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f303269a = iArr;
    }
}
