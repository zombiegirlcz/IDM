package hwc;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f156125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f156126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f156127c;

    static {
        int[] iArr = new int[cuc.e.values().length];
        try {
            iArr[cuc.e.SEPA_INSTANT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f156125a = iArr;
        int[] iArr2 = new int[cuc.h.values().length];
        try {
            iArr2[cuc.h.VOLUME.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[cuc.h.TRANSACTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        f156126b = iArr2;
        int[] iArr3 = new int[cuc.f.values().length];
        try {
            iArr3[cuc.f.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr3[cuc.f.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[cuc.f.DEACTIVATED.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f156127c = iArr3;
    }
}
