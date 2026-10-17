package tb6;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f269498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f269499b;

    static {
        int[] iArr = new int[ba6.p.values().length];
        try {
            iArr[ba6.p.UNLOCKED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ba6.p.LOCKED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ba6.p.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ba6.p.CARD_ORDERED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f269498a = iArr;
        int[] iArr2 = new int[ibd.f.values().length];
        try {
            iArr2[ibd.f.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        f269499b = iArr2;
    }
}
