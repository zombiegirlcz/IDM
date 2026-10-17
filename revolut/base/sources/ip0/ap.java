package ip0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class ap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f163482a;

    static {
        int[] iArr = new int[wo.values().length];
        try {
            iArr[wo.PORTRAIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[wo.SQUARE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[wo.LANDSCAPE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f163482a = iArr;
        int[] iArr2 = new int[uo.values().length];
        try {
            iArr2[uo.DISABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[uo.INACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[uo.ACTIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr3 = new int[xo.values().length];
        try {
            iArr3[xo.ENABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[xo.DISABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
