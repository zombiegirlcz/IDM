package yv2;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f317119a;

    static {
        int[] iArr = new int[g.values().length];
        try {
            iArr[g.LOAD_PIN_STATUS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g.SHOW_PREVIOUS_OR_SINGLE_PIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[g.SHOW_NEW_PIN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[g.SHOW_NEW_PIN_WITHOUT_ACTIVATION_INSTRUCTIONS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f317119a = iArr;
    }
}
