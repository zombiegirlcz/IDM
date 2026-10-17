package zm3;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f323335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f323336b;

    static {
        int[] iArr = new int[do3.c.values().length];
        try {
            iArr[do3.c.YOUTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[do3.c.PERSONAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f323335a = iArr;
        int[] iArr2 = new int[k.values().length];
        try {
            iArr2[k.INDIVIDUAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[k.BUSINESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[k.JUNIOR.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f323336b = iArr2;
    }
}
