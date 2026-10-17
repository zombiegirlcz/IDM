package nfk;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f215083a;

    static {
        int[] iArr = new int[jha.d.values().length];
        try {
            iArr[jha.d.EUROPE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[jha.d.SINGAPORE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[jha.d.USA.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[jha.d.JAPAN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[jha.d.AUSTRALIA.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[jha.d.OTHER.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f215083a = iArr;
    }
}
