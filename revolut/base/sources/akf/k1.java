package akf;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f5855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f5856b;

    static {
        int[] iArr = new int[gkf.m.values().length];
        try {
            iArr[gkf.m.SINGLE_SPLIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[gkf.m.RECURRING_SPLIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f5855a = iArr;
        int[] iArr2 = new int[a2a.g.values().length];
        try {
            iArr2[a2a.g.CARD_MANDATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[a2a.g.EXTERNAL_MANDATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[a2a.g.STANDING_ORDER.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f5856b = iArr2;
    }
}
