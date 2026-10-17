package up5;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f281889a;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.REVIEW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.SUMMARY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d.END_OF_FLOW_NEXT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[d.END_OF_FLOW_BACK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f281889a = iArr;
    }
}
