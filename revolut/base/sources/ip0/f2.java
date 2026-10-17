package ip0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f164184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f164185b;

    static {
        int[] iArr = new int[c2.values().length];
        try {
            iArr[c2.CIRCLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c2.CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f164184a = iArr;
        int[] iArr2 = new int[g2.values().length];
        try {
            iArr2[g2.WRAP_CONTENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[g2.MATCH_PARENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f164185b = iArr2;
    }
}
