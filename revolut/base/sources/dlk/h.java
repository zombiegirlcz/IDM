package dlk;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f115786a;

    static {
        int[] iArr = new int[s.values().length];
        try {
            iArr[s.DOWNGRADE_FEES_AND_TERMS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[s.FEEDBACK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[s.DOWNGRADE_REASONS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[s.DOWNGRADE_LEGIBILITY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f115786a = iArr;
    }
}
